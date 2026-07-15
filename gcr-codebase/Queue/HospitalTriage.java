import java.util.*;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalTriage {
    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }
}
