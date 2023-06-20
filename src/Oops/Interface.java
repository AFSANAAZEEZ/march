package Oops;
// create an interface tv remote and use it to inherit another interface smarttv remote.create a class TV which implements 
// SMARTTV remote interface


interface Tvremote
{
	public void channelup();
	public void channeldown();
	public void volumeup();
	public void volumedown();
	
	
}

interface Smarttvremote extends Tvremote
{
	public void bluetooth();
	public void channelsearch();
}



class TV implements  Smarttvremote
{
	


@Override
public void channelup() {
	System.out.println("channelup");
	
}

@Override
public void channeldown() {
	System.out.println("channeldown");
	
}

@Override
public void volumeup() {
	System.out.println("volumeup");
	
}

@Override
public void volumedown() {
	System.out.println("volumedown");
	
}

@Override
public void bluetooth() {
	System.out.println("bluetooth");
	
}

@Override
public void channelsearch() {
	System.out.println("chnnel search");
	
}
public class Interface {

	public static void main(String[] args) {
		
		TV  ob= new TV();
		ob.bluetooth();
		ob.channeldown();
		ob.channelup();
		ob.channeldown();
		ob.volumeup();
		ob.volumedown();
		ob.bluetooth();
		ob.channelsearch();

	}

}
}