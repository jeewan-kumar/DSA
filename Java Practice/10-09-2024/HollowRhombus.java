public class HollowRhombus {
    public static void main(String[] args) {
        int row = 5;
        int colum = row;
        for(int n = 1; n<=row; n++){
            for(int l = 1;l<=row-n;l++){
                System.out.print("  ");
            }  
            for(int r = 1; r<=colum; r++){
                if(n==1||n==row||r==1||r==colum){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
           
        }
    }
}
