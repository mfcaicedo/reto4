
import java.util.ArrayList;
import reto4variantecarretera.Corredor;

/**
 * Ejemplo de clases
 * @author 
 */
public class Solucion {
    
    public static Object [] reporte(ArrayList <Corredor> carrera){
            
        double tiempoPromedio = 0; 
        for (int i = 0; i < carrera.size(); i++) {
            tiempoPromedio += carrera.get(i).getTiempoMeta();
        }
        tiempoPromedio = tiempoPromedio / carrera.size();
        
        double menorTiempo = carrera.get(0).getTiempoMeta();
        String nombreCorredor = carrera.get(0).getNombreCompleto();
        double mayorTiempo = carrera.get(0).getTiempoMeta();
        String nombreCorredorM = carrera.get(0).getNombreCompleto();
        for (int i = 0; i < carrera.size(); i++) {
            if (carrera.get(i).getTiempoMeta() < menorTiempo) {
                menorTiempo = carrera.get(i).getTiempoMeta();
                nombreCorredor = carrera.get(i).getNombreCompleto();
            }
            
            if (carrera.get(i).getTiempoMeta() > mayorTiempo) {
                mayorTiempo = carrera.get(i).getTiempoMeta();
                nombreCorredorM = carrera.get(i).getNombreCompleto();
            }
        }
        
        Object retorno[] = {
            tiempoPromedio, nombreCorredor, menorTiempo, nombreCorredorM, mayorTiempo
        };
        return retorno; 
    }
    
}
