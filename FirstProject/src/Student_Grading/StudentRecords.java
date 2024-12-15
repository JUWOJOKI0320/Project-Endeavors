package Student_Grading;

public class StudentRecords {
    private String Student_Name;
    private float Student_MathGrade, Student_ScienceGrade, Student_EnglishGrade;

    StudentRecords(){

    }

    StudentRecords(String Student_Name, float Student_MathGrade, float Student_ScienceGrade, float Student_EnglishGrade) {
        this.Student_Name = Student_Name;
        this.Student_MathGrade = Student_MathGrade;
        this.Student_EnglishGrade = Student_EnglishGrade;
        this.Student_ScienceGrade = Student_ScienceGrade;
    }

    //Setters
    public void SetStudentName(String Student_Name){
        this.Student_Name = Student_Name;
    }
    public void SetMathGrade(float MathGrade){
        this.Student_MathGrade = MathGrade;
    }
    public void SetEnglishGrade(float EnglishGrade){
        this.Student_EnglishGrade = EnglishGrade;
    }
    public void SetScienceGrade(float ScienceGrade){
        this.Student_ScienceGrade = ScienceGrade;
    }

    //Getters
    public String GetStudentName(){
        return Student_Name;
    }
    public float GetMathGrade(){
        return Student_MathGrade;
    }
    public float GetEnglishGrade(){
        return Student_EnglishGrade;
    }
    public float GetScienceGrade(){
        return Student_ScienceGrade;
    }

    @Override
    public String toString() {
        return "StudentRecords(Student Name='" + Student_Name +
                "', Student Math Grade'" + Student_MathGrade +
                "', Student English Grade'" + Student_EnglishGrade +
                "', Student Science Grade'" + Student_ScienceGrade + "')";
    }
}


