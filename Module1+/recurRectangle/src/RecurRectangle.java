public class RecurRectangle {
    public static void main(String[] args) {
        System.out.println(recurRectangle(6, 4));
    }

    static String newString(int a) {
        return a==1?"+": newString(a-1) + "+";
    }

    static String recurRectangle(int a, int b) {
        return b==1? newString(a): newString(a) + "\n" + recurRectangle(a,b-1);
    }

}
