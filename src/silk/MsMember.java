/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silk;

/**
 *
 * @author JONG
 */
public class MsMember {
    private String id;
    private String jenis;
    private String nama;
    private String alamat;
    private String telepon;
    private String website;

    public MsMember(String id, String jenis, String nama, String alamat, String telepon, String website) {
        this.id = id;
        this.jenis = jenis;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.website = website;
    }

    public String getId() {
        return id;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getWebsite() {
        return website;
    }

    
}
//
//public class MsMember {
//    
//    String id, jenis, nama, alamat, telepon, website;
//    public MsMember(){}
//    
//    public void inputId(string id){
//        this.idDesa = idDesa;
//    }
//    
//    public Integer getIdDesa(){
//        return this.idDesa;
//    }
//    
//    public void inputNamaDesa(String namaDesa){
//        this.namaDesa = namaDesa;
//    }
//    
//    public String getNamaDesa(){
//        return this.namaDesa;
//    }
//    
//    public void inputUsernameDs(String usernameDs){
//        this.usernameDs = usernameDs;
//    }
//    
//    public String getUsernameDs(){
//        return this.usernameDs;
//    }
//    
//    public void inputPasswordDs(String passwordDs){
//        this.passwordDs = passwordDs;
//    }
//    
//    public String getPasswordDs(){
//        return this.passwordDs;
//    }
//    
//    public void inputDateCreatedDs(String date_created){
//        this.date_created = date_created;
//    }
//    
//    public String getDateCreatedDs(){
//        return this.date_created;
//    }
//}