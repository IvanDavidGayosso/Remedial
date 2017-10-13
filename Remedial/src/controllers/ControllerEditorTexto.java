/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Ivan David
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import views.ViewEditorTexto;
import models.ModelEditorTexto;

public class ControllerEditorTexto {

   
    FileReader fr = null;
    FileWriter fw = null;
    JFileChooser jfc = new JFileChooser();
    ViewEditorTexto view_editor;
    ModelEditorTexto model_editor;

    public ControllerEditorTexto(ModelEditorTexto model_editor, Object[] views) {
        this.model_editor = model_editor;
        this.view_editor = (ViewEditorTexto) views[4];
        initView();
        this.view_editor.jb_abrir.addActionListener(e -> jb_abrir());
        this.view_editor.jb_guardar.addActionListener(e -> jb_guardar());
        this.view_editor.jb_nuevo.addActionListener(e -> jb_nuevo());
    }

    private void jb_guardar() {
        try {

            fw = new FileWriter(model_editor.getArchivo(), false);
            fw.write(view_editor.jta_file.getText());
            fw.close();

        } catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado");
        } catch (IOException err) {
            System.err.println("Erroe en el archivo");
        } finally {
            try {
                fw.close();
            } catch (FileNotFoundException err) {
                System.err.println("Archivo no encontrado");
            } catch (IOException err) {
                System.err.println("Erroe en el archivo");
            }
        }

    }

    private void jb_abrir() {
        try {
            jfc.showOpenDialog(this.view_editor);
            model_editor.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editor.getArchivo());
            int character = 0;
            String texto = "";
            while ((character = fr.read()) != -1) {
                texto += (char) character;
            }
            fr.close();
            view_editor.jta_file.setText(texto);
        } catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado");
        } catch (IOException err) {
            System.err.println("Erroe en el archivo");
        } finally {
            try {
                fr.close();
            } catch (FileNotFoundException err) {
                System.err.println("Archivo no encontrado");
            } catch (IOException err) {
                System.err.println("Erroe en el archivo");
            }
        }

    }

    private void jb_nuevo() {
        
            view_editor.jta_file.setText("");
            
            try {
            if(jfc.showSaveDialog(this.view_editor)==jfc.APPROVE_OPTION){
                model_editor.setArchivo(jfc.getSelectedFile());
                model_editor.setRuta(jfc.getSelectedFile().getAbsolutePath());
                jb_guardar();
          
            }
        } catch (Exception e) {//por alguna excepcion salta un mensaje de error
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo!", "Oops! Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initView() {

    }

}
