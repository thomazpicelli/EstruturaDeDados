package Semana_12;

/**
 *
 * @author thomazpicelli
 */
public class ArvoreBinaria {
    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<>();
        try{    
            binaryTree.addRoot(new Node<>("a"));
            binaryTree.addLeft(binaryTree.root(), new Node<>("b"));
            binaryTree.addRight(binaryTree.root(), new Node<>("c"));
            binaryTree.addLeft(binaryTree.root().getLeft(), new Node<>("d"));
            binaryTree.addRight(binaryTree.root().getLeft(), new Node<>("e"));
            binaryTree.addLeft(binaryTree.root().getRight(), new Node<>("f"));
            binaryTree.addRight(binaryTree.root().getRight(), new Node<>("g"));
            binaryTree.addLeft(binaryTree.root().getLeft().getLeft(), new Node<>("h"));
            binaryTree.addRight(binaryTree.root().getLeft().getLeft(), new Node<>("i"));
            binaryTree.executaPreOrdem(binaryTree.root());
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
