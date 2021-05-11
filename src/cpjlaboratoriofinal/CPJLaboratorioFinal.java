package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        String nombreArchivo;
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion \n"
                    + "1. Iniciar catalogo pelicula \n"
                    + "2. Agregar pelicula \n"
                    + "3. Listar peliculas \n"
                    + "4. Buscar pelicula \n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    nombreArchivo = scanner.nextLine();
                    catalogo.agregarPelicula(nombreArchivo);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre de la pelicula que deseas buscar");
                    nombreArchivo = scanner.nextLine();
                    catalogo.buscarPelicula(nombreArchivo);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
                    break;
            }
        }
    }
}
