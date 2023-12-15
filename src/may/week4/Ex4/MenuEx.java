package may.week4.Ex4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEx extends Frame {
	public MenuEx() {
		Frame test = new Frame("메뉴 테스트");
		test.setSize(800, 600);
		MenuBar mb = new MenuBar();

		Menu mnufile = new Menu("파일");
		Menu mnucolor = new Menu("색상");
		Menu mnuhelp = new Menu("도움말");

		//file
		MenuItem mnunew = new MenuItem("새파일");
		MenuItem mnusave = new MenuItem("저장");
		MenuItem mnuopen = new MenuItem("열기");
		MenuItem mnuexit = new MenuItem("끝!!");

		//color
		MenuItem red= new MenuItem("빨강");
		MenuItem blue = new MenuItem("파랑");
		MenuItem green = new MenuItem("초록");
		MenuItem gray = new MenuItem("회색");
		MenuItem defaultColor = new MenuItem("기본");

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
