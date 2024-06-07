/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silk;

/**
 *
 * @author YSRL
 */
public class TrInfoRuangan {
    private int id;
    private String member_id;
    private String nama_ruang;
    private int tersedia;
    private String username;
    private String waktu;
    
    public TrInfoRuangan (int id, String member_id, String nama_ruang, int tersedia, String username, String waktu){
        this.id = id;
        this.member_id = member_id;
        this.nama_ruang = nama_ruang;
        this.tersedia = tersedia;
        this.username = username;
        this.waktu = waktu;
    }
    
    public int getId(){
        return id;
    }
    
    public String getMember_id(){
        return member_id;
    }
    
    public String get_NamaRuang(){
        return nama_ruang;
    }
    
    public int getTersedia(){
        return tersedia;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getWaktu(){
        return waktu ;
    }
}

    