package employe;

public class EmployeDemo {
    public String name;
    public int empnewId;
    public long number;

    public EmployeDemo(String name, int empnewId, long number) {
        this.name = name;
        this.empnewId = empnewId;
        this.number = number;

    }


    @Override
    public String toString() {
        return "EmployeDemo{" +
                "name='" + name + '\'' +
                ", empnewId=" + empnewId +
                ", number=" + number +

                '}';
    }

}


//    @Override
//    public String toString() {
//        return "Employe [id=" + empnewId + ",name=" + ", number=" + number;
//    }



