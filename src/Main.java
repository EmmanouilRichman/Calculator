public class Main {


    public static void main(String[] args) {
        CalcView view = new CalcView();
        Model model = new Model();
        Controller controller = new Controller(view, model);
    }
}
