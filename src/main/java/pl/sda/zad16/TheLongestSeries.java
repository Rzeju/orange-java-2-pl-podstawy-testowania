package pl.sda.zad16;

public class TheLongestSeries {


    static int findSizeOfTheLongestGrowingSeries(int[] series) {
        //liczby wprowadzone przez użytkownia
        //int[] numbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 15};

        if (series == null) {
            return 0;
        }

        //licznik dla podciągu rosnącego
        int counter = 1;
        //zmienna przetrzymująca wynik
        int result = 0;

        //pętla przechodząca przez całą tablicę 'numbers'
        for (int i = 0; i < series.length - 1; i++) {
            //porównanie ze sobą kolejnych liczb w tablicy
            if (series[i] < series[i + 1]) {
                //jeżeli kolejna liczba jest większa, zwiększ licznik (podciąg jest rosnący)
                counter++;
            } else {
                //jeżeli podciąg rosnący się kończy porównaj licznik z długością obecnie najdłuższego podciągu
                if (counter > result) {
                    //przypisanie do wyniku liczni z dla dłuższego ciągu i dodanie 1 (ostatni element to również element ciągu)
                    result = counter;
                }
                //reset licznika dla kolejnego podciągu
                counter = 1;
            }
        }

        //sprawdzenie licznika dla ostatniego podciągu w tablicy
        //jeżeli ostatni podciąg jest rosnący else nie zostanie wykonane
        if (counter > result) {
            result = counter;
        }

        //wypisanie wyniku
        //System.out.println("Najdłuższy podciąg wynosi = " + result);
        return result;
    }
}
