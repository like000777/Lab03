import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i,sum=0;
        scn.close();
        for(i=1;i<=N;i++)
            sum+=i;
        System.out.printf("1+2+...+N=%d",sum);
        
        
        
        

    }
    
}
