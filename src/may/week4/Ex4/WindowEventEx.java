package may.week4.Ex4;

import java.awt.*;
import java.awt.event.*;

public class WindowEventEx extends Frame {
	public WindowEventEx() {
		super("WihdowEvent �׽�Ʈ");

		Label exit = new Label("�������� ���� ��ư�� ���� �ּ���");

		add(exit);

		setBounds(300, 300, 200, 200);
		setVisible(true);

		addWindowListener(new WindowEventHandler1());
	}

	public static void main(String[] args) {
		new WindowEventEx();
	}	
}

class WindowEventHandler1 extends WindowAdapter{
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}















