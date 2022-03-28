package leetcode.Part9;

public class Demo168 {
    public static String convertToTitle(int columnNumber) {
        String excel = "ABCDEFGHZJKLMNOPQRSTUVWXYZ";
        String ans = "";
        while (columnNumber>0) {
            columnNumber--;
            int a = columnNumber / 26, b = columnNumber % 26;

            ans = excel.charAt(b) + ans;

            columnNumber = a;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }
}
