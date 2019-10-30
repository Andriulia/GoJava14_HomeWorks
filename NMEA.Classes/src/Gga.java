public class Gga {

    static void gga() {
        Object[] s1 = new Object[Utils.s.length + 4];

        s1[0] = Utils.s[0];
        s1[1] = Byte.parseByte(Utils.s[1].substring(0, 2));
        s1[2] = Byte.parseByte(Utils.s[1].substring(2, 4));
        s1[3] = Byte.parseByte(Utils.s[1].substring(4, 6));
        s1[4] = Utils.s[1].substring(6, 7);
        s1[5] = Byte.parseByte(Utils.s[1].substring(7));
        s1[6] = Utils.floatNull(Utils.s[2]);
        s1[7] = Utils.stringNull(Utils.s[3]);
        s1[8] = Utils.floatNull(Utils.s[4]);
        s1[9] = Utils.stringNull(Utils.s[5]);
        for (int i = 10; i < 12; i++) s1[i] = Utils.byteNull(Utils.s[i - 4]);
        for (int i = 12; i < 14; i++) s1[i] = Utils.floatNull(Utils.s[i - 4]);
        s1[14] = Utils.stringNull(Utils.s[10]);
        s1[15] = Utils.floatNull(Utils.s[11]);
        s1[16] = Utils.stringNull(Utils.s[12]);
        s1[17] = Utils.floatNull(Utils.s[13]);
        s1[18] = Utils.shortNull(Utils.s[14]);

        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Время UTC определения координат hh" + " (byte)");
        System.out.println(s1[2] + " Время UTC определения координат mm" + " (byte)");
        System.out.println(s1[3] + " Время UTC определения координат ss" + " (byte)");
        System.out.println(s1[5] + " Время UTC определения координат mss" + " (byte)");
        System.out.println(s1[6] + " Широта – С/Ю" + " (float)");
        System.out.println(s1[7] + " Широта – С/Ю" + " (String)");
        System.out.println(s1[8] + " Долгота – В/З" + " (float)");
        System.out.println(s1[9] + " Долгота – В/З" + " (String)");
        System.out.println(s1[10] + " Режим работы приемника" + " (byte)");
        System.out.println(s1[11] + " Количество спутников в решении, 00-12, может отличаться от количества видимых" + " (byte)");
        System.out.println(s1[12] + " HDOP" + " (float)");
        System.out.println(s1[13] + " Высота над средним уровнем моря, метров" + " (float)");
        System.out.println(s1[14] + " Высота над средним уровнем моря, метров" + " (String)");
        System.out.println(s1[15] + " Высота над геоидом, метров" + " (float)");
        System.out.println(s1[16] + " Высота над геоидом, метров" + " (String)");
        System.out.println(s1[17] + " Возраст дифференциальных поправок" + " (float)");
        System.out.println(s1[18] + " ID Дифференциальной станции" + " (short)");

        System.out.println("\nРежим работы приемника:\n" +
                "\n" +
                "0 = Координаты недоступны или недостоверны\n" +
                "1 = Режим GPS SPS, координаты достоверны\n" +
                "2 = Дифференциальный GPS, режим GPS SPS\n" +
                "3 = Режим GPSPPS, координаты достоверны\n" +
                "4 = RTK\n" +
                "5 = Float RTK\n" +
                "6 = Режим экстраполяции координат\n" +
                "7 = Режим ручного ввода\n" +
                "8 = Режим симулятора.\n" +
                "\n" +
                "Поле «Режим работы приемника» не должно быть пустым.\n" +
                "\n" +
                "Возраст дифференциальных поправок:\n" +
                "\n" +
                "Количество секунд, прошедшее с момента прихода сообщения SC104 тип 1 или 9; нулевое поле, если DGNSS не используется.\n" +
                "\n" +
                "Высота над геоидом:\n" +
                "\n" +
                "Высота над геоидом: различие между поверхностью земного эллипсоида WGS-84 и средним уровнем моря (поверхностью геоида). «-» = средний уровень моря находится ниже уровня поверхности эллипсоида WGS-84.");
    }

}
