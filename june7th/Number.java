package june7th;

public class Number {
    int[] num= new int[]{1,2,3,4,5,7,8,9,0,12};
            int i2 = num[0];
            int i1= num[0];
            public void mynum(){
                for (int i=0;i<num.length;i++){
                    if (num[i]<i2){
                        i2=num[i];
                    }
                    else if(num[i]>i1){
                        i1=num[i];
                    }
                }
                System.out.println("Largest NUmber is="+ i1);
                System.out.println("Largest NUmber is="+ i2);
            }
        public static void main(String[] args)
        {
           Number ls=new Number();
           ls.mynum();
        }

    }

