public class page125ex11 {
    public static void main(String [] args){
        Bars();
        space();
        numbers();
        space();
        Bars2();
        space();
        numbers2();
        space();


    }
    public static void space(){
        System.out.println("");
    }

    public static void Bars(){
        for(int y=1; y<=8; y++){
            System.out.print("    |");
        }
    }

        public static void numbers(){
            for(int y=1; y<=40; y++){
                System.out.print(y%5);

            }
        }
        public static void Bars2(){
            for(int y=1; y<7; y++){
                System.out.print("       |");
            }
        }
            public static void numbers2(){
                for(int y=1; y<=48; y++){
                    System.out.print(y%8);
                }
            }
        }
        
    

