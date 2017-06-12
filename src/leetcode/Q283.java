package leetcode;

/**
 * Created by kanunso on 4/3/17.
 */
public class Q283 {

    public static void main(String[] args) {
        int [] a = {1,0,2,0,1,5,6};
        Q283 q283 = new Q283();
        q283.moveZeros(a);

        for(int i: a){
            System.out.print(i+", ");
        }

    }

    public void moveZeros(int [] a){

        for(int i=0; i<=a.length-1; i++){
            if(i!=a.length-1 && a[i]==0){
                int j=i;
                while(j<a.length-1){
                    a[j] = a[j+1];
                    a[j+1]=0;
                    j++;
                }
            }
        }
    }
}
