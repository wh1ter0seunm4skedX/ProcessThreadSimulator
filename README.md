# 🚀 ProcessThreadSimulator

This project is your go-to playground for exploring how operating systems juggle processes and threads. If you've ever wondered how the OS works its magic behind the scenes, this simulator is here to take you on a wild ride through context switching, process management, and more! 🧙‍♂️✨

## 📝 Overview

**ProcessThreadSimulator** is an interactive tool designed to help you master the inner workings of operating systems. It's like having your own mini-OS where you can experiment with processes, threads, system calls, and context switches, all from the comfort of your command line. Perfect for students, enthusiasts, or anyone preparing for an OS exam! 🎓📚

### 🌟 Key Features

- **🧵 Process & Thread Management**: Create, run, and manage processes and threads just like an OS!
- **🔄 Context Switching**: See how the OS switches between tasks in real-time.
- **📞 System Calls**: Simulate system calls to interact with the kernel—no admin privileges needed! 🤖
- **🕹️ Process State Machine**: Watch processes move through different states (Ready, Running, Blocked, Terminated) like a pro!

## 🛠️ Project Structure

Here's what powers the magic behind the scenes:

- **`Main.java`**: Your main dashboard 🖥️—this is where the action starts!
- **`KernelSimulator.java`**: The brain 🧠 of the simulator, managing context switches and scheduling.
- **`PCB.java`** (Process Control Block): The ID card 📇 for every process, storing all its vital stats.
- **`TCB.java`** (Thread Control Block): The ID card 📇 for threads, managing individual thread states.
- **`ProcessStateMachine.java`**: The traffic controller 🚦 of process states.
- **`SystemCallHandler.java`**: Your hotline ☎️ to the kernel—handles simulated system calls.
- **`ContextSwitch.java`**: The magic wand 🪄 that handles context switching between processes.

## 🚀 Getting Started

Follow these steps to dive into the simulation:

### Prerequisites

- ☕ Java JDK installed (version 11 or higher recommended)
- Any IDE or command-line tool you like!

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/ProcessThreadSimulator.git
   cd ProcessThreadSimulator
   ```

2. **Compile the Code**:
   ```bash
   javac src/*.java
   ```

3. **Run the Simulation**:
   ```bash
   java -cp src Main
   ```

4. **Enjoy the Show! 🎬**: Use the interactive menu to create processes, simulate context switches, and watch how the OS handles it all.

## 🤯 Learning Objectives

- Grasp the fundamentals of process and thread management.
- Dive deep into how context switching works and why it's critical.
- Learn about the lifecycle of a process and its different states.
- Experiment with system calls and see how user programs interact with the OS kernel.

## 🚧 Future Enhancements

- 🖥️ Add a snazzy GUI to visualize processes and threads in action.
- 📊 Implement advanced scheduling algorithms like Round-Robin and Priority Scheduling.
- 📡 Introduce Inter-Process Communication (IPC) to demonstrate semaphores, mutexes, and message queues.

## 📬 Feedback & Contributions

Have ideas or found a bug? Open an issue or submit a pull request! Contributions are welcome, and let's make this simulator even more epic! 💥

## 📝 License

This project is licensed under the MIT License. Feel free to use, modify, and share!

## 📧 Contact

Got questions? Reach out at wh1ter0seunm4sked@gmail.com. Happy simulating! 🧑‍💻

