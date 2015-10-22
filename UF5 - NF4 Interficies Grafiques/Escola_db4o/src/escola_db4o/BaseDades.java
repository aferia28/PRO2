/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola_db4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;
import java.util.ArrayList;

/**
 *
 * @author adrianferialopez
 */
public class BaseDades {
    
    private final ObjectContainer bd;
    
    
    public BaseDades() //Per obrir la BD.
    {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().objectClass(Professor.class).updateDepth(6);
        bd = Db4oEmbedded.openFile(config, "escola");
    }
        
    public void tancarBD()  //Per tencar la BD.
    {
        bd.close();
    }
    
    public ObjectSet retornarGrups()
    {
        Query query = bd.query();
        query.constrain(Grup.class);
        ObjectSet object = query.execute();
        return object;
    }
    
    public Grup retornarGrup(String nomGrup)
    {
        
        Query query = bd.query();
        query.constrain(Grup.class);
        ObjectSet grupos = query.execute();
        
        while (grupos.hasNext())
        {
            Grup grup = (Grup) grupos.next();
            
            if (grup.getNom().equals(nomGrup))
            {
                return grup;
            }
        }
        return null;
    }
    
    public ObjectSet retornarProfessors()
    {
        //Mirar com fer la ordenació com demana l'encunciat.
        Query query = bd.query();
        query.constrain(Professor.class);
        ObjectSet object = query.execute();
        return object;
    }
    
    public Professor recuperarProfesor(String NIF)
    {
        
        Query query = bd.query();
        query.constrain(Professor.class);
        ObjectSet profesores = query.execute();
        
        while (profesores.hasNext())
        {
            Professor prof = (Professor) profesores.next();
            
            if (prof.getNif().equals(NIF))
            {
                return prof;
            }
        }
        return null;
    }
    
    public Professor recuperarProfesorNom(String nom)
    {
        
        Query query = bd.query();
        query.constrain(Professor.class);
        ObjectSet profesores = query.execute();
        
        while (profesores.hasNext())
        {
            Professor prof = (Professor) profesores.next();
            
            if (prof.getNom().equals(nom))
            {
                return prof;
            }
        }
        return null;
    }
    
    public ObjectSet retornarNoDocent()
    {    
        //Mirar com fer la ordenació com demana l'encunciat.
        Query query = bd.query();
        query.constrain(PersonalNoDocent.class);
        ObjectSet object = query.execute();
        return object;
    }
    
    public ObjectSet recuperarPersonas()
    {
        Query query = bd.query();
        query.constrain(Persona.class);
        ObjectSet object = query.execute();
        return object;
    }
    public ObjectSet recuperarAlumnes(){
        Query query = bd.query();
        query.constrain(Alumne.class);
        //ordenar..
        ObjectSet object = query.execute();
        return object;
    }
    
    public Persona retornarPersona(String NIFpersona)
    {
        
        Query query = bd.query();
        query.constrain(Persona.class);
        ObjectSet personas = query.execute();
        
        while (personas.hasNext())
        {
            Persona persona = (Persona) personas.next();
            
            if (persona.getNif().equals(NIFpersona))
            {
                return persona;
            }
        }
        return null;
    }
    public Persona retornarPersonaNom(String nom)
    {
        
        Query query = bd.query();
        query.constrain(Persona.class);
        ObjectSet personas = query.execute();
        
        while (personas.hasNext())
        {
            Persona persona = (Persona) personas.next();
            
            if (persona.getNom().equals(nom))
            {
                return persona;
            }
        }
        return null;
    }
    
    public void anyadirModificarGrup (Grup grup)
    {
        bd.store(grup);
    }
    
    public void anyadirModificarProfessor(Professor prof)
    {
        bd.store(prof);
    }
    
    public void anyadirModificarNoDocent(PersonalNoDocent personalND)
    {
        bd.store(personalND);
    }
    
    public void anyadirModificarAlumne( Alumne alum)
    {
        bd.store(alum);
    }
    
    /*METODES PERO ELIMINAR OBJECTES DE LA BD*/
    
    public void eliminarGrup(Grup grup)
    {
        bd.delete(grup);
    }
    
    public void eliminarAlumne(Alumne alum)
    {
        bd.delete(alum);
    }
    
    public void eliminarNoDocent(PersonalNoDocent personalND)
    {
        bd.delete(personalND);
    }
    
    public boolean eliminarProfesor(String NIF)
    {
        
        Query query = bd.query();
        query.constrain(Professor.class);
        ObjectSet professors = query.execute();
        
        while (professors.hasNext()){ //Recuperem a tots el professors..
            
            Professor prof = (Professor) professors.next();                    
            
            if (prof.getNif().equals(NIF)) //comproblem que es el professor que volem esborrar...
            {
               ArrayList grups_profe = prof.getGrups(); //recuperem els grups que te el professor...
               
               for(int i = 0; i < grups_profe.size(); i++)
               {
                   if(grups_profe.get(i) == null)
                   {
                    bd.delete(prof);
                    return true;   
                   }
                   else{
                       return false;
                   }
               }
                if (grups_profe.isEmpty()) // Si aquest professor no te cap grup assignat, l'eliminarem..
                {
                    bd.delete(prof);
                    return true;
                }
            }
        }
        return false;
    }
    
}
