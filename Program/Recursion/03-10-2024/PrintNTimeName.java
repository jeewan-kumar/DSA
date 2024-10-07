/**
 * PrintNTimeName
 */
public class PrintNTimeName {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        System.out.println(printNTimeName(end));
        printNTimeName(start,end);
    }
    static String printNTimeName(int n){
        if(n<=0){
            return "";
        }
        return "jeewan\n" +printNTimeName(n-1);        
    }
    static void printNTimeName(int start, int end){
        if(end<=start){
            return;
        }
        System.out.println("Jeewan Kumar");
        printNTimeName(start+1, end);
    }
}