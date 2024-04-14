/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Seccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class SeccionDAO {
        private static final String SQL_SELECT = "SELECT codigo_seccion, nombre_seccion, estatus_seccion FROM secciones";
    private static final String SQL_INSERT = "INSERT INTO secciones(nombre_seccion, estatus_seccion) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE secciones SET nombre_seccion=?, estatus_seccion=? WHERE id_empleado = ?";
    private static final String SQL_DELETE = "DELETE FROM secciones WHERE codigo_seccion=?";
    private static final String SQL_QUERY = "SELECT codigo_seccion, nombre_seccion, estatus_seccion FROM secciones WHERE codigo_seccion = ?";

        public List<Seccion> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Seccion seccion = null;
        List<Seccion> secciones = new ArrayList<Seccion>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo_seccion");
                String nombre = rs.getString("nombre_seccion");
                String estatus = rs.getString("estatus_seccion");
                
                seccion = new Seccion();
                seccion.setCodigo_seccion(codigo);
                seccion.setNombre_seccion(nombre);
                seccion.setEstatus_seccion(estatus);
                
                secciones.add(seccion);            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return secciones;
    }
}
