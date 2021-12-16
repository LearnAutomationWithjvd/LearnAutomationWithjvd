import java.util.*;

public class ListInterface {

    public static void main(String args[]){
      /*  List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,2);
        l1.add(1,4);
        l1.add(2,6);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(7);
        l2.add(8);
        System.out.println(l2);

        l1.addAll(1, l2);
        System.out.println(l1);

        l2.addAll(3, l1);
        System.out.println(l2);

        l1.remove(0);
        System.out.println(l1);
        System.out.println(l1.get(3));

        l1.set(0,5);
        System.out.println(l1);*/

    /*  List<String> list = new LinkedList<String>();
      list.add(0,"Shabana");
      list.add("Javed");
      list.add("Sadika");

      System.out.println(list);
      System.out.println(list.get(2));

      List<String> list1 = new ArrayList<String>();
      list1.add("Shahnaj");
      list1.add("Bano");

      System.out.println(list1);

      for(String name: list){
          System.out.println(name);
      }*/

    /*  String[] array={"Java","Python","PHP","C++"};
      List<String> list2 = new ArrayList<String>();
      for(String l: array) {
      list2.add(l);

      }
      System.out.println(list2);
        Collections.sort(list2);
        for(String l: list2)
            System.out.println(l);*/



    /*  String[] arr =list.toArray(new String[list.size()]);
      System.out.println(Arrays.toString(arr));
*/

        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }



    }
}
