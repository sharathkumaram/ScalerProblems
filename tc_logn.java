public class tc_logn {
    public static  int logn(int n){
        int i = 0;
        while (n>1) {
            n = (int)Math.floor(n/2);
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int num = 64;
        System.out.print(logn(num));
    }
}
