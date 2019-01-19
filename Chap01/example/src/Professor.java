public class Professor{
    private Student1 student;                           //Student 객체

    public void setStudent(Student1 student){
        this.student = student;                         //Professor클래스에서 Student클래스 객체에 개입
        student.setAdvisor(this);
    }
    public void advise(String mention){
        student.advise(mention);
    }
}

class Student1{
    private Professor advisor;                      //Professor 객체

    public void setAdvisor(Professor professor){
        advisor = professor;
    }

    public void advise(String mention){
        System.out.println(mention);
}
}

class Main{
    public static void main(String[] args){
        Professor hakSuKim = new Professor();
        Student1 wonKyoJung = new Student1();

        hakSuKim.setStudent(wonKyoJung);
        hakSuKim.advise("공부좀 열심히 해라.");
    }
}