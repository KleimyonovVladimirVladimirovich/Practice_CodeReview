package Sockets;

import java.io.*;
import java.net.BindException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

    public static void main(String[] args) throws IOException, UnknownHostException, BindException {
        //localhost - 127.0.0.1
        InetAddress localhost = InetAddress.getLocalHost();
        //System.out.println(localhost);

        Socket socket = new Socket("127.0.0.1", 8080); //1 вариант
        //Socket socket1 = new Socket("localhost", 25000); //2 вариант

        System.out.println("Клиент начал работу.");


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //ОТПРАВЛЯЕМ ЗАПРОС НА СЕРВЕР
        var request = "Дядя Вова\n";
        bufferedWriter.write(request);
        bufferedWriter.flush(); //чтобы улетело на сервер

        //ПОЛУЧАЕМ ОТВЕТ ОТ СЕРВЕРА
        var response = bufferedReader.readLine();
        System.out.println(response);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();


    }
}
