//文字列型からint型へ変換

public class Chap1_11_1 {
    public static void main(String[] args) {
//        変数numに文字列30を代入
        String num = "30";

//        変数numと数値の20を連結して表示
        System.out.println(num + 20);

//        変数numをString型からInteger型に変換　→変換したnum足す20
//        Integer型.int型に変換（変数num）+　20);
        System.out.println(
                Integer.parseInt(num) + 20);
    }
}
