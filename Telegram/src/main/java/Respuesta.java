import java.util.List;

public class Respuesta {
    public Alumno datosAlumno(String carnet) {
        //5
        Alumno respuestaAlumno = new Alumno();
        List<Alumno> todos = new LecturaArchivo().leer();
        for (Alumno Alumnotemp : todos) {
            if (Alumnotemp.getCarnet().equals(carnet)) {
                respuestaAlumno = Alumnotemp;
            }
        }
        return respuestaAlumno;
    }
}
