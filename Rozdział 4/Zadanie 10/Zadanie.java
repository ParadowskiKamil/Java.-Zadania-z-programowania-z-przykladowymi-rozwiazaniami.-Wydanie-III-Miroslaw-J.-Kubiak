class Zadanie
{
  public static void main(String[] args)
  {
    int[][] a = new int[10][10];
    int[][] b = new int[10][10];

    System.out.println("Macierz a.");
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[0].length; j++)
      {
        a[i][j] = 1;
        b[i][j] = 2;
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\nMacierz b.");
    for (int i = 0; i < b.length; i++)
    {
      for (int j = 0; j < b[0].length; j++)
        System.out.print(b[i][j] + " ");
      System.out.println();
    }

    System.out.println("\nMacierz c = a-b.");
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[0].length; j++)
        System.out.print(a[i][j] - b[i][j] + " ");
      System.out.println();
    }
  }
}