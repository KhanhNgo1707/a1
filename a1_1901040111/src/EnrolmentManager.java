import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import CourseMan.Enrolment;
import CourseMan.Module;
import CourseMan.Students;

public class EnrolmentManager {
    ArrayList<Enrolment> enrolmentsList = new ArrayList<>();
    public void addEnrolment(Enrolment enrolment) {
        enrolmentsList.add(enrolment);
    }

    public Enrolment getEnrolment(Students student, Module module) {
        return enrolmentsList.stream().filter(obj -> obj.module.equals(module) && obj.student.equals(student)).collect(Collectors.toList()).get(0);
    }

    public void setMarks(Students student, Module module, float internal, float examination) {
        Enrolment enrolment = getEnrolment(student, module);
        if (enrolment != null) {
            enrolment.internalMark = internal;
            enrolment.examinationMark = examination;
        }
    }

    public String report() {
        StringBuilder result = new StringBuilder();
        enrolmentsList.forEach(it -> {
            result.append(it.toString());
        });
        return result.toString();
    }

    public String reportAssessment() {
        StringBuilder result = new StringBuilder();
        enrolmentsList.forEach(it -> {
            result.append(it.toFullString());
        });
        return result.toString();
    }

    public void sort() {
        enrolmentsList.sort(((o1, o2) -> {
            return Integer.parseInt(o2.student.id.substring(1)) - Integer.parseInt(o1.student.id.substring(1));
        }));
    }
}
