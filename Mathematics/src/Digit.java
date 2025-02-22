public class Digit {

    static int countDigit(long l){

        if(l==0) return 1;

        return countDigit(l/10);
    }

    public static void main(String[] args) {
        long no = 1234546L;
        System.out.println("Number of Digits : " + countDigit(no));
    }
}
