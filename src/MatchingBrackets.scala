import scala.collection.mutable
object MatchingBrackets {
  def isPaired(string: String): Boolean = {
    
    val stack  = mutable.Stack[Char]()    
    val result = string.forall( character => 
      
      character match {
        case '[' | '{' | '(' => stack.push( character ); true   		  
        case ']' | ')' | '}' => 
          var result1 = false
          if ( stack.nonEmpty ) {  
           result1 = character match {
              case '}' => stack.pop() == '{'
              case ']' => stack.pop() == '['
              case ')' => stack.pop() == '('
            }   
          }
          result1   
        case  _  => true 
      }       
    )
                                           
    stack.isEmpty && result
  }
}