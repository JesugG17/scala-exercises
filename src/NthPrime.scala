import scala.annotation.tailrec
import scala.math.sqrt
object NthPrime {

  @tailrec
  def prime(times: Int, number: Int = 2, iteration: Int = 0): Option[Int] = {
    if ( times == 0 ) {
      return None
    }

    if ( iteration == times ) {
      return Some( number - 1 )
    }

    if ( isPrime( number ) ) {
      prime( times, number + 1, iteration + 1 )
    } else {
      prime( times, number + 1, iteration )
    }


  }

  def isPrime(num: Int): Boolean = (2 to sqrt( num ).toInt).forall( divisor => num % divisor != 0 )
}