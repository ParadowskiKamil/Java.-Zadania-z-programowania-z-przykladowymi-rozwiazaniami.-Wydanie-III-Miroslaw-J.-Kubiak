class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
    final String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZZYXWVUTSRQPONMLKJIHGFEDCBA";
    int indeks = -1;

    while (++indeks < alfabet.length())
      System.out.print(indeks == 25 || indeks == 51 ? alfabet.charAt(indeks) + ".\n" : alfabet.charAt(indeks) + ", ");
  }
}