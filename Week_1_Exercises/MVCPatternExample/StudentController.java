public class StudentController {
    private Student instance;
    private StudentView viewinstance;
    public StudentController(Student student, StudentView view) {
        this.instance = student;
        this.viewinstance = view;
    }
    public void View() {
        viewinstance.displayStudentDetails(instance.getDetails());
    }
}
