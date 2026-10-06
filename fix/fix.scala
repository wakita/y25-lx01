package prg1.lx01.fix

/*
 * 以下のファイルは正しい Scala プログラムではありません。
 * Scala 3 では def 宣言はトップレベルに書けますが、
 * println(...) のような実行文はトップレベルには書けないからです。
 */

def simple(a: Int, n: Int): Int = {
  def aux(a: Int, i: Int) {
    if (i > n) a else aux(a + i, i + 1)
  }
  aux(a, 1)
}

println("1 + 2 + ... + 10 = " + simple(10, 1))
