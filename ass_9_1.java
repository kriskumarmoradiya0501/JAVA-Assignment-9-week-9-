import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class cArrayList<T> {
    private ArrayList<T> list;

    public cArrayList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void printList() {
        System.out.println(list);
    }
}

class cLinkedList<T> {
    private LinkedList<T> list;

    public cLinkedList() {
        list = new LinkedList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void addFirst(T element) {
        list.addFirst(element);
    }

    public void addLast(T element) {
        list.addLast(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void printList() {
        System.out.println(list);
    }
}

class cVector<T> {
    private Vector<T> vector;

    public cVector() {
        vector = new Vector<>();
    }

    public void add(T element) {
        vector.add(element);
    }

    public void remove(T element) {
        vector.remove(element);
    }

    public T get(int index) {
        return vector.get(index);
    }

    public int size() {
        return vector.size();
    }

    public void printVector() {
        System.out.println(vector);
    }
}

public class ass_9_1 {
    public static void main(String[] args) {
        
        cArrayList<Integer> cArrayList = new cArrayList<>();
        cArrayList.add(12);
        cArrayList.add(25);
        cArrayList.add(34);
        cArrayList.add(46);
        System.out.println("CustomArrayList after adding elements:");
        cArrayList.printList();

        cArrayList.remove(25);
        System.out.println("CustomArrayList after removing 25:");
        cArrayList.printList();

        cLinkedList<String> cLinkedList = new cLinkedList<>();
        cLinkedList.add("Inception");
        cLinkedList.add("The Matrix");
        cLinkedList.add("Interstellar");
        cLinkedList.add("The Dark Knight");
        System.out.println("CustomLinkedList after adding movies:");
        cLinkedList.printList();

        cLinkedList.addFirst("The Shawshank Redemption");
        cLinkedList.addLast("Fight Club");
        System.out.println("CustomLinkedList after adding elements at both ends:");
        cLinkedList.printList();

        cLinkedList.remove("Interstellar");
        System.out.println("CustomLinkedList after removing 'Interstellar':");
        cLinkedList.printList();

        cVector<Integer> cVector = new cVector<>();
        cVector.add(100);
        cVector.add(200);
        cVector.add(300);
        cVector.add(400);
        System.out.println("CustomVector after adding elements:");
        cVector.printVector();

        cVector.remove(300);
        System.out.println("CustomVector after removing 300:");
        cVector.printVector();
    }
}
