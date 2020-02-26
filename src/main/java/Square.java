public class Square {
    public static void addition (int number){

         for (int x=0; x<number; x++){
             for(int y=0; y<number; y++ ) {
                 System.out.print("#");
             }
             System.out.println("");
         }
    }
    public static void main (String[] args) {

        addition(4);

    }

}
