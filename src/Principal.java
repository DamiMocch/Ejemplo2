public class Principal {
    public static void main(String[] args) {
// Crear mis objetos
//        1. Clase a la que pertenece el objeto
//        2. Identificador
//        3. new + constructor
        Estudiante estudiante1 = new Estudiante();

//        Definirle
        estudiante1.nombre = "Damaris";
        estudiante1. edad = 23;

//        LLAMAMOS AL METODO PARA SALUDAR
        estudiante1.saludar();
    }

}
