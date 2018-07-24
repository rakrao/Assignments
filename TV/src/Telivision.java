//This tells about designing a television
public class Telivision {
private String state;
private int volume;
private int channel;
public Telivision(String state, int volume, int channel) {
	super();
	this.state=state;
	this.volume=volume;
	this.channel=channel;
	
}
public String getState() {
	return state;
}
public String setState(String state) {
	return this.state = state;
}
public void setChannel(int channel) {        //getters and setters
	this.channel=channel;
}
public int getVolume() {
	return volume;
}
public void IncVolume()
{
	this.volume+=1;
}
public void DecVolume()
{
	this.volume-=1;
}


public int getChannel() {
	return channel;
}
public void setVolume(int volume) {
	this.volume = volume;
}


}
