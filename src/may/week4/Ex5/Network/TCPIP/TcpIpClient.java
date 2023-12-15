package may.week4.Ex5.Network.TCPIP;

import java.net.*;
import java.io.*;

public class TcpIpClient {
	public static void main(String args[]) {
		try {
			String serverIp = "192.168.0.136";

			System.out.println("������ �������Դϴ�. ����IP :" + serverIp);
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 5625); 

			// ������ �Է½�Ʈ���� ��´�.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			// �������� ���� ���� �����͸� ����Ѵ�.
			System.out.println("�����κ��� ���� �޼��� :"+dis.readUTF());      
			System.out.println("������ �����մϴ�.");
			
			// ��Ʈ���� ������ �ݴ´�.
			dis.close();
			socket.close();
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();  
		}  
	} // main
} // class