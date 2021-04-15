public class tiktac{
    public static void main(String[] args){
        char[][] grid = {{'.','.','.'}, {'.','.','.'},{'.','.','.'}};
        for(int i = 0; i<3; i++){
            System.out.print(grid[0][i] + " ");
        }
        System.out.println();
        for(int i=0; i<3; i++ ){
            System.out.print(grid[1][i] + " ");
        }
        System.out.println();
        for(int i=0; i<3; i++ ){
            System.out.print(grid[2][i] + " ");
        }
        System.out.println();
    } 
}
