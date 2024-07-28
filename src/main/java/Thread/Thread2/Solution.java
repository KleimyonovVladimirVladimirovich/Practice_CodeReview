package Thread.Thread2;

import static java.lang.Thread.*;

//Проблематика многопоточности, synchronize, volatile, yield, join, deadlock, условия синх памяти
public class Solution  {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append(" B");
        System.out.println(sb);
    }
}
