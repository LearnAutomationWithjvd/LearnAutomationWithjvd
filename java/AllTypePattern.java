public class AllTypePattern {

    public static void main(String args[]) {
       /* *****
          *****
          *
          *****
          *****  */
        /*for (int i = 1; i <= 5; i++) {   // row
            for(int j =1; j<=5 ;j++) {    // column
                System.out.print("*");

                if(i == 3 ) {

                    break;
                }

            }
            System.out.println();

        }*/
/*------------------------------------------------------------*/
        /*1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1*/
        /*int row = 7;

        for(int i=1; i<=row ; i++){
            for(int j=1; j<=i ;j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        for(int i=row-1 ; i>=1 ;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        /*------------------------------------------------------------*/

        /*1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6
        7 7 7 7 7 7 7*/

        /*for(int i= 1; i<=7 ; i++) {
            for(int j=1; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();

        }*/
        /*------------------------------------------------------------*/

       /* 7 6 5 4 3 2 1
        7 6 5 4 3 2
        7 6 5 4 3
        7 6 5 4
        7 6 5
        7 6
        7*/

       /*for(int i=1; i<=7 ;i++) {
           for(int j=7; j>=i; j--) {
               System.out.print(j);
           }
           System.out.println();
       }*/
        /*------------------------------------------------------------*/

       /* 1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1*/

      /* for(int i =7; i>=1; i-- ) {
           for(int j=1; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();
       }*/

        /*------------------------------------------------------------*/

       /* 7 6 5 4 3 2 1
        6 5 4 3 2 1
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1*/

       /*for(int i=7; i>=1 ; i--) {
           for(int j=i; j>=1;j--) {
               System.out.print(j);
           }
           System.out.println();
       }*/

        /*------------------------------------------------------------*/

       /* 7
        7 6
        7 6 5
        7 6 5 4
        7 6 5 4 3
        7 6 5 4 3 2
        7 6 5 4 3 2 1*/

       /*for(int i=7 ; i>=1 ; i--) {
           for(int j=7; j>=i; j--) {
               System.out.print(j);
           }
           System.out.println();
       }
*/

        /*------------------------------------------------------------*/

        /*1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 6 7 6 5 4 3 2 1*/



    }
}