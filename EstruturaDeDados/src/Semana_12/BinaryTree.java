package Semana_12;

public class BinaryTree<E> {

    private Node<E> root; // raiz da árvore   

    BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRoot(Node<E> e) throws Exception {
        if (!isEmpty()) throw new Exception("A árvore já possui raiz");
        this.root = e;
    }

    public Node<E> root() {
        return this.root;
    }

    public boolean isRoot(Node<E> n) {
        return n.getParent() == null;
    }

    public boolean isInternal(Node<E> n) {
        return (n.getParent() != null) && (n.getLeft() != null || n.getRight() != null);
    }

    public boolean isLeaf(Node<E> n) {
        return (n.getParent() != null) && (n.getLeft() == null && n.getRight() == null);
    }

    public void addLeft(Node<E> n, Node<E> m) throws Exception {
        if (n.getLeft() != null) throw new Exception("O nó já possui um filho à esquerda.");
        m.setParent(n);
        n.setLeft(m);
    }

    public Node<E> left(Node<E> n) throws Exception {
        if (n.getLeft() == null) throw new Exception("O nó não possui filho à esquerda.");
        return n.getLeft();
    }

    public boolean hasLeft(Node<E> n) {
        return n.getLeft() != null;
    }

    public void addRight(Node<E> n, Node<E> m) throws Exception {
        if (n.getRight() != null) throw new Exception("O nó já possui um filho à direita.");
        m.setParent(n);
        n.setRight(m);
    }

    public Node<E> right(Node<E> n) throws Exception {
        if (n.getRight() == null) throw new Exception("O nó não possui filho à direita.");
        return n.getRight();
    }

    public boolean hasRight(Node<E> n) {
        return n.getRight() != null;
    }

    public void remove(Node<E> n) {
        if(n == root)
            root = null;
        else{
            if(n.getParent().getLeft() == n)
                n.getParent().setLeft(null);
            else
                if(n.getParent().getRight() == n)
                    n.getParent().setRight(null);
        }
    }
    public void executaPreOrdem(Node <E> no){
        if(no == null) return;
        System.out.println(no.getElemento());
        executaPreOrdem(no.getLeft());
        executaPreOrdem(no.getRight());
    }
    
    public void executaInOrdem(Node <E> no){
        if (no == null) return;
        executaInOrdem(no.getLeft());
        System.out.println(no.getElemento());
        executaInOrdem(no.getRight());
    }
    
    public void executaPosOrdem(Node <E> no){
        if (no == null) return;
        executaPosOrdem(no.getLeft());
        executaPosOrdem(no.getRight());
        System.out.println(no.getElemento());
    }
    public Node<E> busca(Node k) throws Exception{
        Node y = root;
        while(y != null){
            if((Integer)y.getElemento() == (Integer)k.getElemento())
                return y;
            else if((Integer)y.getElemento() < (Integer)k.getElemento())
                y = right(y);
            else
                y = right(y);
        }
        return y; 
    }
    
    public void insere(Node z){
        Node y = null;
        Node x = root;
        while(x != null){
            y = x;
            if((Integer)z.getElemento() <= (Integer)y.getElemento())
                x = y.getLeft();
            else
                x = y.getRight();
        }
        z.setParent(y);
        if(y == null)
            root = z;
        else if((Integer)z.getElemento() < (Integer)y.getElemento())
            y.setLeft(z);
        else
            y.setRight(z);
    }
    public Node maximo(Node x){
        while(x.getRight() != null){
            x = x.getRight();
        }
        return x;
    }
    public Node minimo(Node x){
        while(x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }
    public void delete(Node x) throws Exception{
        x = busca(x);
        if(isLeaf(x)){
            if(hasLeft(x.getParent()))
                x.getParent().setLeft(null);
            else
                x.getParent().setRight(null);
        }
    }
}