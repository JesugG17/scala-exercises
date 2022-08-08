object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = {
    (1 to n).map( number => number * number ).sum
  }

  def squareOfSum(n: Int): Int = {
    math.pow( (1 to n).sum, 2).toInt
  }

  def differenceOfSquares(n: Int): Int = {
    squareOfSum( n ) - sumOfSquares( n )
  }
  
}