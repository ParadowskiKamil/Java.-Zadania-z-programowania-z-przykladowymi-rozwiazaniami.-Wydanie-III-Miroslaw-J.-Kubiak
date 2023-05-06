class Zadanie
{
  public static void main(String[] args)
  {
    int[][] macierzKwadratowa = new int[10][10];

    for (int i = 0; i < macierzKwadratowa.length; i++)
    {
      macierzKwadratowa[i][0] = i;
      macierzKwadratowa[i][1] = i * i;
      for (int j = 0; j < macierzKwadratowa[0].length; j++)
        System.out.print(macierzKwadratowa[i][j] + " ");
      System.out.println();
    }
    System.out.println("Suma liczb znajdujących się w pierwszej kolumnie to 45.");
    System.out.println("Suma liczb znajdujących się w drugiej kolumnie to 285.");
  }
}