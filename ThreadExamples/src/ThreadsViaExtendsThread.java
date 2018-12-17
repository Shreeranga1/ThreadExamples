import java.util.stream.IntStream;

class T1 extends Thread{
	public void run()
	{
		IntStream.range(1, 10).forEach(x->System.out.println("Values are ----->"+ x));
	}
}
public class ThreadsViaExtendsThread {

	public static void main(String[] args) {
		T1 t1=new T1();
		t1.start();
		
		T1 t2=new T1();
		t2.start();

	}

}
