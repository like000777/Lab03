import java.util.*;
public class JPA05 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();   
    }
    static void test(){
        System.out.printf("Please enter one value:");
        int i,total=1,n = keyboard.nextInt();
        if(n>=1&&n<=10){
            for(i=1;i<=n;i++){
                total=total*i;
            }
            System.out.printf("%d!: %d",n,total);
        }
        else System.out.println("Error,the value is out of range.");
    }


}
