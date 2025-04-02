package ArraysQuestions;

public class SubquierySum {
    public static void main(String[] args) {
        int []a= {2,4,1,3,0};
        int [][] q= {{0,3},{1,4}};
        // below one brute force
        for (int i = 0; i <q.length ; i++) {
            int l= q[i][0];
            int r= q[i][1];
            int sum =0;
            for (int j = l; j <= r ; j++) {
                sum=sum+a[j];

            }
            System.out.println(sum);
        }
        //optimized version
        int []ps=new int[a.length];
        ps[0]=a[0];
        for(int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];
        }
        for (int i =0;i<q.length;i++){
            int s= q[i][0];
            int e=q[i][1];
            if(s==0){
                System.out.println(ps[e]);
            }else {
                System.out.println(ps[e]-ps[s-1]);
            }
        }


    }
}
