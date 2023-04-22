class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla liczby całkowite od 1 do 20.");
    for (int i = 1; i <= 20; i++)
      System.out.print(i < 20 ? i + ", " : i + ".\n");
  }
}