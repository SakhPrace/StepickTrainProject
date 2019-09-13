import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.logging.*;

/**
 * @author ViKo
 */
public class Main {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    /**
     * @param args Default in main
     */
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        Scanner scanner = new Scanner(System.in);
        double value = 0.0;
        while (scanner.hasNext()){
            try {
                value += Double.parseDouble(scanner.next());
            } catch (java.lang.NumberFormatException e) {
            }
        }
        //System.out.println(value);
        System.out.format("%.6f", value);
        printWriter.printf("%.6f", value);

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        byte[] data = inputStream.readAllBytes();
        int check = 0 ^ data[0];
        for (int i = 1; i < data.length; i++){
            check = Integer.rotateLeft(check, 1) ^ data[i];
        }
        return check;
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while ((i = reader.read()) != -1) {
            stringBuilder.append(reader.read());
        }
        return stringBuilder.toString();
    }
}
