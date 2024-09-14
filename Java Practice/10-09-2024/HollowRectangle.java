class HollowRectangle{
    public static void main(String[] args) {
        int row = 4;
        int colum = 5;
        for(int n = 1; n<= row; n++){
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