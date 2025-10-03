package prg1.lx01.hello3

/*
 * 定数を宣言し、利用する例。
 * この例はふたつの定数(instructor1, instructor2)を宣言しています。
 * 定数の参照は単に定数名を利用するだけです。
 */

@main
def main = {
  val instructor1 = "脇田 建（わきた けん）"
  val instructor2 = "七島 幹人（ななしま みきと）"

  println("講義の担当は" + instructor1 + "です。")
  println("演習の担当は" + instructor2 + "です。")
}
