package thuchanh4;

public class BST <E extends Comparable<E>>extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
        if (root == null) return;

        System.out.println(root.element+ " ");
        inorder(root.right);
    }

}
