/**
 * Created by Eliza Liu on 2018/5/20
 */
public class P191HammingWeight {
    public static void  main(String[] args){

    }
    public int hammingWeight(int n) {

        int count = 0;
        int flag = 1;
        while(n>= flag){
          if((n&flag) != 0)
              count++;
            flag = flag<<1;
        }
        return count;
    }

    public int hammingWeight2(int n) {

        int count = 0;
        while(n!=0){
            count++;
            n = n &(n-1);
        }
        return count;
    }
}
