import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;


	TreeNode(int x) {
		val = x;
	}

	/**
	 * 迭代实现二叉树的先序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<>();
		Stack<TreeNode> s = new Stack<>();
		TreeNode top;
		if(root!=null){
			s.push(root);
			while (!s.isEmpty()){
				top = s.pop();
				//进栈顺序先进先出
				if(top.right!=null)s.push(top.right);
				if(top.left!=null)s.push(top.left);
				result.add(top.val);
			}
		}
		return result;
	}

	/**
	 * 递归实现二叉树的中序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list =new LinkedList<>();
		if(root==null)return list;
		else{
			list.addAll(inorderTraversal(root.left));
			list.add(root.val);
			list.addAll(inorderTraversal(root.right));
			return list;
		}
	}
	/**
	 * 递归实现二叉树的后序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> result = new LinkedList<>();
		if(root==null) return result;
		else{
			result.addAll(postorderTraversal(root.left));
			result.addAll(postorderTraversal(root.right));
			result.add(root.val);
			return result;
		}
	}

	/**
	 * 递归寻找二叉树的最大深度
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if(root==null) return 0;
		else{
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return 1+(left>right?left:right);
		}
	}


}