package Data;

import java.util.List;

public class Teacher extends User {

    private Journal journal;
    private List<Institution> institutionList;

    public Teacher(String name) {
        super(name);
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public List<Institution> getInstitutionList() {
        return institutionList;
    }

    public void setInstitutionList(List<Institution> institutionList) {
        this.institutionList = institutionList;
    }

    private class Journal{

        private List<Integer> assesments;

        public List<Integer> getAssesments() {
            return assesments;
        }

        public void setAssesments(List<Integer> assesments) {
            this.assesments = assesments;
        }
    }


}
