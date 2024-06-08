import java.util.*;
public class JPA07 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Input:");
        num1=new Scanner(System.in).nextInt();
        while(num1!=999){
            num2=new Scanner(System.in).nextInt();
            System.out.println(gcd(num1,num2));
            System.out.println("Input:");
            num1=new Scanner(System.in).nextInt();

        }
        
    }
    static int gcd(int m, int n){
        int result;
        while(n!=0){
            result=m%n;
            m=n;
            n=result;
        }
        return m;

    }
}
