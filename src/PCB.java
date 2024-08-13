import java.util.ArrayList;
import java.util.List;

public class PCB {

    public enum ProcessState {
        NEW, READY, RUNNING, BLOCKED, TERMINATED
    }

    private int PID;
    private ProcessState state;
    private int priority;
    private long creationTime;
    private long terminationTime;
    private long memoryAllocation;
    private List<TCB> threads;

    public PCB(int pid, int priority, long memoryAllocation) {
        this.PID = pid;
        this.state = ProcessState.NEW;
        this.priority = priority;
        this.memoryAllocation = memoryAllocation;
        this.creationTime = System.currentTimeMillis();
        this.threads = new ArrayList<>();
    }

    public void addThread(TCB thread) {
        threads.add(thread);
    }

    public void setState(ProcessState state) {
        this.state = state;
    }

    public void start() {
        setState(ProcessState.RUNNING);
        for (TCB thread : threads) {
            thread.run();
        }
    }

    public void terminate() {
        setState(ProcessState.TERMINATED);
        this.terminationTime = System.currentTimeMillis();
        System.out.println("Process " + PID + " has terminated.");
    }

    public int getPID() {
        return PID;
    }

    public ProcessState getState() {
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

    public long getMemoryAllocation() {
        return memoryAllocation;
    }

    public List<TCB> getThreads() {
        return threads;
    }
}
