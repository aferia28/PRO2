package exercicipatrimoni;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Conté la classe FinestraGrafica on es troba la finestra i components visuals.
 * @author 
 */
public class FinestraPrincipal extends javax.swing.JFrame
{
	//Atributs=================================================================
	/** Base de Dades. */
	private BaseDades bd;
    /** ArrayList amb les comunitats. */
    private ArrayList<Comunitat> comunitats;
    /** ArrayList amb els tipus de monument. */
    private ArrayList<TipusMonument> tipusMonuments;
    /** ArrayList amb els monuments. */
    private ArrayList<Monument> monuments;
	//=========================================================================
    /**
	 * Constructor parametritzat de la classe FinestraGrafica.
	 * @param bd Base de dades d' on es treuen les dades dels usuaris.
	 */
	public FinestraPrincipal(BaseDades bd)
	{
		this.bd = bd;
		
		// Donem un títol al quadre de diàleg.
		setTitle("Patrimoni");
		
		// Situem el quadre de diàleg en la pantalla.
		setLocation(200, 200);
		
		// Impedim que l'usuari pugui canviar el tamany del quadre de diàleg.
		setResizable(false);
		
		// Iniciem els components del diàleg.
		initComponents();
	}
	//=========================================================================
    /** Mètode iniciar. Aquest mètode es crida des de el mètode main.*/
    public void iniciar() throws SQLException
    {
        // Omplir de dades els components.
        omplirComboComunitat();
        omplirComboTipus();
        
        // Fa visible la finestra.
		setVisible(true);
    }
	//=========================================================================
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEleccioPatrimoni = new javax.swing.JPanel();
        labelComunitat = new javax.swing.JLabel();
        labelTipus = new javax.swing.JLabel();
        labelPatrimoni = new javax.swing.JLabel();
        comboComunitat = new javax.swing.JComboBox();
        comboTipus = new javax.swing.JComboBox();
        comboPatrimoni = new javax.swing.JComboBox();
        panelButtons = new javax.swing.JPanel();
        buttonAfegirMonument = new javax.swing.JButton();
        buttonEliminarMonument = new javax.swing.JButton();
        labelNomMonument = new javax.swing.JLabel();
        panelFoto = new javax.swing.JPanel();
        labelImatge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEleccioPatrimoni.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Elecció del Patrimoni"));

        labelComunitat.setText("Comunitat autònoma:");

        labelTipus.setText("Tipus de patrimoni:");

        labelPatrimoni.setText("Patrimoni escollit:");

        comboComunitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboComunitatActionPerformed(evt);
            }
        });

        comboTipus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboTipus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipusActionPerformed(evt);
            }
        });

        comboPatrimoni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboPatrimoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPatrimoniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEleccioPatrimoniLayout = new javax.swing.GroupLayout(panelEleccioPatrimoni);
        panelEleccioPatrimoni.setLayout(panelEleccioPatrimoniLayout);
        panelEleccioPatrimoniLayout.setHorizontalGroup(
            panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccioPatrimoniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPatrimoni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEleccioPatrimoniLayout.createSequentialGroup()
                        .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPatrimoni)
                            .addGroup(panelEleccioPatrimoniLayout.createSequentialGroup()
                                .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelComunitat)
                                    .addComponent(comboComunitat, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTipus)
                                    .addComponent(comboTipus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEleccioPatrimoniLayout.setVerticalGroup(
            panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEleccioPatrimoniLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComunitat)
                    .addComponent(labelTipus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEleccioPatrimoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboComunitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(labelPatrimoni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPatrimoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        buttonAfegirMonument.setText("Afegir nou patrimoni");
        buttonAfegirMonument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAfegirMonumentActionPerformed(evt);
            }
        });

        buttonEliminarMonument.setText("Eliminar monument");
        buttonEliminarMonument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarMonumentActionPerformed(evt);
            }
        });

        labelNomMonument.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(buttonAfegirMonument)
                        .addGap(59, 59, 59)
                        .addComponent(buttonEliminarMonument))
                    .addGroup(panelButtonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNomMonument)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAfegirMonument, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminarMonument, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(labelNomMonument))
        );

        panelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelImatge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(labelImatge)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFotoLayout.createSequentialGroup()
                .addComponent(labelImatge)
                .addGap(0, 308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEleccioPatrimoni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelButtons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(panelEleccioPatrimoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //=========================================================================
    /**
     * Mètode que elimina el monument que estigui seleccionat actualment.
     * @param evt 
     */
    private void buttonEliminarMonumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarMonumentActionPerformed
        try
        {
            if(comboPatrimoni.getSelectedIndex() > 0)
            {
                String nomMonument = 
                                    comboPatrimoni.getSelectedItem().toString();

                ArrayList<Monument> monuments = bd.recuperarMonuments();
                
                boolean trobat = false;
                int num = monuments.size();
                int i = 0;
                while(i < num && !trobat)
                {
                    if(monuments.get(i).getNom().equals(nomMonument))
                    {                       
                        int seleccion = JOptionPane.showOptionDialog
                        (
                            this,
                            "Estàs segur/a que vols eliminar el monument "
                            + "actual?", 
                            "Eliminació",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[] { "Si", "No", },
                            "No"
                        );

                        if (seleccion == 0)
                        {
                            // Eliminar el monument de la BD.
                            bd.eliminarMonument(monuments.get(i));
                            JOptionPane.showMessageDialog(null, 
										  "Monument Eliminat.",
										  "Informació",
										  JOptionPane.INFORMATION_MESSAGE);
                            
                            //Recargar la pagina.
                            dispose();
                            FinestraPrincipal fp = new FinestraPrincipal(bd);
                            fp.iniciar();
                        } 
                        else if(seleccion == 1)
                        {
                            JOptionPane.showMessageDialog(null, 
										  "El monument no s'ha eliminat.",
										  "Informació",
										  JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    i++;
                }
            }
            else
            {
                throw new Exception("Per eliminar un monument, primer cal "
                                    + "escollir-lo.");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, 
										  e.toString(),
										  "Error!",
										  JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, 
                                            e.toString(),
                                            "Informació",
                                            JOptionPane.INFORMATION_MESSAGE);
        }
 

    }//GEN-LAST:event_buttonEliminarMonumentActionPerformed
    //=========================================================================
    /**
     * Mètode que obre uan nova finestra per poder afegir un nou monument a la 
     * BD.
     * @param evt 
     */
    private void buttonAfegirMonumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAfegirMonumentActionPerformed
        try
        {
            AfegirMonument afegir = new AfegirMonument(this, true, bd);
            afegir.iniciar();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, 
                                            e.toString(),
                                            "Error!",
                                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAfegirMonumentActionPerformed
    //=========================================================================
    /**
     * Mètode que comproba si s'ha seleccionat qualsevol opció que no sigui
     * en blanc i si l'altre comboBox comboTipus tambe te seleccionada un altra 
     * que tampoc sigui en blanc, llavors omplirà el comboPatrimoni amb els
     * filtres adequats.
     * @param evt 
     */
    private void comboComunitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboComunitatActionPerformed
        try
        {
            // Borrar pantalla.
            labelImatge.setIcon(new ImageIcon());
            // Visualitzar el nom i l' any.
            labelNomMonument.setText("");
            comprovarFiltres();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,
                ex.toString(),
                "Error!",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_comboComunitatActionPerformed
    //=========================================================================
    /**
     * Mètode que comproba si s'ha seleccionat qualsevol opció que no sigui
     * en blanc i si l'altre comboBox comboComunitat tambe te seleccionada un 
     * altra que tampoc sigui en blanc, llavors omplirà el comboPatrimoni amb 
     * els filtres adequats.
     * @param evt 
     */
    private void comboTipusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipusActionPerformed
        try
        {
            // Borrar pantalla.
            labelImatge.setIcon(new ImageIcon());
            // Visualitzar el nom i l' any.
            labelNomMonument.setText("");
            comprovarFiltres();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,
                ex.toString(),
                "Error!",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_comboTipusActionPerformed
    //=========================================================================
    /**
     * Mètode que comproba si s'ha seleccionat qualsevol opcio diferent de 
     * l'opció en blanc per visualitzar l'imatge del monument (si en té) i
     * mostrar el seu nom i any d'alta.
     * @param evt 
     */
    private void comboPatrimoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPatrimoniActionPerformed
        if(comboPatrimoni.getSelectedIndex() > 0)
        {          
            boolean trobat = false;
            int num = monuments.size();
            String nomMonument =  comboPatrimoni.getSelectedItem().toString();
            
            //Visualitzar la foto del monument=================================
            int i = 0;
            while(!trobat && i < num)
            {
                if(monuments.get(i).getNom().equals(nomMonument))
                {
                    trobat = true;
                    String nomImatge = monuments.get(i).getNomFoto();
                    int anyAlta = monuments.get(i).getAnyAlta();
                    //String hola = System.getProperty(“user.dir”).toString();
                    String rutaProjecte = System.getProperty("user.dir");
                    ImageIcon icon = new ImageIcon (rutaProjecte + "\\fotos\\" 
                                                    + nomImatge);  
                    labelImatge.setIcon(icon);
                    //Visualitzar el nom i l' any
                    labelNomMonument.setText(nomMonument + " (" + anyAlta 
                                             + ")");
                    
                }
                i++;
            }  
            //=================================================================
        }
        else
        {
            // Borrar pantalla.
            labelImatge.setIcon(new ImageIcon());
            // Visualitzar el nom i l' any.
            labelNomMonument.setText("");
        }
    }//GEN-LAST:event_comboPatrimoniActionPerformed
   //=========================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAfegirMonument;
    private javax.swing.JButton buttonEliminarMonument;
    private javax.swing.JComboBox comboComunitat;
    private javax.swing.JComboBox comboPatrimoni;
    private javax.swing.JComboBox comboTipus;
    private javax.swing.JLabel labelComunitat;
    private javax.swing.JLabel labelImatge;
    private javax.swing.JLabel labelNomMonument;
    private javax.swing.JLabel labelPatrimoni;
    private javax.swing.JLabel labelTipus;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelEleccioPatrimoni;
    private javax.swing.JPanel panelFoto;
    // End of variables declaration//GEN-END:variables
	//=========================================================================
    /**
     * Mètode que omple el comboComunitat amb totes les comunitats de la taula
     * comunitats de la BD.
     */
	private void omplirComboComunitat() throws SQLException
	{
		// Recuperem el model existent.
		DefaultComboBoxModel modelComunitat = 
                               (DefaultComboBoxModel) comboComunitat.getModel();

		// Buidem les dades existents.
		modelComunitat.removeAllElements();

		// Introduïm un primer element buit.
		modelComunitat.addElement("");
		modelComunitat.addElement("Totes");
        
		// Afegim els nous elements.
        comunitats = bd.recuperarComunitats();
        ListIterator<Comunitat> iterador = comunitats.listIterator();
        
        while(iterador.hasNext())
        {
            modelComunitat.addElement(iterador.next().getNom());
        }
        
	}
    //=========================================================================
    /**
     * Mètode que omple el comboTipus amb tots els tipus de monument de la taula
     * tipus de la BD.
     */
	private void omplirComboTipus() throws SQLException
	{
		// Recuperem el model existent.
		DefaultComboBoxModel modelTipus = 
                                   (DefaultComboBoxModel) comboTipus.getModel();
		
		// Buidem les dades existents.
		modelTipus.removeAllElements();

		// Introduïm un primer element buit.
		modelTipus.addElement("");
        modelTipus.addElement("Tots");
		
		// Afegim els nous elements.
        tipusMonuments = bd.recuperarTipus();
        ListIterator<TipusMonument> iterador = tipusMonuments.listIterator();
        
        while(iterador.hasNext())
        {
            modelTipus.addElement(iterador.next().getNom());
        }		
	}
    //=========================================================================
    /**
     * Mètode que omple el comboPatrimoni amb tots els monuments de la taula
     * monuments de la BD filtrats per comunitat i tipus escollits en els
     * comboBox comboComunitat i comboTipus.
     */
	private void omplirComboPatrimoni() throws SQLException
	{
		boolean trobat = false;
        
        // Recuperem el model existent.
		DefaultComboBoxModel model = 
                               (DefaultComboBoxModel) comboPatrimoni.getModel();
		
		// Buidem les dades existents.
		model.removeAllElements();

		// Introduïm un primer element buit.
		model.addElement("");
		
		// Recuperar el index de la comunitat seleccionada.
        int indexComunitat = comboComunitat.getSelectedIndex();
        
        // Recuperar el index del tipus seleccionat.
        int indexTipus = comboTipus.getSelectedIndex();
        
        // Afegim els nous elements filtrats.
        monuments = bd.recuperarMonuments();
        int num = monuments.size();
        if(indexComunitat > 1 && indexTipus > 1)
        {            
            TipusMonument tipusMonument = tipusMonuments.get(indexTipus - 2);
            Comunitat comunitat = comunitats.get(indexComunitat - 2);
            
            for(int i = 0; i < num; i++)
            {
                if(monuments.get(i).getComunitat().getId() == comunitat.getId()
                   && monuments.get(i).getTipus().getId() == 
                                                          tipusMonument.getId())
                {
                    model.addElement(monuments.get(i).getNom());
                }
            }        
        }	
        else if(indexComunitat == 1 && indexTipus > 1)
        {
            TipusMonument tipusMonument = tipusMonuments.get(indexTipus - 2);
            
            for(int i = 0; i < num; i++)
            {
                if(monuments.get(i).getTipus().getId() == tipusMonument.getId())
                {
                    model.addElement(monuments.get(i).getNom());
                }
            } 
        }
        else if(indexComunitat > 1 && indexTipus == 1)
        {
            Comunitat comunitat = comunitats.get(indexComunitat - 2);
            
            for(int i = 0; i < num; i++)
            {
                if(monuments.get(i).getComunitat().getId() == comunitat.getId())
                {
                    model.addElement(monuments.get(i).getNom());
                }
            } 
        }
        else if(indexComunitat == 1 && indexTipus == 1)
        {
            for(int i = 0; i < num; i++)
            {
                model.addElement(monuments.get(i).getNom());
            } 
        }
	}
    //=========================================================================
    /**
     * Mètode que comproba si els dos comboBox tenen seleccionada una opció.
     * @throws SQLException 
     */
    public void comprovarFiltres() throws SQLException
    {
        if(comboComunitat.getSelectedItem() != null 
           && comboTipus.getSelectedItem() != null)
        {
            omplirComboPatrimoni();
        }
    }
    //=========================================================================
}
