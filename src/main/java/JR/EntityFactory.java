package JR;

public interface EntityFactory {
    Entity create(long id, String email, String userName);
}
