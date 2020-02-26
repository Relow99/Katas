public class Frame {
    public static void frame(String[] wording) {

        String name = wording[0];
        int n;
        //checking the longest word in the String[]
        for ( int i=0; i<wording.length; i++){

                if (wording[i].length() > name.length()){
                    //storing the longest name to variable (name).
                    name = wording[i];
                }
        }
        //printing out the top frame based on the longest name.
        for ( int i=0; i<name.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // print all the words from array.
        for ( int i=0; i<wording.length; i++) {
            System.out.print("* "+wording[i]);

            n = (((name.length() + 4) - wording[i].length())- 2);

            for (int x = 1; x <= n; x++){

                if (x == n){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
//        bottom frame
        System.out.print("");
        for ( int i=0; i<name.length() + 4; i++) {
            System.out.print("*");
        }

    }
        public static void main (String[]args){

            String[] wording = {"Write", "good", "code", "every", "day"};
            frame(wording);

        }
    }
