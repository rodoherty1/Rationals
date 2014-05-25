package rationals


class Rational (x: Int, y: Int) {
  
	// require (y!=0, "Demoninator must be positive");
	
	
	val numer = x
	val demon = y
	
	
	def add (that: Rational) = {
		new Rational(numer * that.demon + that.numer * demon, demon * that.demon)
	}
	
	def neg = new Rational(numer * -1, demon)
	
	def sub (that: Rational) : Rational = {
		new Rational ((numer * that.demon) - (that.numer * demon), demon * that.demon);
	}
	
	def less (that: Rational) : Boolean = {
		this.numer * that.demon < that.numer * this.demon
	}
	
	def max (that: Rational) : Rational = {
		if (this.less(that)) 
			that
		else 
			this
	}
	
	override def equals (that: Any) : Boolean = {
		if (that.isInstanceOf[Rational])
			numer == that.asInstanceOf[Rational].numer && demon == that.asInstanceOf[Rational].demon
		else
			false
	}
	
	override def toString = {
	  	val g = Math.gcd(x, y)
	  	(numer / g) + "/" + (demon / g)
	}
}