/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JOptionPane;
import views.ViewMVCMayor;
import models.ModelMVCMayor;

public class ControllerMVCMayor {

    ViewMVCMayor view_mvc_mayor;
    ModelMVCMayor model_mvc_mayor;

    public ControllerMVCMayor(ModelMVCMayor model_mvc_mayor, Object[] views) {
        this.view_mvc_mayor = (ViewMVCMayor) views[1];
        this.model_mvc_mayor = model_mvc_mayor;
        this.view_mvc_mayor.jtbn_calcular.addActionListener(e -> calcularMayorClick());
        initView();
    }

    public void initView() {

    }

    private void calcularMayorClick() {
        try {
            model_mvc_mayor.setNumero1(Integer.parseInt(view_mvc_mayor.jtf_numero1.getText()));
            model_mvc_mayor.setNumero2(Integer.parseInt(view_mvc_mayor.jtf_numero2.getText()));
            model_mvc_mayor.setNumero3(Integer.parseInt(view_mvc_mayor.jtf_numero3.getText()));
            model_mvc_mayor.CalcularMayor();
            JOptionPane.showMessageDialog(view_mvc_mayor, ("El numero mayor es: " + model_mvc_mayor.getNumero_mayor()), "Resultado", JOptionPane.PLAIN_MESSAGE);
            
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(view_mvc_mayor, "Numeros no validos", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}
