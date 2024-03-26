package org.example

fun main() {
  val name = nullable("John")
  val emptyName = nullable(null)
  println("name: $name, emptyName: $emptyName")
}

fun nullable(name: String?): String {
  return name ?: "Unnamed"
}

