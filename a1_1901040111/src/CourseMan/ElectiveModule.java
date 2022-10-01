package CourseMan;
import CourseMan.Module;
public class ElectiveModule extends Module {
    String departmentName;
    public ElectiveModule(String name, int semeter, int credits) {
        super(name, semeter, credits);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectiveModule)) return false;
        if (!super.equals(o)) return false;

        ElectiveModule that = (ElectiveModule) o;

        return departmentName != null ? departmentName.equals(that.departmentName) : that.departmentName == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

