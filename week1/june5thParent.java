package week1;

public class june5thParent {
    int x;
}
class Son extends june5thParent{
    int y;
    Son(int x,int y){
        this.x=x;
        this.y=y;
    }
    Son(int y){
        this.y=y;
    }

public static void main(String[] args){
        Son obj = new Son(10);
        Son obj5 = new Son(20);
        int a=obj.x;
        int b=obj.y;
        int c= obj5.x;
        int d= obj5.y;
}

}
