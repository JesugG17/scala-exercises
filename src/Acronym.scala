object Acronym {
  def abbreviate(phrase: String): String = {

    val list = phrase.replace('-',' ').split(" ").toList.filter( some => some.nonEmpty )

    var abbreviate = ""
    list.foreach( word => {
      abbreviate += word.trim.head
    })

    abbreviate.toUpperCase()
  }
}