import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.Vector;
/*
public class Student {
    private String name;
    private Vector<Course> courses;

    public Student(String name){
        this.name = name;
        courses = new Vector<Course>();
    }
    public void registerCourse(Course course){
        courses.add(course);
        course.addStudent(this);
    }

    public void dropCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
            course.deleteStudent(this);
        }
    }

    public Vector<Course> getCourse(){
        return courses;
    }
}

class Course{
    private String name;
    private Vector<Student> students;

    public Course(String name){
        this.name = name;
        students = new Vector<Student>();
    }

    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
        else{
            System.out.println("이미 존재하는 이름 입니다.");
        }
    }

    public void deleteStudent(Student student){
        if(students.contains(student))
            students.remove(student);
    }

    public Vector<Student> getStudent(){
        return students;
    }
    public String getName(){
        return name;
    }
}
*/

public class Student{
    private Vector<Transcript> transcripts;
    private String name;

    public Student(String name){
        this.name = name;
        transcripts = new Vector<Transcript>();
    }

    public void setTranscripts(Transcript transcript){
        transcripts.add(transcript);
    }
    public Vector<Transcript> getTranscripts(){
        return transcripts;
    }

    public Vector<Course> getCourse(){
        Vector<Course> courses = new Vector<Course>();
        Iterator<Transcript> itor = transcripts.iterator();

        while(itor.hasNext()){
            Transcript tr = itor.next();
            courses.add(tr.getCourse());
        }
        return courses;
    }

    public String getName(){
        return name;
    }

    public void getGrade(){
        for(int i = 0 ; i <transcripts.size(); i++){
            System.out.println(transcripts.get(i).getGrade());
        }
    }
}

class Transcript{
    private Student student;
    private Course course;
    private String date;
    private String grade;

    public Transcript(Student student,Course course){
        this.student = student;
        this.student.setTranscripts(this);
        this.course = course;
        this.course.setTranscripts(this);
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }

    public String getDate(){
        return date;
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

}

class Course{
    private String name;
    private Vector<Transcript> transcripts;

    public Course(String name){
        this.name = name;
        transcripts = new Vector<Transcript>();
    }

    public void setTranscripts(Transcript transcript){
        transcripts.add(transcript);
    }

    public String getName(){
        return name;
    }
}

class TestMain{
    public static void main(String[] args) {

        Student s1 = new Student("이은지");
        Student s2 = new Student("정원교");
        Course courseFlight = new Course("항공운항개론");
        Course courseMath = new Course("공업수학");
        Course courseChinese = new Course("중국어");

        Transcript t1 = new Transcript(s1, courseChinese);
        Transcript t2 = new Transcript(s1, courseFlight);
        Transcript t3 = new Transcript(s1, courseMath);

        Transcript t4 = new Transcript(s2, courseChinese);
        Transcript t5 = new Transcript(s2, courseFlight);
        Transcript t6 = new Transcript(s2, courseMath);

        t1.setDate("2018년 12월");
        t1.setGrade("A+");
        t2.setDate("2018년 11월");
        t2.setGrade("A");
        t3.setDate("2018년 10월");
        t3.setGrade("A+");

        t4.setDate("2018년 12월");
        t4.setGrade("C+");
        t5.setDate("2018년 11월");
        t5.setGrade("F");
        t6.setDate("2018년 10월");
        t6.setGrade("D+");



        printGrade(s1);
        printGrade(s2);


    }

    public static void printGrade(Student student){
        System.out.println(student.getName()+" 의 성적과 과목: ");
        Vector<Course> courses = student.getCourse();
        Vector<Transcript> transcript = student.getTranscripts();
        for(int i= 0 ; i<courses.size(); i++){
            System.out.println(courses.get(i).getName()+transcript.get(i).getGrade());

        }
    }

}