/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola_db4o;

import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author adrianferialopez
 */
public class Escola_db4o {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcio;
        BaseDades bd = new BaseDades();
        do{
            opcio=menu();
            switch(opcio){
                case 1:
                    System.out.println("***Mostrar Grups***\n");
                    mostrarGrups(bd);
                    break;
                case 2:
                    System.out.println("***Mostrar Grup***\n");
                    mostrarGrup(bd);
                    break;
                case 3:
                    System.out.println("***Mostrar Professorat***\n");
                    mostrarProfessors(bd);
                    break;
                case 4:
                    System.out.println("***Mostrar personal no docent***\n");
                    mostrarPersonalND(bd);
                    break;
                case 5:
                    System.out.println("***Mostrar Persona***\n");
                    mostrarPersona(bd);
                    break;
                case 6:
                    System.out.println("***Crear Grup***\n");
                    crearGrup(bd);
                    break;
                case 7:
                    System.out.println("***Crear Persona***\n");
                    crearPersona(bd);
                    break;
                case 8:
                    System.out.println("***Modificar Grup***\n");
                    modificarGrup(bd);
                    break;
                case 9:
                    System.out.println("***Modificar una persona***\n");
                    modificarPersona(bd);
                    break;
                case 10: 
                    System.out.println("***Eliminar Grup***\n");
                    eliminarGrup(bd);
                    break;
                case 11:
                    System.out.println("***Eliminar persona***\n");
                    eliminarPersona(bd);
                    break;
                case 0:
                    System.out.println("SORTINT DE LA APLICACIÓ...");
                    bd.tancarBD();
                    break;
            }
            
            
        }while(opcio!=0);
    }
    
    private static int menu (){
        
        int op;
        
        System.out.println("\n1- Mostrar tots els grups");
        System.out.println("2- Mostrar grup");
        System.out.println("3- Mostrar tot el professorat");
        System.out.println("4- Mostrar personal no docent");
        System.out.println("5- Mostrar una persona");
        System.out.println("6- Crear un grup");
        System.out.println("7- Crear una persona");
        System.out.println("8- Modificar un grup");
        System.out.println("9- Modificar una persona");
        System.out.println("10- Eliminar un grup");
        System.out.println("11- Eliminar una persona");
        System.out.println("0- Sortir");
        
        op = Teclat.leerInt("Opcio: ");
        
        return op;
    }
    
    public static void mostrarGrups(BaseDades bd)
    {
        ObjectSet grups = bd.retornarGrups();
        if(grups.isEmpty())
        {
            System.out.println("No hi ha cap grup enregistrat...\n");
        }else{
            while(grups.hasNext())
            {
                System.out.println(grups.next().toString());
            }
        }
    }
    
    public static void mostrarGrup(BaseDades bd)
    {
        Grup g;
        ArrayList<Alumne> alumnes;
        
        mostrarGrups(bd);
        String nomGrup = Teclat.leerString("Quin grup vols mostrar?");
        Grup grup = bd.retornarGrup(nomGrup);
        if(grup != null)
        {
            System.out.println("Nom del grup: " + grup.getNom());

            String nif_profe = grup.getNif_profe();
            Professor prof = bd.recuperarProfesor(nif_profe);
            System.out.println("Professor: " + prof.toString());

            alumnes = grup.getAlumnes();
            Iterator<Alumne> it = alumnes.iterator();
            if(alumnes.isEmpty())
            {
                System.out.println("No hi ha cap alumne a aquest grup...");
            }else{
                System.out.println("Alumnes del grup: \n");
                while(it.hasNext())
                {
                    System.out.println(it.next().toString());
                }
            }
        }else{
            System.out.println("Aquest grup no existeix!");
        }
    }
    
    public static void mostrarProfessors(BaseDades bd)
    {
        ObjectSet professors = bd.retornarProfessors();
        if(professors.isEmpty())
        {
            System.out.println("No hi ha professors a la Base de Dades...");
        }else{
            while(professors.hasNext())
            {
                System.out.println(professors.next().toString());
            }
        }
    }
    
    public static void mostrarPersonalND(BaseDades bd)
    {
        ObjectSet personalND = bd.retornarNoDocent();
        if(personalND.isEmpty())
        {
            System.out.println("No hi ha personal no docent a la base de dades....");
        }else{
            while(personalND.hasNext())
            {
                System.out.println(personalND.next().toString());
            }
        }
    }
    
    public static void mostrarPersona(BaseDades bd)
    {
        
        ObjectSet persones = bd.recuperarPersonas();
        if(persones.isEmpty())
        {
            System.out.println("No hi ha persones a la BD...");
        }else{
            while(persones.hasNext())
            {
                Persona p = (Persona) persones.next();
                System.out.println(p.getNom() + " " + p.getNif());
            }
        }
        
        String nif = Teclat.leerString("Introdueix el NIF de la persona que vols recuperar: ");
        Persona persona = bd.retornarPersona(nif);
        if(persona != null)
        {
            System.out.println(persona.toString() + " " + persona.getClass().getSimpleName());
        }else{
            System.out.println("No existeix aquesta persona");
        }
    }
    
    public static void crearGrup(BaseDades bd)
    {
        String nomGrup, nomTutor;
        
        ObjectSet professors = bd.retornarProfessors();
        if(professors.isEmpty())
        {
            System.out.println("No es pot crear cap grup perque no hi ha cap professor a la base de dades...");
        }
        else{
            
            nomGrup = Teclat.leerString("Nom del nou grup: ");
            
            while(professors.hasNext())
            {
                Professor p = (Professor) professors.next();
                System.out.println(p.toString());
            }
        
            nomTutor = Teclat.leerString("Quin professor serà el tutor del grup: ");
            Professor prof = bd.recuperarProfesorNom(nomTutor);

            Grup nou_grup = new Grup(nomGrup, prof.getNif());
            bd.anyadirModificarGrup(nou_grup);

            prof.anyadirGrup(nou_grup);
            bd.anyadirModificarProfessor(prof); 
        }

    }
    
    public static void crearPersona(BaseDades bd)
    {
        String nom, nif, cognom;
        int dia, mes, any;
        String adre, tel;
        
        int op = Teclat.leerInt("Quin tipus de persona vols afegir a la base de dades:\n 1. Professor\n 2.Alumne\n 3.Personal no docent\n");
        
            nif = Teclat.leerString("NIF: ");
            nom = Teclat.leerString("Nom: ");
            cognom = Teclat.leerString("Cognom: ");
            dia = Teclat.leerInt("Data de naixament. Dia: ");
            mes = Teclat.leerInt("Data de naixament. Mes: ");
            any = Teclat.leerInt("Data de naixament. Any: ");
            adre = Teclat.leerString("Direcció: ");
            tel = Teclat.leerString("Telefon: ");
            
        if(op == 1)
        {
            Professor prof = new Professor(nom, cognom, nif, dia, mes, any, adre, tel);
            bd.anyadirModificarProfessor(prof);
            
            System.out.println("Professor anyadit.");
        }else
            if(op == 2)
            {
                ObjectSet grups = bd.retornarGrups();
                if(grups.isEmpty())
                {
                    System.out.println("L'alumne no es pot assignar a cap grup pq no hi ha cap creat...");
                }else
                {
                    while(grups.hasNext())
                    {
                        Grup g = (Grup) grups.next();
                        System.out.println(g.getNom());
                    }
                    
                    String grup_nom = Teclat.leerString("A quin grup vols assignar l'alumne: ");
                    Grup g = bd.retornarGrup(grup_nom);
                    
                    Alumne alum = new Alumne(nom, cognom, nif, dia, mes, any, adre, tel, g.getNom());
                    bd.anyadirModificarAlumne(alum);
                    
                    g.anyadirAlumne(alum);
                    bd.anyadirModificarGrup(g); 
                }
            }else
                if(op == 3)
                {
                    String tasca = Teclat.leerString("Quina tasca desenvolupara aquesta persona no docent: ");
                    PersonalNoDocent pnd = new PersonalNoDocent(tasca, nom, cognom, nif, dia, mes, any, adre, tel);
                    
                    bd.anyadirModificarNoDocent(pnd);
                }
    }
    
    public static void modificarGrup(BaseDades bd)
    {
        String nom_profe;
                
        ObjectSet grups = bd.retornarGrups();
        if(grups.isEmpty())
        {
            System.out.println("No hi ha cap grup..");
        }else{
            while(grups.hasNext())
            {
                Grup g = (Grup) grups.next();
                System.out.println(g.getNom());
                //System.out.println(grups.next().toString());
            }
            
            String nom_grup = Teclat.leerString("Quin grup vols modificar: ");
            Grup grup = bd.retornarGrup(nom_grup);
            if(grup == null)
            {
                System.out.println("error. no existe este grupo...");
            }else{
                
                String nom_nou = Teclat.leerString("Introdueix el nou nom del grup: ");
            
                System.out.println("##TUTOR##\n");

                ObjectSet profes = bd.retornarProfessors();
                if(profes.isEmpty())
                {
                    System.out.println("No hi ha cap professor...");
                }else{

                    while(profes.hasNext()){
                        Professor p = (Professor) profes.next();
                        System.out.println(p.toString());
                    }
                    nom_profe = Teclat.leerString("\nQuin serà el nou tutor del grup: ");
                    Professor p_nou = bd.recuperarProfesorNom(nom_profe);

                    p_nou.eliminarGrup(grup);//Eliminem el grup..

                    grup.setNom(nom_nou); //seteamos amb el nou nom..
                    p_nou.anyadirGrup(grup); //anyadim el "nou grup" al professor
                    grup.setNif_profe(p_nou.getNif());
                    bd.anyadirModificarProfessor(p_nou);
                }
            }
        }
    }
    
    public static void modificarPersona(BaseDades bd)
    {
        String nom_nou, cognom_nou, adre_nova, tel_nou;
        int dia_nou, mes_nou, any_nou;
        
        ObjectSet persones = bd.recuperarPersonas();
        if(persones.isEmpty())
        {
            System.out.println("No hi ha persones a la base de dades...");
        }else{
            
            while(persones.hasNext())
            {
                Persona p = (Persona) persones.next();
                System.out.println(p.getNom()+" "+p.getCognom());
            }
            
            System.out.println("\n");
            
            String nom_persona = Teclat.leerString("¿Quina persona vols modificar?");
            Persona persona_modificar = bd.retornarPersonaNom(nom_persona);
            
            System.out.println("___Modificació de " + persona_modificar.getNom() + " " + persona_modificar.getCognom()+"___");
            
            nom_nou = Teclat.leerString("Nou nom: ");
            cognom_nou = Teclat.leerString("Nou cognom: ");
            System.out.println("Nova data de neixament\n");
            dia_nou = Teclat.leerInt("Dia: ");
            mes_nou = Teclat.leerInt("Mes: ");
            any_nou = Teclat.leerInt("Any: ");
            System.out.println("\n");
            adre_nova = Teclat.leerString("Nova adreça: ");
            tel_nou = Teclat.leerString("Nou telèfon: ");
            
            if(persona_modificar instanceof Professor)
            {
                Professor profe = bd.recuperarProfesorNom(persona_modificar.getNom());
                ArrayList<Grup> grups = profe.getGrups();
                
                if(bd.eliminarProfesor(persona_modificar.getNif()));
                {
                    Professor profe_nou = new Professor(nom_nou, cognom_nou, tel_nou, dia_nou, mes_nou, any_nou, adre_nova, tel_nou);
                    profe_nou.setGrups(grups);
                    bd.anyadirModificarProfessor(profe_nou);
                    System.out.println("La persona es un professor. No es poden modificar mes dades.");

                    System.out.println("Professor actualitzat");
                }
            }else
                if(persona_modificar instanceof Alumne)
                {
                    System.out.println("Alumne actualitzat");
                }else
                    if(persona_modificar instanceof PersonalNoDocent)
                    {
                        System.out.println("Personal no docent actualitzat");
                    }
        }
    }
    
    public static void eliminarGrup(BaseDades bd)
    {
        ObjectSet grups = bd.retornarGrups();
        if(grups.isEmpty())
        {
            System.out.println("No hi ha grups..");
        }else{
        
            String nom = Teclat.leerString("nom: ");
            Grup g = bd.retornarGrup(nom);

            ArrayList<Alumne> alumnes = g.getAlumnes();
            if(alumnes.isEmpty())
            {
                System.out.println("No hi ha alumnes al grup..El grup s'eliminará.");
                bd.eliminarGrup(g);
            }else{
                Iterator<Alumne> it = alumnes.iterator();
                while(it.hasNext()){
                    Alumne alum = it.next();
                    System.out.println("Aquest grup conté els següents alumnes.. També s'eliminarán.");
                    String op = Teclat.leerString("¿Estas d'acord? [S/N]");
                    if(op == "s" || op == "S")
                    {
                        g.eliminarAlumno(alum);
                        bd.eliminarGrup(g);
                    }
                }
            }
        }
    }
    
    public static void eliminarPersona(BaseDades bd)
    {   
        String nom_eliminar;
        int tipo = Teclat.leerInt("Quin tipus de persona vols afegir a la base de dades:\n 1. Professor\n 2.Alumne\n 3.Personal no docent\n");
        
        if(tipo == 1)
        {
            ObjectSet professors = bd.retornarProfessors();
            if(professors.isEmpty())
            {
                System.out.println("No hi ha professors...");
            }else{
                while(professors.hasNext())
                {
                    Professor profe = (Professor) professors.next();
                    System.out.println(profe.getNom()+" "+profe.getCognom());
                }
                nom_eliminar = Teclat.leerString("Quin professor vols eliminar de la base de dades?");
                try{
                    Professor profe_elininar = bd.recuperarProfesorNom(nom_eliminar);

                    if(bd.eliminarProfesor(profe_elininar.getNif())==true);
                    {
                        System.out.println("Profe eliminat");
                    }
                }catch(Exception e){
                    System.out.println("No s'ha pogut eliminar el professor. Nom incorrecte.");
                }
            }
        }else
        if(tipo == 2)
        {
            ObjectSet alumnes = bd.recuperarAlumnes();
            if(alumnes.isEmpty())
            {
                System.out.println("No hi ha alumnes...");
            }else{
                while(alumnes.hasNext())
                {
                    Alumne alum = (Alumne) alumnes.next();
                    System.out.println(alum.getNom()+" "+alum.getCognom());
                }
                    
                    nom_eliminar = Teclat.leerString("Quin alumne vols eliminar?");
                try{
                    
                    Alumne alum_eliminar = (Alumne) bd.retornarPersonaNom(nom_eliminar);

                    //Eliminem l'alumne del grup al que pertany...
                    String grup_nom = alum_eliminar.getNom_grup();
                    Grup g = bd.retornarGrup(grup_nom);
                    if(g != null)
                    {
                        g.eliminarAlumno(alum_eliminar);
                        
                    }else
                    {
                        System.out.println("Aquest grup no tenia alumnes\n");
                    }
                    
                    //Eliminem l'alumne del grup al que pertany...

                    bd.eliminarAlumne(alum_eliminar);
                    System.out.println("Alumne eliminat...");
                }catch(Exception e)
                {
                    System.out.println("Introdueix un nom correcte..");
                }
            }
        }else
        if(tipo == 3)
        {
            
        }else{
            System.out.println("Error.");
        }
    }
}
