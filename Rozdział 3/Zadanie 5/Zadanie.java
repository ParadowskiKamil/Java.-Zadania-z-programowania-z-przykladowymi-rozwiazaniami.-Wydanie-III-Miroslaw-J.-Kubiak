class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla liczby całkowite od 1 do 20.");
    int liczba = 1;

    do
      System.out.print(liczba < 20 ? liczba + ", " : liczba + ".\n");
    while (++liczba <= 20);
  }
}