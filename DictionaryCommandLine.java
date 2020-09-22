public class DictionaryCommandLine extends DictionaryManagement {
    public static void showAllWords() {
        System.out.println("No     | English        | Vietnamese");
        for (int i=1;i<=mang.size();i++) {
            System.out.print(i + "    " + mang.get(i-1).getWord_target());
            for (int j=1+mang.get(i-1).getWord_target().length();j<=17;j++) {
                System.out.print(" ");
            }
            System.out.println(mang.get(i-1).getWord_explain());
        }
    }

    public static void dictionaryBasic() {
        insertFromCommandline();
        showAllWords();
    }

    public static void main(String[] args) {
        dictionaryBasic();
    }
}
