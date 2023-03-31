import java.util.ArrayList;

public class Zadanie2 {
    /**
     * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
     * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
     * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
     *
     * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
     */
    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        ArrayList<Integer> wynik = new ArrayList<>();
        int znalezione = 0;
        int liczba =1;
        int dzielnik, suma;
        while(znalezione<n){
            suma=0;
            for(dzielnik=1;dzielnik<liczba;dzielnik++){
                if((liczba%dzielnik)==0) {
                    suma += dzielnik;
                }
            }
            if(liczba==suma){
                wynik.add(liczba);
                znalezione++;
            }
            liczba++;
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }
}
