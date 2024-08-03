package Thread.Thread2;

import java.util.Scanner;

import static java.lang.Thread.*;

//Проблематика многопоточности, synchronize, volatile, yield, join, deadlock, условия синх памяти
public class Solution extends Thread {
    private Account to;
    private Account from;
    private Integer amount = 0;

    public Solution(Account to, Account from, Integer amount) {
        this.to = to;
        this.from = from;
        this.amount = amount;
    }

    public void run() {
        synchronized (from) {
            synchronized (to) { //такая вложенности синх и приводит к deadlock
                from.money -= amount; //списать
                to.money += amount; //добавить
                System.out.println("Платеж на сумму: " + amount);
            }
        }
//        from.money = this.amount; //списать
//        to.money = this.amount; //добавить
//        System.out.println("Платеж на сумму: " + amount);
    }

    public static void main(String[] args) throws Exception {
        Account w1 = new Account();
        Account w2 = new Account();
        //Account w3 = new Account();

        Solution solution1 = new Solution(w1,w2,10);
        Solution solution2 = new Solution(w2,w1,100);
        //Solution solution3 = new Solution(w3,w1,10);

        solution1.start();
        solution2.start();
        //solution3.start();
//DeadLock тут случается из-за нехватки мониторов(мьютаблов)
    }
}



class Account {
   Integer money = 0;
}
