package org.example

import java.time.LocalDateTime

fun main() {
  val one = pop(50)
  val two = pop(200)
  val three = pop(10)
  println("one: $one, two: $two, three: $three")
  
  val date = getDate(LocalDateTime.now())
  println("date: $date")
}

fun pop(num: Int = 1): Int {
  require(num >= 0) { "num should be non-negative, but was $num" }
  check(num <= 100) { "num should be less than or equal to 100, but was $num" }
  assert(num < 0) { "num should be 50, but was $num" }
  return num + 1
}

fun getDate(date: LocalDateTime?): LocalDateTime {
  require(date is LocalDateTime) { "date should be of type LocalDateTime, but was ${date?.javaClass?.simpleName}" }
  require(date > LocalDateTime.now()) { "date should be in the future, but was $date" }
  return date
 }
