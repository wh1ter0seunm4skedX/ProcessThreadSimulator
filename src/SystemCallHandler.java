public class SystemCallHandler {

    public void handleSystemCall(String callType) {
        System.out.println("System call requested: " + callType);
        userModeCall();
    }

    public void userModeCall() {
        System.out.println("Entering User Mode...");
        System.out.println("TRAP: Switching to Kernel Mode for system call...");
        kernelModeOperation();
    }

    public void kernelModeOperation() {
        System.out.println("Executing operation in Kernel Mode...");
        // Simulate system call processing
        System.out.println("Operation completed. Returning to User Mode...");
        returnToUserMode();
    }

    public void returnToUserMode() {
        System.out.println("Returning to User Mode.");
    }
}
