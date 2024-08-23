package Sockets;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExampleSocket {
    //HOSTS
    static final String HOST_ONE = "google.com";
    static final String HOST_TWO = "streamcraft.net";

    //PORT
    static final int PORT = 80;

    //REQOEST (запрос)
    static final String REQUEST = "GET / HTTP/1.1\n"; // google.com

    public static void main(String[] args) {
        System.out.println("ВВЕДЕМ ОБМЕН С СЕРВЕРОМ " + HOST_ONE);
        try {
            //создаем сокет
            Socket socket = new Socket(HOST_ONE, PORT);

            //ДЛЯ ОБМЕНА НУЖНЫ ВХОДНОЙ И ВЫХОДНОЙ ПОТОКИ
            PrintStream out = new PrintStream(socket.getOutputStream()); //отправка запроса
            //Отличается от BufferWriter только тем, что его не нужно flush()
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //ОТПРАВЛЯЕМ ЗАПРОС ПО ПРОТОКОЛУ HTTP v 1.0 ПО МЕТОДУ GET
            out.println(REQUEST);

            //ПОЛУЧАЕМ ОТВЕТ ПОСТРОЧНО
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }

            in.close();
            out.close();
            socket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

















