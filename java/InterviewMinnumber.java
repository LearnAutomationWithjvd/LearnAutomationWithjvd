public class InterviewMinnumber {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        int abc[][] = {{2,4,10},{3,2,0},{1,2,5}};
        int min=abc[0][0];
        int mincoloumn = 0;


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j]<min)//2
                {
                    min=abc[i][j];
                    mincoloumn=j;
                }
            }
        }

        int max=abc[0][mincoloumn];
     //   int k = 0;
      //  while(k<3)
       for(int k=0; k<3 ;k++) {
            if(abc[k][mincoloumn]>max)
            {
                max=abc[k][mincoloumn];
            }
           // k++;
        }

        System.out.println(max);

        /*for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println(" ");
        }*/

    }

}