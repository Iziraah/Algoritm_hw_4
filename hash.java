import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string for hashing: ");
        String firstString = in.nextLine();
        String secondString = converter(firstString);
        System.out.println(mySimpleHash(secondString));
    }

    static String converter(String str) {

        byte[] getBytesFromString = str.getBytes(StandardCharsets.UTF_8);
        BigInteger bigInteger = new BigInteger(1, getBytesFromString);

        String convertedResult = String.format("%x", bigInteger);
        String convRes = convertedResult;
        return convRes;
    }
    
    static String mySimpleHash(String x){
        String a = "98ea6e4";
        String b = "216f2fb4";
        String c = "Salt";
        String d = "Rainbow";
        if (x.length()< 8){
            x = x + converter(a);
        }
        if (x.length()< 16){
            x = x + converter(b);
        }
        if (x.length()< 32){
            x = x + converter(c);
        }
        if (x.length()< 64){
            x = x + converter(d);
        }
        return x;
    }
}
