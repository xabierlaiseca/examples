package scala.examples.methods

object Main {
    def main(args: Array[String]) = {
        val methodExamples = new MethodExamples
        println(methodExamples.joinOverload(args, " "))
        println(methodExamples.joinOverload(args))
        println(methodExamples.joinDefaultValue(args, " "))
        println(methodExamples.joinDefaultValue(args))
    }
}

class MethodExamples {
    def joinOverload(tokens: Array[String]): String = {
        joinOverload(tokens, " ")
    }

    def joinOverload(tokens: Array[String], separator: String): String = {
        tokens.mkString(separator)
    }

    def joinDefaultValue(tokens: Array[String], separator: String = " ") = {
        tokens.mkString(separator)
    }
}
