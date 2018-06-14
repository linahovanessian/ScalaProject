package examples

/**
  * @author linahovanessian on 6/13/18.
  */
object AnonymousTimer {

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 1000;
    }


  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(() => {
      println("time flies like an arrow...");
    })
  }

}
