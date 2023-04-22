class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
    final String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZZYXWVUTSRQPONMLKJIHGFEDCBA";
    int indeks = 0;

    do
      System.out.print(indeks == 25 || indeks == 51 ? alfabet.charAt(indeks) + ".\n" : alfabet.charAt(indeks) + ", ");
    while (++indeks < alfabet.length());
  }
}