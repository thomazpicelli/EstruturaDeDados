package Semana_12;

public class Node<E> {

    private E elemento;  // elemento armazenado no nó
    private Node<E> left, right, parent; // apontadores do nó

    Node(E elemento) {
        this.elemento = elemento;
        left = right = parent = null;
    }

    public E getElemento() {
        return this.elemento;
    }

    public void setElemento(E e) {
        this.elemento = e;
    }

    public Node<E> getParent() {
        return this.parent;
    }

    public void setParent(Node<E> p) {
        this.parent = p;
    }

    public Node<E> getLeft() {
        return this.left;
    }

    public void setLeft(Node<E> p) {
        this.left = p;
    }

    public Node<E> getRight() {
        return this.right;
    }

    public void setRight(Node<E> p) {
        this.right = p;
    }
}