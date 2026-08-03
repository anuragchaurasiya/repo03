package MyProfile;
class Ride{
	double calculateFare(double distance) {
		return 0.0;
	}	
}
class BickRide extends Ride{
	double calculateFare(double distance) {
		return distance*8;
	}
}class AutoRide extends Ride{
	double calculateFare(double distance) {
		return distance*12;
	}
}
class CarRide extends Ride{
	double calculateFare(double distance) {
		return distance*18;
	}
}
public class Uber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double distance=10.5;
Ride Bick=new BickRide();
Ride Auto=new AutoRide();
Ride car=new CarRide();

System.out.println("Distance="+distance+"Km");
System.out.println("Bick Fare="+Bick.calculateFare(distance));
System.out.println("Auto Fare="+Auto.calculateFare(distance));
System.out.println("car Fare="+car.calculateFare(distance));

	}

}
