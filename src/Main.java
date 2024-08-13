import java.util.Scanner;

public class Main {
    private static KernelSimulator kernel = new KernelSimulator();
    private static SystemCallHandler syscallHandler = new SystemCallHandler();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            handleChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("==== Operating System Simulation ====");
        System.out.println("1. Create a new process");
        System.out.println("2. Create a new thread in a process");
        System.out.println("3. Display all processes and threads");
        System.out.println("4. Simulate a system call");
        System.out.println("5. Fork a process");
        System.out.println("6. Run simulation");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                createProcess();
                break;
            case 2:
                createThread();
                break;
            case 3:
                displayProcesses();
                break;
            case 4:
                simulateSystemCall();
                break;
            case 5:
                forkProcess();
                break;
            case 6:
                runSimulation();
                break;
            case 7:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void createProcess() {
        System.out.print("Enter priority for the new process: ");
        int priority = scanner.nextInt();
        System.out.print("Enter memory allocation for the new process: ");
        long memory = scanner.nextLong();
        PCB process = kernel.createProcess(priority, memory);
        System.out.println("Process created with PID: " + process.getPID());
    }

    private static void createThread() {
        System.out.print("Enter PID of the process to add a thread: ");
        int pid = scanner.nextInt();
        PCB process = findProcessByPID(pid);
        if (process != null) {
            System.out.print("Enter priority for the new thread: ");
            int priority = scanner.nextInt();
            TCB thread = kernel.createThread(process, priority);
            System.out.println("Thread created with TID: " + thread.getTID());
        } else {
            System.out.println("Process with PID " + pid + " not found.");
        }
    }

    private static PCB findProcessByPID(int pid) {
        for (PCB process : kernel.getProcessList()) {
            if (process.getPID() == pid) {
                return process;
            }
        }
        return null;
    }

    private static void displayProcesses() {
        System.out.println("==== Process and Thread List ====");
        for (PCB process : kernel.getProcessList()) {
            System.out.println("Process PID: " + process.getPID() + ", State: " + process.getState() +
                    ", Priority: " + process.getPriority());
            for (TCB thread : process.getThreads()) {
                System.out.println("  Thread TID: " + thread.getTID() + ", State: " + thread.getState() +
                        ", Priority: " + thread.getPriority());
            }
        }
    }

    private static void simulateSystemCall() {
        System.out.print("Enter the system call type (e.g., READ_FILE): ");
        String callType = scanner.nextLine();
        syscallHandler.handleSystemCall(callType);
    }

    private static void forkProcess() {
        System.out.print("Enter PID of the process to fork: ");
        int pid = scanner.nextInt();
        PCB process = findProcessByPID(pid);
        if (process != null) {
            kernel.forkProcess(process);
        } else {
            System.out.println("Process with PID " + pid + " not found.");
        }
    }

    private static void runSimulation() {
        kernel.run();
    }
}
