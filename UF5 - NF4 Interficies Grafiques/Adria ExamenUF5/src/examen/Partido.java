/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author adrianferialopez
 */
public class Partido {
    String equipLocal;
    int golsLocal;
    String equipVisitant;
    int golsVisitant;
    //---------------//

    public Partido(){}
    
    public Partido(String equipLocal, String equipVisitant, int golsLocal, int golsVisitant) {
        this.equipLocal = equipLocal;
        this.equipVisitant = equipVisitant;
        this.golsLocal = golsLocal;
        this.golsVisitant = golsVisitant;
    }
    
    public int resultado(){
        
           if(getGolsLocal() > getGolsVisitant())
           {
               return 1;
           }else
           if(getGolsVisitant() > getGolsLocal()){
                return -1;
            }
            return 0;
    }

    public String getEquipLocal() {
        return equipLocal;
    }

    public String getEquipVisitant() {
        return equipVisitant;
    }

    public int getGolsLocal() {
        return golsLocal;
    }

    public int getGolsVisitant() {
        return golsVisitant;
    }

    public void setEquipLocal(String equipLocal) {
        this.equipLocal = equipLocal;
    }

    public void setEquipVisitant(String equipVisitant) {
        this.equipVisitant = equipVisitant;
    }

    public void setGolsLocal(int golsLocal) {
        this.golsLocal = golsLocal;
    }

    public void setGolsVisitant(int golsVisitant) {
        this.golsVisitant = golsVisitant;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.equipLocal);
        hash = 47 * hash + Objects.hashCode(this.equipVisitant);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partido other = (Partido) obj;
        if (!Objects.equals(this.equipLocal, other.equipLocal)) {
            return false;
        }
        if (!Objects.equals(this.equipVisitant, other.equipVisitant)) {
            return false;
        }
        if (this.golsLocal != other.golsLocal) {
            return false;
        }
        if (this.golsVisitant != other.golsVisitant) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return equipLocal + "::" + equipVisitant + "::" + golsLocal + "::" + golsVisitant;
    }
    
    
}
