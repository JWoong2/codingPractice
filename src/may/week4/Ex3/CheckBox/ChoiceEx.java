package may.week4.Ex3.CheckBox;

/*
// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//
*/

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ChoiceEx{
	public static void main(String[] args){

		Frame f=new Frame("Choice �׽�Ʈ");
		Panel p=new Panel();
		f.setSize(1200, 800);
		f.setVisible(true);
		
		Choice ch= new Choice();
		
		ch.add("���");
		ch.addItem("����");
		ch.addItem("��");
		ch.addItem("�ٳ���");
		
		List list = new List(3);
		
		list.setSize(300, 200);
//		f.add(ch);
//		f.add(list);
		ch.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getItem().toString());
				
				list.add((String) e.getItem());
				
				
//				for(int i=0; i<list.size(); i++) {
//					System.out.println(list.get(i).toString());
//				}
				
				
			}
		});
		
		p.add(ch);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}

