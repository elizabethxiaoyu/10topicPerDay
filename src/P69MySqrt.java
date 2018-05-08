/**
 * Created by Eliza Liu on 18-5-8
 */
public class P69MySqrt {
    public static void main(String[] args){
        System.out.println(mySqrt(9));
    }

    //牛顿迭代法
    public static  int mySqrt(int x) {
        if(x < 0)
            return 0;
        double err = 1e-15;
        double t = x;
        while(Math.abs(t- x/t) > err* t)
            t = (x/t +t )/2.0;
        return (int) t;
    }

}
