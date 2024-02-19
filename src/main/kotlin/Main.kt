package org.example

fun main() {
  val one = pop(-50)
  val two = pop(200)
  val three = pop(10)
  println("one: $one, two: $two, three: $three")
}

fun pop(num: Int = 1): Int {
  require(num >= 0) { "num should be non-negative, but was $num" }
  check(num <= 100) { "num should be less than or equal to 100, but was $num" }
  assert(num < 0) { "num should be 50, but was $num" }
  return num + 1
}
