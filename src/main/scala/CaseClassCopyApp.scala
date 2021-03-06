import shapeless._
import record._, syntax.singleton._
/**
 * Created by monkeygroover on 23/06/2015.
 */
object CaseClassCopyApp extends App {

  case class Nested(value: String)
  case class B(i: Int)
  case class C(s: String)
  case class Foo(blah: String, blah2: List[Nested], b: B, c: C)
  val foo = Foo("hello", Nested("huh") :: Nested("huh") :: Nil, B(3), C("dfdf"))

  val fooRecord = LabelledGeneric[Foo].to(foo)

  case class Bar(id: String, blah: String,blah2: List[Nested], b: B, c: C)

  val bar = LabelledGeneric[Bar].from(('id ->> "uuid") :: fooRecord)

  println(bar)
}
