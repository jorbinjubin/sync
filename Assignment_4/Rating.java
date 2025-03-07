import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;

public class Rating {
    static int mChoice;
    static BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String[] distros = br.readLine().split(" ");
        String[] parentDistro = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] hasGuiInstaller = new boolean[distros.length];
        for(int i = 0; i < 6; i++) {
            hasGuiInstaller[i] = Boolean.parseBoolean(st.nextToken());
        }
        String[] stability = br.readLine().split(" ");
        st = new StringTokenizer(br.readLine());
        int[] packageBaseSize = new int[6];
        for(int i = 0; i < 6; i++) {
            packageBaseSize[i] = Integer.parseInt(st.nextToken());
        }
        mChoice = 0;
        while(mChoice != 4) {
            menu();
        }
    }
    public static void menu() throws IOException{
        System.out.println("Welcome to Justin\'s Linux Distro Ranker\n");
        System.out.println("Please choose an option:");
        System.out.println("1. List distros");
        System.out.println("2. Rank distros");
        System.out.println("3. Help");
        System.out.println("4. Exit");
        System.out.print("Enter a choice (default = 4): ");
        do {
            mChoice = Integer.parseInt(inp.readLine());
        } while(!(1<= mChoice && mChoice <= 4));

    }
}
