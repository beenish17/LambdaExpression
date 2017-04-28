
package lambdaexpression;

public class ValidateName implements Validate {

    

    public boolean check(Emp emp){
        return (emp.getName().startsWith("B"));
    }
}
