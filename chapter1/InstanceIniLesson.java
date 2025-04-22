package chapter1;
public class InstanceIniLesson{
    InstanceIniLesson(){
        code = 0;
    }
    int code =1;
    {
        System.out.println(code);
    }
    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();
        
        System.out.println(ini.code);
        {System.out.println("feathers");}
    }
    
    {
        System.out.println("Snowy");
        code = 214234234;
        System.out.println(code);
    }
    
}