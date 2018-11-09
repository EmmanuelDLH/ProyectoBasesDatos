/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasesdatos;

import Clases.*;
import Ventanas.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emmanuel
 */
public class ProyectoBasesDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario nuevo = new Usuario("Emmanuel", "Rompe20", "123456");
        InicioSesion.Methods.AddNewUser(nuevo);
        
        InicioSesion ventana = new InicioSesion();
        ventana.show();
        
    }
    
}
