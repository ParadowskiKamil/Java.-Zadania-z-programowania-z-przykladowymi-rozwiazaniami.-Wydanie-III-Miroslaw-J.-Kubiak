class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program oblicza wartość funkcji y = 3*x\ndla x zmieniającego się od 0 do 10.");
    int x = 0;
    
    do
    {
      final int y = 3 * x;
      System.out.println("x = " + x + "\ty = " + y);
    } while (++x <= 10);
  }
}