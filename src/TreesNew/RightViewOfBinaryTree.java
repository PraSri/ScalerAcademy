package TreesNew;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

	public static void main(String[] args) {

	}

	public ArrayList<Integer> solve(TreeNode A) {

		ArrayList<Integer> res = new ArrayList<Integer>();

		rightViewUtil(A, res);

		return res;

	}

	private void rightViewUtil(TreeNode a, ArrayList<Integer> res) {

		if (a == null) {
			return;
		}

		Queue<TreeNode> q = new LinkedList<TreeNode>();

		q.add(a);

		TreeNode end = null;

		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				end = q.poll();
				if (size == 0) {
					res.add(end.val);
				}
				if (end.left != null) {
					q.add(end.left);
				}
				if (end.right != null) {
					q.add(end.right);
				}
			}

		}

	}

}
