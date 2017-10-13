/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelMVCMayor;
import models.ModelOperaciones;
import views.ViewOperaciones;

public class ControllerOperaciones {

    private final ViewOperaciones view_operaciones;
    private final ModelOperaciones model_operaciones;

    public ControllerOperaciones(ModelOperaciones model_operaciones, Object[] views) {
        this.model_operaciones = model_operaciones;
        this.view_operaciones = (ViewOperaciones) views[2];

        this.view_operaciones.jtbn_suma.addActionListener(e -> operacionSumaClick());
        this.view_operaciones.jbtn_resta.addActionListener(e -> operacionRestaClick());
        this.view_operaciones.jtbn_division.addActionListener(e -> operacionDivisionClick());
        this.view_operaciones.jtbn_multiplicacion.addActionListener(e -> operacionMultiplicacionClick());
        initView();
    }

    private void operacionSumaClick() {
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.suma();
        view_operaciones.jtf_res.setText(String.valueOf(model_operaciones.getResultado()));
    }

    private void operacionRestaClick() {
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.resta();
        view_operaciones.jtf_res.setText(String.valueOf(model_operaciones.getResultado()));
    }

    private void operacionDivisionClick() {
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.division();
        view_operaciones.jtf_res.setText(String.valueOf(model_operaciones.getResultado()));
    }

    private void operacionMultiplicacionClick() {
        model_operaciones.setNumero1(Integer.parseInt(view_operaciones.jtf_num1.getText()));
        model_operaciones.setNumero2(Integer.parseInt(view_operaciones.jtf_num2.getText()));
        model_operaciones.multiplicacion();
        view_operaciones.jtf_res.setText(String.valueOf(model_operaciones.getResultado()));
    }

    private void initView() {

    }
}
