public class ParseOfNMEA {

//    static String protocol = "$GPGSV,3,1,10,23,38,230,44,29,71,156,47,07,29,116,41,08,09,081,36*7F";
//    static String protocol = "$GPGLL,4717.11364,N,00833.91565,E,092321.00,A,A*60";
//    static String protocol = "$GPRMC,083559.00,A,4717.11437,N,00833.91522,E,0.004,77.52,091202,,,A*57";
//    static String protocol = "$GPVTG,77.52,T,,M,0.004,N,0.008,K,A*06";
    static String protocol = "$GPGGA,172814.0,3723.46587704,N,12202.26957864,W,2,6,1.2,18.893,M,-25.669,M,2.0,0031*4F";
//    static String protocol = "$GPGSA,A,3,23,29,07,08,09,18,26,28,,,,,1.94,1.18,1.54*0D";

    static String[] s = protocol.substring(1, protocol.indexOf("*")).split(",");


    public static void main(String[] args) {
        System.out.println(protocol.substring(1, protocol.indexOf("*")));
        System.out.println("\n" + s.length);

        parse();
    }

    static void gsv() {
        Object[] s1 = new Object[s.length];

        s1[0] = s[0];
        for (int i = 1; i < 6; i++) s1[i] = byteNull(s[i]);
        s1[6] = shortNull(s[6]);
        for (int i = 7; i < 10; i++) s1[i] = byteNull(s[i]);
        s1[10] = shortNull(s[10]);
        for (int i = 11; i < 14; i++) s1[i] = byteNull(s[i]);
        s1[14] = shortNull(s[14]);
        for (int i = 15; i < 18; i++) s1[i] = byteNull(s[i]);
        s1[18] = shortNull(s[18]);
        s1[19] = byteNull(s[19]);

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

    static void gll() {
        Object[] s1 = new Object[12];

        s1[0] = s[0];
        s1[1] = Float.parseFloat(s[1]);
        s1[2] = s[2];
        s1[3] = Float.parseFloat(s[3]);
        s1[4] = s[4];
        s1[5] = Byte.parseByte(s[5].substring(0, 2));
        s1[6] = Byte.parseByte(s[5].substring(2, 4));
        s1[7] = Byte.parseByte(s[5].substring(4, 6));
        s1[8] = s[5].substring(6, 7);
        s1[9] = Byte.parseByte(s[5].substring(7));
        for (int i = 10; i < 12; i++) s1[i] = stringNull(s[i - 4]);


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

    static void rmc() {
        Object[] s1 = new Object[s.length + 6];

        s1[0] = s[0];
        s1[1] = Byte.parseByte(s[1].substring(0, 2));
        s1[2] = Byte.parseByte(s[1].substring(2, 4));
        s1[3] = Byte.parseByte(s[1].substring(4, 6));
        s1[4] = s[1].substring(6, 7);
        s1[5] = Byte.parseByte(s[1].substring(7));
        s1[6] = stringNull(s[2]);
        s1[7] = floatNull(s[3]);
        s1[8] = stringNull(s[4]);
        s1[9] = floatNull(s[5]);
        s1[10] = stringNull(s[6]);
        for (int i = 11; i < 13; i++) s1[i] = floatNull(s[i - 4]);
        s1[13] = Byte.parseByte(s[9].substring(0, 2));
        s1[14] = Byte.parseByte(s[9].substring(2, 4));
        s1[15] = Byte.parseByte(s[9].substring(4, 6));
        s1[16] = floatNull(s[5]);
        for (int i = 17; i < 19; i++) s1[i] = stringNull(s[i - 6]);

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

    static void vtg() {
        Object[] s1 = new Object[s.length];

        s1[0] = s[0];
        s1[1] = floatNull(s[1]);
        s1[2] = stringNull(s[2]);
        s1[3] = floatNull(s[3]);
        s1[4] = stringNull(s[4]);
        s1[5] = floatNull(s[5]);
        s1[6] = stringNull(s[6]);
        s1[7] = floatNull(s[7]);
        for (int i = 8; i < 10; i++) s1[i] = stringNull(s[i]);

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

    static void gga() {
        Object[] s1 = new Object[s.length + 4];

        s1[0] = s[0];
        s1[1] = Byte.parseByte(s[1].substring(0, 2));
        s1[2] = Byte.parseByte(s[1].substring(2, 4));
        s1[3] = Byte.parseByte(s[1].substring(4, 6));
        s1[4] = s[1].substring(6, 7);
        s1[5] = Byte.parseByte(s[1].substring(7));
        s1[6] = floatNull(s[2]);
        s1[7] = stringNull(s[3]);
        s1[8] = floatNull(s[4]);
        s1[9] = stringNull(s[5]);
        for (int i = 10; i < 12; i++) s1[i] = byteNull(s[i - 4]);
        for (int i = 12; i < 14; i++) s1[i] = floatNull(s[i - 4]);
        s1[14] = stringNull(s[10]);
        s1[15] = floatNull(s[11]);
        s1[16] = stringNull(s[12]);
        s1[17] = floatNull(s[13]);
        s1[18] = shortNull(s[14]);

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

    static void gsa() {
        Object[] s1 = new Object[s.length];

        s1[0] = s[0];
        s1[1] = stringNull(s[1]);
        for (int i = 2; i < 15; i++) s1[i] = shortNull(s[i]);
        for (int i = 15; i < 18; i++) s1[i] = floatNull(s[i]);

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

    static Object shortNull(String s) {
        if (s.isEmpty()) {
            Object s1 = null;
            return s1;
        } else {
            Object s1 = Short.parseShort(s);
            return s1;
        }
    }

    static Object byteNull(String s) {
        if (s.isEmpty()) {
            Object s1 = null;
            return s1;
        } else {
            Object s1 = Byte.parseByte(s);
            return s1;
        }
    }

    static Object floatNull(String s) {
        if (s.isEmpty()) {
            Object s1 = null;
            return s1;
        } else {
            Object s1 = Float.parseFloat(s);
            return s1;
        }
    }

    static Object stringNull(String s) {
        if (s.isEmpty()) {
            Object s1 = null;
            return s1;
        } else {
            return s;
        }
    }

    static void parse() {
        if (s[0].substring(0, 2).equals("GP")) System.out.println("GPS\n");
        if (s[0].substring(0, 2).equals("GL")) System.out.println("ГЛОНАСС\n");
        if (s[0].substring(0, 2).equals("GN")) System.out.println("GPS+ГЛОНАСС\n");

        if (s[0].substring(2).equals("GSV")) gsv();
        if (s[0].substring(2).equals("GLL")) gll();
        if (s[0].substring(2).equals("RMC")) rmc();
        if (s[0].substring(2).equals("VTG")) vtg();
        if (s[0].substring(2).equals("GGA")) gga();
        if (s[0].substring(2).equals("GSA")) gsa();

        System.out.println("\n\nВзято с http://geostar-navi.com/files/docs/geos3/geos_nmea_protocol_v3_0_rus.pdf.");
    }

}
