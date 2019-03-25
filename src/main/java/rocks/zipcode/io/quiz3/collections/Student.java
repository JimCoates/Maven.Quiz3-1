package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this(null);
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        try {
            for (Lab lab : labs) {
                if (lab.getName().equals(labName)) {
                    lab.setStatus(labStatus);
                } else {
                    throw new UnsupportedOperationException();
                }
            }
        } catch (Exception ex) {
            System.out.println("error");
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab.getStatus();
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(labs.get(1).getName() + " > " + labs.get(1).getStatus() + "\n");
        builder.append(labs.get(0).getName() + " > " + labs.get(0).getStatus());

        return builder.toString();
    }
}
