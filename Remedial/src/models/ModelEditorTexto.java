/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;

/**
 *
 * @author Ivan David
 */
public class ModelEditorTexto {

    private File archivo ;
    private String ruta;
    
    public String getRuta() {
        return ruta;
    }

  
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

}
