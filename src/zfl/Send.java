package zfl;

import java.io.IOException;
import java.net.*;

/**
 * @author zhangfl<br               />
 * @program:myshop
 * @Description: <br/>
 * @create: 2019/1/2 15:01<br/>
 */
public class Send {

    public static void main(String[] args) throws IOException {
        Send sendUDP = new Send();
        if (args[0] == "normal")
            sendUDP.sendMsg(args[1], args[2], Integer.parseInt(args[3]));
        else if (args[0] == "auto")
            sendUDP.receiveAndSend();
        else
            System.out.println("输入参数错误");
    }

    void sendMsg(String msg, String IP, int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = msg.getBytes();
        InetAddress inetAddress = InetAddress.getByName(IP);
        DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, port);
        socket.send(packet);
        System.out.println("发送数据");
    }

    void receiveAndSend() throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.receive(packet);
        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("reveive MSG:");
        System.out.println(packet.getAddress().getHostAddress() + " : " + message);
        try {
            System.out.println("线程进入40s休眠");
            Thread.sleep(1000 * 40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendMsg("hello", packet.getAddress().getHostAddress(), packet.getPort());
    }
}
