class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla liczby całkowite od 1 do 20.");
    int liczba = 0;

    while (++liczba <= 20)
      System.out.print(liczba < 20 ? liczba + ", " : liczba + ".\n");
  }
}