import java.util.PriorityQueue;

class k{
public static void main(String args[]){
    PriorityQueue to = new PriorityQueue();
    to.add("dishes");
    to.add("launndry");
    to.add("bills");
    to.offer("bills");
    System.out.println(to.size()+ "" +to.poll());
    System.out.println(to.peek()+ "" +to.poll());
    System.out.println(to.poll()+ "" +to.poll());
    }
}

