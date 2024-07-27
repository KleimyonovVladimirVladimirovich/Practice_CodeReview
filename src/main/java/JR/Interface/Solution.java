package JR.Interface;

import JR.Interface.contracts.ImplWithStaticMethod;
import JR.Interface.contracts.Interface;
import JR.Interface.contracts.Stoppable;

public class Solution{

    public static void main(String[] args) {
        Interface vehicle1 = new Car();
         Car vehicle = new Car();

         vehicle1.goBack();
         vehicle1.goLeft();
         vehicle1.goStraight();
         //От контракта(интерфейс)
         vehicle.someText();


//Реализация функционального интерфейса (когда есть всего один реализованный метод в теле интерфейса)
         Stoppable stoppable = s -> System.out.println(s);
         stoppable.stop("Privet");



         Interface motorsycl = new Move();
         motorsycl.goStraight();
         //...


        ImplWithStaticMethod.toCol();
    }
}













