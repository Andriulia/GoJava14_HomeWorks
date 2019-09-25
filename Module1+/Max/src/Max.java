public class Max {
    public static void main(String[] args) {
        System.out.println(numMax(0.1, 16));
    }

    static double numMax(double a, double b) {
        return a==b?a:a>b?a:b;
    }

    static double numMax(double a, int b) {
        return a==b?a:a>b?a:b;
    }

    static int numMax(int a, int b) {
        return a==b?a:a>b?a:b;
    }

    static float numMax(float a, int b) { // Not
        return a==b?a:a>b?a:b;            // in
    }                                     // use.

}
