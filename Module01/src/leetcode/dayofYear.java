package leetcode;

public class dayofYear {
    public static void main(String[] args) {
        System.out.printf("有多少天%d\n",dayOfyear("2000-12-04"));

    }
    public static int dayOfyear(String date) {
        int year=Integer.parseInt(date.substring(0, 4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        int[] count={31,28,31,30,31,30,31,31,30,31,30,31};
        if( year%400==0||(year%4==0&&year%100!=0)){
            count[1]+=1;
        }
        int ans=0;
        for(int i=1;i<month;i++){
            ans+=count[i];
        }
        return ans+day;
    }
}
