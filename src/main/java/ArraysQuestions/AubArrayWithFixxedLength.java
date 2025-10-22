package ArraysQuestions;

public class AubArrayWithFixxedLength {
    public static void main(String[] args) {
        int []a= {2,9,5,7,8,1,6};
        int k=4;
        int sum =0;
        for (int i = 0; i <k ; i++) {
            sum=sum+a[i];

        }
        int s=1,e=k;
            int  ans=sum;
        for(int i=s;e<a.length;i++){
            sum=sum-a[s-1]+a[e];

            if(sum>ans){
                ans=sum;
            }
            s++;e++;
        }
        System.out.println(ans);
    }
}
