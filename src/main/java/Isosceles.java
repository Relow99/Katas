public class Isosceles {
    public static void addition (int height) {

        String hash ="#";
        for(int t=0; t<height; t++) {
            int NoOfSpaces = height - t;
          for(int s=0; s<NoOfSpaces; s++)
          {
              System.out.print(" ");
          }
            System.out.println(hash);
            //add 2 hash keys to hash
            hash+="##";

        }
    }
    public static void main(String[] args){
        addition(4);
        }



}
