object inclass4 {
	
	def myMin(xs: int[Int]): Option[Int] = {
		if (xs.isEmpty){
			None
		}
		else {
			val tailMin: Option[Int] = myMin(xs.tail)

			if (xs.tail.isEmpty || xs.head < tailMin) Some(xs.head) else tailMin
		}
	}

	def fac(n: Int): Long = {
		def tail(n:Int, prod: Long): Int = {
			if (n == 0) prod else tailFac(n-1, prod*n)
		}
		tailFac(n, 1)
	}

	def find(xs: List[(Int, String)], key: Int): Option[String] = {

		if (xs.isEmpty) None 
		else {
			if (xs.head._1 == key) Some(xs.head_2)
			else find(xs.tail, key)
		}
	}

	def rev(xs: List[Int]): List[Int] = {

		def tail(x: List[Int], ys: List[Int]) = List[Int] = {

			if (x.isEmpty) ys
			else tail(xs.tail, xs.head::ys) //prepend
		}
		tail(xs, Nil)
	}

	def fib(x: Int): Long = {
		def tail(x: Int, y: Int) = Int = {
			
		}
	}
}