
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode tempNode = q.poll();
            if (tempNode != null) {
                tempList.add(tempNode.val);
                if (tempNode.left != null)
                    q.offer(tempNode.left);

                if (tempNode.right != null)
                    q.offer(tempNode.right);
            } else {
                result.add(new ArrayList<>(tempList));
                tempList.clear();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return result;
    }
}
