package chapter4;

public class VarArgsLesson {
    int counter = 0;
    public static float MarsGravity = 3.72f;
    public int sumOfAllNums(int y,String p, int... nums){

        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
    public static float getEarthsGravity(){
        return 9.8f;
    }
    public static void main(String[] args) {
        VarArgsLesson vl = new VarArgsLesson();
        vl.counter = 3;
        VarArgsLesson vl2 = new VarArgsLesson();
        vl2.counter = 30;
        VarArgsLesson vl3 = new VarArgsLesson();
        vl3.counter = 300;
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(vl.sumOfAllNums(1,"2",a));
        System.out.println(vl.sumOfAllNums(1,"2",3,4,5,6,7,8,9,10));
        System.out.println(vl.sumOfAllNums(33,"44",55));
        System.out.println(getEarthsGravity());
        System.out.println(MarsGravity);
        System.out.println(vl.MarsGravity);
        System.out.println(vl2.MarsGravity);
        System.out.println(vl3.MarsGravity);
        MarsGravity+=10;
        vl.MarsGravity+=30;
        System.out.println(MarsGravity);
        System.out.println(vl.MarsGravity);
        vl = null;
        vl2 = null;
        vl3 = null;
        System.out.println(vl);
        System.out.println(vl2);
        System.out.println(vl3);
        System.out.println(vl.MarsGravity);
        System.out.println(vl2.MarsGravity);
        System.out.println(vl3.MarsGravity);
        System.out.println(vl.getEarthsGravity());
        
        
    }
}
