package ArraysQuestions;

public class SubArrays {
    public static void main(String[] args) {
        int []a ={3,-1,2};
        //bruteforce O(n3)
        // 3, 3 -1 ,3 -1 2
        //-1 , -1 2
        //2

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k = i; k<= j; k++){
                    System.out.print(a[k]+ " ");
                    sum=sum+a[k];
                }
                System.out.println("Sub Array sum is "+sum);
                System.out.println();

            }

        }
        //prefix sum way
        // littile optimized O(n2)
        int [] ps= new int[a.length];
        ps[0]= a[0];
        for(int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];
        }
        for (int s = 0; s <a.length ; s++) {
            for (int e = s; e <a.length ; e++) {
                if(s==0){

                    System.out.println("Prefix summ way "+ps[e]);
                }else {
                    System.out.println("Prefix summ way "+ (ps[e]-ps[s-1]));
                }

            }

        }

    }
}
