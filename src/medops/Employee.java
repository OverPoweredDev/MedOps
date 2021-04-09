package medops;

class Shift{
    int shiftDurationMinutes;
    int shiftStartTime;
    int shiftEndTime;

    Shift(int duration, int start, int end){
        this.shiftDurationMinutes = duration;
        this.shiftStartTime = start;
        this.shiftEndTime = end;
    }

    boolean isShiftOver(){
        return true;
    }

    void startShift(){

    }

    void endShift() {

    }
}

public class Employee {
    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getShift() {
        return shift;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getSalaryInRupees() {
        return salaryInRupees;
    }

    private final int ID;
    private final String username;
    private String shift;
    private final String password;
    private final String name;
    private final int salaryInRupees;

    public Employee(int id, String username, String name, String password, int salary){
        this.ID = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.salaryInRupees = salary;
    }
}
