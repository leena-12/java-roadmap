import java.util.*;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList first item: " + arrayList.get(0));

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.addFirst("Start");
        linkedList.addLast("End");
        System.out.println("LinkedList: " + linkedList);
        linkedList.removeFirst();
        System.out.println("After removing first item: " + linkedList);
    }
}