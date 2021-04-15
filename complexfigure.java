public class complexfigure {
    public static final int AARON = 4;
    public static void main(String [] args){
        top();
        head();
        bottom();
        top();
        }

    public static void top(){
        System.out.println("#================#");
    }
    public static void head() {
        for (int line = 1; line <= AARON; line++) {
            System.out.print("|");

            space(line);

                System.out.print("<>");

                for(int per=1; per<=(line*(4) - 4); per++){
                    System.out.print(".");
                }

                    System.out.print("<>");

                    space2(line);
                        System.out.println("|");                    
                }
            }
            public static void space(int line){
                for(int space = 1; space <= (line * -2+2*(AARON)); space++){
                    System.out.print(" ");
                }
            
                
                    }
                    public static void space2(int line){
                        for(int space = 1; space <= (line*-2 + 2*(AARON)); space++){
                            System.out.print(" ");
                }
            }
        public static void bottom(){
            for (int line = 1; line <= AARON; line++){
                System.out.print("|");

            for (int space = 1; space <= (line *2-2); space++){
                System.out.print(' ');
            }

            System.out.print("<>");

            for (int gap = 1; gap<= (-4*line+4*AARON); gap++){
                System.out.print(".");
            }

            System.out.print("<>");
            for (int space = 1; space<= (line*2-2); space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

    

