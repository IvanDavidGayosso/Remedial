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

import models.*;
import views.*;

public class ControllerPrincipal {

    ModelPrincipal model_principal;
    ViewPrincipal view_principal;
    ViewMVCMayor view_mvc_mayor;
    ViewOperaciones view_operaciones;
    ViewOrdenaryPromedio view_OrdenaryPromedio;
    ViewEditorTexto view_editor;

    public ControllerPrincipal(ModelPrincipal model_principal, Object views[]) {
        this.model_principal = model_principal;
        this.view_principal = (ViewPrincipal) views[0];
        this.view_mvc_mayor = (ViewMVCMayor) views[1];
        this.view_operaciones = (ViewOperaciones) views[2];
        this.view_OrdenaryPromedio = (ViewOrdenaryPromedio) views[3];
        this.view_editor = (ViewEditorTexto) views[4];
        this.view_principal.jmi_numero_mayor.addActionListener(e -> jmi_numero_mayor());
        this.view_principal.jmi_operaciones.addActionListener(e -> jmi_operacion());
        this.view_principal.jmi_orden_promedio.addActionListener(e -> jmi_orden_promedio());
        this.view_principal.jmi_editor_texto.addActionListener(e -> jmi_editor_texto());
        initView();
    }

    private void initView() {
        this.view_principal.setTitle("Trabajo integrador");
        this.view_principal.setLocationRelativeTo(null);
        this.view_principal.setVisible(true);
    }

    private void jmi_numero_mayor() {
        view_principal.setContentPane(view_mvc_mayor);
        view_principal.revalidate();
        view_principal.repaint();
    }

    private void jmi_operacion() {
        view_principal.setContentPane(view_operaciones);
        view_principal.revalidate();
        view_principal.repaint();
    }

    private void jmi_orden_promedio() {
        view_principal.setContentPane(view_OrdenaryPromedio);
        view_principal.revalidate();
        view_principal.repaint();
    }

    private void jmi_editor_texto() {
        view_principal.setContentPane(view_editor);
        view_principal.revalidate();
        view_principal.repaint();
    }
}
