package week3.Ex1.ObjectProblem;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] personList = new Person[50];
		int index=0;
		
		personList[index++] = new Student("ȫ�浿" , 24, 25000); 
		personList[index++] = new Teacher("ȫ�浿", 30, "�ڹ�");
		personList[index++] = new Employee("��浿", 40, "������");
		
		for(int i = 0; i<index; i++) {
			if(personList[i] instanceof Student) {
				personList[i].print();
			}
			if(personList[i] instanceof Teacher) {
				personList[i].print();
			}
			if(personList[i] instanceof Employee) {
				personList[i].print();
			}
		}
	}

}

