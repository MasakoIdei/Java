//importはクラスブロックの外に記述
import java.util.Scanner;

public class Chap1_10_1 {
    public static void main (String[] args){
        System.out.println("入力してください");

//        Scanner型　変数scanner　=　Scannerクラスを新規作成　(Systemクラス.標準入力);
        Scanner scanner = new Scanner(System.in);

//      String型　変数input = 変数scanner.次の行の取得
        String input = scanner.nextLine();

        System.out.println(input);

    }
}
