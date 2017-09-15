object Factorial {

	def factorial(n: Int): Long = {

		if (n == 0) return 1

		return n * factorial(n - 1)
	}

	def main(args: Array[String]) = {
		println(factorial(4))		
	}
}
