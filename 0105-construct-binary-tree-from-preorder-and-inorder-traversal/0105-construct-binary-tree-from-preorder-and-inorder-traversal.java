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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
       
         return  buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mpp);
        
    }
    public static TreeNode buildtree(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,Map<Integer,Integer> mpp){
        if(prestart>preend||instart>inend){
            return null;
        }
         TreeNode  root=new TreeNode(preorder[prestart]);
         int inod=mpp.get(root.val);
        int numsleft=inod-instart;
        root.left=buildtree(preorder,prestart+1,prestart+numsleft,inorder,instart,inod-1,mpp);
        root.right=buildtree(preorder,prestart+numsleft+1,preend,inorder,inod+1,inend,mpp);
        return root;
    }
}