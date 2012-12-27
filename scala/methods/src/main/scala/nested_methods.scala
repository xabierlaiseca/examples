package scala.examples.methods

object NestedMethods {
    def main(args: Array[String]) = {
        val nm = new NestedMethods
        println(nm.multiply1(2, 5))
        println(nm.multiply2(3, 5))
    }
}

class NestedMethods {
    def multiply1(n1: Int, n2: Int): Int = {
        // this method only uses it's parameters
        def mult(n: Int, times: Int, acc: Int): Int = {
            if (times == 0)
                acc
            else
                mult(n, times - 1, acc + n)
        }

        mult(n1, n2, 0)
    }

    def multiply2(n1: Int, n2: Int): Int = {
        // this method uses it's parameters and its parent's parameters
        def mult(n: Int, count: Int, acc: Int): Int = {
            if (count == n2)
                acc
            else
                mult(n, count + 1, acc + n)
        }

        mult(n1, 0, 0)
    }
}
