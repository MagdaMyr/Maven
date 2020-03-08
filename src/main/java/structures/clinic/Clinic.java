package structures.clinic;

import java.util.ArrayDeque;
import java.util.Queue;

public class Clinic {

    private Queue<String> patientQueue;

    public Clinic() {
        this.patientQueue = new ArrayDeque<>();
    }

    public void registerPatient(String name) {
        this.patientQueue.offer(name);
    }

    public String handlePatient() {
        return this.patientQueue.poll();
    }


}
