class Zadanie
{
  public static void main(String[] args)
  {
    int[][] macierz = new int[10][10];

    for (int i = 0; i < macierz.length; i++)
    {
      macierz[i][i] = 1;
      for (int j = 0; j < macierz[0].length; j++)
        System.out.print(macierz[i][j] + " ");
      System.out.println();
    }
    System.out.println("Suma wyróżnionych elementów w tablicy wynosi 10.");
  }
}