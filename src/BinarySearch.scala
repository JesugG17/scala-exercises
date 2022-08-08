import scala.annotation.tailrec
object BinarySearch {

 def find(list: List[Int], find: Int): Option[Int] = {
    if ( list.isEmpty ) return None

    if ( list.size == 1) {

      if ( list.head == find ) return Some( 0 )
      else return None

    }

    BinarySearch( list, find, list.size / 2 )

  }


  @tailrec
  def BinarySearch(list: List[Int], find: Int, position: Int ): Option[Int] = {
    if ( position < 0 || position > list.size - 1 ) {
      return None
    }
   
    if ( find == list( position ) ) Some( position )
    else if ( find > list( list.size / 2 ) ) BinarySearch( list, find, position + 1 )
    else BinarySearch( list, find, position - 1 )

  }
}