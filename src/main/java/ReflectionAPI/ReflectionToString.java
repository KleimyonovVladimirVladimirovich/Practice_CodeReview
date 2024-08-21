import java.lang.reflect.Field;

public class ReflectionToString {

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.getClass().getName()).append(" = { ");

        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            //field.setAccessible(true);
            try {
                stringBuffer.append(getClass().getName()).append(" -> ").append(field.get(this)).append(".");
            } catch (IllegalAccessException e) {
                e.getStackTrace();
                System.out.println(e.getMessage().length());
            }
        }
        stringBuffer.append(" } ");

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        ClassEx classEx = new ClassEx();
        classEx.name = "1";
        classEx.id = "001";
        classEx.age = 5;
        System.out.println(classEx);
    }
}
class ClassEx extends ReflectionToString {
    public String name;
    public String id;
    public Integer age;

}




