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
    public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> list=new ArrayList<>();
    //     helper(root,list);
    //     return list;
    // }
    // public static void helper(TreeNode root,List<Integer> list){
    //     if(root==null){
    //         return;
    //     }
    //     helper(root.left,list);
    //     list.add(root.val);
    //     helper(root.right,list);
        // Stack<TreeNode> st=new Stack<>();
        // List<Integer> list=new ArrayList<>();
        // TreeNode node=root;
        // while(true){
        //      if(node!=null){
        //         st.push(node);
        //         node=node.left;
        //      }
        //      else{
        //         if(st.isEmpty()){
        //             break;
        //         }
        //         node=st.pop();
        //         list.add(node.val);
        //         node=node.right;
        //      }
        // }
        // return list;
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        TreeNode cur=root;
        while(cur!=null){
            if(cur.left==null){
                list.add(cur.val);
                cur=cur.right;
            }
            else{
                TreeNode prev=cur.left;
                while(prev.right!=null&&prev.right!=cur){
                    prev=prev.right;
                    
                }
                if(prev.right==null){
                    prev.right=cur;
                    cur=cur.left;
                }
                else{
                    prev.right=null;
                    list.add(cur.val);
                    cur=cur.right;
                }
            }
        }
        return list;
    }
}