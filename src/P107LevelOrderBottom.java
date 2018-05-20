import java.util.*;

/**
 * Created by Eliza Liu on 2018/5/9
 */
public class P107LevelOrderBottom {


    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> rr = new LinkedList<>();
        if(root == null)
            return rr;

        Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
        Queue<ArrayList<TreeNode>> queue = new LinkedList<>();
        ArrayList<TreeNode> nodeList = new ArrayList<>();
        ArrayList<TreeNode> tempList;
        ArrayList<Integer> numList;
        nodeList.add(root);
        queue.add(nodeList);
        while(nodeList.size() != 0){
            tempList = new ArrayList<>();
            numList = new ArrayList<>();
            nodeList = queue.poll();

            for(TreeNode node : nodeList) {
                numList.add(node.val);
                if(node.left != null)
                    tempList.add(node.left);
                if(node.right != null)
                    tempList.add(node.right);

            }
            stack.push(numList);
            queue.add(tempList);

        }

        List<List<Integer>> result = new ArrayList<>();
        while(!stack.isEmpty() ){
            List<Integer> t = stack.pop();
            if(t!=null && t.size()!=0)
                result.add(t);
        }

        return result;


    }

}
