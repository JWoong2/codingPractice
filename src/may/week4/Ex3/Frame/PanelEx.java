package may.week4.Ex3.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEx{

	public PanelEx(){
		Frame f = new Frame("Panel Test");
		Panel p = new Panel();

		p.setBackground(Color.LIGHT_GRAY);
		f.add(p);

		f.setSize(800, 600);
		f.setVisible(true);
		
		Button b1 = new Button("test");
		b1.setSize(300, 200);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1.setLabel("´­·È´Ù¾Æ ¤Ì¤Ì");
				b1.setSize(500, 300);
			}
		});
		p.add(b1);
		
	}
	public static void main(String[] args){
		new PanelEx();
	}
}
