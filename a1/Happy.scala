import scala.math.pow

object Happy {
	
	def sumOfDigitsSquared(n: Int): Int = {

	 	if (n < 10) return pow(n, 2).toInt

	 	else pow(n % 10, 2).toInt + sumOfDigitsSquared(n / 10)
	}
	
	def isHappy(n: Int): Boolean = {

		if (n == 1) return true
		if (n == 4) return false

		else isHappy(sumOfDigitsSquared(n))

	}

	def kThHappy(k: Int): Int = {
		
		if (k == 1) return 1

		else return helpHappy(kThHappy(k - 1) + 1)
	}

	def helpHappy(k: Int): Int = {

		if (isHappy(k)) return k

		else return helpHappy(k + 1)
	}

	def main(args: Array[String]) = {

		println(kThHappy(3))

	}
}