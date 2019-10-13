package Usage_scenarios;

import Tree.TreeNode;

public class BinarySortTree {
	/**
	 * 将数组转成二叉搜索树
	 * @param array ：有序数组
	 * @constructor
	 */
	TreeNode root = null;

	public BinarySortTree(int[] array ){
		this.root = ToBST(array,0,array.length-1);
	}

	private static TreeNode ToBST(int nums[],int left,int right){
		if(left>right)return null;//定义的二分区间为[left,right]，无法进行继续递归，直接退出
		int mid = (int)(left+right)/2;//二分中值
		TreeNode root = new TreeNode(nums[mid]);
		root.left = ToBST(nums,left,mid-1);//注意mid-1 对左半部分进行递归
		root.right = ToBST(nums,mid+1,right);//注意mid+1 对右半部分进行递归
		return root;
	}


}
