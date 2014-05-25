package rationals

object Math {

	def gcd (x: Int, y: Int) : Int = 
		if (y == 0) x else gcd(y, x % y)
}