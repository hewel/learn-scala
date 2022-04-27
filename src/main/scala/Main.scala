import variables._

@main def hello: Unit =
  println("Hello world!")
  println(msg)
  getVariables()

def msg = "I was compiled by Scala 3. :)"
