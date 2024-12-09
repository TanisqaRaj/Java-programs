//Program to print name n times using recursion

// import java.util.Scanner;
// class Recursion
// {
//     static int count=0;
//     public static void printNo(int num)
//     {
//         if (count==num) {
//             return;
//         }
//         else{
//             System.out.println("Name");
//             count++;
//         }
//         printNo(num);
//     }
//     public static void main(String[] args) 
//     {       
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         printNo(num);
//     }    
// }


//Program to print N to 1 using backtracking

// import java.util.Scanner;
// class Recursion
// {
    
//     public static void printNo(int num ,int count)
//     {
//         if (count>num) {
//             return;
//         }
//         printNo(num ,count+1); 
//         System.out.println(count);       
//     }
//     public static void main(String[] args) 
//     {
//         System.out.println("Enter Number: ");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();    
//         printNo(num,1);
//     }
// }


// import java.util.Scanner;
// class Recursion
// {
//     public static int sum(int num)
//     {
//         if(num == 0)
//         {
//             return 0;
//         }
//         return num + sum(num-1);
//     } 
//     public static void main(String[] args)
//     {
//         System.out.println("Enter Number: ");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();    
//         int ans=sum(num);
//         System.out.println(ans);
//     }
// }


// import java.util.Scanner;
// class Recursion
// {
//     public static int factorial(int num)
//     {
//         if(num == 0 || num==1)
//         {
//             return 1;
//         }
//         return num * factorial(num-1);
//     } 
//     public static void main(String[] args)
//     {
//         System.out.println("Enter Number: ");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();    
//         int ans=factorial(num);
//         System.out.println(ans);
//     }
// }


// import java.util.Scanner;
// class Recursion
// {
//     public static void reverse(int arr[] ,int l,int size)
//     {
//         if(l>=size)
//         {
//             return ;
//         }
//         swap(arr,l, size);
//         reverse(arr,l+1, size-1);
//     }
//     public static void swap(int arr[] ,int l,int size)
//     {
//         int temp;
//         for(int i:arr)
//         {
//             temp=arr[l];
//             arr[l]=arr[size];
//             arr[size]=temp;
//         }
//     } 
//     public static void main(String[] args)
//     {
//         System.out.print("Enter size of array: ");
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]= new int[size];
//         System.out.println("Enter data in array: ");    
//         for (int i = 0; i < size; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             arr[i] = sc.nextInt();
//         }
//         reverse(arr,0,size-1);
//         System.out.println("reversed array: ");
//         for(int i:arr)
//         {
//             System.out.println(i);
//         }      
//     }
// }


// import java.util.Scanner;
// class Recursion
// {
//     public static int findNthFibonacci(int n) {
//         if (n==0)
//         {
//             return 0;
//         }
//         if(n==1)
//         {
//             return 1;
//         }
//         return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
//     }

//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the value of n: ");
//         int n = scanner.nextInt();
//         int result = findNthFibonacci(n);
//         System.out.println("The " + n + "th Fibonacci number is: " + result);
//     }
// }

