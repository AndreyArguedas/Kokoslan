/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import com.google.gson.Gson;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kokoslan.kotlin.compiler.KoKoCompiler;
import kokoslan.kotlin.eval.KoKoValue;
import kokoslan.parser.KoKoslanLexer;
import kokoslan.parser.KoKoslanParser;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;

/**
 *
 * @author Andrey
 */
public class SandboxServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String json; //Json para manejar las operaciones
            
            String inputFile = null,
            outputFile = null;

            InputStream is = System.in;

            if (inputFile != null) {
                is = new FileInputStream(inputFile);
                System.out.println(">>> KoKoc Reading from " + inputFile + " <<<");
            } else {
                System.out.println(">>> KoKoc Reading from console (enter CTRL-Z+ENTER to finish <<<");
            }
            // Setup Lexer/Parser
            //ANTLRInputStream input = new ANTLRInputStream(is);
            CharStream input = (CharStream) CharStreams.fromStream(is);
            KoKoslanLexer lexer = new KoKoslanLexer((org.antlr.v4.runtime.CharStream) input);
            CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
            KoKoslanParser parser = new KoKoslanParser((TokenStream) tokens);

            // Parse, Compile and Generate code
            // Starting point is rule (context) 'program' (See grammar KoKoslan.g4)
            KoKoslanParser.ProgramContext tree = parser.program();

            KoKoCompiler compiler = new KoKoCompiler(outputFile);
            compiler.compile(tree);

            System.err.println(">>> KoKoc is writing to " + outputFile + " <<<");
            


            String accion = request.getParameter("accion"); //CRUD

            switch (accion) {
                case "getResult":
                    KoKoValue finalValue = compiler.eval();
                    json = new Gson().toJson(finalValue);
                    out.print(json);
                    break;

                case "post":
                    String myProgram = request.getParameter("program");
                    //json = new Gson().toJson();
                    out.print(json);
                    break;
 
                default:
                    out.print("E~ KoKoFail No se indico la acción que se desea realizar");
                    break;
            }

        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
