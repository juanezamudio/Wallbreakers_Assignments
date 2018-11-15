class Trees {

    /**
     * N-ary Tree PostOrder Traversal
     */

    List<Integer> result = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        
        if (root == null) {
            return result;
        }
        
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        
        result.add(root.val);
        
        return result;
    }

    /**
     * Leaf-Similar Trees
     */

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        stack1 = getLeaves(root1, stack1);
        stack2 = getLeaves(root2, stack2);
        
        return stack1.equals(stack2);
    }
    
    public Stack<Integer> getLeaves (TreeNode root, Stack<Integer> stack) {
        
        if (root.left == null && root.right == null) {
            stack.push(root.val);
            return stack;
        }
        
        if (root.left != null) {
            getLeaves(root.left, stack);
        }
        
        if (root.right != null) {
            getLeaves(root.right, stack);
        }
        
        return stack;
    }

    /**
     * Same Tree
     */

    /**
     * Optimal Solution?
     * 
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<Integer>();
        List<Integer> qList = new ArrayList<Integer>();
        
        bfs(p, pList);
        bfs(q, qList);
        
        return pList.equals(qList);
    }
    
    public void bfs(TreeNode root, List<Integer> nodes) {
        if (root == null) {
            nodes.add(null);
        }
        
        if (root != null) {
            nodes.add(root.val);
            bfs(root.left, nodes);
            bfs(root.right, nodes);
        }
    }

    /**
     * Sum of Left Leaves
     */

     /**
      * Better Solution?
      *
      * public int sumOfLeftLeaves(TreeNode root) {
            if(root == null) return 0;
            if(root.left!= null && root.left.left == null && root.left.right == null )
                return root.left.val + sumOfLeftLeaves(root.right);
            
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
      */

      int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        if (root == null || (root.left == null && root.right == null)) {
            return sum;
        }
        
        getLeftLeaves(root);
        
        return sum;
    }
    
    public int getLeftLeaves(TreeNode root) {
        
        if (root == null) {
            return sum;
        }
        
        if (root.right != null && root.right.left == null && root.right.right == null) {
            return getLeftLeaves(root.left);
        }
        
        if (root.left == null && root.right == null) {
            sum += root.val;
        } else {
            getLeftLeaves(root.left);
            getLeftLeaves(root.right);
        }
        
        return sum;
    }

    /**
     * Diameter of Binary Tree
     */

    /**
     * Longest Univalue Path
     */

    /**
     * Find Bottom Left Tree Value
    */
}

class Graphs {

}