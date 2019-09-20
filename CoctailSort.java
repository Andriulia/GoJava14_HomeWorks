import java.util.ArrayList;

public class CoctailSort {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        int a = (int)(Math.random()*1000);
        int b;

        for (int i = 0; i < a ; i++) {
            b = (int)(Math.random()*2001) - 1000;
            ar.add(b);
        }
        System.out.println(ar);

        for (int i = 0; i < ar.size()-1; i++) {
            for (int j = 1; j < ar.size()-i-1; j++) {
                if (ar.get(j) > ar.get(j+1)) {
                    b = ar.get(j);
                    ar.set(j, ar.get(j+1));
                    ar.set((j+1), b);
                }
            }
            for (int j = ar.size()-i-1; j > 0; j--) {
                if (ar.get(j) < ar.get(j-1)) {
                    b = ar.get(j-1);
                    ar.set((j-1), ar.get(j));
                    ar.set(j, b);
                }

            }
        }
        System.out.println(ar);
    }
}

//Можно переписать и обычным массивом, но вдруг "черновик" сойдет!.. :-)