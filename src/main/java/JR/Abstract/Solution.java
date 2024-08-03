package JR.Abstract;


public class Solution {
    public static void main(String[] args) {
        AbstractSon son = new AbstractSon("Vladimir");
        AbstractDaughter daughter = new AbstractDaughter("Maria");

        son.func();
        daughter.func();

        Abstract abs = new Abstract("Sons and daughters...") {
            @Override
            void func() {
                System.out.println("Its cool!");
            }
        }; //Анонимный класс (;)Анонимный

        Abstract absTest = new Abstract("Abstract Class") {
            @Override
            void func() {

            }
        };
        absTest.func();
        System.out.println("Имя класса - " + absTest.getName());


        abs.func();
    }
}



abstract class Abstract {

    private final String name;

    public Abstract(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    abstract void func();
}
//super - добраться до чего-то класса родителя
class AbstractSon extends Abstract {

    public AbstractSon(String name) {
        super(name);
    }

    @Override
    void func() {
        System.out.println("Im son");
    }

}
class AbstractDaughter extends Abstract {
    public AbstractDaughter (String name) {
        super(name);
    }
    @Override
    void func() {
        System.out.println("Im daughter");
    }
}
