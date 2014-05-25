package rationals

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class RationalsTest extends FunSpec with ShouldMatchers {

	describe ("Rational Numbers") {
		it ("Adds two rational numbers together") {
			val x = new Rational (1, 2)
			val y = new Rational (1, 3)
			
			x.add(y) should equal (new Rational(5, 6))
		}
		
		it ("Confirms that two different Rational objects of equal value are equivalent") {
			val x = new Rational (2, 3)
			val y = new Rational (2, 3)
			x should equal (y)
		}
		
		it ("Confirm that neg(5/6) is -5/6") {
			val x = new Rational (5, 6) 
			x.neg should equal (new Rational (-5, 6))
		}
		
		it ("Subtracts 1/3 from 1/2") {
			val x = new Rational (1, 2)
			val y = new Rational (1, 3)
			
			x.sub(y) should equal (new Rational (1, 6))
		}
		
		it ("Calculates 1/3 - 5/7 - 3/2 + 9/42") {
			val x = new Rational(1, 3);
			val y = new Rational(5, 7);
			val z = new Rational(3, 2);
			val w = new Rational(9, 42);
			
			x.sub(y).sub(z).add(w).toString should equal (new Rational (-5, 3).toString)
		}
	}
  

}