public class PrintPrime {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }


    }
/*
        int num = 3;
        if(isPrime(num)) {


            System.out.println(num + " is prime");
        }
    }
*/

    static boolean isPrime(int n) {
        boolean flag = true;
        for(int j=2; j<=n/2;j++) {
            if(n%j==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

