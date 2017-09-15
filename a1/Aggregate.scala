object Aggregate {
	
	def myMin(p: Double, q: Double, r: Double): Double = {

		if (p < q && p < r) return p

		else if (q < p && q < r) return q

		else return r
	}

	def myMean(p: Double, q: Double, r: Double): Double = {

		return 1.0/3 * (p + q + r)

	}

	def myMed(p: Double, q: Double, r: Double): Double = {

		if (p < q && p > r) return p

		else if (q < p && q > r) return q

		else if (p > q && p < r) return p

		else if (q > p && q < r) return q

		else return r

	}

	def main(args: Array[String]) = {
		
		println(myMed(13,5.0,12))		
	}
}