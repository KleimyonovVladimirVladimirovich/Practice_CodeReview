package Method;

public class Engineer extends Developer{

    final String GOVERNMENT_UNIVERSITY = "SPBU";

    public Engineer() {
    }

    @Override
    public String toString() {
        return "\nEngineer Info:" +
                "\nGOVERNMENT_UNIVERSITY: " + GOVERNMENT_UNIVERSITY +
                "\nid : " + id +
                "\nname : " + name +
                "\nspeciality : " + speciality +
                "\nexperience : " + experience + "\n";
    }

    public Engineer(int id, String name, String speciality, int experience) {
        super(id, name, speciality, experience);
    }
}
