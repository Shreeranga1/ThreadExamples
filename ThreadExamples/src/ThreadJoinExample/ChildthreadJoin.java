package ThreadJoinExample;

public class ChildthreadJoin extends Thread {
    private int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int c;

    @Override
    public void run() {
        super.run();
        setC(10);
    }
}
