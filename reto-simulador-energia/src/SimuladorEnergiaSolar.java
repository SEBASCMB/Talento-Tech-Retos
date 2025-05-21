import java.util.Scanner;

public class SimuladorEnergiaSolar {

    public static void main(String[] args) {

        DatosEntrada datos = CapturadorDatos.capturar();
        double energiaGenerada = CalculadorEnergia.calcularEnergia(datos);
        Clasificador clasificador = new Clasificador();
        clasificador.mostrarResultado(datos, energiaGenerada);

    }
}

class DatosEntrada {

    double eficiencia;
    double area;
    double radiacion;

    public DatosEntrada(double eficiencia, double area, double radiacion) {

        this.eficiencia = eficiencia;
        this.area = area;
        this.radiacion = radiacion;

    }
}


class CapturadorDatos {

    public static DatosEntrada capturar() {

        Scanner sc = new Scanner(System.in);
        double eficiencia = 0, area = 0, radiacion = 0;

        while (true) {

            System.out.print("Ingrese la eficiencia del panel (0.10 - 0.25): ");
            eficiencia = sc.nextDouble();
            if (eficiencia >= 0.10 && eficiencia <= 0.25) break;
            System.out.println("⚠️ Eficiencia inválida. Intente de nuevo.");

        }

        while (true) {

            System.out.print("Ingrese el área total de los paneles (m²): ");
            area = sc.nextDouble();
            if (area > 0) break;
            System.out.println("⚠️ El área debe ser mayor a 0.");

        }

        while (true) {

            System.out.print("Ingrese la radiación solar diaria promedio (kWh/m²/día): ");
            radiacion = sc.nextDouble();
            if (radiacion > 0) break;
            System.out.println("⚠️ La radiación debe ser mayor a 0.");

        }

        DatosEntrada datosEntrada = new DatosEntrada(eficiencia, area, radiacion);
        sc.close();
        return datosEntrada;
    }
}

class CalculadorEnergia {

    public static double calcularEnergia(DatosEntrada datos) {
        return datos.eficiencia * datos.area * datos.radiacion;
    }
}

class Clasificador {

    public void mostrarResultado(DatosEntrada datos, double energia) {

        System.out.println("\n--- Resultados de tu instalación ---");
        System.out.println("Área total: " + datos.area + " m²");
        System.out.println("Eficiencia del panel: " + datos.eficiencia);
        System.out.println("Radiación promedio diaria: " + datos.radiacion + " kWh/m²/día");
        System.out.printf("Energía generada estimada: %.1f kWh/día%n", energia);


        String clasificacion = clasificarEnergia(energia);
        System.out.println("Clasificación: Producción " + clasificacion + ".");

        if (energia < 10) {
            System.out.println("❌ No cubre el consumo promedio de un hogar.");
            return;
        }
        System.out.println("✅ Cubre el consumo promedio de un hogar.");
    }

    private String clasificarEnergia(double energia) {
      if (energia < 5) return "baja";
      if (energia <= 10) return "media";
      return "alta";
    }
}
