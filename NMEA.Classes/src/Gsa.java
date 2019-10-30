public class Gsa {

    static void gsa() {
        Object[] s1 = new Object[Utils.s.length];

        s1[0] = Utils.s[0];
        s1[1] = Utils.stringNull(Utils.s[1]);
        for (int i = 2; i < 15; i++) s1[i] = Utils.shortNull(Utils.s[i]);
        for (int i = 15; i < 18; i++) s1[i] = Utils.floatNull(Utils.s[i]);

        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Режим. M = Ручной, перевод в режим 2D или 3D; A =А втоматический, автоматическое переключение 2D/3D" + " (String)");
        System.out.println(s1[2] + " Режим: 1 = нет решения, 2 = 2D, 3 = 3D" + " (short)");
        System.out.println(s1[3] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[4] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[5] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[6] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[7] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[8] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[9] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[10] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[11] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[12] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[13] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[14] + " ID номера спутников, используемых в решении" + " (short)");
        System.out.println(s1[15] + " PDOP" + " (float)");
        System.out.println(s1[16] + " HDOP" + " (float)");
        System.out.println(s1[17] + " VDOP" + " (float)");

        System.out.println("\nID номера спутников:\n" +
                "\n" +
                "а) Для GPS используются номера с 1 по 32\n" +
                "\n" +
                "б) Для WAAS используются номера с 33 по 64. WAAS использует номера PRN с 120 по 138. Смещение между NMEA WAAS SV ID и WAAS PRN равняется 87. WAAS с PRN, равным 120, соответствует SV ID равный 33 (120-87 = 33)\n" +
                "\n" +
                "в) Номера с 65 до 96 зарезервированы для спутников ГЛОНАСС. Спутники ГЛОНАСС обозначаются номером 64 + номер системной точки. Номера системных точек с 1 по 24 для полной группировки ГЛОНАСС приводят к диапазону чисел 65-88. Номера с 88 по 96 доступны для номеров системных точек, превышающих 24, и предназначены для запасных КА.");
    }

}
