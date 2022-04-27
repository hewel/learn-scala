package control.structures

def control(x: Int) = {

  if x < 0 then println("negative")
  else if x == 0 then println("zero")
  else println("positive")

  val ints = List(1, 2, 3, 4, 5)
  for i <- ints do println(i)
  for i <- ints if i % 2 == 0 do println(i)

  for
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 2
    if j == 'b'
  do println(s"i = $i, j = $j") // prints: "i = 2, j = b"

  val double = for i <- ints yield i * 2
  println(double)

  val names = List("chris", "ed", "maurice")
  val capNames = for name <- names yield name.capitalize
  println(capNames)

  x match
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("other")

  val result = x match
    case 1 => "one"
    case 2 => "two"
    case _ => "other"

  getClassAsString(1)
  getClassAsString("hello")
  getClassAsString(List(1, 2, 3))
  control2
}

def getClassAsString(x: Matchable) = x match
  case s: String  => s"String: $s"
  case i: Int     => s"Int: $i"
  case d: Double  => s"Double: $d"
  case l: List[_] => s"List: $l"
  case _          => "unknown"

def control2 =
  var x = 1
  while x < 3 do
    println(x)
    x += 1
