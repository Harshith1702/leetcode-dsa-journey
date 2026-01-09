/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode res=null;
    int prevdepth=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root,0);
        return res;
    }

    public int dfs(TreeNode node,int depth){
        if(node==null)  return depth;
        int left=dfs(node.left,depth+1);
        int right=dfs(node.right,depth+1);
        int cdepth=Math.max(left,right);;
        if(left==right && cdepth>=prevdepth){ 
            res=node;
            prevdepth=cdepth;
        }
        return cdepth;
    }
}