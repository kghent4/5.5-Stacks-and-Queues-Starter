//To use for queues problem
public class Employee {
    String name;
    public Employee(String n){
        name = n;
    }
    public void answerCall(String customerName){
        System.out.println("Hi, this is " + name + ". How can I help you today, " + customerName + "?");
    }
}
