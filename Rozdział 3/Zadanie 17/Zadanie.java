import java.util.Random;

class Zadanie
{
  public static void main(String[] args)
  {
    System.out.println("Program losuje 5 liczb całkowitych od 0 do 99,\na następnie znajduje najmniejszą i największą");
    System.out.println("oraz oblicza średnią ze wszystkich wylosowanych liczb.\n");
    double sumaWszystkichWylosowanychLiczb = 0.0;
    double najwiekszaWartoscZeZbioruWylosowanychLiczb = 0.0;
    double najmniejszaWartoscZeZbioruWylosowanychLiczb = 99.0;
    double[] wylLiczb = new double[5];
    int indeksTablicy = 0;
    final Random generatorLiczbLosowych = new Random();

    do
    {
      wylLiczb[indeksTablicy] = generatorLiczbLosowych.nextInt(100);
      if (wylLiczb[indeksTablicy] > najwiekszaWartoscZeZbioruWylosowanychLiczb)
        najwiekszaWartoscZeZbioruWylosowanychLiczb = wylLiczb[indeksTablicy];
      if (wylLiczb[indeksTablicy] < najmniejszaWartoscZeZbioruWylosowanychLiczb)
        najmniejszaWartoscZeZbioruWylosowanychLiczb = wylLiczb[indeksTablicy];
      sumaWszystkichWylosowanychLiczb += wylLiczb[indeksTablicy];
    } while (++indeksTablicy < wylLiczb.length);
    
    System.out.print("Wylosowano liczby: ");
    System.out.println(wylLiczb[0] + ", " + wylLiczb[1] + ", " + wylLiczb[2] + ", " + wylLiczb[3] + ", " + wylLiczb[4] + ",");
    System.out.println("największa liczba to " + najwiekszaWartoscZeZbioruWylosowanychLiczb + ",");
    System.out.println("najmniejsza liczba to " + najmniejszaWartoscZeZbioruWylosowanychLiczb + ",");
    System.out.println("średnia = " + sumaWszystkichWylosowanychLiczb / wylLiczb.length + ".");
  }
}