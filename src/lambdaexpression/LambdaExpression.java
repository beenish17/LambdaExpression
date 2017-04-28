
package lambdaexpression;

import java.util.ArrayList;

public class LambdaExpression {

    public static void main(String[] args) {
        
        Emp e1=new Emp("Beenish",4,455.56);
        Emp e2=new Emp("Sajjad",3,355.56);
        Emp e3=new Emp("Umer",6,655.56);
        Emp e4=new Emp("Farooq",5,755.56);
        Emp e5=new Emp("Wasif",8,755.56);
        
        ArrayList<Emp> object=new ArrayList<>();
        object.add(e1);
        object.add(e2);
        object.add(e3);
        object.add(e4);
        object.add(e5);
       // filter(object,new ValidateName());
       Validate validatePerfor=value->(value.getperformanceRating()>=4);
       System.out.println(validatePerfor.getClass());
       filter(object, validatePerfor);
    }
    static void filter(ArrayList<Emp> object,Validate rule){
        
        for(Emp value: object)
            if(rule.check(value))
        System.out.println(value + "  ");
    }
}
