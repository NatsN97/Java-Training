public class Start {
    public static void main(String[] args) {
        
        /*Printing 1-5 in a right triangle */
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i>j||i==j){
                    System.out.print(j);
                }
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------");

        /*Printing * in a right triangle */
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i>j||i==j){
                    System.out.print("*");                        
                }
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------");

        /*Printing * in a X */
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==j||i+j==6){
                    System.out.print("*");                        
                }
                else{
                    System.out.print(" ");                        
                }
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------");

        /*Printing * in a triangle */
        int n=2;
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i<(j+1/2)){
                    System.out.print(" ");                        
                }
                else{
                    System.out.print("*");                        
                }
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------");

    }   
}
