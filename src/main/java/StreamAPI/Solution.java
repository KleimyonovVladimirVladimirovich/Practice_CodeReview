package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        Stream<Integer> stream = list.stream();

     Optional<Integer> first = stream
                .filter((s) -> s!=4)
                .limit(3)
                .skip(2)
                .findFirst();
                //.orElseThrow(); //Если не писать Optional

        System.out.println(first);



    }
}


//Stream - стрим
//Thread - поток
