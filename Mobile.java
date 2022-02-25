package week1.day3;

public class Mobile {
	public void sendMessage()
	{
		System.out.println("hello");
	}
	public void shareDocument()
	{
		System.out.println("Files");
	}
	public void callMe()
	{
		System.out.println("call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob=new Mobile();
		mob.sendMessage();
      mob.shareDocument();
     mob.callMe();
	}

}
