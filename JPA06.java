import java.util.*;
public class JPA06 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input:");
        num1 = keyboard.nextInt();
        while(num1!=999){
            num2 = keyboard.nextInt();
            System.out.println(power0f(num1,num2));
            System.out.println("Input:");
            num1 = keyboard.nextInt();
        }
        
    }

    static int power0f(int m, int n) {
        int total = 1;
        while(n>0){
            total*=m;
            n--;
        }
        return total;
        
        
    }

}
