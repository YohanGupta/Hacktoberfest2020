import java.util.*;
import java.io.*;

class Employee
{
int id, age;
String name;
public void Employee(int i_1, String n_1, int a_1)
{
    id = i_1;
    name = n_1;
    age = a_1;
} 
}

class Emp{ 
        public static void main(String args[])throws IOException
        {   
            Employee e1 = new Employee();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the employee id: ");
            int i = Integer.parseInt(br.readLine());
            System.out.println("Enter the name: "); 
            String n = br.readLine();
            System.out.println("Enter the age : "); 
            int a = Integer.parseInt(br.readLine());
            e1.Employee(i,n,a);
            System.out.println("The Employee id: " + e1.id);
            System.out.println("The name of the Employee: " + e1.name);
            System.out.println("The age of the Employee: " + e1.age);
        }
}

