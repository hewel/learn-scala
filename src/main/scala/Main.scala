import variables._
import control.structures._

@main def hello: Unit =
  println("Hello world!")
  println(msg)
  getVariables
  control(-3)

def msg = "I was compiled by Scala 3. :)"
