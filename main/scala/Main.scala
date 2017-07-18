/**
  * Created by Administrator on 18/07/2017.
  */
object Main extends BaseTest {

  val consoleInput = scala.io.StdIn.readLine().toInt

  // Check number of digits.

  def digitLength(x: Int, i: Int = 1): Int = {
    if (x < 10) i
    else digitLength(x / 10, i + 1)
  }

  // Method to split number into digits for printing to console

  def split(x: Int): List[Int] = {

   val splitInteger = x.toString.map(_.asDigit).toList
    splitInteger

  }

  def checkInput(x: Int) = x match {

    case 1 if x > 1 && x < 3 =>
      "Short Scale: " + consoleInput + "\n" + "Long Scale: " + consoleInput;
    case 2 if x > 3 && x < 6 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "thousand" +
          split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "\n" +
      "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "thousand" +
          split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5);
    case 3 if x > 6 && x < 9 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "million" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "thousand" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "\n" +
      "Long Scale: " + split(consoleInput).head + + split(consoleInput)(1) + split(consoleInput)(2) + "million" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "thousand" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8);
    case 4 if x > 9 && x < 12 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "billion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "million" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "thousand" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "\n" +
      "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "milliard" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "million" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "thousand" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11);
    case 5 if x > 12 && x < 15 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "billion" +
        ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "million" +
        ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "thousand" +
        ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "\n" +
  }

  def main(args: Array[String]): Unit = {



  }



}
