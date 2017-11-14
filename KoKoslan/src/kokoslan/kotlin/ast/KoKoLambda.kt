/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

class KoKoLambda(val pattern: KoKoAst, private val expr: KoKoAst, var isLambdaEvaluable: Boolean) : KoKoAst {

    override fun genCode(Out: PrintStream) {
        if (isLambdaEvaluable)
            Out.print("(")
        Out.print("\\")
        this.pattern.genCode(Out)
        Out.print(". ")
        this.expr.genCode(Out)
        if (isLambdaEvaluable)
            Out.print(") ")
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        if (isLambdaEvaluable)
            return manageEvaluableLambda(ctx)

        val kokoLambdaValue: KoKoLambdaValue
        if (pattern is KoKoListPat)
            kokoLambdaValue = KoKoLambdaValue(pattern, expr, ctx.push())
        else
            kokoLambdaValue = KoKoLambdaValue(pattern as KoKoId, expr, ctx.push())
        return kokoLambdaValue
    }

    private fun manageEvaluableLambda(ctx: KoKoContext): KoKoValue? {
        val newCtx = ctx.push()
        val newPattern = pattern as KoKoLambda
        val kokoLambdaValue = KoKoLambdaValue(newPattern.pattern, newPattern.expr, newCtx.push())
        newCtx.assoc(KoKoId(pattern.hashCode().toString()), kokoLambdaValue)
        val r = KoKoCall(KoKoId(pattern.hashCode().toString()), KoKoList(listOf(expr))).eval(kokoLambdaValue.ctx)
        return r
    }


}