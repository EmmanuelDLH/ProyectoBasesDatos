/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Clases.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emmanuel
 */
public class Metodos {
    public ArrayList<Usuario> UsersList = new ArrayList<Usuario>();
    public DBConnect bdconGlobal;
    public Connection ConGlobal;

//Users methods
    //Add user to UserList
    public void AddNewUser(Usuario users) {
        UsersList.add(users);
    }

    public Usuario LoginUsers(String NickName, String PassWord) {
        for (Usuario users : UsersList) {

            if (users.getNickName().equals(NickName) && users.getPassWord().equals(PassWord)) {
                return users;
            }
        }
        return null;
    }

    public boolean validateNickNameUser(String nickName) {
        for (Usuario users : UsersList) {
            if (users.getNickName().equalsIgnoreCase(nickName)) {
                return true;
            }
        }
        return false;
    }
    
    public void EnlazarBaseDatos(){
        //Enlazar Base De Datos
        DBConnect bdcon = new DBConnect("databaseName = Base_de_Datos_Lezama", "prueba", "emmanuel");
        bdconGlobal = bdcon;
        bdconGlobal.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        bdconGlobal.setUrl("jdbc:sqlserver://localhost:1433;");
        Connection conexion = bdconGlobal.getConnection();
        ConGlobal = conexion;
    }
    
}
