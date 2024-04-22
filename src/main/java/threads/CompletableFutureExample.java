package threads;

import java.util.concurrent.CompletableFuture;

// crea data pipel line using CF
// if exception :

// make a non blocking call, ur thread cna cont..
// issue: longer the piple, harder to manage and mintian the code, difficult to use ,,
// if java 21 : access to cirtual thread;// make huge dif in java echo system
//
public class CompletableFutureExample {
    static  int comput(int n){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2*n;

    }

    static  CompletableFuture<Integer> create(int n){
        // time of cmpletatble never finish
        return CompletableFuture.supplyAsync(() -> comput(n));
    }

    public static void main(String[] args) throws InterruptedException {
        // thread will submit tabsk, and when the task is completed it will process
                 create(10)
                .exceptionally( err ->{   // to cthc the exception
                    return 0;
                }).
                //CF<Integer>
                thenApply(data ->data+1) // non-blocking it is map operation similar to stream map ,it take Funciton<t,P>
                //thenApply(data ->data+1.0) CF of double
                .thenAccept(System.out::println) //// simialr to forEache, it take Consumer <t>.. it is terminal operation // save to DB
                .thenRun(() -> System.out.println("Log the info")); // log  //Cf of Void

        System.out.println("IN Main thread "+Thread.currentThread());
        // wait till computable finish as we introcue 100 killi sec in compute
        Thread.sleep(200);


        CompletableFuture<Integer> cf1 = create(2);
        CompletableFuture<Integer> cf3 = create(3);
        cf1.thenCombine(cf3,(data1,data2) -> data1+data2).thenAccept(System.out::println); // combining 2 CF

        create(4).thenCompose(data ->create(data)
                .thenAccept(System.out::println));

        //similar to flat mao we hav e then compoose
        // if your func return dat use thenapply
        //if you func return completuable fututre use thencompse

    }


}
// if one to to one : use map in strema
// if one to many, like reun can be colleciton returr FlatMap
// oka go to next then
// exceptionl go to nect exceptionally
// timeout:  completeonntimeout , ortimeout // error timeout exption
