package patterns.factorymethod;

public class Solution {

    public static void main(String[] args) {
        Transport transport1 = new CarPlant().createTransport();
        Transport transport2 = new MotorcyclePlant().createTransport();


        System.out.println(transport2 + " " +  transport2.getClass());
    }
}
