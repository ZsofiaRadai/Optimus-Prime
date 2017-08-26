import java.util.ArrayList;

public class CountingPrimes {
    static ArrayList<Boolean> numArray = new ArrayList<>();

    public static void countPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            numArray.add(true);
        }
        int size = numArray.size()-1;
        for (int i = 2; i <= size; i++) {
            for (int j = i * i; j <= size; j += i) {
                numArray.set(j, false);
            }
        }
        for (int i = 2; i <= size; i++) {
            if (numArray.get(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static void main (String[] args){
        countPrimes(30);
    }
}
