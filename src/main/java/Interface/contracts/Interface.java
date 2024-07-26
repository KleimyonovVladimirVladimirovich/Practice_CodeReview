package Interface.contracts;
//ТАКАЯ РЕАЛИЗАЦИЯ будет выглядеть функциональной, когда в нем ОДИН нериализованный метод.
@FunctionalInterface
public interface Interface {

    default void goStraight() {
        System.out.println("smtg to..");
    }
    default void goBack() {
        System.out.println("Yep");
    }
    default void goLeft() {
        System.out.println("Biba");
    }
    void toMove();

}



















