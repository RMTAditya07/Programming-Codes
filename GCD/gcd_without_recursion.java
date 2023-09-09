
class gcd_without_recursion{
    public static int gcd(int a,int b){
        int result = Math.min(a,b);
        while (result > 0){
            if(a%result == 0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        int a=100, b=15;
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
    }
}
