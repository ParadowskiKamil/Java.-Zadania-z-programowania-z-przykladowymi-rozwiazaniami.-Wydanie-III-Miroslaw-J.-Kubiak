class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
    final String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZZYXWVUTSRQPONMLKJIHGFEDCBA";

    for (int i = 0; i < alfabet.length(); i++)
      System.out.print(i == 25 || i == 51 ? alfabet.charAt(i) + ".\n" : alfabet.charAt(i) + ", ");
  }
}