import java.util.Scanner;
public abstract  class Member {
    String name;
    int  age;
    long Phonenumber;
    String Address;
    int Salary;
    Member(String name,int age,long Phonenumber,String Address,int Salary)
    {
        this.name=name;
        this.age=age;
        this.Phonenumber=Phonenumber;
        this.Address=Address;
        this.Salary=Salary;
    }
    public abstract void printSalary();
}
class Employee extends Member
{
    String specialization;
    String department;
    Employee(String s,String d,String n,int a,long Ph,String Add,int Sa)
    {
       super(n,a,Ph,Add,Sa);
       specialization=s;
       department=d;
    }

    @Override
    public void printSalary() {
        System.out.println(name+"\n"+age+"\n"+Phonenumber+"\n"+Address+"\n"+Salary);
    }
}
class Manager extends Member
{
    String specialization;
    String department;
    Manager(String s,String d,String n,int a,long Ph,String Add,int Sa)
    {
        super(n,a,Ph,Add,Sa);
        specialization=s;
        department=d;
    }
    @Override
    public void printSalary() {
        System.out.println(name+"\n"+age+"\n"+Phonenumber+"\n"+Address+"\n"+Salary);

    }
}
class Test
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);

        Employee obj=new Employee( readme.nextLine(),readme.nextLine(),readme.nextLine(),readme.nextInt(),readme.nextLong(),readme.next(),readme.nextInt());
        //Employee obj = new Employee("Aiml", "b.tech", "prashant", 20, 79916662, "kamasi post basant", 5000);
        readme.nextLine();
        Manager obj1=new Manager(readme.nextLine(),readme.nextLine(),readme.nextLine(),readme.nextInt(),readme.nextLong(),readme.next(),readme.nextInt());
        //Employee obj1 = new Employee("Aiml", "b.tech", "prashant", 20, 79916662, "kamasi post basant", 5000);
        obj.printSalary();
        obj1.printSalary();
    }
}

