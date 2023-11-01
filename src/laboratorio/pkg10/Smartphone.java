/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg10;

/**
 *
 * @author ferna
 */
public class Smartphone implements Camara, ReproductorDeMusica, NavegadorDeInternet {
    public String marca;
    public String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    @Override
    public void tomarFoto(String foto) {
        System.out.println("Tomando un foto: " + foto);
        
    }
    
    @Override
    public void grabar(String grabar) {
        System.out.println("Grabar con Smartphone: " + grabar);
        
    }
    
    @Override
    public void reproducirCancion(String cancion) {
        System.out.println("Reproduciendo la cancion: " + cancion);
    }
    
    @Override
    public void deteniendoCancion(String Dcancion){
    System.out.println("Deteniendo la cancion: " + Dcancion);
    }

    @Override
    public void abrirSitioWeb(String url) {
        System.out.println("Abriendo el sitio web: " + url);
    }
    
    
    public void mostrarMarcaYModelo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    public static void main(String[] args) {
        Smartphone miSmartphone = new Smartphone("Samsung", "Galaxy S21");
        miSmartphone.mostrarMarcaYModelo();
        miSmartphone.tomarFoto("Vacaciones");
        miSmartphone.grabar("Grabando");
        miSmartphone.reproducirCancion("Cancion favorita");
        miSmartphone.deteniendoCancion("Deteniendo cancion favorita");
        miSmartphone.abrirSitioWeb("Google");
    }
}
