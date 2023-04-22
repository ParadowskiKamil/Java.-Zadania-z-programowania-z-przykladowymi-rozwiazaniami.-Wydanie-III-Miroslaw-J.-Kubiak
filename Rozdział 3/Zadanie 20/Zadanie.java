class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
    int numerWiersza = 1;
    
    do
    {
      int numerKolumny = 1;
      
      do
        System.out.printf("%4d", numerWiersza * numerKolumny);
      while (++numerKolumny <= 10);

      System.out.println();
    } while (++numerWiersza <= 10);
  }
}