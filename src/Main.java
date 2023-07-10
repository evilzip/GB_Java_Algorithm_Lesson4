// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BinTree<Integer> userTree = new BinTree<>();

        userTree.add(6);
        userTree.add(16);
        userTree.add(8);
        userTree.add(5);

        userTree.print();

        userTree.add(10);
        userTree.print();

        userTree.add(2);
        userTree.print();

        userTree.add(4);
        userTree.print();

        userTree.add(22);
        userTree.print();



    }

}