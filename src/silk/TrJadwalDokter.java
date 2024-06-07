/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package silk;

/**
 *
 * @author JONG
 */

public class TrJadwalDokter {
    private int id;
    private int member_id;
    private String nama_dokter;
    private String spesialisasi;
    private String hari;
    private String jam;
    private String username;
    private String waktu;

    public TrJadwalDokter(int id, int member_id, String nama_dokter, String spesialisasi, String hari, String jam, String username, String waktu) {
        this.id = id;
        this.member_id = member_id;
        this.nama_dokter = nama_dokter;
        this.spesialisasi = spesialisasi;
        this.hari = hari;
        this.jam = jam;
        this.username = username;
        this.waktu = waktu;
    }

    public int getId() {
        return id;
    }

    public int getMemberId() {
        return member_id;
    }

    public String getNamaDokter() {
        return nama_dokter;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }

    public String getUsername() {
        return username;
    }

    public String getWaktu() {
        return waktu;
    }

}
