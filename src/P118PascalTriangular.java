import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eliza Liu on 2018/5/18
 */
public class P118PascalTriangular {

    public static void main(String[] args){
        List<List<Integer>> result =  new P118PascalTriangular().generate(5);
        for(List<Integer> list : result){
            for(Integer i : list)
                System.out.print(i+" ");
            System.out.println();
        }

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        if(numRows == 1)
            return result;


        for(int i = 2; i<= numRows;i++){
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            List<Integer> lastRow = result.get(i-2);
            for(int j =2; j<=i-1; j++){
                row1.add(lastRow.get(j-2) + lastRow.get(j-1));
            }
            row1.add(1);
            result.add(row1);
        }
       return result;
    }

}
