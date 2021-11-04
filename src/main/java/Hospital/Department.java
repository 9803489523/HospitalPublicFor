package Hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
    private String department_name;
    private List<Doctor> doctors;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department(String department_name, Doctor... doctors) {
        this.department_name =  department_name;
        this.doctors=new ArrayList<>();
        int counter=1;
        for (Doctor doctor:doctors){
            doctor.setId(counter++);
        }
        this.doctors.addAll(Arrays.asList(doctors));
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public void getDoctor(int id,int time){
        for(Doctor doctor:doctors){
            if(id==doctor.getId()) {
                System.out.println("Доктор: ");
                System.out.println(doctor.getName() + " " + doctor.getSurname());
                System.out.print("Время: ");
                doctor.getTime(time);
            }

        }

    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        int counter=1;
        for(Doctor doctor:doctors){
            stringBuilder.append("\t\t").append(counter++).append("-").append(doctor.toString()).append("\n");
        }
        return String.format("%s\n%s",department_name,stringBuilder);
    }
}
