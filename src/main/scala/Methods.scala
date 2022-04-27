package methods

def sum(a: Int, b: Int) = a + b
def concatenate(s1: String, s2: String) = s1 + s2

def empty =
  val x = sum(1, 2)
  val y = concatenate("foo", "bar")
  makeConnection("https://localhost")
  makeConnection("https://localhost", 2333)
  makeConnection(url = "https://localhost", timeout = 565)
  println("world".hello)
  println("10".makeInt(2))

def makeConnection(url: String, timeout: Int = 5000): Unit =
  println(s"url=$url, timeout=$timeout")

extension (s: String)
  def hello: String = s"Hello, ${s.capitalize}!"
  def aloha: String = s"Aloha, ${s.capitalize}!"
  def makeInt(radix: Int): Int = Integer.parseInt(s, radix)
