package scala.examples.methods

object ParametersExample {
  def main(args: Array[String]) = {
    val paramExample = new ParametersExample
    paramExample.printArray(Array("Parameters", "Example"))
    paramExample.printElements("Parameters", "Example")
  }
}

class ParametersExample {
  def printArray(array: Array[String]): Unit = 
    array foreach{println(_)}

  def printElements(elems: String*): Unit = 
    elems foreach{println(_)}
}
