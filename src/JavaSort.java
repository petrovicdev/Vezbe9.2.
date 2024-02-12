import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {

    private static void sort(List<Student> studentList){
        for(int i = 0; i < studentList.size() - 1; i++){
            for(int j = 0; j < studentList.size() - i - 1; j++){
                if(studentList.get(j).getCgpa() < studentList.get(j + 1).getCgpa()){
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
                else if(studentList.get(j).getCgpa() == studentList.get(j + 1).getCgpa()){
                    if(studentList.get(j).getFname().compareTo(studentList.get(j + 1).getFname()) > 0){
                        Student temp = studentList.get(j);
                        studentList.set(j, studentList.get(j + 1));
                        studentList.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
