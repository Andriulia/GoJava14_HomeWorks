public class DrawRectangle {
    public static void main(String[] args) {
        drawRectangle(4, 8);
    }

    static void drawRectangle(int a, int b) {
        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
