public class DrawSquare {
    public static void main(String[] args) {
        drawRectangle(11);
    }

    static void drawRectangle(int a, int b) {
        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    static void drawRectangle(int a) {
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

}
