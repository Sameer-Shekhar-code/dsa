package mathematics;

//All the prime numbers  between 1 and 40
public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        for(int i=1; i<=40; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c= 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
