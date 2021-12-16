public class ABC {

     public void m(Object o) {
            System.out.println("object");
        }

      public void m(String s) {
          System.out.println("String");
        }

        public static void main(String args[]){

            ABC ob=new ABC();
            ob.m(null);
        }
}
