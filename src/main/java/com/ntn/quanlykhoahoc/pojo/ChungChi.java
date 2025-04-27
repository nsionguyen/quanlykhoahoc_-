/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.quanlykhoahoc.pojo;

import java.sql.Timestamp;

/**
 *
 * @author ADMIN
 */
public class ChungChi {
    
    private int hocVienID;
    private int khoaHocID;
    private Timestamp ngay_phat_hanh;
    private String ma_chung_chi;

    public ChungChi(int hocVienID, int khoaHocID, Timestamp ngay_phat_hanh, String ma_chung_chi) {
        this.hocVienID = hocVienID;
        this.khoaHocID = khoaHocID;
        this.ngay_phat_hanh = ngay_phat_hanh;
        this.ma_chung_chi = ma_chung_chi;
    }

    /**
     * @return the hocVienID
     */
    public int getHocVienID() {
        return hocVienID;
    }

    /**
     * @param hocVienID the hocVienID to set
     */
    public void setHocVienID(int hocVienID) {
        this.hocVienID = hocVienID;
    }

    /**
     * @return the khoaHocID
     */
    public int getKhoaHocID() {
        return khoaHocID;
    }

    /**
     * @param khoaHocID the khoaHocID to set
     */
    public void setKhoaHocID(int khoaHocID) {
        this.khoaHocID = khoaHocID;
    }

    /**
     * @return the ngay_phat_hanh
     */
    public Timestamp getNgay_phat_hanh() {
        return ngay_phat_hanh;
    }

    /**
     * @param ngay_phat_hanh the ngay_phat_hanh to set
     */
    public void setNgay_phat_hanh(Timestamp ngay_phat_hanh) {
        this.ngay_phat_hanh = ngay_phat_hanh;
    }

    /**
     * @return the ma_chung_chi
     */
    public String getMa_chung_chi() {
        return ma_chung_chi;
    }

    /**
     * @param ma_chung_chi the ma_chung_chi to set
     */
    public void setMa_chung_chi(String ma_chung_chi) {
        this.ma_chung_chi = ma_chung_chi;
    }
    
}
