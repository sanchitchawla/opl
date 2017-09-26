object inclass3{
	
	def concat(xs: List[Int] ,  ys: List[Int]): List[Int] = {
		if (xs.isEmpty) ys else xs.head::concat(xs.tail, ys) 
	}

	// def range(to: Int){
	// 	def rangehelper(from: Int): List[Int] = {
	// 		if (from == to) Nil else from::range(from + 1)
	// 	}

	// 	rangehelper(1)
	// }

	def sumPairList(xs: List[(Int, Int)]): Int = {
		if (xs.isEmpty) 0 else xs.head._1 + xs.head._2 + sumPairList(xs.tail) 
	}

	def firsts(xs: List[(Int, Int)]): List[Int] = {
		if (xs.isEmpty) Nil else xs.head._1::firsts(xs.tail)
	}

	def seconds(xs: List[(Int, Int)]): List[Int] = {
		if (xs.isEmpty) Nil else xs.head._2::firsts(xs.tail)
	}

	def sumList(xs: List[Int]): Int = {
		if (xs.isEmpty) 0 else xs.head + sumList(xs.tail)
	}

	def pairSumList(xs: List[(Int, Int)]): (Int, Int) = {
		return (sumList(firsts(xs)), sumList(seconds(xs)))
	}

	def main(args: Array[String]): Unit = {
		val x = List(1,2,3)
		val y = List(4)
		val tupx = List((1,1), (2,2))

		//println(concat(x, y))
		//println(range(5))
		println(sumPairList(tupx))
		println(pairSumList(tupx))
	}

}