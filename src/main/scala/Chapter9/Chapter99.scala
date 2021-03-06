package Chapter9
import java.io.File  
object Chapter99 extends App {

val path = "src"
val dir = new File(path)  
def subdirs(dir:File):Iterator[File]={  
  val children = dir.listFiles().filter(_.getName.endsWith("class"))  
  children.toIterator ++ dir.listFiles().filter(_.isDirectory).toIterator.flatMap(subdirs _)  
}  

val n = subdirs(dir).length  
println(n) 
}