import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NTreeNode {
	public int val;
	public List<NTreeNode> children;


	public NTreeNode(int _val, List<NTreeNode> _children) {
		val = _val;
		children = _children;
	}
	/**
	 * N叉数的前序遍历,递归遍历
	 * @param root
	 * @return 遍历结果，以数组返回
	 */
	public List<Integer> preorder(NTreeNode root) {
		int i;
		List<Integer> list = new LinkedList<>();
		if(root==null) return list;
		else{
			//add 加一个节点
			list.add( root.val);
			Iterator<NTreeNode> ls = root.children.iterator();
			while (ls.hasNext()){
				//addAll 加collections
				list.addAll(preorder(ls.next()));
			}
			return list;
		}
	}
	/**
	 * 迭代 采用 根 右 左 的方式遍历
	 * 逆序输出即为 左 右 根
	 * @param root
	 * @return 后序遍历结果
	 */
	public List<Integer> postorder(NTreeNode root){
		Stack<NTreeNode> s = new Stack<>();
		List<Integer> result = new LinkedList<>();
		NTreeNode top;
		int i,len;
		if(root==null)return result;
		s.push(root);
		while(!s.isEmpty()){
			top = s.pop();
			len = top.children.size();
			//根
			//每次向结果链表的第一个位置添加，之前的所有数组元素后移
			//与逆序输出结果相同
			result.add(0,top.val);
			//从右至左遍历
			//模拟一下栈的进出过程就知道为什么是从右至左了
			for(i=0;i<len;i++){
				s.push(top.children.get(i));
			}
		}
		return result;
	}
}
