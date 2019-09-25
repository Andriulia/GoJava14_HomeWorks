public class ParseOfNMEA {

   static String protocol = "$GPGSV,3,1,10,01,65,268,49,11,56,218,54,12,03,036,39,14,50,066,*7F";


    public static void main(String[] args) {
        System.out.println(protocol.substring(1, protocol.length()-4) + "\n");



        gpgsv();

    }

//    static String[] general(){
//
//
//    }

    static void gpgsv() {
        String[] s = protocol.substring(1, protocol.length()-4).split(",");
        System.out.println(s[4]);

        Object[] s1 = new Object[19];

        s1[0] = s[0];
        s1[1] = Byte.parseByte(s[1]);
        s1[2] = Byte.parseByte(s[2]);
        s1[3] = Byte.parseByte(s[3]);
        s1[4] = Byte.parseByte(s[4]);
        s1[5] = Byte.parseByte(s[5]);
        s1[6] = Short.parseShort(s[6]);
        s1[7] = Byte.parseByte(s[7]);
        s1[8] = s[0];
        s1[9] = s[0];
        s1[10] = s[0];
        s1[11] = s[0];
        s1[12] = s[0];
        s1[13] = s[0];
        s1[14] = s[0];
        s1[15] = s[0];
        s1[16] = s[0];
        s1[17] = s[0];
        s1[18] = s[0];

        System.out.println(s1[4]);
    }
}
