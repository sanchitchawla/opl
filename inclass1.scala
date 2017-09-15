object inclass1 {

	def fib(n : Int): Long = {

		if (n <= 2){
			n
		} 
		else {
			
			fib(n - 1) + fib(n - 2)
		}

	}

	def main(args: Array[String]) = {
		println(fib(3))		
	}
}
