package package1

object Letter_Counter {

  def countLetterOccurences(words: List[String]): Int = {
    val letter_counts = words.map(word => word.length)
    val total_letter_count = letter_counts.reduce(_ + _)

    total_letter_count
  }

  def main(args: Array[String]): Unit = {
    val input_words = List("apple", "banana", "cherry", "date")
    val total_letter_count = countLetterOccurences(input_words)
    println(s"Total count of letter occurences : $total_letter_count")
  }

}
