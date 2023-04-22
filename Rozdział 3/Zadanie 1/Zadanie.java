class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza wartość funkcji y = 3*x\ndla x zmieniającego się od 0 do 10.");
    for (int x = 0; x <= 10; x++)
    {
      final int y = 3 * x;
      System.out.println("x = " + x + "\ty = " + y);
    }
  }
}