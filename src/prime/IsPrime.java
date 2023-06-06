package prime;
public class IsPrime {
    public static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if (number % i == 0) {
                return false;
                //means it is not prime
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i=2; i<200;i++){
            if(isPrime(i)){
        System.out.println(i);
            }
        }
    }
}

