import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		do{
		    
		        int marks = sc.nextInt();
		        if(marks >=90){
		            System.out.println("This is Good");
		        } else if(marks <=89 && marks >= 60){
		            System.out.println("This is also Good");
		        }else if(marks <=59 && marks >= 0){
		            System.out.println("This is Good as well");
		        }
		} while(n==1);
	}
}
