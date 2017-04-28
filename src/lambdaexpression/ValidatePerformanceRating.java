
package lambdaexpression;

public class ValidatePerformanceRating implements Validate{
    
    public boolean check(Emp emp){
      return  (emp.getperformanceRating() >=5);
            
    }
}
