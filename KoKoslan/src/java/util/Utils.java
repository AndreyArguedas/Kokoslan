/**
 Authors:
     Andrey Arguedas Espinoza
     Daniela Armas Sanchez
     Michael Chen Wang
     Kimberly Olivas Delgado
 */
package kokoslan.util;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;

public class Utils{
    public static String getMethodsStr(Class c) {
        StringBuffer methods = new StringBuffer();
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
            methods.append(m[i].toString() + "\n");
        return methods.toString();
    }
}



