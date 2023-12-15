package may.week4.Ex5.Network.UDP;

import java.net.*;
import java.io.*;

public class UdpClient {
	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("192.168.0.136");

		// �����Ͱ� ����� �������� byte�迭�� �����Ѵ�.
		byte[] msg = new byte[100];

		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 6060);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

		datagramSocket.send(outPacket);   // DatagramPacket�� �����Ѵ�.
		datagramSocket.receive(inPacket); // DatagramPacket�� �����Ѵ�.

		System.out.println("current server time :" + new String(inPacket.getData()));

		datagramSocket.close();
	} // start()

	public static void main(String args[]) {
		try {
			new UdpClient().start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main 
}