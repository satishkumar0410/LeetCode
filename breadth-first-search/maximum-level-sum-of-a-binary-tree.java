 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int max = 1;
            int sum = Integer.MIN_VALUE;
            int level = 1;
            while(!queue.isEmpty()){
                int levelsum = 0;
                int levelsize = queue.size();
                for(int i = 0; i <levelsize; i++){
                    TreeNode node = queue.poll();
                    levelsum += node.val;
                    if(node.left !=null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
                if(levelsum > sum){
                    sum = levelsum;
                    max = level;
                }
                level++;
            }
            return max;   
    }
}