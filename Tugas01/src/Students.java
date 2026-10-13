
public class Students {
    // Atribut
    private Integer NPM;
    private String Fullname;
    private String ClassName;
    private Integer Semester;
    private Float GPA;

    // Method
    public Integer getNPM(Integer value) {
        this.NPM = value;
        return this.NPM;
    }

    public String getFullname(String value) {
        this.Fullname = value;
        return this.Fullname;
    }

    public String getClassName(String value) {
        this.ClassName = value;
        return this.ClassName;
    }

    public Integer getSemester(Integer value) {
        this.Semester = value;
        return this.Semester;
    }

    public Float getGPA(Float value) {
        this.GPA = value;
        return this.GPA;
    }
}
