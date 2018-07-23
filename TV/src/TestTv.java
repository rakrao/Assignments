import java.util.Scanner;
public class TestTv {


	public static void main(String[] args) {     //main method
		
		Scanner scanner = new Scanner(System.in);
		Telivision Remote=new Telivision("OFF", 1, 10);
		int volume,channel;
		
		System.out.println("Switch ON/OFF");
		
		String state=scanner.nextLine();
		Remote.setState(state);
		if(state.equals("ON"))
		{
			System.out.println("Enter channel number:");
			channel=scanner.nextInt();
			Remote.setChannel(channel);
			
			System.out.println("Press 1 or 0 to increase or decrease volume:");
			volume=scanner.nextInt();
			if(volume==1)
			{
				Remote.IncVolume();
			}
			else if(volume==0)
			{
				Remote.DecVolume();
			}
			
			System.out.println("TV info:");
			System.out.println("State:"+Remote.getState());
			System.out.println("channel:"+Remote.getChannel());
			System.out.println("Volume:"+Remote.getVolume());
		}
		Remote.setState("OFF");
	}

}
