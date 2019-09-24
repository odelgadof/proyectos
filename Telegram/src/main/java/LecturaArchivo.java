import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LecturaArchivo {
	static ArrayList<Alumno> estudiantes = new ArrayList();
    public ArrayList<Alumno> leer() {
       
        String nombreArchivo = "datos.xlsx";
        String rutaArchivo = "C:\\Users\\Orvin\\Desktop\\estadistica\\" + nombreArchivo;
        String hoja = "Hoja1";

        try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();

            Row row;
            
           
            Alumno estu;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                boolean entra = true;
                estu = new Alumno();
              
                ArrayList<Double> notas = new ArrayList();    
                row = rowIterator.next();
                //se obtiene las celdas por fila
                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                //se recorre cada celda
                int cel=0;
                while (cellIterator.hasNext()) {
                    entra = false;
                    // se obtiene la celda en específico y se la imprime
                    cell = cellIterator.next();
                    try {
                        double nota = cell.getNumericCellValue();
                        notas.add(nota);
                    } catch (Exception e) {
                        if(cel == 0){
                            estu.setCarnet(cell.getStringCellValue());
                        }else if(cel == 1){
                            estu.setIdTelegram(cell.getStringCellValue());
                        }else if(cel == 2){
                            estu.setCorreo(cell.getStringCellValue());
                        }else if(cel == 3){
                            estu.setNombre(cell.getStringCellValue());
                        }
                        
                        cel++;
                    }
                }
                if(entra){
                    break;
                }
                
         
                estu.setNotas(notas);
                
                double[] datos = new double[notas.size()];
                
                for(int i = 0; i < notas.size(); i++){
                	datos[i] = notas.get(i); 
                }
                
                Calculos oper = new Calculos();
                estu.setDesviacion(oper.desviacion(datos));
                estu.setMedia(oper.promedio(datos));
                estu.setMediana(oper.mediana(datos));
                estu.setModa(oper.moda(datos));
                estu.setRango(oper.rango(datos));
                
                estudiantes.add(estu);
                //System.out.println();
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
        //recorrerArray();
        return estudiantes;
    }
    
    /*static void recorrerArray(){
        for(Estudiante est : estudiantes){
            System.out.println(est.getId() +" "+est.getNombre());
        }
        
        Scanner Sc = new Scanner (System.in);
        System.out.println("Seleccione un estudiante ");
        int notas = Sc.nextInt();
        seleccion(notas);
      
    }
    
    static void seleccion(int id){
        Estudiante estudiante = null;
        for(Estudiante est : estudiantes){
            if(id == est.getId()){
                estudiante = est;
                break;
            }
        }
        Operaciones oper = new Operaciones();
        
        System.out.println("Los datos del estudiante "+estudiante.getNombre()+" son.");
        double[] notas = new double[estudiante.getNotas().size()];
        
        for(int i = 0; i < estudiante.getNotas().size(); i++){
            notas[i] = estudiante.getNotas().get(i); 
        }
        
        System.out.println("Carnet: " +estudiante.getCarnet());
        System.out.println("IdTelegram: " +estudiante.getIdTelegram());
        System.out.println("Correo: " +estudiante.getCorreo());
        System.out.println("Desviacion: " +oper.desviacion(notas));
        System.out.println("Media: " +oper.promedio(notas));
        System.out.println("Mediana: " +oper.mediana(notas));
        System.out.println("Moda: " +oper.moda(notas));
        System.out.println("Rango: " +oper.rango(notas));
    }*/
    
}
