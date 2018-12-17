import java.util.stream.IntStream;

class T implements Runnable {

	@Override
	public void run() {
		IntStream.range(1, 10).forEach(x -> System.out.println("Values are ----->" + x));

	}

}

public class ImplementsRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T());
		Thread t2 = new Thread(new T());
		t1.start();
		t2.start();
	}
}
