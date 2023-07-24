object CaesarCipher {
  def main(args: Array[String]): Unit = {
    println(encryption("Hello", 0, -1));
    println(decryption(encryption("Hello", 0, -1), 0, -1))
  }

  def encryption(text: String, index: Int, encKey: Int): String = {
    if (index == text.length - 1) {
      return ((text.charAt(index) + encKey).toChar).toString;
    }
    return ((text.charAt(index) + encKey).toChar).toString + encryption(text, index + 1, encKey);
  }

  def decryption(text: String, index: Int, decKey: Int): String = {
    if (index == text.length - 1) {
      return ((text.charAt(index) - decKey).toChar).toString;
    }
    return ((text.charAt(index) - decKey).toChar).toString + decryption(text, index + 1, decKey);
  }
}
