package pe.edu.upeu.claseinterna;

public class ClaseExterna {
    int num1;
    int num2;
    char oper;
    ClaseExterna(int num1, int num2, char oper){
        this.num1=num1;
        this.num2=num2;
        this.oper=oper;
    }

    class ClaseInterna{

        double operacion(int num1, int num2, char oper){
            double result=0;
            switch (oper){
                case '+': result=num1+ num2; break;
                case '-': result=num1- num2; break;
                case '/': result=(double)num1/ num2; break;
                case '*': result=num1* num2; break;
                default:break;
            }

         return result;

        }
    }
    public static void main(String[] args){
        char[] oper={'+','-', '/', '*'};
        ClaseExterna obj=new ClaseExterna(10,6,'+');
        ClaseInterna objI=obj.new ClaseInterna();
        for(char o:oper) {
            double result = objI.operacion(obj.num1, obj.num2, o);
            System.out.println("resultado con "+o+":"+result);

        }
    }
}
