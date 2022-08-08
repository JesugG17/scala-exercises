import scala.collection.mutable                                                
class School {     
                                                            
  type DB = mutable.Map[Int, Seq[String]]                                      
                                                                               
  private var data: DB = mutable.Map.empty                                     
                                                                                                                                                                                                                  
  def add(name: String, g: Int): Unit =  {                                     
    if ( data.contains( g ) ) {                                                
      data += ( g -> ( data( g ) :+ name) )                                    
    } else {                                                                   
      data += ( g -> Seq( name ) )                                             
    }                                                                          
  }                                                                            
                                                                               
  def db: DB = data                                                            
                                                                               
  def grade(g: Int): Seq[String] = data.getOrElse( g, Nil )                      
                                                                               
  def sorted: Map[Any, Any] = {                                                
    data.keys.toList.sorted.map( key => ( key -> data( key ).sorted )).toMap   
  }    

}                                                                       