object CaesarCipher {
  def main(args: Array[String]): Unit = {
    //    println(encryption("Hello", 0, -1));
    //    println(decryption(encryption("Hello", 0, -1), 0, -1))

    cipher("Hello", encryption, -1);
    cipher("Gdkkn", decryption, -1);
  }

  def encryption(text: String, index: Int, encKey: Int): String = {
    if (index == text.length - 1) {
      return ((text.charAt(index) + encKey).toChar).toString; //added the encryption key to make character change
    }
    return ((text.charAt(index) + encKey).toChar).toString + encryption(text, index + 1, encKey);
  }

  def decryption(text: String, index: Int, decKey: Int): String = {
    if (index == text.length - 1) {
      return ((text.charAt(index) - decKey).toChar).toString; //subtracted the encryption key to revise encryption
    }
    return ((text.charAt(index) - decKey).toChar).toString + decryption(text, index + 1, decKey);
  }

  def cipher(text: String, formatFunction: (String, Int, Int) => String, secret: Int): Unit = {
    println(formatFunction(text, 0, secret))
  }


}
