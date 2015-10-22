/*
Crea una classe ordinador, que tingui com atributs: Processador, memoria, HDD, Placa Base i si té unitat de cd o no.
 */
package lecturaordinador;

/**
 *
 * @author adrianferialopez
 */
public class Ordinador {
    
    float proc, memoria, hdd;
    String placa;
    boolean cd;

    public Ordinador(float proc, float memoria, float hdd, String placa, boolean cd) {
        this.proc = proc;
        this.memoria = memoria;
        this.hdd = hdd;
        this.placa = placa;
        this.cd = cd;
    }
    
    public Ordinador(){}

    public float getProc() {
        return proc;
    }

    public void setProc(int proc) {
        this.proc = proc;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public float getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isCd() {
        return cd;
    }

    public void setCd(boolean cd) {
        this.cd = cd;
    }

    @Override
    public String toString() {
        return "Ordinador\n proc: " + proc + ", memoria: " + memoria + ", hdd: " + hdd + ", placa: " + placa + ", cd: " + cd;
    }
    
    
    
}
