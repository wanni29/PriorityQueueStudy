import java.util.PriorityQueue;

public class PriorityQueueStudy02 {

    static class Task implements Comparable<Task> {
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);

        }

    }

    public static void main(String[] args) {

        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task("Task 1", 3));
        taskQueue.add(new Task("Task 2", 1));
        taskQueue.add(new Task("Task 3", 2));

        while(!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processiong : " + task.name);
        }

    }

}
