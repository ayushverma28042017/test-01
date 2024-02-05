import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int test1[] =  {1,3,5,7,9};
        int test2[] =  {2,4,6,8,10};
        int res[] = getStortedArray(test1,test2);
        Arrays.stream(res).forEach(System.out::println);
//        System.out.println(Arrays.stream(res).toArray().forEach(System.out::println));
    }


    public static int[]  getStortedArray(int [] a, int []b){
        int s1= a.length;
        int s2= b.length;
        int i=0,j=0,k=0;
        int []result = new int[s1+s2];

        while(i<s1 && j <s2) {

            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
            while(i<s1) {
                result[k++] = a[i++];
            }
            while(j<s1) {
                result[k++] = b[j++];
            }
            return  result;
        }
    }

