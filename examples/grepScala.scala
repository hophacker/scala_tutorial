def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines

def grepScala(pattern: String) = {
  val filesHere = (new java.io.File(".")).listFiles
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } yield(file + ": " + trimmed)
}

val results = grepScala(".*for.*")
for (r <- results) println(r)
