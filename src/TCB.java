public class TCB {

    public enum ThreadState {
        NEW, READY, RUNNING, BLOCKED, TERMINATED
    }

    private int TID;
    private ThreadState state;
    private int priority;
    private long creationTime;
    private long terminationTime;
    private int processID;

    public TCB(int tid, int priority, int processID) {
        this.TID = tid;
        this.state = ThreadState.NEW;
        this.priority = priority;
        this.processID = processID;
        this.creationTime = System.currentTimeMillis();
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public void run() {
        setState(ThreadState.RUNNING);
        System.out.println("Thread " + TID + " of Process " + processID + " is running.");
        // Simulate work
        try {
            Thread.sleep(500); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        terminate();
    }

    public void suspend() {
        setState(ThreadState.BLOCKED);
        System.out.println("Thread " + TID + " is suspended.");
    }

    public void terminate() {
        setState(ThreadState.TERMINATED);
        this.terminationTime = System.currentTimeMillis();
        System.out.println("Thread " + TID + " of Process " + processID + " has terminated.");
    }

    public int getTID() {
        return TID;
    }

    public ThreadState getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public long getTerminationTime() {
        return terminationTime;
    }

    public int getProcessID() {
        return processID;
    }
}
