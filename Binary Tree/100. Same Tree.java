class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果都为空 返回true
        if (p == null && q == null) return true;
        // 如果有一个非空，不满足条件返回false
        if (p == null || q == null) return false;
        // 判断两树的value是否一样
        if (p.val != q.val) return false;
        
        //对比左右树
        return isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
        
    }
}
