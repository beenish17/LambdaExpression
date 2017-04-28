
package lambdaexpression;

public class Emp {
    String name;
    int performanceRating;
    double Salary;
    
    Emp(String name,int pR,double Salary){
        this.name=name;
        this.performanceRating=pR;
        this.Salary=Salary;
    }
    public String getName(){
        
        return name;
    }
    
    public int getperformanceRating(){
        
        return performanceRating;
    }
    
    public double getSalary(){
        
        return Salary;
    }
    public String toString(){
    return name + " " + performanceRating + " "+ Salary;
    }
}
