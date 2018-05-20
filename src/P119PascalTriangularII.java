import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P119PascalTriangularII {
    public static void main(String[] args){
        List<Integer> result = new P119PascalTriangularII().getRow(5);
        for(Integer i : result)
            System.out.println(i);
    }

    public List<Integer> getRow(int rowIndex) {

        rowIndex++;
        List<Integer> row = new ArrayList<>();
        if(rowIndex == 0)
            return row;

        row.add(1);

        if(rowIndex == 1)
            return row;


        for(int i = 2; i<= rowIndex;i++){
            int last = 1;
            for(int j =2; j<i; j++){
                int temp = row.get(j-1);
                 row.set(j-1,last+ row.get(j-1));
                last = temp;
            }
            row.add(1);

        }
        return row;
    }

}
