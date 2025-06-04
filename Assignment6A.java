import java.util.Random;

public class Assignment6A {
    public static void main(String[] args) {
        int[] mA = new int[1000019];
        int[] rmA = new int[mA.length];
        int count=0, count1=0, low=0, mid, high=mA.length-1;
        for (int j = 0; j < mA.length; j++) {
            mA[j] = j;
        }
        for (int i = 0; i < mA.length; i++) {
            rmA[(mA.length - 1) - i] = mA[i];
        }
        Random rand = new Random();
        int target = rand.nextInt(mA.length - 1);
        System.out.println("\n[Linear vs. Binary Search]");
        System.out.println("Target value is " + target);

        for (int x=mA.length-1; x > 0; x--) {
            if (rmA[x] != target) {
                count++;
            }else {
                count++;
                break;
            }

        }System.out.println("Linear search: "+count+" loop(s)");

        while(high>=low){
            mid=(low+high)/2;
            if(target<rmA[mid]){
                high=mid-1;
                count1++;
            }
            else if(target==rmA[mid]){
                count1++;
                break;
            }
            else{
                low=mid+1;
                count1++;
            }
        }System.out.println("Binary Search: "+count1+" guess(es)");

        if(count>count1){System.out.println("\nBinary search is faster this time!");}
        else{System.out.println("\nLinear search is faster this time!\n");}
    }

}
