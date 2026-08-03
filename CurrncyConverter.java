package MyProfile;
import java.util.Scanner;
public class CurrncyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter in  USA amount");
double USA=sc.nextDouble();
double Ind_Rate=94.00;
double Ind=USA*Ind_Rate;
System.out.println("Amount in India="+Ind);
	}

}
