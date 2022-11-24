package pl.camp.it.egzamin;

public class BinaryTree {
    private Node node;

    public void add(int value) {
        if(this.node == null) {
            this.node = new Node(value);
        } else {
            if(value > this.node.getValue() && this.node.getRight() == null) {
                this.node.setRight(new Node(value));
            } else if(value < this.node.getValue() && this.node.getLeft() == null) {
                this.node.setLeft(new Node(value));
            } else if(value > this.node.getValue() && this.node.getRight() != null) {
                addToTree(this.node.getRight(), value);
            } else if(value < this.node.getValue() && this.node.getLeft() != null) {
                addToTree(this.node.getLeft(), value);
            } else {
                return;
            }
        }
    }

    private void addToTree(Node child, int value) {
        if(value > child.getValue() && child.getRight() == null) {
            child.setRight(new Node(value));
        } else if(value < child.getValue() && child.getLeft() == null) {
            child.setLeft(new Node(value));
        } else if(value > child.getValue() && child.getRight() != null) {
            addToTree(child.getRight(), value);
        } else if(value < child.getValue() && child.getLeft() != null) {
            addToTree(child.getLeft(), value);
        } else {
            return;
        }
    }

    public int min() {
        return minNode(this.node);
    }

    private int minNode(Node n) {
        if(n.getLeft() == null) {
            return n.getValue();
        } else {
            return minNode(n.getLeft());
        }
    }

    public int max() {
        return maxNode(this.node);
    }

    private int maxNode(Node n) {
        if(n.getRight() == null) {
            return n.getValue();
        } else {
            return maxNode(n.getRight());
        }
    }

    public boolean contains(int value) {
        return containsNode(this.node, value);
    }

    public boolean containsNode(Node n, int value) {
        if(n == null) {
            return false;
        }
        if(n.getValue() == value) {
            return true;
        } else {
            if(value > n.getValue()) {
                return containsNode(n.getRight(), value);
            } else {
                return containsNode(n.getLeft(), value);
            }
        }
    }
}
