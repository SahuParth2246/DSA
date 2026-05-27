import java.util.LinkedList;
public class stl {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);

        // Adding elements
        list.add(10);
        list.add(25);
        list.add(47);
        list.addFirst(5);   // adds at beginning
        list.addLast(63);   // adds at end

        System.out.println(list); // [5, 10, 25, 47, 63]

        // Access
        System.out.println(list.get(2));     // 25
        System.out.println(list.getFirst()); // 5
        System.out.println(list.getLast());  // 63

        // Update
        list.set(1, 99);
        System.out.println(list); // [5, 99, 25, 47, 63]

        // Remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list); // [99, 25, 47]

        // Size and search
        System.out.println(list.size());        // 3
        System.out.println(list.contains(25));  // true
        System.out.println(list.indexOf(47));   // 2
    }

}
