package rationals

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{FunSpec, GivenWhenThen, Tag}

class MoreRationalsTest extends FunSpec with ShouldMatchers with GivenWhenThen {

	describe ("More tests demonstrating more FunSpec features") {
		/*
		 * The calls to Tag have the same effect as tags do in a typical blog.
		 * It associates some keywords with a particular test which you may later use
		 * to run all known tests that were tagged with those keywords.
		 * 
		 * For Example:
		 * $ test-only -- -n rational
		 */
		it ("Can add two Rational Numbers together", Tag("add"), Tag("rational")) {
			given ("Two Rational Numbers") 
			val x = new Rational(5, 6)
			val y = new Rational(7, 8)
			
			when ("we add y to x")
			val z = x add y
			
			then ("We confirm it's not null")
			z should not be (null)
			
			and ("we test the result")
			z should equal (new Rational(41, 24))

			info ("All is well")
		}
		
		it ("Can add two Rationals using an operator symbol", Tag("add"), Tag("rational")) {
			val x = new Rational(5, 6)
			val y = new Rational(7, 8)
			
			val z = x + y
			
			z should equal (new Rational(41, 24))
		}
		
		it ("Can find the quantum root of a Rational", Tag("quantum"), Tag("rational")) {
			info ("No idea what a quantum root is so I have not yet coded a test for this")
			pending 
		}
	}
	
	
	
 }