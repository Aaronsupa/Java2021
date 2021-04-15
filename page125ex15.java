public class page125ex15 {
    public static void main(String[]args){
    for (int num = 1; num <= 9; num += 2) {
        for (int j = 0; j < (9 - num) / 2; j++) System.out.print('-');
        for (int k = 0; k < num; k++) System.out.print(num);
        for (int l = 0; l < (9- num) / 2; l++) System.out.print('-');
        System.out.println();
     }
}}