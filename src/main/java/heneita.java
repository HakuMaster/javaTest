import java.util.Scanner;

public class heneita {
   static int count = 0;

    //定义函数n是要移动的个数,a移动到c通过b
    static  void   hanoi(int n,int a,int b,int c) {
        if(n >= 1)
        {
            hanoi(n-1,a,c,b); //n - 1 move to b by c
            System.out.printf("%c--%c\n",a,c);//print process
            count++;
            hanoi(n-1,b,a,c);  //move to c by a
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.printf("Input the number of diskes:\n");
        Scanner sc = new Scanner(System.in);//声明初始化
        // scanf("%d",&a));
        //控制台输入 以回车符或空格符结束4
        n = sc.nextInt();
        hanoi(n,'A','B','C');
        System.out.printf("count = %d\n",count);
    }
}
