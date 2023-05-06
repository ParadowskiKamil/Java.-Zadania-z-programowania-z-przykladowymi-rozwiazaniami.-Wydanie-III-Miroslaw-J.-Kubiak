import java.util.Arrays; 
import java.util.Collections;
import java.util.List;

class Zadanie
{
  public static void main(String[] args)
  {
    List<Integer> liczby = Arrays.asList(574, 303, 34, 125, 8, 23);

    for (int i = 0; i < liczby.size(); i++)
    {
      for (int j = 1; j < liczby.size() - i; j++)
      {
        if (liczby.get(j) < liczby.get(j - 1))
          Collections.swap(liczby, j, j - 1);
      }
    }

    System.out.println("Dla liczb:\n574, 303, 34, 125, 8, 23\nliczby uporządkowane to:");
    for (int i = 0; i < liczby.size(); i++)
      System.out.print(i == 5 ? liczby.get(i) + ".\n" : liczby.get(i) + ", ");
  }
}