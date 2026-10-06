package prg1.lx01.fix1

def simple(a: Int, n: Int): Int = {
  def aux(a: Int, i: Int) {
    if (i > n) a else aux(a + i, i + 1)
  }
  aux(a, 1)
}

def main = {
  println("1 + 2 + ... + 10 = " + simple(10, 1))
}
