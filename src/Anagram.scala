object Anagram {

  def findAnagrams(text: String, list: List[String] ): List[Any] = {
      list.filter( word => !text.equalsIgnoreCase( word )  
                           && 
                           text.toLowerCase().sorted == word.toLowerCase().sorted )
  }
} 