public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addHead(5);
        linkedList.addHead(4);
        linkedList.addHead(3);
        linkedList.addHead(9);
        linkedList.addTail(10);
        linkedList.addTail(2);
        linkedList.addTail(14);
        linkedList.addTail(12);
        linkedList.addTail(7);
        linkedList.agregarPorPosicion(5, 14);
        linkedList.agregarPorPosicion(2, 22);
        linkedList.agregarPorPosicion(7,20);
        linkedList.imprimir();
        linkedList.buscarPorPosicion(1);
        linkedList.eliminarPorPoscion(1);
        linkedList.buscarPorPosicion(1);
        linkedList.imprimir();
        linkedList.buscarPorValor(10);
    }
}
