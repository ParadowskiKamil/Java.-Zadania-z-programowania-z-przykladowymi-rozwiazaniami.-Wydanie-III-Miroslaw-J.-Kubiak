class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
    int numerWiersza = 0;

    while (++numerWiersza <= 10)
    {
      int numerKolumny = 0;

      while (++numerKolumny <= 10)
        System.out.printf("%4d", numerWiersza * numerKolumny);
      System.out.println();
    }
  }
}