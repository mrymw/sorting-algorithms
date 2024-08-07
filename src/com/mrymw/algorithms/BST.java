package com.mrymw.algorithms;

public class BST {
    private  BSTNode root;

    public BST() {
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int data) {
        root = insert(root, data);
    }

    private BSTNode insert(BSTNode node, int data) {
        if(node == null) {
            node = new BSTNode(data);
        } else {
            if (data <= node.getData()) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                node.setRight(insert(node.getRight(), data));
            }
        }
        return node;
    }
    public boolean search(int value) {
        return search(root, value);
    }
    public boolean search(BSTNode node, int value) {
        boolean found = false;
        while ((node!=null) && found) {
            int rvalue = node.getData();
            if (value<rvalue){
                node = node.getLeft();
            } else if (value > rvalue) {
                node = node.getRight();
            } else {
                found = true;
                break;
            }
            found= search(node, value);
        }
        return found;
    }

    public void delete(int k) {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (!search(k))
            System.out.println("Sorry " + k + " is not present");
        else {
            root = delete(root, k);
            System.out.println(k + " deleted from the tree");
        }
    }

    private BSTNode delete(BSTNode root, int k) {
        BSTNode p, p2, n;
        if (root.getData() == k) {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null) {
                p = rt;
                return p;
            } else if (rt == null) {
                p = lt;
                return p;
            } else {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BSTNode r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BSTNode r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BSTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BSTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
    public static int binarySearchString(String[] array, String target) {
        return binarySearchString(array, target, 0, array.length - 1);
    }

    private static int binarySearchString(String[] array, String target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        int comparison = target.compareTo(array[mid]);

        if (comparison == 0) {
            return mid;
        } else if (comparison < 0) {
            return binarySearchString(array, target, low, mid - 1);
        } else {
            return binarySearchString(array, target, mid + 1, high);
        }
    }
}
