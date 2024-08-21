package Sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    static int i = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        //System.out.println(serverSocket.getLocalPort()); //проверили
        System.out.println("Сервер работает.");
        while (true) {
            //будет ожидать входящие запросы
            Socket accept = serverSocket.accept();
            //Конструкция для получения входящих данных
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            //для ответа
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

            var request = bufferedReader.readLine();
            System.out.println("Запрос получен. Итерация: " + ++i);

            var response = "Ответ отдан.";
            bufferedWriter.write(response);
            bufferedWriter.flush(); //Чтобы все выскочило


            accept.close();
            bufferedReader.close();
            bufferedWriter.close();


        }
    }
}
