import java.util.ArrayList;

import CourseMan.CompulsoryModule;
import CourseMan.ElectiveModule;
import CourseMan.Enrolment;
import CourseMan.Students;

public class CourseManProg {
    public static void main(String[] args) {
        ArrayList<Students> studentArrayList = new ArrayList<>();
        EnrolmentManager enrolmentManager = new EnrolmentManager();
        ArrayList<Enrolment> enrolmentsList = new ArrayList<>();
        ElectiveModule npr = new ElectiveModule("Network Programming", 1, 21);
        ElectiveModule mpr = new ElectiveModule("Mobile Programming", 1, 21);


        CompulsoryModule pco = new CompulsoryModule("Principle of Computing", 1, 23);
        CompulsoryModule ss1 = new CompulsoryModule("Special Subject 1", 1, 12);
        CompulsoryModule se1 = new CompulsoryModule("Se1", 2, 21);

        for (int i = 0; i < 5; i++) {
            studentArrayList.add(new Students("john" + i, "6/9/69", "fakeData@vllas.com", "America"));
        }


        enrolmentsList.add(new Enrolment(studentArrayList.get(0), npr, 10, 10));
        enrolmentsList.add(new Enrolment(studentArrayList.get(0), mpr, 9, 6));
        enrolmentsList.add(new Enrolment(studentArrayList.get(0), se1, 4, 9));
        enrolmentsList.add(new Enrolment(studentArrayList.get(1), pco, 2, 10));
        enrolmentsList.add(new Enrolment(studentArrayList.get(1), ss1, 5, 5));
        enrolmentsList.add(new Enrolment(studentArrayList.get(2), pco, 6, 6));
        enrolmentsList.add(new Enrolment(studentArrayList.get(2), mpr, 7, 7));
        enrolmentsList.add(new Enrolment(studentArrayList.get(3), se1, 4, 7));
        enrolmentsList.add(new Enrolment(studentArrayList.get(4), pco, 5, 6));
        enrolmentsList.add(new Enrolment(studentArrayList.get(4), se1, 0, 6));

        enrolmentsList.forEach(enrolmentManager::addEnrolment);
        enrolmentManager.sort();
        System.out.println(enrolmentManager.reportAssessment());
    }
}

