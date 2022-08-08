object SumOfMultiples {
  
  def sum(factors: Set[Int], limit: Int): Int = {
    
    (1 until limit).filter(value => factors.exists( number => { value % number == 0 })).sum

  }

}