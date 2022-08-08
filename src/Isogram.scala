object Isogram {

  def isIsogram(text: String): Boolean = {
    if ( text.isEmpty ) return true

    val onlyLetters = text.toLowerCase().filter( letter => letter.isLetter )
    onlyLetters.toSet.size == onlyLetters.size
  }
}