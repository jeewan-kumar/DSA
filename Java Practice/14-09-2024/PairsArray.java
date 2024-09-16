public class PairsArray {
    public static void main(String[] args) {
        int list[] = {2,4,6,8,10};
        pairsArray(list);
    }

    static void pairsArray(int list[]){
        for(int a = 0; a <=list.length-1;a++){
            for(int b = a+1;b<=list.length-1;b++){
                System.out.print("["+list[a]+","+list[b]+"], ");
            }
        }
    }
}
