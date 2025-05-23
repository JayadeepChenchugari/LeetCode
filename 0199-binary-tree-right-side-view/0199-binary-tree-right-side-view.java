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
    static class Pair{
        TreeNode temp;
        int level;
        Pair(TreeNode temp,int level){
            this.temp=temp;
            this.level=level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(root,1));
        while(!q.isEmpty()){
            Pair it=q.remove();
            int level=it.level;
            TreeNode temp=it.temp;
            map.put(level,temp.val);
            if(temp.left!=null){
                q.add(new Pair(temp.left,level+1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,level+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}






//  List<Integer> list=new ArrayList<>();
//         rightview(root,0,list);
//         return list;

//     }
//     public static void rightview(TreeNode root,int level,List<Integer> list){
//         if(root==null){
//             return;
//         }
//         if(level==list.size()){
//             list.add(root.val);
//         }
//         rightview(root.right,level+1,list);
//         rightview(root.left,level+1,list);
//     }