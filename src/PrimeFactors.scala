object PrimeFactors {


    def factors(number: Long, divisor: Int = 2): List[Long] = {
      if ( number <= 1 ) {
        return Nil
      }

      if ( number % divisor == 0 ) {
        List[Long]( divisor ) ++ factors( number / divisor , divisor )
      } else {
        factors( number, divisor + 1 )
      }
  }
}