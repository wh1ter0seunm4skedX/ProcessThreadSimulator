public class ContextSwitch {

    public void switchProcessContext(PCB current, PCB next) {
        System.out.println("Switching context from process PID: " + current.getPID() + " to PID: " + next.getPID());
        // Simulate saving and loading process states
    }

    public void switchThreadContext(TCB current, TCB next) {
        System.out.println("Switching context from thread TID: " + current.getTID() + " to TID: " + next.getTID());
        // Simulate saving and loading thread states
    }
}
