public class AddTwoNumbers {

   public static void main(String[] args) {
        
      int num1 = 5, num2 = 15, sum;
      sum = num1 + num2;

      System.out.println("Sum of these numbers: "+sum);
      System.out.println("demo project assignment for github");

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int num1=sc.nextInt();
      System.out.print("Enter the second number: ");
      int num2=sc.nextInt();
      sc.close();
      sumNum(num1,num2);


     }

     public static void sumNum(int num_A,int num_B){
        int sum=0;
        sum=num_A+num_B;
        System.out.println("Sum of two numbers  "+sum);
        
}