package practica7.ej2;

// Tira error porque el segundo print es unreachable
// Cuando saco el comentario del try y finally ejecuta los dos print.
public class Test2 {
    public int unMetodo(){
        try {
            System.out.println("Va a retornar 1");
            return 1;
        } finally {
            System.out.println("Va a retornar 2");
            return 2;
        }
    }
    public static void main(String[] args) {
        Test2 res = new Test2();
        System.out.println(res.unMetodo());
    }
}