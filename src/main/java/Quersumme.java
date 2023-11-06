import java.util.Scanner;

public class Quersumme {
    static int quersumme(int x){
        int summe = 0;
        while (0 != x) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
            summe = summe + (x % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            x = x / 10;
        }
        return summe;
    }

    static int quersummeHex(String h){
        int decimal = Integer.parseInt(h,16);
        int n = quersumme(decimal);
        return n;
    }
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number:");
        int i = s.nextInt();
        System.out.println("Your quersumme is: " + Quersumme.quersumme(i));
        System.out.println("Enter your hexnumber:");
        String hex = s.next();
        System.out.println("Your hexquersumme is: " + Integer.toHexString(Quersumme.quersummeHex(hex)).toUpperCase());
    }

}
