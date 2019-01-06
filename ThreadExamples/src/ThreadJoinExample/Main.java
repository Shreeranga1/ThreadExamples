package ThreadJoinExample;

public class Main {

//if the thread.join is commented the out put will be 10
    public static void main(String[] args) throws InterruptedException {
        ChildthreadJoin childthread = new ChildthreadJoin();
        childthread.start();
        childthread.join();
        //waits for thread to complete
        int b = 10;
        int a = b + childthread.getC();
        System.out.println(String.format("The sum is %d", a));
    }
}
