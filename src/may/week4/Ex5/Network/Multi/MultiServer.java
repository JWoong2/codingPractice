package may.week4.Ex5.Network.Multi;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

import java.io.*;
import java.net.*;
import java.util.*;
public class MultiServer { 
	private ArrayList<MultiServerThread> list; //Thread�� ���� �� �ִ� ����Ʈ ���� 
	private Socket socket; 
	
	public MultiServer() throws IOException {  
		list = new ArrayList<MultiServerThread>();  
		ServerSocket serverSocket = new ServerSocket(3333);  
		MultiServerThread mst = null;  
		boolean isStop = false;  
		
		while(!isStop) {   
			System.out.println("Server ready...");   
			socket = serverSocket.accept(); // ���ӱ��� ���⿡ ��� 
			
			mst = new MultiServerThread(this);   
			list.add(mst); //����Ʈ�� Thread�� �߰���Ų��   
			Thread t = new Thread(mst);   
			t.start();  
		}  
		// TODO Auto-generated constructor stub 
	} 
	
	public ArrayList<MultiServerThread> getList() {  
		return list; 
	} 
	
	public Socket getSocket() {  
		return socket; 
	} 

	public static void main(String[] args) throws IOException{  
	// TODO Auto-generated method stub  
		new MultiServer(); 
	}
}
