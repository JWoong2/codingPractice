package may.week4.Ex3.List;
/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListEx {
	public static void main(String[] arsg) {

		Frame f = new Frame("리스트 테스트");
		Panel p = new Panel();
		p.setSize(1020, 800);
		List list1 = new List(3);

		list1.add("서울");
		list1.add("대구");
		list1.add("대전");
		list1.add("부산");

		list1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Button b;
				b = new Button(list1.getItem(list1.getSelectedIndex()));
				b.setBackground(Color.LIGHT_GRAY);
				b.setSize(300, 200);

			}
		});

		p.add(list1);

		f.add(p);

		f.setSize(300, 100);
		f.setVisible(true);
	}
}
