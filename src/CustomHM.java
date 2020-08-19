import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomHM {

   private String name;
   private int salary;
   private String city;
   private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "CustomHM{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(getClass() != o.getClass()) return false;
        if(o == null) return false;
        CustomHM custom = (CustomHM) o;
        if(name != null ? !name.equals(custom.name) : custom.name != null) return false;
        if(salary != custom.salary) return false;
        if(city != null ? !city.equals(custom.city) : custom.city != null) return false;
        if(dept != null ? !dept.equals(custom.dept) : custom.dept!= null) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int result = 1;
        result = result * 31 + name != null ? name.hashCode() : 0;
        result = result * 31 + city != null ? city.hashCode() : 0;
        result = result * 31 + dept != null ? dept.hashCode() : 0;
        result = result * 31 + salary;
        return result;
    }

    public static void main(String [] args){

        HashMap<CustomHM,String> hm = new HashMap<CustomHM,String>();
        CustomHM c1 = new CustomHM();
        c1.setName("jake");
        c1.setCity("brooklyn");
        c1.setDept("accts");
        c1.setSalary(20000);

        CustomHM c2 = new CustomHM();
        c2.setName("jake");
        c2.setCity("brooklyn");
        c2.setDept("accts");
        c2.setSalary(20000);

        hm.put(c1,"paid");
        for(Map.Entry<CustomHM,String> entry : hm.entrySet()){
            System.out.println(entry.getKey().hashCode());
        }
        c1.setName("dfrfg");

        for(Map.Entry<CustomHM,String> entry : hm.entrySet()){
            System.out.println(entry.getKey().hashCode());
        }
        System.out.println(hm.get(c1)); //ideally null because key is mutable

        hm.put(c2,"unpaid");
        for(Map.Entry<CustomHM,String> entry : hm.entrySet()){
            System.out.println(entry.getKey().hashCode());
        }

System.out.println(hm);

    }
}
