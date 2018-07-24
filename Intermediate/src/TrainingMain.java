//Main function 
public class TrainingMain {

	public static void main(String[] args) {
		Training training = new PublicTraining(1,"java",5000,50);
		Training training1 = new CorporateTraining(2,"BigData",35000,4);
		
		training.getOrderValue();//invoking member function
		System.out.println("The total cost of java training is:" +training.getCost());
		training1.getOrderValue();//invoking member function
	
		System.out.println("The total cost of BigData training is:" +training1.getCost());//display
	}
}
