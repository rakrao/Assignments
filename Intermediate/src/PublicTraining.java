//PublicTraining child class
public class PublicTraining extends Training {
	private int participants; // instance member
	private double cost;

	public PublicTraining(int id, String subject, double fees, int participants) {
		super(id, subject, fees);
		this.participants = participants;
		
	}

	public void getOrderValue() // calculate cost
	{
		this.cost = participants * getFees();
	}

	public double getCost() {
		return cost;
	}

}
