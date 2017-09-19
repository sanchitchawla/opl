object Roman extends App{
	
	def toRoman(n: Int): String = {

		if (n >= 1000) return "M" + toRoman(n - 1000)
		if (n >= 900) return "CM" + toRoman(n - 900)
		if (n >= 500) return "D" + toRoman(n - 500)
		if (n >= 400) return "CD" + toRoman(n - 400)
		if (n >= 100) return "C" + toRoman(n - 100)
		if (n >= 90) return "XC" + toRoman(n - 90)
		if (n >= 50) return "L" + toRoman(n - 50)
		if (n >= 40) return "XL" + toRoman(n - 40)
		if (n >= 10) return "X" + toRoman (n - 10)
		if (n == 9) return "IX"
		if (n >= 5) return "V" + toRoman(n - 5)
		if (n == 4) return "IV" 
		if (n >= 1) return "I" + toRoman(n - 1)
		else return ""
	}
	
}