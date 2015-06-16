import org.ensime.json.FamilyFormats
import spray.json._

object MainApp extends App {

  case class Foo(blah: String, blah2: Option[String])
  case class Bar(boo: List[Foo])

  val wat = Bar(Foo("dfsdf", Some("dsfd")) :: Foo("feefef", None) :: Nil)

  import FamilyFormats._

  val jsonWat = wat.toJson

  println(jsonWat.prettyPrint)

  val backAgain = jsonWat.convertTo[Bar]

  println(backAgain)
}
