/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.quanlykhoahoc.services;

import com.ntn.quanlykhoahoc.database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author ADMIN
 */
public class CertificateServices {
      public int submitSQL(int hocHocVienID, int khoaHocID) throws SQLException {
       Connection conn = Database.getConn();
        String sql = "INSERT INTO chungchi (hocVienID, khoaHocID, ngay_phat_hanh, ma_chung_chi) VALUES (?, ?, ?, ?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1, hocHocVienID); 
        stm.setInt(2, khoaHocID); 
        stm.setTimestamp(3,new Timestamp(System.currentTimeMillis()) ); 
        stm.setString(4,"CC_ABC" ); 
        int soDong = stm.executeUpdate();
        return soDong;

    }
}
