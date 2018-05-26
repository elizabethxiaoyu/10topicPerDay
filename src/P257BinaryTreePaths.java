import java.util.ArrayList;
import java.util.List;

public class P257BinaryTreePaths {
		public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			TreeNode left = new TreeNode(2);
			TreeNode right = new TreeNode(3);
			
			root.left = left;
			root.right = right;
			List<String> re = binaryTreePaths(root);
			for(String s : re)
				System.out.println(s);
			}
	
	 public static List<String> binaryTreePaths(TreeNode root) {
		 List<String> result = new ArrayList<String>();
		 if(root == null)
			 return result;
		 StringBuilder sb = new StringBuilder();
		 if(root.left == null && root.right == null) {
			 sb.append(root.val);
			 result.add(sb.toString());
		 }
		 
		
		 List<String> leftResult = binaryTreePaths(root.left);
		 for(String s : leftResult) {
			 s = root.val+"->" +s ;
			 result.add(s);
		 }
			
		 List<String> rightResult = binaryTreePaths(root.right);
		 for(String s : rightResult) {
			 s = root.val+"->" + s;
			 result.add(s);
		 }
			
		 return result;
	  }
}
