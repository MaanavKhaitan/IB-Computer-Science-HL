
/**
 * Write a description of class ALPHA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ALPHA
{
    public static void main(String args[]){
        int A[]={3,4,31,2,3,1,2,3,6};
        int K[]={1,3,2,1};
        int pay123=0;
        int p=0; int Kcounter=0;
        if(K[p]==0){} else{
            p++;
            Kcounter++;
        }
        int[] B = java.util.Arrays.copyOf(A, A.length);
        for(int ii=0; ii<Kcounter;ii++){
        java.util.Arrays.sort(A);
        for( int i = 0; i < A.length/2; ++i )  
        { 
            int temp = A[i]; 
            A[i] = A[A.length - i - 1]; 
            A[A.length - i - 1] = temp; 
        }
        int smallest=A[0];
        for(int i=1;i<A.length;i++){
            if(smallest>A[i]&&smallest!=0){
                smallest=A[i];
            }
        }
        pay123=pay123+smallest;
        for (int i=0;i<=A.length;i++){
            if(A[i]==smallest){
            A[i]=0;}
        }
        A[1]=0;
        A[2]=0;
    }
    }
}
