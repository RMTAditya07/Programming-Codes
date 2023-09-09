// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class gcd_with_recursion{
    public static int gcd(int a,int b){
        if (a==0){
            return b;
        }
        if (b==0){
            return a;
        }
        if (a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
    public static void main(String[] args) {
        int a=100, b=15;
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
    }
}
