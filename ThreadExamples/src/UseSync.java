
public class UseSync {
	private static int count=0;
	public static synchronized void intcount()
	{
		count++;
	}
	public static void main(String[] args) {
		
	
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<10000;i++)
			{
				intcount();
			}
			
		}
	});
	
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<10000;i++)
			{
				intcount();
			}
			
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(count);

	

}
}