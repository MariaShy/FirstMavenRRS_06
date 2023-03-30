import java.util.Objects;

public class Manager extends Employee{

    int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalaryManager(){
        if (this.numberOfSubordinates==0){
            return getBaseSalary();
        }
        else {
            return getBaseSalary() * (1.0 * this.numberOfSubordinates / 100 * 3);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return numberOfSubordinates == manager.numberOfSubordinates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSubordinates);
    }
}
