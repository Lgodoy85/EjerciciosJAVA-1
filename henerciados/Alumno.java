/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henerciados;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    private Date _fechaInsc;
    private int _legajo;
    
    public void MostrarLosDatos()
    {
        super.MostrarLosDatos();
        System.out.println("Fecha de Inscripcion: "+this._fechaInsc);
        System.out.println("Legajo: "+this._legajo);
    }
}
