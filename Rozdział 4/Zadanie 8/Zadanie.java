class Zadanie
{
  public static void main(String[] args)
  {
    int[][] a = new int[10][10];
    int[][] b = new int[10][10];

    System.out.println("Wyświetlenie zawartości tablicy a:");
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[0].length; j++)
      {
        a[i][j] = j;
        b[j][i] = a[i][j];
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\nWyświetlenie zawartości tablicy b:");
    for (int i = 0; i < b.length; i++)
    {
      for (int j = 0; j < b[0].length; j++)
        System.out.print(b[i][j] + " ");
      System.out.println();
    }
  }
}