public class LinkedList {

    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }

    protected Node  head = null;
    protected Node tail = null;

    public void addHead(int valor) {
        Node newNode = new Node(valor);
        newNode.next = head;
        head = newNode;
        if(newNode.next == null){
            tail = newNode;
        }
    }

    public void addTail(int valor) {
        Node newNode = new Node(valor);
        if (tail == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            addHead(valor);
        } else {
            Node node = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if (actual.next == null) {
                addTail(valor);
            } else {
                node.next = actual.next;
                actual.next = node;
            }
        }
    }
    public void imprimir() {
        Node temp = head;
        //[5] -> [6] -> [9] -> [3] -> [2]
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int buscarPorPosicion (int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Node actual = head;
            for (int i = 0; i < posicion-1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            int busqueda = actual.value;
            System.out.println("El valor seleccionado es: " + busqueda);
            return busqueda;
        }
    }
    public void eliminarPorPoscion (int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Node actual = head;
            for (int i = 0; i < posicion; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                while (actual != null) {
                    actual = actual.next;
                }
            }
        }
    }
    public void buscarPorValor(int valor) {
        Node temp = head;
        //[5] -> [6] -> [9] -> [3] -> [2]
        while (temp != null) {
            if (temp.value == valor) {
                System.out.print(temp.value + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}