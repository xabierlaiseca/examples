package scala.examples.methods

object MethodExamples {
    def main(args: Array[String]) = {
        val methodExamples = new MethodExamples
        // call to the "joinOverload" method with two parameters
        println(methodExamples.joinOverload(args, " "))
        // call to the "joinOverload" method with one parameter
        println(methodExamples.joinOverload(args))
        // call to the "joinDefaultValue" method with two parameters
        println(methodExamples.joinDefaultValue(args, " "))
        // call to the "joinDefaultValue" method with two parameters,
        // the separator parameter takes the default value
        println(methodExamples.joinDefaultValue(args))
        // call with parameter names
        println(methodExamples.joinDefaultValue(separator = " ", tokens = args))
    }
}

class MethodExamples {
    def joinOverload(tokens: Array[String]): String = 
        joinOverload(tokens, " ")

    def joinOverload(tokens: Array[String], separator: String): String = 
        tokens.mkString(separator)

    def joinDefaultValue(tokens: Array[String], separator: String = " ") = 
        tokens.mkString(separator)
}
