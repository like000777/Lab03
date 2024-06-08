public class JPA03 {
    public static void main(String[] args) {
        int i,num,sum = 0;
        System.out.printf("1~1000中的完美數有:");
        for(i=1;i<1000;i++){
            sum = 0;
            for(num=1;num<i;num++){
             if(i%num==0)sum+=num;

            }
            if(i==sum){
             System.out.printf("%d ",num);
            }

        }
        System.out.printf("\n");
    }
    
}
