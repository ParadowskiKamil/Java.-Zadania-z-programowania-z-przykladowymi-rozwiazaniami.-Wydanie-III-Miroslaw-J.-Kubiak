class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100.");
    for (int i = 1; i <= 10; i++)
    {
      for (int j = 1; j <= 10; j++)
        System.out.printf("%4d", i * j);
      System.out.println();
    }
  }
}