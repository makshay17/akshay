package week1.june2nd;

public class june2ndDepartment {
public static void main(String args[]){
    Departmentsubclass dpmt = new Departmentsubclass();
    int x= dpmt.getDepartmentSize();
    System.out.println(x);
}
}
    abstract class Department {
    abstract int getDepartmentSize();
    }
    class Departmentsubclass extends Department{
    int getDepartmentSize(){
        return 2;
    }
    }
