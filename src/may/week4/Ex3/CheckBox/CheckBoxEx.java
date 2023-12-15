package may.week4.Ex3.CheckBox;

// header - edit "Data/yourJavaHeader" to customize
// contents - edit "EventHandlers/Java file/onCreate" to customize
//

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

class Habit {
	String name;

	public Habit(String name) {
		super();
		this.name = name;
	}
	
}

public class CheckBoxEx{
	public static void main(String[] args){
		Frame f=new Frame("체크박스 테스트");
		Panel p=new Panel();
		
		ArrayList<Habit> list = new ArrayList<Habit>();
		
		Checkbox ck1=new Checkbox("영화",true);
		Checkbox ck2=new Checkbox("스포츠");	
		Checkbox ck3=new Checkbox("여행");
		
		CheckboxGroup cg = new CheckboxGroup();
		cg.setSelectedCheckbox(ck3);
		cg.setSelectedCheckbox(ck2);
		cg.setSelectedCheckbox(ck1);
		Checkbox test = new Checkbox("테스트", false, cg);
		
		test.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				list.add(new Habit((String) e.getItem()));
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).name);
				}
			}
		});
		
		
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}

