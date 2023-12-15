package may.week4.Ex4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEx extends Frame {
	public MenuEx() {
		Frame test = new Frame("�޴� �׽�Ʈ");
		test.setSize(800, 600);
		MenuBar mb = new MenuBar();

		Menu mnufile = new Menu("����");
		Menu mnucolor = new Menu("����");
		Menu mnuhelp = new Menu("����");

		//file
		MenuItem mnunew = new MenuItem("������");
		MenuItem mnusave = new MenuItem("����");
		MenuItem mnuopen = new MenuItem("����");
		MenuItem mnuexit = new MenuItem("��!!");

		//color
		MenuItem red= new MenuItem("����");
		MenuItem blue = new MenuItem("�Ķ�");
		MenuItem green = new MenuItem("�ʷ�");
		MenuItem gray = new MenuItem("ȸ��");
		MenuItem defaultColor = new MenuItem("�⺻");

		//help
		mnufile.add(mnunew);
		mnufile.add(mnusave);
		mnufile.add(mnuopen);
		mnufile.addSeparator();
		mnufile.add(mnuexit);

		mnucolor.add(red);
		mnucolor.add(blue);
		mnucolor.add(green);
		mnucolor.add(gray);
		mnucolor.addSeparator();
		mnucolor.add(defaultColor);
		
		mnucolor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				switch (e.getID()) {
				case 0:
					test.setBackground(Color.red);	
					break;
				case 1:
					test.setBackground(Color.blue);	
					break;
				case 2:
					test.setBackground(Color.green);	
					break;
				case 3:
					test.setBackground(Color.lightGray);	
					break;
				
				default:
					test.setBackground(Color.white);
					break;
				}
				
			}
		});
		
		mb.add(mnufile);
		mb.add(mnuhelp);
		mb.add(mnucolor);

		setMenuBar(mb);

		setSize(200, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
