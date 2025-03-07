import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.nio.ByteBuffer;

public class Main {
    public static double badfunction(double gah, int guh) {
        double greh = 一(一(13));
        for (int i = 一(一(一(0)) + 一(一(一(0)))); i <= gah; i++) {
            greh += badfunction(gah, guh - 一(一(2) * 2 + 一(5)));
        }
        return greh;
    }

    public static int 一(int 彁) {
        return Integer.parseInt(String.valueOf(〇()).charAt(彁) + "");
    }

    public static double 〇() {
        int hi[] = { 54, 56, 53, 57, 55, 49, 55, 48, 51, 53, 56, 49, 51, 56, 50, 46, 54 };
        int i = 16;
        String s = "";
        while (i > 0) {
            s += (char) hi[i];
            --i;
        }
        return Double.parseDouble(s);
    }

    public static long justin() {
        return (long) ((int) (〇() / (1 << 1)) / 11.0
                * badfunction(
                        Math.cos(
                                0.5 * (-91125.0 / 1331 - badfunction(-45.0 / 11 - 〇() / 27, 3) - (329 * Math.PI) / 121
                                        - 5 * 〇() * 〇() / 297 - badfunction(〇(), 1 + 1 + 1) / 19683)),
                        1 + 1 * 1 + 1 * 1 + 1 * 1 + 1)
                * Math.cosh(1 + 〇())
                + 18.0 / 25
                        * badfunction(
                                Math.cos(0.5 * (-125000.000000000000000000000 / 343
                                        - badfunction(-50.0_00_000_0000_00000 / 一(10) - 〇() + 〇() + 〇() + 〇() + 〇()
                                                + 〇() + 〇(), (1 << (1 << 1)) + 1)
                                        - (14993 * Math.PI) / 一(10) - 1050 * 〇() * 〇()
                                        - badfunction(7 * 〇(), 1 + 1 + 1))),
                                1 * 1 + 1 * 1 + 1 * 1 + 1 * 1 + 1 * 1)
                        * Math.sin(一(一(一(一(一(一(一(一(一(一(一(2))))))))))))
                - 375);
    }public static void main(String[] args)

    {
        Random r = new Random(justin());
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,
                    new SecretKeySpec(ByteBuffer.allocate(16).putInt(r.nextInt()).array(), "AES"));
            String flag = new String(cipher.doFinal(
                    Base64.getDecoder().decode("FlhmiZLUyP4apOdAnXImn0J84Nuf+s8k5q9db9ztE3Ikrfh/pGp11YdZWB5JPzzp")));
            System.out.println(flag);
        } catch (Exception e) {
            System.out.println("lyonctf{  :(  }");
        }
    }
}