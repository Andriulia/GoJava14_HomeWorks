public class RecurNumberColumn {
    public static void main(String[] args) {
        System.out.println(newRecurLine(6));
    }

    static String newRecurLine(int x) {
        return x==1?"1": newRecurLine(x-1) + "\n" + x;
    }

}
