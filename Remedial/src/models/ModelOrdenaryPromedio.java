/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.DefaultListModel;

/**
 *
 * @author Ivan David
 */
public class ModelOrdenaryPromedio {
    private DefaultListModel valores = new DefaultListModel();
    private double promedio=0;
    
    public DefaultListModel getValores() {
        return valores;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setValores(DefaultListModel valores) {
        this.valores = valores;
    }

    public void ordenar() {
        String aux;
       for (int i=0;i<valores.getSize();i++){
		for(int j=0;j<valores.getSize();j++){
			if (Double.parseDouble((String) valores.get(i)) <Double.parseDouble((String)valores.get(j))){
				aux=(String) valores.get(i);
				valores.set(i,valores.get(j));
				valores.set(j,aux);
			}
			
		}
	}
    
    }

    public void promedio() {
        for(int i=0;i<valores.getSize();i++)
            promedio+=Double.parseDouble((String) valores.get(i));
    
        promedio=promedio/valores.getSize();
       
    }

    public void agregar(String numero) {
        valores.addElement(numero);
       
    }
}
