package JR.Interface.contracts;
//сатические интерфейсы враг ООП
public interface ImplWithStaticMethod {
    String s = "smtnk"; //авто. помечен как public static final
    private void someMethod(){}
    static void toCol() {
        System.out.println("Static method");
    }
}
