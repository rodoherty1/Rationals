package rationals


class Rational (x: Int, y: Int) {
  
	// require (y!=0, "Demoninator must be positive");
	
	
	val numer = x
	val demon = y
	
	
	def add (that: Rational) = {
		new Rational(numer * that.demon + that.numer * demon, demon * that.demon)
	}
	
	def + (that: Rational) = add(that)
	
	def neg = new Rational(numer * -1, demon)
	
	def sub (that: Rational) : Rational = {
		new Rational ((numer * that.demon) - (that.numer * demon), demon * that.demon);
	}
	
	def - (that: Rational) = sub(that)
	
	def less (that: Rational) : Boolean = {
		this.numer * that.demon < that.numer * this.demon
	}
	
	def max (that: Rational) : Rational = {
		if (this.less(that)) 
			that
		else 
			this
	}
	
	def *&^% (that: Rational) : Rational = {
	  ???
	}
	
	def simplify (r: Rational) = {
	  	val g = Math.gcd(r.numer, r.demon)
	  	new Rational(r.numer / g, r.demon / g)
	}
	
	override def equals (that: Any) : Boolean = {
		if (that.isInstanceOf[Rational]) {
			val _this = simplify(this)
			val _that = simplify(that.asInstanceOf[Rational])
			_this.numer == _that.numer && _this.demon == _that.demon
		} else {
			false
		}
	}
	
	override def toString = {
	  	val g = Math.gcd(numer, demon)
	  	(numer / g) + "/" + (demon / g)
	}
}