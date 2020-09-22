import java.util.Scanner;
public class DictionaryManagement extends Dictionary {

    public static void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String no = sc.nextLine();
        for (int i=1;i<=n;i++) {
            String tu = sc.nextLine();
            String dich = sc.nextLine();
            Word moi = new Word(tu, dich);
            mang.add(moi);
        }
    }
}
