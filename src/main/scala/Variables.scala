package variables

def getVariables() = {
  val a = 0 // val is immutable
  var b = 1 // var is mutable
  b = 2
  val i = 123
  val j = 1.2
  val x = 1_000L // val x: Long = 1000
  val y = 2.2d // val y: Double = 2.2
  val z = 3.3f // val z: Float = 3.3
  var k = BigInt(1_234_567_890_987_654_321L)
  var f = BigDecimal(123_456.789)

  val nums = List(1, 2, 3, 4, 5)

  var msg = "variables"
  val c = 'c'
  val quote = """The essence of Scala:
                 Fusion of functional and object-oriented
                 programming in a typed setting."""

  msg = "variables and data types"
  println(s"hi, $msg $quote")
  println(s"a+b = ${a + b}")
}
