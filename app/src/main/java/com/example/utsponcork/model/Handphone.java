package com.example.utsponcork.model;

public class Handphone {
    private Integer id;
    private String nama;
    private String harga;

    public Handphone() {
        super();
    }
    public Handphone(Integer id, String phone_name, String price){
        this.id = id;
        this.nama = phone_name;
        this.harga = price;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama(){ return nama; }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getHarga(){
        return harga;
    }
    public void setharga(String harga){ this.harga = harga; }
}
