public class javabook {
    public static final int num=10;
        public static void main(String[]args){
        topspaces();
        topline();
        desclines();
        bttm();
        bldjava();
        bldjavapro();
        bldjava();
        bttm();
        


    }
    public static void topspaces(){
        for(int line=1; line<=num; line++){
            for(int space=1; space<=num*line; space++){
                System.out.print(" ");

    }
}
    }
    public static void topline(){
        System.out.print("*");
        for(int line=1; line<=num*3; line++){
        System.out.print("-");
        }
        System.out.print("*");
        System.out.println();
    }
    public static void desclines(){
        System.out.print("/");
        for(int line=1; line<=num; line++){
            for(int space=1; space<=3*num-3*line+1;space++){
            System.out.print(" ");
        }
        System.out.println("_");
    }

        }
    public static void bldjava(){
        System.out.print("|");
        for(int space=1; space<=num*3; space++){
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void bldjavapro(){
        System.out.print("|");
        for(int space=1; space<=num; space++){
            System.out.print(" ");
        }
        System.out.print("Java book ");
        for(int space=1; space<=num; space++){
            System.out.print(" ");
        }
        System.out.println("|");
    }


    public static void bttm(){
        System.out.print("*");
        for(int line=1; line<=num*3; line++){
            System.out.print("-");
        }
        System.out.print("*");
        System.out.println();
    }
    }

