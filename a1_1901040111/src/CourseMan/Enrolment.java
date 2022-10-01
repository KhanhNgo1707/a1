package CourseMan;
import CourseMan.FinalGrade;

public class Enrolment {
    public Students student;
    public Module module;
    public float internalMark;
    public float examinationMark;
    public FinalGrade finalGrade;

    public Enrolment(Students student, Module module, float internalMark, float examinationMark) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        double aggregatedMark = (0.4 * internalMark + 0.6 * examinationMark);
        if (aggregatedMark >= 9f) {
            finalGrade = FinalGrade.E;
        } else if (aggregatedMark >= 7f) {
            finalGrade = FinalGrade.G;
        } else if (aggregatedMark >= 5f) {
            finalGrade = FinalGrade.P;
        } else {
            finalGrade = FinalGrade.F;
        }
    }

    @Override
    public String toString() {
        return "--------------------\nEnrolment:" +
                "student=" + student.toString() +
                ", module=" + module.toString() +
                ", finalGrade=" + finalGrade +
                "\n";
    }

    public String toFullString() {
        return "---------------------\nEnrolment:" +
                "student=" + student.toString() +
                ", module=" + module.toString() +
                ", internalMark=" + internalMark +
                ", examinationMark=" + examinationMark +
                ", finalGrade=" + finalGrade +
                "\n";
    }
}

