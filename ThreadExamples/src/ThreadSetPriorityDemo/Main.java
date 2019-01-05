package ThreadSetPriorityDemo;

public class Main {
    public static void main(String[] args) {
        //but thread priority often doesen't work
        ChildThread childThread=new ChildThread();
        childThread.setPriority(10);
        childThread.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
