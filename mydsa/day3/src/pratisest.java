import java.util.LinkedList;
public class pratisest {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        for (int i = 4; i < 14 ; i +=2 ) {
            list.add(i);

            
        }
        for (int num : list){
            System.out.print(num+ ", ");

        }System.out.println();
        list.addFirst(3);
        list.addLast(14);
        System.out.println(list);
        
        
    }
}
