```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => String): String = f(value)
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    val myString = new MyClass("hello")

    println(myInt.myMethod(i => i.toString))
    println(myString.myMethod(_.toUpperCase))
  }
}
```