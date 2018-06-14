package examples

/**
  * @author linahovanessian on 6/13/18.
  */
object Timer {

  def timeFlies() {
    println("time flies like an arrow...")
  }

  def main(args: Array[String]) {
    waiter(timeFlies)
  }


  def waiter(callback2: () => Unit) {
    while (true) {
      callback2();
      Thread sleep 1000
    }
  }

}
