import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        int total = 0;
        int s = 0;
        int count = 0;
        double average;
        System.out.printf("Please enter meal dollars or enter -1 to stop:");
        s=new Scanner(System.in).nextInt();
        while(s!=-1){
            total+=s;
            count++;
            System.out.printf("Please enter meal dollars or enter -1 to stop:");
            s=new Scanner(System.in).nextInt();
        }
        System.out.println("餐點總費用:" + total);
        System.out.printf("%d 道餐點費用為: %.2f %n",count,1.0*total/count);


    }
}
