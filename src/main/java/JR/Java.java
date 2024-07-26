package JR;

import java.sql.SQLOutput;

public class Java {

    public static void main(String[] args) {
        EntityFactory  entityFactory = new EntityFactory() {
            @Override
            public Entity create(long id, String email, String userName) {
                return new Entity(id,email,userName);
            }
        };
        Entity entity = entityFactory.create(100, "kitkat@org.new", "Vladimir");
        //или
        EntityFactory entityFactory1 = Entity::new;


        //ПРИМЕРЫ ФУНКЦ ИНТЕРФЕЙСОВ И ДЛЯ ЧЕГО
        //Типизированный результат
        //Function

        //БУЛЕВСКИЙ РЕЗУЛЬТАТ
        //Predicate

    }
}
