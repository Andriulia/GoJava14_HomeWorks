public class Gll {

    static void gll() {
        Object[] s1 = new Object[12];

        s1[0] = Utils.s[0];
        s1[1] = Float.parseFloat(Utils.s[1]);
        s1[2] = Utils.s[2];
        s1[3] = Float.parseFloat(Utils.s[3]);
        s1[4] = Utils.s[4];
        s1[5] = Byte.parseByte(Utils.s[5].substring(0, 2));
        s1[6] = Byte.parseByte(Utils.s[5].substring(2, 4));
        s1[7] = Byte.parseByte(Utils.s[5].substring(4, 6));
        s1[8] = Utils.s[5].substring(6, 7);
        s1[9] = Byte.parseByte(Utils.s[5].substring(7));
        for (int i = 10; i < 12; i++) s1[i] = Utils.stringNull(Utils.s[i - 4]);


        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Широта – С/Ю" + " (float)");
        System.out.println(s1[2] + " Широта – С/Ю" + " (String)");
        System.out.println(s1[3] + " Долгота – В/З" + " (float)");
        System.out.println(s1[4] + " Долгота – В/З" + " (String)");
        System.out.println(s1[5] + " Время UTC определения координат hh" + " (byte)");
        System.out.println(s1[6] + " Время UTC определения координат mm" + " (byte)");
        System.out.println(s1[7] + " Время UTC определения координат ss" + " (byte)");
        System.out.println(s1[9] + " Время UTC определения координат mss" + " (byte)");
        System.out.println(s1[10] + " Статус: A = данные достоверны, V = данные не достоверны" + " (String)");
        System.out.println(s1[11] + " Индикатор режима" + " (String)");

        System.out.println("\nИндикатор режима/Статус:\n" +
                "\n" +
                "A = Автономный режим\n" +
                "D = Дифференциальный режим\n" +
                "E = Экстраполяция координат\n" +
                "M = Режим ручного ввода\n" +
                "S = Режим симулятора\n" +
                "N = Недостоверные данные\n" +
                "\n" +
                "Поле «Индикатор режима» дополняет поле «Статус», которое содержит значение V = Invalid для всех значений поля «Индикатор режима», кроме значений A = Автономный режим и D = дифференциальный режим.");
    }

}
