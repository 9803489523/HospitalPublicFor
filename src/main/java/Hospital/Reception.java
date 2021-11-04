package Hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reception {
    private List<Department> departments;

    public Reception(Department... departments) {
        this.departments=new ArrayList<Department>();
        int counter=1;
        for (Department department:departments){
            department.setId(counter++);
        }
        this.departments.addAll(Arrays.asList(departments));
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
    public void getUslDocTime(int usl,int doc,int time){
        for(Department department:departments){
            if(department.getId()==usl) {
                System.out.println("Услуга: \n" + department.getDepartment_name());
                department.getDoctor(doc,time);
            }

        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        int counter=1;
        for(int i=0;i<departments.size();i++){
            stringBuilder.append("\t").append(counter++).append("-").append(departments.get(i).toString());
        }
        return  String.format("Услуги:\n%s",stringBuilder);
    }
}

