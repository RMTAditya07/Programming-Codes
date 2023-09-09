// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Prime {
    public static boolean isPrime(int a){
        if (a<2){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=1, b=100;
        System.out.println("Prime numbers between "+a+" and "+b+" is ");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
