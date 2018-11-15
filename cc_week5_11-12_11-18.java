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
     * Sum of Left Leaves
     */

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