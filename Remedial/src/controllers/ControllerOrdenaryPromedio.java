/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.DefaultListModel;

import views.ViewOrdenaryPromedio;
import models.ModelOrdenaryPromedio;

public class ControllerOrdenaryPromedio {

    ModelOrdenaryPromedio model_OrdenaryPromedio;
    ViewOrdenaryPromedio view_OrdenaryPromedio;
    DefaultListModel valores = new DefaultListModel();

    public ControllerOrdenaryPromedio(ModelOrdenaryPromedio model_OrdenaryPromedio, Object[] views) {
        this.model_OrdenaryPromedio = model_OrdenaryPromedio;
        this.view_OrdenaryPromedio = (ViewOrdenaryPromedio) views[3];
        this.view_OrdenaryPromedio.jb_agregar.addActionListener(e -> agregarClick());
        this.view_OrdenaryPromedio.jb_asc.addActionListener(e -> ascClick());
        this.view_OrdenaryPromedio.jb_promedio.addActionListener(e -> promedioClick());
        initView();

    }

    public void agregarClick() {
        model_OrdenaryPromedio.agregar(view_OrdenaryPromedio.jtfl_numero.getText());
        view_OrdenaryPromedio.jl_valores.setModel(model_OrdenaryPromedio.getValores());

    }

    public void promedioClick() {
        valores = (DefaultListModel) view_OrdenaryPromedio.jl_valores.getModel();
        model_OrdenaryPromedio.setValores(valores);
        model_OrdenaryPromedio.promedio();
        view_OrdenaryPromedio.jtfl_promedio.setText(String.valueOf(model_OrdenaryPromedio.getPromedio()));
    }

    public void ascClick() {
        valores = (DefaultListModel) view_OrdenaryPromedio.jl_valores.getModel();
        model_OrdenaryPromedio.setValores(valores);
        model_OrdenaryPromedio.ordenar();
        view_OrdenaryPromedio.jl_valores.setModel(model_OrdenaryPromedio.getValores());
    }

    public void initView() {

    }
}
