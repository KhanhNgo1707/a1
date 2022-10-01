package CourseMan;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

    public class Students {
        private static int count = 0;
        public String id;
        public String name;
        public String dob;
        public String email;
        public String address;

        public Students(String name, String dob, String email, String address) {
            this.name = name;
            this.dob = dob;
            this.email = email;
            this.address = address;

            int current = Calendar.getInstance().get(Calendar.YEAR);


            this.id = "S" + (current + (count++));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Students)) return false;

            Students student = (Students) o;

            if (!id.equals(student.id)) return false;
            return name.equals(student.name);
        }

        @Override
        public String toString() {
            return "\nStudent:" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    "\n";
        }
    }


