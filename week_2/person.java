package week_2;

public class person {
    int age;
    person(){
        age=9;
    }
    String typePerson(int age){
        if (age<15){
            return "kid";
        } else if (age<19) {
            return "teen";

        }
        else {
            return "Adult";
        }
    }
        public static void main(String []args){
            person obj1= new person();
            System.out.println(obj1.typePerson(obj1.age));
        }

}
