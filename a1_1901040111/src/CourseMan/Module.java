package CourseMan;

import java.util.HashMap;

public abstract class Module {
    private static final HashMap<Integer, Integer> countList = new HashMap<>();
    String code, name;
    int semeter, credits;

    public Module(String name, int semeter, int credits) {
        this.name = name;
        this.semeter = semeter;
        this.credits = credits;

        if (!countList.containsKey(semeter)) {
            countList.put(semeter, 0);
        }
        countList.put(semeter, countList.get(semeter) + 1);
        this.code = "M" + ((semeter * 100) + (countList.get(semeter)));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Module)) return false;
        Module module = (Module) o;

        if (code != null ? !code.equals(module.code) : module.code != null) return false;
        return name != null ? name.equals(module.name) : module.name == null;
    }

    @Override
    public String toString() {
        return "\nModule:" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                "\n";
    }
}
