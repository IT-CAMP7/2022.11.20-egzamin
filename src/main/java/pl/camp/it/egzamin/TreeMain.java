package pl.camp.it.egzamin;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(10);

        System.out.println(binaryTree.min());
        System.out.println(binaryTree.max());

        System.out.println(binaryTree.contains(1));
        System.out.println(binaryTree.contains(5));
        System.out.println(binaryTree.contains(10));
        System.out.println(binaryTree.contains(15));
        System.out.println(binaryTree.contains(20));
    }
}
