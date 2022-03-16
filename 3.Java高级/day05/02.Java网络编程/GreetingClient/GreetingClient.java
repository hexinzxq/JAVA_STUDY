/**
 * @description: 该GreetingClient是一个客户端程序，该程序通过socket连接到服务器并发送一个请求，然后等待一个响应
 * */
import java.net.*;
import java.io.*;

public class GreetingClient {
    public static void main(String[] args) throws Exception {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("连接到主机： " + serverName + " ,端口号： " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址： " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFormServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFormServer);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}