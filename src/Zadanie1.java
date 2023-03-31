public class Zadanie1 {
     /** Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
            *
            * Przykłady:
            *
            * Dla n = 1 w konsoli powinien pojawić się wzór:
            * 1
            *
            * Dla n = 2 w konsoli powinien pojawić się wzór:
            * 2 2 2
            * 2 1 2
            * 2 2 2
            *
            * Dla n = 3 w konsoli powinien pojawić się wzór:
            * 3 3 3 3 3
            * 3 2 2 2 3
            * 3 2 1 2 3
            * 3 2 2 2 3
            * 3 3 3 3 3
            *
            * Dla n = 4 w konsoli powinien pojawić się wzór:
            * 4 4 4 4 4 4 4
            * 4 3 3 3 3 3 4
            * 4 3 2 2 2 3 4
            * 4 3 2 1 2 3 4
            * 4 3 2 2 2 3 4
            * 4 3 3 3 3 3 4
            * 4 4 4 4 4 4 4
            *
      *
            */
    public static String createPicture(int n) {
         //ilość liczb to będzie 2n -1, więc indeksowane będą do 2n-2
        int rozmiar = 2*n-1;
        int[][] tablica = new int[rozmiar][rozmiar];
        int i =0,j=0;
        int x=0,y=0;
        int tmp=rozmiar-1;
        int wartosc = n;
        while (x<n){
            for(i=0+x;i<rozmiar-x;i++){
                for(j=0+x;j<rozmiar-x;j++) {
                    if (i == 0 + x || i == tmp - x || j == 0 + x || j == tmp - x) {
                        tablica[i][j] = wartosc;
                    }
               }
           }
            x++;
            wartosc--;
        }

        for (int[] array: tablica) {
            for (int a: array) {
                System.out.print(a + " ");
            }
            System.out.print("\n");
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(createPicture(4));
    }
}
