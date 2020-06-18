package Data;

import java.util.List;

public class Student extends User {

    private List<Institution> institutionList;

    public Student(String name) {
        super(name);
    }

    public List<Institution> getInstitutionList() {
        return institutionList;
    }

    public void setInstitutionList(List<Institution> institutionList) {
        this.institutionList = institutionList;
    }


}
