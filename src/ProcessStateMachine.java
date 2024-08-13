public class ProcessStateMachine {
    private PCB.ProcessState currentState;

    public ProcessStateMachine() {
        this.currentState = PCB.ProcessState.NEW;
    }

    public void transitionTo(PCB.ProcessState newState) {
        System.out.println("Transitioning from " + currentState + " to " + newState);
        this.currentState = newState;
    }

    public PCB.ProcessState getCurrentState() {
        return currentState;
    }
}
