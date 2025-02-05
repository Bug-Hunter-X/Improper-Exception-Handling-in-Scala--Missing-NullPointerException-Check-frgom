```scala
class MyClass {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      throw new IllegalArgumentException("Value cannot be negative")
    }
    _value = newValue
  }
}

object Main extends App {
  val myObj = new MyClass
  myObj.value = 10
  println(myObj.value) // Output: 10

  try {
    myObj.value = -5
  } catch {
    case e: IllegalArgumentException => println(e.getMessage) // Output: Value cannot be negative
  }
}
```