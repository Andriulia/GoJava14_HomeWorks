import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecToBinOctHex {
    public static void main(String[] args) {

        convert();
        stringConvert();
//      Different methods; exclude one if unnecessary.

    }

    static void convert() {

        System.out.println("Numeral system to convert in --> Decimal number:");

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        switch (c) {
            case 2:
            case 8:
            case 16: {
                int s = sc.nextInt();
                ArrayList<Integer> bin = new ArrayList<>();
                int m;

                if (s > 1) {
                    do {
                        m = s % c;
                        bin.add(m);
                        s = s / c;
                    } while (s > 0);
                } else {
                    m = s % c;
                    bin.add(m);
                }

                Collections.reverse(bin);
                for (int i = 0; i < bin.size(); i++) {
                    switch (bin.get(i)) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9: {
                            System.out.print(bin.get(i));
                            continue;
                        }
                        case 10: {
                            System.out.print("A");
                            continue;
                        }
                        case 11: {
                            System.out.print("B");
                            continue;
                        }
                        case 12: {
                            System.out.print("C");
                            continue;
                        }
                        case 13: {
                            System.out.print("D");
                            continue;
                        }
                        case 14: {
                            System.out.print("E");
                            continue;
                        }
                        case 15: {
                            System.out.print("F");
                        }
                    }
                }
                break;
            }
            default:
                System.out.println("Not a condition.");
        }
    }

    static void stringConvert() {

        System.out.println("Input decimal number:");

        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Auf Wiedersehen!");
        } else {
            int s = sc.nextInt();

            System.out.println("Choose 2, 8, 16:");

            if (!sc.hasNextInt()) {
                System.out.println("Auf Wiedersehen!");
            } else {
                do {
                    int c = sc.nextInt();
                    if (c == 2 || c == 8 || c == 16) {
                        String bin = "";
                        int m;

                        if (s > 1) {
                            do {
                                m = s % c;
                                bin += (m + ",");
                                s = s / c;
                            } while (s > 0);
                        } else {
                            m = s % c;
                            bin += (m + ",");
                        }

                        String[] binarr = bin.substring(0, bin.length() - 1).split(",");
                        int[] intarr = new int[binarr.length];
                        for (int i = 0; i < binarr.length; i++) {
                            intarr[i] = Integer.parseInt(binarr[binarr.length - 1 - i]);
                        }

                        for (int i = 0; i < intarr.length; i++) {
                            switch (intarr[i]) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9: {
                                    System.out.print(intarr[i]);
                                    continue;
                                }
                                case 10: {
                                    System.out.print("A");
                                    continue;
                                }
                                case 11: {
                                    System.out.print("B");
                                    continue;
                                }
                                case 12: {
                                    System.out.print("C");
                                    continue;
                                }
                                case 13: {
                                    System.out.print("D");
                                    continue;
                                }
                                case 14: {
                                    System.out.print("E");
                                    continue;
                                }
                                case 15: {
                                    System.out.print("F");
                                }
                            }
                        }
                        break;
                    } else {
                        System.out.println("Not a condition. Retry:");
                    }
                } while (sc.hasNextInt());
            }
        }
    }
}