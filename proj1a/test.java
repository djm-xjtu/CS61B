import org.junit.Test;

public class test{

    @Test
    public void check1(){
        LinkedListDeque<Integer> t = new LinkedListDeque<>();
        t.addFirst(1);
        t.addFirst(2);
        t.addLast(1);
        t.addLast(5);
        t.printDeque();
        System.out.println();
        System.out.println(t.getRecursive(0));
    }
    public static void main(String[] args){
        System.out.println("Start testing!");
        //check1();
    }

}