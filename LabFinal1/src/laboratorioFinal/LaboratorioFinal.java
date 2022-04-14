/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioFinal;

import com.peliculas.negocio.CatalogoPeliculasImpl;
import java.util.Scanner;
import com.peliculas.negocio.ICatalogoPeliculas;

/**
 *
 * @author Fernando Davila
 */
public class LaboratorioFinal {

    public static void main(String[] args) {

        int opcion = -1; //se inicializa en 100 para evitar confusiones 
       // String nombreArchivo = CatalogoPeliculasImpl.NOMBRE_RECURSO;
        Scanner sn = new Scanner(System.in);
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elija una opcion a continuacion \n ");
            System.out.println("1.- Iniciar Catalogo de peliculas");
            System.out.println("2.- Agregar pelicula");
            System.out.println("3.- Listar pelicula");
            System.out.println("4.- Buscar Pelicula");
            System.out.println("0.- Salir");
            
            opcion = scanearNumero();
            
            switch (opcion) {
                case 0: 
                    System.exit(0);
                case 1:
                    catalogoPeliculas.iniciarCatalogoPeliculas();
                    break;
                case 2: 
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula = sn.nextLine();
                    catalogoPeliculas.agregarPelicula(nombrePelicula);
                    break;
                case 3: 
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4: 
                    System.out.println("Introduce una pelicula a buscar");
                    var buscar = sn.nextLine();
                    catalogoPeliculas.buscarPelicula(buscar);
                    break;
                default:
                    System.out.println("Opcion desconocida");
            }
        }
    }
    /***
     * el metodo permite la lectura de los numeros de manera mas ordenada, 
     * ya que si se adjunta todo en el metodo main, queda mucho menos legible el codigo.
     * tambien se manejan las excepciones al momento de ingresar caracteres diferentes a los numericos
     * 
     * @return -1 como default para no salir del bucle while y no se seleccione una opcion que modifique 
     * el archivo
     */
    public static int scanearNumero() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Caracter no permitido, solo numeros enteros");
        }

       return -1;
    }
    

}
