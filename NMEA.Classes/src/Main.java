public class Main {

//    static String protocol = "$GPGSV,3,1,10,23,38,230,44,29,71,156,47,07,29,116,41,08,09,081,36*7F";
//    static String protocol = "$GPGLL,4717.11364,N,00833.91565,E,092321.00,A,A*60";
//    static String protocol = "$GPRMC,083559.00,A,4717.11437,N,00833.91522,E,0.004,77.52,091202,,,A*57";
//    static String protocol = "$GPVTG,77.52,T,,M,0.004,N,0.008,K,A*06";
    static String protocol = "$GPGGA,172814.0,3723.46587704,N,12202.26957864,W,2,6,1.2,18.893,M,-25.669,M,2.0,0031*4F";
//    static String protocol = "$GPGSA,A,3,23,29,07,08,09,18,26,28,,,,,1.94,1.18,1.54*0D";



    public static void main(String[] args) {
        System.out.println(protocol.substring(1, protocol.indexOf("*")));
        System.out.println("\n" + Utils.s.length);

        Utils.parse();
    }










}