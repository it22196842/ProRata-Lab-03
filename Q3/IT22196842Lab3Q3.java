import java.util.Scanner;
public class IT22196842Lab3Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount: ");
		int amount = input.nextInt();
		
		//calculations
		int amount1 = amount/5000;
		int amount2 = (amount-(5000*amount1))/1000;
		int amount3 = (amount-((5000*amount1)+(1000*amount2)))/(500);
		int amount4 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)))/200;
		int amount5 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)))/100;
		int amount6 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)))/50;
		int amount7 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)+(50*amount6)))/20;
		int amount8 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)+(50*amount6)+(20*amount7)))/10;
		int amount9 = (amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)+(50*amount6)+(20*amount7)+(10*amount8)))/05;
		int amount10 =(amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)+(50*amount6)+(20*amount7)+(10*amount8)+(05*amount9)))/02;
		int amount11 =(amount-((5000*amount1)+(1000*amount2)+(500*amount3)+(200*amount4)+(100*amount5)+(50*amount6)+(20*amount7)+(10*amount8)+(05*amount9)+(02*amount10)))/01;
		
		
		
		
		System.out.println("5000 Notes - " + amount1);
		System.out.println("1000 Notes - " + amount2);
		System.out.println("500 Notes - " + amount3);
		System.out.println("200 Notes - " + amount4);
		System.out.println("100 Notes - " + amount5);
		System.out.println("50 Notes - " + amount6);
		System.out.println("20 Notes - " + amount7);
		System.out.println("10 Coins - " + amount8);
		System.out.println("05 Coins - " + amount9);
		System.out.println("02 Coins - " + amount10);
		System.out.println("01 Coins - " + amount11);
		
		
		
		
	}
}
