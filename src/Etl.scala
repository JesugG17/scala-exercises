object Etl {

    def transform(map: Map[Any,Seq[String]]): Map[Any,Any] = {
     map.flatMap( pairs => pairs._2.map( letter => (letter.toLowerCase() -> pairs._1)))
    }
}