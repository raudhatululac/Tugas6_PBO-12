/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.raudhatululacamalia.latihanmvcjdbc.main;

import edu.raudhatululacamalia.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.raudhatululacamalia.latihanmvcjdbc.entity.Pelanggan;
import edu.raudhatululacamalia.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingUtilities;
import edu.raudhatululacamalia.latihanmvcjdbc.service.PelangganDao;
import edu.raudhatululacamalia.latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author 10116598-Raudhatul Ula Camalia-PBO12
 */
public class Latihanmvcjdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }
}
