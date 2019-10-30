public class Rmc {

    static void rmc() {
        Object[] s1 = new Object[Utils.s.length + 6];

        s1[0] = Utils.s[0];
        s1[1] = Byte.parseByte(Utils.s[1].substring(0, 2));
        s1[2] = Byte.parseByte(Utils.s[1].substring(2, 4));
        s1[3] = Byte.parseByte(Utils.s[1].substring(4, 6));
        s1[4] = Utils.s[1].substring(6, 7);
        s1[5] = Byte.parseByte(Utils.s[1].substring(7));
        s1[6] = Utils.stringNull(Utils.s[2]);
        s1[7] = Utils.floatNull(Utils.s[3]);
        s1[8] = Utils.stringNull(Utils.s[4]);
        s1[9] = Utils.floatNull(Utils.s[5]);
        s1[10] = Utils.stringNull(Utils.s[6]);
        for (int i = 11; i < 13; i++) s1[i] = Utils.floatNull(Utils.s[i - 4]);
        s1[13] = Byte.parseByte(Utils.s[9].substring(0, 2));
        s1[14] = Byte.parseByte(Utils.s[9].substring(2, 4));
        s1[15] = Byte.parseByte(Utils.s[9].substring(4, 6));
        s1[16] = Utils.floatNull(Utils.s[5]);
        for (int i = 17; i < 19; i++) s1[i] = Utils.stringNull(Utils.s[i - 6]);

        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Время UTC определения координат hh" + " (byte)");
        System.out.println(s1[2] + " Время UTC определения координат mm" + " (byte)");
        System.out.println(s1[3] + " Время UTC определения координат ss" + " (byte)");
        System.out.println(s1[5] + " Время UTC определения координат mss" + " (byte)");
        System.out.println(s1[6] + " Статус: A = данные достоверны, V = предупреждение ГНСС приемника" + " (String)");
        System.out.println(s1[7] + " Широта – С/Ю" + " (float)");
        System.out.println(s1[8] + " Широта – С/Ю" + " (String)");
        System.out.println(s1[9] + " Долгота – В/З" + " (float)");
        System.out.println(s1[10] + " Долгота – В/З" + " (String)");
        System.out.println(s1[11] + " Скорость относительно земли, узлов" + " (float)");
        System.out.println(s1[12] + " Курс, град (истинный)" + " (float)");
        System.out.println(s1[13] + " Дата: дд" + " (String)");
        System.out.println(s1[14] + " Дата: мм" + " (String)");
        System.out.println(s1[15] + " Дата: гг" + " (String)");
        System.out.println(s1[16] + " Магнитное склонение, градусов В/З" + " (float)");
        System.out.println(s1[17] + " Магнитное склонение, градусов В/З" + " (String)");
        System.out.println(s1[18] + " Индикатор режима" + " (String)");

        System.out.println("\nМагнитное склонение, градусов В/З:\n" +
                "\n" +
                "Восточное склонение вычитается из истинного курса, западное склонение складывается с истинным курсом.\n" +
                "\n" +
                "Индикатор режима/Статус:\n" +
                "\n" +
                "A = Автономный режим\n" +
                "D = Дифференциальный режим\n" +
                "E = Экстраполяция координатM= Режим ручного ввода\n" +
                "S = Режим симулятора\n" +
                "N = Недостоверные данные\n" +
                "\n" +
                "Поле «Индикатор режима» дополняет поле «Статус», которое содержит значение V = Invalid для всех значений поля «Индикатор режима», кроме значений A = Автономный режим и D = Дифференциальный режим. Поля «Индикатор режима» и «Статус» не должны быть пустыми.");
    }

}
