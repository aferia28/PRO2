/*
- Nom del PC.
- Velocitat del processador (en MHz).
- Capacitat de memòria (en MB).
- Capacitat del disc dur (en GB)
- Tamany de la pantalla (en polsades)
- Si porta lector de CD/DVD (sí o no)
 */
package ejercicio19;

/**
 *
 * @author adrianferialopez
 */
public class Ordinador {
    
    String Nom;
    double velpro;
    int ram;
    short discoduro;
    double pantalla;
    boolean dvd;

    public Ordinador(String Nom, double velpro, int ram, short discoduro, double pantalla, boolean dvd) {
        this.Nom = Nom;
        this.velpro = velpro;
        this.ram = ram;
        this.discoduro = discoduro;
        this.pantalla = pantalla;
        this.dvd = dvd;
    }
    
    public Ordinador()
    {
        
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getVelpro() {
        return velpro;
    }

    public void setVelpro(double velpro) {
        this.velpro = velpro;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public short getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(short discoduro) {
        this.discoduro = discoduro;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }
    
    public String toString (){
        String mensaje="PC:  " + Nom + "\n" + "Processador:" + velpro + "\n" + " Memoria RAM: " + ram + "\n" + "Capacitat del HDD: " +
                discoduro + "\n" + "Tamany de la pantalla: " + pantalla + "\n" + "Te DVD/CD: " + dvd;
        return mensaje;
    }
    
    
    @Override
    public Ordinador clone(){
        return new Ordinador(Nom,velpro,ram,discoduro,pantalla,dvd);
    }
    
    public boolean equals(Ordinador OrdinadorDos)
    {
        return this.Nom.equals(OrdinadorDos.Nom);
    }
    
}
