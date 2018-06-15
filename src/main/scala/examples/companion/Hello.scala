package examples.companion

import examples.companion.Hello.message

/**
  * @author linahovanessian on 6/15/18.
  */
object Hello {

  private val message: String = "Hello-private value";


  def main(args: Array[String]): Unit = {
    new Hello();
  }


}

// default value is set to Hello.message
class Hello(message: String = Hello.message) {
  println(Hello.message);

}
