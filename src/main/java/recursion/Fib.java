package recursion;

public class Fib {
    public static void main(String[] args) {
        //fibIteration(10);

        for(int i=0;i<10;i++){
           System.out.println(fib(i));
        }

    }

   static int fib(int n){
        if(n==0|| n==1){
            return n;
        }
//       System.out.println(n);
       return fib(n-1)+fib(n-2);


    }

    static  void fibIteration(int n){
        int a =0;
        int b=1;
        int c;

        for(int i=0;i<=n;i++){

            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
//            fibtest+=i;
        }
    }
}
