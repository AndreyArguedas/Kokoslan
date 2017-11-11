package kokoslan.kotlin.eval

import kokoslan.kotlin.ast.*

class KoKoCaseValue(val cases : KoKoList, val call : KoKoAst, var ctx : KoKoContext, vararg args: KoKoValue) : KoKoValue