object FlattenArray {

   def flatten(list: List[Any]): List[Any] = { 
    list.flatMap( value => {
      value match {
        case int: Int => List(int)
        case list: List[Any] => flatten(list)
        case _ => Nil 
      }
    })
    
  }

}