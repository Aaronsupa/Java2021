public class chapter7_2 {
    public static void main(String[]args){
        double[] darray = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(darray));
        int[] array = {36, 12, 25, 19, 46, 31, 22};
        System.out.println(range(array));


    }

public static boolean isSorted(double[] darray) {
    for(int x = 1; x < darray.length; x++) {
        if(darray[x] < darray[x - 1]) {
            return false;
        }
    }
    return true;
}
public static int range(int[] rarray) {
    int min = rarray[0];
    int max = rarray[0];
    for(int x = 0; x < rarray.length; x++) {
        if(rarray[x] < min) {
            min = rarray[x];
        }
        if(rarray[x] > max) {
            max = rarray[x];
        }
    }
    return Math.abs(min - max) + 1;
}
}
