object ArmstrongNumbers {

  def isArmstrongNumber(value: Int): Boolean = {
     val list = value.toString.toList
     list.map( character => character.toInt - '0' )
         .map( num => math.pow( num, list.size) )
         .sum.toInt == value
  }
  
}