import java.util.ArrayList;
import java.util.List;

public class KernelSimulator {
    private List<PCB> processList;
    private PCB currentProcess;
    private int nextPID;
    private int nextTID;

    public KernelSimulator() {
        this.processList = new ArrayList<>();
        this.nextPID = 1;
        this.nextTID = 1;
    }

    public PCB createProcess(int priority, long memoryAllocation) {
        PCB process = new PCB(nextPID++, priority, memoryAllocation);
        processList.add(process);
        System.out.println("Created process with PID: " + process.getPID());
        return process;
    }

    public TCB createThread(PCB process, int priority) {
        TCB thread = new TCB(nextTID++, priority, process.getPID());
        process.addThread(thread);
        System.out.println("Created thread with TID: " + thread.getTID() + " in process PID: " + process.getPID());
        return thread;
    }

    public void run() {
        for (PCB process : processList) {
            currentProcess = process;
            process.setState(PCB.ProcessState.READY);
            process.start();
            manageContextSwitch();
        }
    }

    public void manageContextSwitch() {
        // Context switching logic here
        System.out.println("Context switch: saving state of current process and switching to next.");
    }

    public void forkProcess(PCB process) {
        PCB childProcess = createProcess(process.getPriority(), process.getMemoryAllocation());
        // Simulate copying memory space, registers, etc.
        System.out.println("Forked process. Parent PID: " + process.getPID() + ", Child PID: " + childProcess.getPID());
    }

    public List<PCB> getProcessList() {
        return processList;
    }
}
