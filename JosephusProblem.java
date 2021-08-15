public class JosephusProblem {
    public static void main(String[] args) {

       jos(1, 3);
        
    }

    public static int jos(int n, int k) {
        if(n == 1) return 0;

        return (jos(n-1, k) + k) % n ; 
    }
}
