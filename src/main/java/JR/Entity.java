package JR;

public class Entity {
    public long getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getUserName() {
        return userName;
    }

    long id;
    String mail;
    String userName;

    public Entity(long id, String mail, String userName) {
        this.id = id;
        this.mail = mail;
        this.userName = userName;
    }
}
