public class Utils {

    static String[] s = Main.protocol.substring(1, Main.protocol.indexOf("*")).split(",");

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

        if (s[0].substring(2).equals("GSV")) Gsv.gsv();
        if (s[0].substring(2).equals("GLL")) Gll.gll();
        if (s[0].substring(2).equals("RMC")) Rmc.rmc();
        if (s[0].substring(2).equals("VTG")) Vtg.vtg();
        if (s[0].substring(2).equals("GGA")) Gga.gga();
        if (s[0].substring(2).equals("GSA")) Gsa.gsa();

        System.out.println("\n\nВзято с http://geostar-navi.com/files/docs/geos3/geos_nmea_protocol_v3_0_rus.pdf.");
    }
}
