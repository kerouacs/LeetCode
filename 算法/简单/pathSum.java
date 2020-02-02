/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class pathSum {
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root,sum,new int[1000],0);
    }
    public int pathSum(TreeNode root, int sum, int[] array, int p) {
        if(root==null){
            return 0;
        }
        array[p] = root.val;
        int temp = 0;
        int n = 0;
        for(int i=p;i>=0;i--){
            temp+=array[i];
            if(temp==sum){
                n++;
            }
        }
        int left=pathSum(root.left, sum, array,  p+1);
        int right=pathSum(root.right, sum,  array,  p+1);
        return n+left+right;
    }
}