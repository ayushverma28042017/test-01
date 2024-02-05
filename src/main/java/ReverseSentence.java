import java.util.Arrays;

public class ReverseSentence {


     public static void reverseSentence() {
         String sent = " i am going to school";
         String sentArr[] = sent.split(" ");
         for (int i = sentArr.length-1; i > 0; i--){
             System.out.print(sentArr[i]);
             System.out.print(" ");
         }
     }

    public static void main(String[] args) {
        reverseSentence();
    }

}
