object CollatzConjecture {

  def steps(number: Int, steps: Int = 0): Option[Int] = {
      if ( number == 1 ) {
        return Some( steps )
      } else if ( number <= 0 ) {
        return None
      }


      if ( number % 2 == 0 ) {
        CollatzConjecture.steps( number / 2, steps + 1)
      } else {
        CollatzConjecture.steps( 3 * number + 1, steps + 1 )
      }

      

  }
  
}