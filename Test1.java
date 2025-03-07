public class Test1 {
    public static void main(String[] args) {
        System.out.println(e());
        System.out.println(2*Math.PI);
    }
       public static double e() {
        int hi[] = { 54, 56, 53, 57, 55, 49, 55, 48, 51, 53, 56, 49, 51, 56, 50, 46, 54 };
        int i = 16;
        String s = "";
        while (i > 0) {
            s += (char) hi[i];
            --i;
        }
        return Double.parseDouble(s);
    }
}
