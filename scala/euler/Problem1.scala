#!/bin/sh
exec scala "$0" "$@"
!#

/*
 Author JTMengel 
 Date   2015-09-27
 Project Euler Problem 1 Scala Solution
 Description:
   Find the sum of all the multiples of 3 or 5 below 1000.
   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
   The sum of these multiples is 23.
*/

object EulerProblem1{
  // actual filters
  val predicate1 = (i:Int) => (i%3 == 0) || (i%5==0)

  // actual filtering logic
  def usingFilter(n: Int, predicate: (Int)=>Boolean): List[Int] = {
    for( x <- (1 to n).toList ) yield (
      if (predicate(x)) x 
      else 0
    )
  }

  // Main method, should call helper func or kick out when args unfound...
  def main(args: Array[String]) = {
    val message = try{
      s"Sum: ${usingFilter( args(0).toInt, predicate1).sum }"
    } catch {
      case t: Throwable => s"""Please pass in a single agument that is castable to an Int
                              |(for use as the upper bound on the number range to create)
                              |
                              |${t.getStackTrace}""".stripMargin
    }
    println(message)
  }
}

EulerProblem1.main(args)
