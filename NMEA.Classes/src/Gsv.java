public class Gsv {

    static void gsv() {
        Object[] s1 = new Object[Utils.s.length];

        s1[0] = Utils.s[0];
        for (int i = 1; i < 6; i++) s1[i] = Utils.byteNull(Utils.s[i]);
        s1[6] = Utils.shortNull(Utils.s[6]);
        for (int i = 7; i < 10; i++) s1[i] = Utils.byteNull(Utils.s[i]);
        s1[10] = Utils.shortNull(Utils.s[10]);
        for (int i = 11; i < 14; i++) s1[i] = Utils.byteNull(Utils.s[i]);
        s1[14] = Utils.shortNull(Utils.s[14]);
        for (int i = 15; i < 18; i++) s1[i] = Utils.byteNull(Utils.s[i]);
        s1[18] = Utils.shortNull(Utils.s[18]);
        s1[19] = Utils.byteNull(Utils.s[19]);

        for (int i = 0; i < s1.length; i++) System.out.print(s1[i] + " ");

        System.out.println("\n\n" + s1[1] + " Общее количество сообщений" + " (byte)");
        System.out.println(s1[2] + " Номер сообщения" + "(byte)");
        System.out.println(s1[3] + " Общее количество видимых спутников" + " (byte)");
        System.out.println(s1[4] + " ID Номер спутника" + "(byte)");
        System.out.println(s1[5] + " Угол места, градусов, 90 максимум" + " (byte)");
        System.out.println(s1[6] + " Азимут, градусов истинный, 000–359" + " (short)");
        System.out.println(s1[7] + " SNR (C/N0) 00-99 дБГц, 0 если не в слежении" + " (byte)");
        System.out.println(s1[8] + " ID Номер спутника" + "(byte)");
        System.out.println(s1[9] + " Угол места, градусов, 90 максимум" + " (byte)");
        System.out.println(s1[10] + " Азимут, градусов истинный, 000–359" + " (short)");
        System.out.println(s1[11] + " SNR (C/N0) 00-99 дБГц, 0 если не в слежении" + " (byte)");
        System.out.println(s1[12] + " ID Номер спутника" + "(byte)");
        System.out.println(s1[13] + " Угол места, градусов, 90 градусов максимум" + " (byte)");
        System.out.println(s1[14] + " Азимут, градусов истинный, 000–359" + " (short)");
        System.out.println(s1[15] + " SNR (C/N0) 00-99 дБГц, 0 если не в слежении" + " (byte)");
        System.out.println(s1[16] + " ID Номер спутника" + "(byte)");
        System.out.println(s1[17] + " Угол места, градусов, 90 максимум" + " (byte)");
        System.out.println(s1[18] + " Азимут, градусов истинный, 000–359" + " (short)");
        System.out.println(s1[19] + " SNR (C/N0) 00-99 дБГц, 0 если не в слежении" + " (byte)");

        System.out.println("\nID номера спутников:\n" +
                "\n" +
                "а) Для GPS используются номера с 1 по 32\n" +
                "\n" +
                "б) Для WAASиспользуются номера с 33 по 64. WAASиспользует номера PRNс 120 по 138. Смещение между NMEA WAAS SV ID и WAAS PRN равняется 87. WAAS с PRN, равным 120, соответствует SV ID равный 33 (120-87 = 33)\n" +
                "\n" +
                "в) Номера с 65 до 96 зарезервированы для спутников ГЛОНАСС. Спутники ГЛОНАСС обозначаются номером 64 + номер системной точки. Номера системных точек с 1 по 24 для полной группировки ГЛОНАСС приводят к диапазону чисел 65-88. Номера с 88 по 96 доступны для номеров системных точек,превышающих 24, и предназначеныдля запасных КА.");
    }

}
