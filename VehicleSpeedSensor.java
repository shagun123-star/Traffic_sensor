package project3;
import java.util.Random;
public class VehicleSpeedSensor {

	public static void main(String[] args) {
		Random rand =new Random();
		int numberOfVehicle = rand.nextInt(1,5);

		int typeOfVehicle=rand.nextInt(1,6) ;

		int incrementSpeedOfBike1=rand.nextInt(60,150) ;
		int decrementSpeedOfBike1=rand.nextInt(0,50);

		int incrementSpeedOfBike2=rand.nextInt(50,160) ;
		int decrementSpeedOfBike2=rand.nextInt(0,50);


		int incrementSpeedOfCar1=rand.nextInt(60,200) ;
		int decrementSpeedOfcar1=rand.nextInt(0,60);


		int incrementSpeedOfCar2=rand.nextInt(60,190) ;
		int decrementSpeedOfcar2=rand.nextInt(0,50);


		int incrementSpeedOfTruck1=rand.nextInt(40,130);
		int decrementSpeedOfTruck1=rand.nextInt(0,30);

		int incrementSpeedOfTruc2=rand.nextInt(40,140);
		int decrementSpeedOfTruck2=rand.nextInt(0,35);




		Motorbike bike1 = new Motorbike();
		Motorbike bike2 = new Motorbike();

		CarSensor car1 = new CarSensor();
		CarSensor car2 = new CarSensor();
		truckSensor truck1 =new truckSensor();
		truckSensor truck2 =new truckSensor();








		switch( numberOfVehicle) {
		case 1:
			numberOfVehicle=1;
			
			switch(typeOfVehicle) {
			case 1:
				typeOfVehicle=1;
				
				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());
				break;
				
			case 2:
				typeOfVehicle=2;
				
				car1.setSpeed(12);
				car1.increaseSpeed(incrementSpeedOfCar1);
				car1.decreaseSpeed(decrementSpeedOfcar1);
				System.out.println("Speed of Car: " +  car1.getSpeed());
				break;
			case 3:
				typeOfVehicle=3;
				
				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());
				break;
				
			case 4:
				typeOfVehicle=4;
				
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				break;
				
			case 5:
				typeOfVehicle=5;
				
				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				break;
				
			case 6:
				typeOfVehicle=6;

				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				break;

			}
			break;

		case 2:			
			numberOfVehicle=2;


			switch(typeOfVehicle) {
			
			
			case 1:
				typeOfVehicle=1;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());
				car1.setSpeed(12);
				car1.increaseSpeed(incrementSpeedOfCar1);
				car1.decreaseSpeed(decrementSpeedOfcar1);
				System.out.println("Speed of Car: " +  car1.getSpeed());
				break;
				
			case 2:
				typeOfVehicle=2;

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());


				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				break;

			case 3:
				typeOfVehicle=3;

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				break;
				
			case 4:
				typeOfVehicle=4;

				car1.setSpeed(12);
				car1.increaseSpeed(incrementSpeedOfCar1);
				car1.decreaseSpeed(decrementSpeedOfcar1);
				System.out.println("Speed of Car: " +  car1.getSpeed());
				
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				break;
				
			case 5:
				typeOfVehicle=5;

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				break;
				
			case 6:
				typeOfVehicle=6;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				break;

			}
			break;
		case 3:
			numberOfVehicle=3;

			switch(typeOfVehicle) {
			
			case 1:
				typeOfVehicle=1;

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());

				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());

				car1.setSpeed(12);
				car1.increaseSpeed(incrementSpeedOfCar1);
				car1.decreaseSpeed(decrementSpeedOfcar1);
				System.out.println("Speed of Car: " +  car1.getSpeed());

				break;
				
			case 2:
				typeOfVehicle=2;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());
				
				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				break;
				
			case 3:
				typeOfVehicle=3;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());

				break;
			case 4:
				typeOfVehicle=4;

				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				break;
			case 5:
				typeOfVehicle=5;

				car1.setSpeed(12);
				car1.increaseSpeed(incrementSpeedOfCar1);
				car1.decreaseSpeed(decrementSpeedOfcar1);
				System.out.println("Speed of Car: " +  car1.getSpeed());
				
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());

				break;
				
			case 6:
				typeOfVehicle=6;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());
				
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				
				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());
				break;
			}
			break;
			
		case 4:
			numberOfVehicle=4;

			switch(typeOfVehicle) {
			
			case 1:
				typeOfVehicle =1;
				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				
				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				break;
			case 2:
				typeOfVehicle=2;
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());
				break;

			case 3:
				typeOfVehicle=3;
				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());


				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());
				break;
			case 4:
				typeOfVehicle=4;
				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				break;
			case 5:
				typeOfVehicle=5;

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());
				
				bike2 .setSpeed(31);
				bike2.increaseSpeed(incrementSpeedOfBike2);
				bike2.decreaseSpeed(decrementSpeedOfBike2);

				System.out.println("Speed of bike: " +bike2.getSpeed());
				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());
				break;
				
			case 6:

				typeOfVehicle=5;

				bike1.setSpeed(20);
				bike1.increaseSpeed(incrementSpeedOfBike1);
				bike1.decreaseSpeed(decrementSpeedOfBike1);
				System.out.println("Speed of Bike: " +  bike1.getSpeed());

				truck2.setSpeed(23);
				truck2.increaseSpeed(incrementSpeedOfTruc2);
				truck2.decreaseSpeed(decrementSpeedOfTruck2);
				System.out.println("Speed of truck: " +  truck2.getSpeed());

				car2.setSpeed(23);
				car2.increaseSpeed(incrementSpeedOfCar2);
				car2.decreaseSpeed(decrementSpeedOfcar2);
				System.out.println("Speed of Car: " +  car2.getSpeed());

				truck1.setSpeed(23);
				truck1.increaseSpeed(incrementSpeedOfTruck1);
				truck1.decreaseSpeed(decrementSpeedOfTruck1);
				System.out.println("Speed of truck: " +  truck1.getSpeed());
				break;
			}
			break;
		default:
			System.out.println("There is no car passing through the sensor");
		}

	}
}




