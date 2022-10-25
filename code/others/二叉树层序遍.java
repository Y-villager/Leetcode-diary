package code.others;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 *
 * @author: yxz
 * @date: 2022年07月21日 16:00
 */
public class 二叉树层序遍 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 返回值
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // 根节点入队
        queue.offer(root);

        while(!queue.isEmpty()){
            // 一层的结果
            ArrayList<Integer> level =  new ArrayList<Integer>();

            int levelCount = queue.size();
            // 添加节点到一层list中去
            for (int i = 0; i < levelCount; i++) {
                // 节点出队
                TreeNode node = queue.poll();
                // 节点的左子树入队
                if (node.left != null){
                    queue.offer(node.left);
                }
                // 节点的右子树入队
                if (node.right != null){
                    queue.offer(node.right);
                }
                // 将一层信息添加到level中
                level.add(node.val);
            }
            res.add(level);
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
