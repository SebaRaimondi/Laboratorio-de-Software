public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Raimondi1", "Sebastian1", "12345/1");
        Estudiante estudiante2 = new Estudiante("Raimondi2", "Sebastian2", "12345/2");
        Estudiante estudiante3 = new Estudiante("Raimondi3", "Sebastian3", "12345/3");
        Estudiante estudiante4 = new Estudiante("Raimondi4", "Sebastian4", "12345/4");
        Estudiante estudiante5 = new Estudiante("Raimondi5", "Sebastian5", "12345/5");

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
        System.out.println(estudiante5.toString());
    }
}
