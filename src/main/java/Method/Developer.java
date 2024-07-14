package Method;

public class Developer {

    int id;
    String name;
    String speciality;
    int experience;

    public Developer() {

    }

    public Developer(int id, String name, String speciality, int experience) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience=" + experience +
                '}';
    }
}
