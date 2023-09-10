import java.util.Scanner;
class Pattern1 {
    public static void main(String[] args) {
        int n;
        int i,j,a=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=((i*(i+1))+1)/2;
            for(j=1;j<i;j++)
            {
                    System.out.print((a--)+"*");
            }
            System.out.println(a--);
        }
    }
}
