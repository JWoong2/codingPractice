package 프로그래머스_스쿨.자바중급.람다내부익명;

public class Car{
    public String name;
    public int capacity;  
    public int price;
    public int age;
      
    public Car(String name, int capacity, int price, int age){
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.age = age;
    }
    
    public String toString(){
        return name;
    }
}