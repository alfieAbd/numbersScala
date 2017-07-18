/**
  * Created by Administrator on 18/07/2017.
  */
object Main extends BaseTest {

  val consoleInput: String = scala.io.StdIn.readLine()
  val length: Int = consoleInput.length()
  val grouped: List[String] = consoleInput.grouped(3).toList

  def checkLength(x: Int): String = x match {

      case _ if x > 0 && x <= 3 =>
        "Short Scale: " + grouped.head + "\n" + "Long Scale: " + grouped.head;
      case _ if x > 3 && x <= 6 =>
        "Short Scale: " + grouped.head + " thousand and " + grouped(1) + "\n" +
        "Long Scale: " + grouped.head + " thousand and " + grouped(1);
      case _ if x > 6 && x <= 9 =>
        "Short Scale: " + grouped.head + " million, " + grouped(1) + " thousand and " + grouped(2) + "\n" +
        "Long Scale: " + grouped.head + " million, " + grouped(1) + " thousand and " + grouped(2);
      case _ if x > 9 && x <= 12 =>
        "Short Scale: " + grouped.head + " billion, " + grouped(1) + " million, " + grouped(2) + " thousand and " +
          grouped(3) + "\n" +
        "Long Scale: " + grouped.head + " milliard, " + grouped(1) + " million, " + grouped(2) + " thousand and " +
          grouped(3);
      case _ if x > 12 && x <= 15 =>
        "Short Scale: " + grouped.head + " trillion, " + grouped(1) + " billion, " + grouped(2) + " million, " +
          grouped(3) + " thousand and " + grouped(4) + "\n" +
        "Long Scale: " + grouped.head + " billion, " + grouped(1) + " milliard, " + grouped(2) + " million, " +
          grouped(3) + " thousand and " + grouped(4);
      case _ if x > 15 && x <= 18 =>
        "Short Scale: " + grouped.head + " quadrillion, " + grouped(1) + " trillion, " + grouped(2) + " billion, " +
          grouped(3) + " million, " + grouped(4) + " thousand and " + grouped(5) + "\n" +
        "Long Scale: " + grouped.head + " billiard, " + grouped(1) + " billion, " + grouped(2) + " milliard, " +
          grouped(3) + " million, " + grouped(4) + "thousand and " + grouped(5);
      case _ if x > 18 && x <= 21 =>
        "Short Scale: " + grouped.head + " quintillion, " + grouped(1) + " quadrillion, " + grouped(2) + " trillion, " +
          grouped(3) + " billion, " + grouped(4) + " million " + grouped(5) + " thousand and " + grouped(6) + "\n" +
        "Long Scale: " + grouped.head + " trillion, " + grouped(1) + " billiard, " + grouped(2) + " billion, " +
          grouped(3) + " milliard, " + grouped(4) + " million " + grouped(5) + " thousand and " + grouped(6);
      case _ if x > 21 && x <= 24 =>
        "Short Scale: " + grouped.head + " sextillion, " + grouped(1) + " quintillion, " + grouped(2) + " quadrillion, " +
          grouped(3) + " trillion, " + grouped(4) + " billion " + grouped(5) + " million " + grouped(6) +
          " thousand and " + grouped(7) + "\n" +
        "Long Scale: " + grouped.head + " trilliard, " + grouped(1) + " trillion, " + grouped(2) + " billiard, " +
          grouped(3) + " billion, " + grouped(4) + " milliard " + grouped(5) + " million " + grouped(6) +
          " thousand and " + grouped(7);
      case _ => "Invalid Input";
  }

  def main(args: Array[String]): Unit = {
    println(checkLength(length))
  }



}
