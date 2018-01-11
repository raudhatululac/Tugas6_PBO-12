/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.raudhatululacamalia.latihanmvcjdbc.event;

import edu.raudhatululacamalia.latihanmvcjdbc.entity.Pelanggan;
import edu.raudhatululacamalia.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 10116598-Raudhatul Ula Camalia-PBO12
 */
public interface PelangganListener {

    //diambil dari model
    public void onChange(PelangganModel model);

    //diambil dari entity
    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();
}
