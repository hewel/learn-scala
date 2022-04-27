package modeling

trait Speaker:
  def speak(): String
trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
trait Runner:
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow"
  override def startRunning(): Unit = println("Yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")

val d = Dog("Rover")
val c = Cat("Fluffy")

def animal =
  println(d.speak())
  println(c.speak())
  c.startRunning()
  c.stopRunning()

// class Person(var firstName: String, var lastName: String):
//   def printFullName() = println(s"$firstName $lastName")

// def runPerson =
//   val p = Person("John", "Doe")
//   println(p.firstName)
//   p.firstName = "Jane"
//   p.printFullName()

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

def pizza =
  import CrustSize.*
  val currentCrustSize = Small

  currentCrustSize match
    case Small  => println("Small crust size")
    case Medium => println("Medium crust size")
    case Large  => println("Large crust size")

  if currentCrustSize == Small then println("Small crust size")

  val p = Person("Reginald Kenneth Dwight", "Singer")

  p match
    case Person(name, vocation) => println(s"$name is a $vocation")

enum Nat:
  case Zero
  case Succ(pred: Nat)

case class Person(
    name: String,
    vocation: String
)
