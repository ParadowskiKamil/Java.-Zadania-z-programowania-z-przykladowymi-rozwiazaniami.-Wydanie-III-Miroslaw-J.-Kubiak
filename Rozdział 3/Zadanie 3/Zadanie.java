class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza wartość funkcji y = 3*x\ndla x zmieniającego się od 0 do 10.");
    int x = -1;

    while (++x <= 10)
    {
      final int y = 3 * x;
      System.out.println("x = " + x + "\ty = " + y);
    }
  }
}