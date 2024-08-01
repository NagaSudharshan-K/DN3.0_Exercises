public class MVCPattern {
    public static void main(String[] args) {
        Student model = new Student("Sudharshan", "001", "S");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.View();
    }
}
