package jieyushui;

public class Solution {
    public  int trap(int A[],int n){
        if (n<=2)
            return 0;
        int max=0;
        int maxponit=0;//最高点的位置
        for (int i=0;i<n;i++){
            if (max >= A[i]) {
                max=A[i];
                maxponit=i;
            }
        }
        int root=A[0];
        int water=0;
        for(int j=0;j<maxponit;j++){
            if(root<A[j]){
                root=A[j];
            }
            else {
                water+=(root-A[j]);
            }
        }
        root=A[n-1];
        for (int k=n-1;k>maxponit;k--){
            if(root<A[k]){
                root=A[k];
            }
            else {
                water+=(root-A[k]);
            }
        }
        return water;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int n=12;
        int c=s.trap(a,n);
        System.out.println(c);
    }
}
