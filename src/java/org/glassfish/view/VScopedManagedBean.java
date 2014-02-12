/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.view;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.view.ViewScoped;

/**
 *
 * @author bhalepr
 */
@Named(value = "vScopedManagedBean")
@ViewScoped
public class VScopedManagedBean {

    int data = 0;

    /**
     * Creates a new instance of VscopedManagedBean
     */
    public VScopedManagedBean() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String addButtonPressed() {
        data++;
        return null;
    }
    
    public String subButtonPressed() {
        data--;
        return null;
    }
}
