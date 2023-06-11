package June8th;

public class Rotate{

    boolean flag=true;
    public void test(String round,String xyz) {
        for (int i = 0; i <= round.length(); i++) {
            if (round.equals(xyz)) {
                flag = true;
                break;
            }
            else {
                char c = round.charAt(0);
                round = round.substring(1);
                if ((round= round + c).equals(xyz)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }



        }
        System.out.println(flag);
    }
    public static void main(String[] args){
        Rotate m=new Rotate();
        m.test("aksh","aksh");

    }
}
