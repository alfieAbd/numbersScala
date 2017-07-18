/**
  * Created by Administrator on 18/07/2017.
  */
object Main extends BaseTest {

  val consoleInput = scala.io.StdIn.readLine().toInt

  // Check number of digits.

  def digitLength(x: Int, i: Int = 1): Int = {
    if (x < 24) i
    else digitLength(x / 24, i + 1)
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
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "trillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "billion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "million" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "thousand" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "\n" +
       "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "trillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "billion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "million" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "thousand" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14);
    case 6 if x > 15 && x < 18 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "quadrillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "trillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "billion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "million" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "thousand" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17) + "\n" +
        "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "quadrillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "trillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "billion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "million" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "thousand" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17);
    case 7 if x > 18 && x < 21 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "quintillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "quadrillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "trillion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "billion" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "million" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17) + "thousand" +
                              ", " + split(consoleInput)(18) + split(consoleInput)(19) + split(consoleInput)(20) + "\n" +
      "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "quintillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "quadrillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "trillion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "billion" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "million" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17) + "thousand" +
                              ", " + split(consoleInput)(18) + split(consoleInput)(19) + split(consoleInput)(20);
    case 8 if x > 21 && x < 24 =>
      "Short Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "sextillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "quintillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "quadrillion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "trillion" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "billion" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17) + "million" +
                              ", " + split(consoleInput)(18) + split(consoleInput)(19) + split(consoleInput)(20) + "thousand" +
                                  ", " + split(consoleInput)(21) + split(consoleInput)(22) + split(consoleInput)(23) + "\n" +
      "Long Scale: " + split(consoleInput).head + split(consoleInput)(1) + split(consoleInput)(2) + "quintillion" +
          ", " + split(consoleInput)(3) + split(consoleInput)(4) + split(consoleInput)(5) + "quintillion" +
              ", " + split(consoleInput)(6) + split(consoleInput)(7) + split(consoleInput)(8) + "quadrillion" +
                  ", " + split(consoleInput)(9) + split(consoleInput)(10) + split(consoleInput)(11) + "trillion" +
                      ", " + split(consoleInput)(12) + split(consoleInput)(13) + split(consoleInput)(14) + "billion" +
                          ", " + split(consoleInput)(15) + split(consoleInput)(16) + split(consoleInput)(17) + "million" +
                              ", " + split(consoleInput)(18) + split(consoleInput)(19) + split(consoleInput)(20) + "thousand" +
                                  ", " + split(consoleInput)(21) + split(consoleInput)(22) + split(consoleInput)(23);
    case _ => "Invalid input"
  }

  def main(args: Array[String]): Unit = {

    println(digitLength(1000000000,1))

  }



}
