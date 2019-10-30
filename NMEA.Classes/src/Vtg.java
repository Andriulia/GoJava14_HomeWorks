public class Vtg {

    static void vtg() {
        Object[] s1 = new Object[Utils.s.length];

        s1[0] = Utils.s[0];
        s1[1] = Utils.floatNull(Utils.s[1]);
        s1[2] = Utils.stringNull(Utils.s[2]);
        s1[3] = Utils.floatNull(Utils.s[3]);
        s1[4] = Utils.stringNull(Utils.s[4]);
        s1[5] = Utils.floatNull(Utils.s[5]);
        s1[6] = Utils.stringNull(Utils.s[6]);
        s1[7] = Utils.floatNull(Utils.s[7]);
        for (int i = 8; i < 10; i++) s1[i] = Utils.stringNull(Utils.s[i]);

        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Курс, град (на истинный полюс)" + " (float)");
        System.out.println(s1[2] + " Курс, град (на истинный полюс)" + " (String)");
        System.out.println(s1[3] + " Курс, град (магнитное склонение)" + " (float)");
        System.out.println(s1[4] + " Курс, град (магнитное склонение)" + " (String)");
        System.out.println(s1[5] + " Скорость относительно земли, узлов" + " (float)");
        System.out.println(s1[6] + " Скорость относительно земли, узлов" + " (String)");
        System.out.println(s1[7] + " Скорость относительно земли, км/час" + " (float)");
        System.out.println(s1[8] + " Скорость относительно земли, км/час" + " (String)");
        System.out.println(s1[9] + " Индикатор режима" + " (String)");

        System.out.println("\nИндикатор режима:\n" +
                "\n" +
                "A = Автономный режим\n" +
                "D = Дифференциальный режим\n" +
                "E = Экстраполяция координат\n" +
                "M = Режим ручного ввода\n" +
                "S = Режим симулятора\n" +
                "N = Недостоверные данные");
    }

}
