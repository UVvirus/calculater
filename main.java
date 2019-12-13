package calculater;

import java.util.Scanner;

public class main {
	 
	public static void main(String[] args) {
		double output = 1;
		// TODO Auto-generated method stub
 double num1,num2;
 System.out.println("Enter first number:");
 Scanner scan=new Scanner(System.in);
 num1=scan.nextDouble();
 System.out.println("Enter the operater:(+-*/)");
 char operater=scan.next().charAt(0);

 System.out.println("Enter second number");
 num2=scan.nextDouble();
 switch(operater) {
 case '+':output=num1+num2;
          break;
 case '-':output=num1-num2;
           break;
 case '*':output=num1*num2;
          break;
 case '/':output=num1/num2;
          break;
  default:System.out.println("choosse the correct operater");
          return;
	}
 System.out.println(output);

	}
}
