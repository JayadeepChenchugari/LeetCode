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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(root,result,sb);
        return result;
    }

    public void helper(TreeNode root,ArrayList<String> result,StringBuilder sb){
        if(root==null){
            return;
        }
        int len=sb.length();

        if(root.left==null&&root.right==null){
            sb.append(root.val);
            result.add(sb.toString());
            sb.setLength(len);
            return;
        }
        sb.append(root.val);
        sb.append("->");
        helper(root.left,result,sb);
        helper(root.right,result,sb);
        sb.setLength(len);
    }
}
