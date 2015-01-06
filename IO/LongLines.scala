import scala.io.Source

object LongLines{
  def processFile(filename: String, width: Int):String = {
    val source = Source.fromFile(filename)
    val lines = for (line <- source.getLines; if (line.length > width)) 
      yield (filename + ":" + line.trim)
    lines.mkString
  }
  def main(args: Array[String]){
    val width = args(0).toInt
    for (arg <- args.drop(1))
      println(processFile(arg, width))
  }
}

//println( if (args.length > 0) LongLines.processFile(args(0), 80) else "hum?")
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
