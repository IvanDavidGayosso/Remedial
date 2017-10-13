/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Ivan David
 */
import controllers.*;
import models.*;
import views.*;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        
        ModelMVCMayor model_mvc_mayor = new ModelMVCMayor();
        ViewMVCMayor view_mvc_mayor = new ViewMVCMayor();
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        
        ModelOrdenaryPromedio model_OrdenaryPromedio = new ModelOrdenaryPromedio();
        ViewOrdenaryPromedio view_orden_promedio = new ViewOrdenaryPromedio();
        
        ModelEditorTexto model_editor = new ModelEditorTexto();
        ViewEditorTexto view_editor = new ViewEditorTexto();
        
         Object views[] = new Object[5];
         
         views[0] = view_principal;
         views[1] = view_mvc_mayor ;
         views[2] = view_operaciones;
         views[3] = view_orden_promedio;
         views[4] = view_editor;
         
       
        ControllerMVCMayor controller_mvc_mayor = new ControllerMVCMayor(model_mvc_mayor, views);
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones, views);
        ControllerOrdenaryPromedio controller_orde_promedio = new ControllerOrdenaryPromedio( model_OrdenaryPromedio, views);
        ControllerEditorTexto controller_editor = new ControllerEditorTexto(model_editor, views);
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal, views);
    }
    
}
