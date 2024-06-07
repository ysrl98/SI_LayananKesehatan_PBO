/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author YSRL
 */
public class database {
    private String databaseName = "yusril_2210010454";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    public database(){
        try {
           String location = "jdbc:mysql://localhost/"+databaseName;
           Class.forName("com.mysql.jdbc.Driver");
           
           connectionDB = DriverManager.getConnection(location, username, password);    
           System.out.println("Sistem Terkoneksi");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    } 
    
//    public void simpanUji(String nik, String nama, String telp, String alamat){
//        try{
//            String sql = "insert into uji (nik, nama, telp, alamat) value(?,?,?,?)";
//            PreparedStatement perintah = connectionDB.prepareStatement(sql);
//            perintah.setString(1, nik);
//            perintah.setString(2, nama);
//            perintah.setString(3, telp);
//            perintah.setString(4, alamat);
//            perintah.executeUpdate();
//            System.out.println("Data Berhasil Disimpan");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void ubahUji(String nik, String nama, String telp, String alamat){
//        try{
//            String sql = "update uji set nama = ?, telp = ?, alamat = ? where nik = ?";
//            PreparedStatement perintah = connectionDB.prepareStatement(sql);
//            perintah.setString(1, nama);
//            perintah.setString(2, telp);
//            perintah.setString(3, alamat);
//            perintah.setString(4, nik);
//            perintah.executeUpdate();
//            System.out.println("Data Berhasil Diubah");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//    
//    public void hapusUji(String nik, String nama, String telp, String alamat){
//        try{
//            String sql = "delete from uji where nik = ? ";
//            PreparedStatement perintah = connectionDB.prepareStatement(sql);
//            perintah.setString(1, nik);            
//            perintah.executeUpdate();
//            System.out.println("Data Berhasil Dihapus");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
       public void simpanMember(String id, String jenis, String nama, String alamat, String telepon, String website){
        try{
            String sql = "insert into ms_member (id, jenis, nama, alamat, telepon, website) value(?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, jenis);
            perintah.setString(3, nama);
            perintah.setString(4, alamat);
            perintah.setString(5, telepon);
            perintah.setString(6, website);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void ubahMember(String id, String jenis, String nama, String alamat, String telepon, String website){
        try{
            String sql = "update ms_member set jenis = ?, nama = ?, alamat = ?, telepone = ?, website = ? where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, jenis);
            perintah.setString(2, nama);
            perintah.setString(3, alamat);
            perintah.setString(4, telepon);
            perintah.setString(5, website);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void hapusMember(String id, String jenis, String nama, String alamat, String telepon, String website){
        try{
            String sql = "delete from ms_memmber where id = ? ";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);            
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    
   public void cariMember(String id){
        try{
            String sql = "select*from ms_member where id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Member    : "+data.getString("id"));
                System.out.println("Jenis Member : "+data.getString("jenis"));
                System.out.println("Nama         : "+data.getString("nama"));
                System.out.println("Alamat       : "+data.getString("alamat"));
                System.out.println("Telepon      : "+data.getString("telepon"));
                System.out.println("Website      : "+data.getString("website"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showMember(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from ms_member order by id  asc");
            while(baris.next()){
                System.out.println(baris.getString("id")+" | "+
                                   baris.getString("jenis")+" | "+
                                   baris.getString("nama")+" | "+
                                   baris.getString("alamat")+" | "+
                                   baris.getString("telepon")+" | "+
                                   baris.getString("website"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void simpanJadwal(int id, String member_id, String nama_dokter, String spesialisasi, String hari, String jam, String username, String waktu){
        try{
            String sql = "insert into tr_jadwal_dokter (id, member_id, nama_dokter, spesialisasi, hari, jam, username, waktu) value(?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            perintah.setString(2, member_id);
            perintah.setString(3, nama_dokter);
            perintah.setString(4, spesialisasi);
            perintah.setString(5, hari);
            perintah.setString(6, jam);
            perintah.setString(7, username);
            perintah.setString(8, waktu);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void ubahJadwal(int id, String member_id, String nama_dokter, String spesialisasi, String hari, String jam, String username, String waktu){
        try{
            String sql = "update tr_jadwal_dokter set member_id = ?, nama_dokter = ?, spesialisasi = ?, hari = ?, jam = ?, username = ?, waktu = ? where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, member_id);
            perintah.setString(2, nama_dokter);
            perintah.setString(3, spesialisasi);
            perintah.setString(4, hari);
            perintah.setString(5, jam);
            perintah.setString(6, username);
            perintah.setString(7, waktu);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void hapusJadwal(int id, String member_id, String nama_dokter, String spesialisasi, String hari, String jam, String username, String waktu){
        try{
            String sql = "delete from tr_jadwal_dokter where id = ? ";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);            
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public void cariJadwal(String id){
        try{
            String sql = "select*from tr_jadwal_dokter where id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Jadwal    : "+data.getString("id"));
                System.out.println("ID Member    : "+data.getString("member_id"));
                System.out.println("Nama Dokter  : "+data.getString("nama_dokter"));
                System.out.println("Spesialisasi : "+data.getString("spesialisasi"));
                System.out.println("Hari         : "+data.getString("hari"));
                System.out.println("Jam          : "+data.getString("jam"));
                System.out.println("Username     : "+data.getString("username"));
                System.out.println("Waktu        : "+data.getString("waktu"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showJadwal(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from tr_jadwal_dokter order by id  asc");
            while(baris.next()){
                System.out.println(baris.getString("id")+" | "+
                                   baris.getString("member_id")+" | "+
                                   baris.getString("nama_dokter")+" | "+
                                   baris.getString("spesialisasi")+" | "+
                                   baris.getString("hari")+" | "+
                                   baris.getString("jam")+" | "+
                                   baris.getString("username")+" | "+
                                   baris.getString("waktu"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void simpanLogin(String username, String password, String member_id) {
        try{
            String sql = "insert into ms_login (username, password, member_id) value(?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username);
            perintah.setString(2, password);
            perintah.setString(3, member_id);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void ubahLogin(String username, String password, String member_id) {
        try{
            String sql = "update ms_login set password = ?, member_id = ? where username = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, password);
            perintah.setString(2, member_id);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void hapusLogin(String username) {
        try{
            String sql = "delete from ms_login where username = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username);            
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void cariLogin(String username){
        try{
            String sql = "select*from ms_login where member_id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("Username    : "+data.getString("username"));
                System.out.println("Password    : "+data.getString("password"));
                System.out.println("ID Member   : "+data.getString("member_id"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showLogin(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from ms_login order by member_id asc");
            while(baris.next()){
                System.out.println(baris.getString("username")+" | "+
                                   baris.getString("password")+" | "+
                                   baris.getString("member_id"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void simpanRuang(int id, String member_id, String nama_ruang, int tersedia, String username, String waktu){
        try{
            String sql = "insert into tr_info_ruangan (id, member_id, nama_ruang, tersedia, username, waktu) value (?,?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);
            perintah.setString(2, member_id);
            perintah.setString(3, nama_ruang);
            perintah.setInt(4, tersedia);
            perintah.setString(5, username);
            perintah.setString(6, waktu);
            
            perintah.executeUpdate();
            System.err.println("Data Berhasil Disimpan");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahRuang(int id, String member_id, String nama_ruang, int tersedia, String username, String waktu){
        try{
            String sql = "update tr_info_ruangan set member_id = ?, nama_ruang = ?, tersedia = ?, username = ?, waktu = ? where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, member_id);
            perintah.setString(2, nama_ruang);
            perintah.setInt(3, tersedia);
            perintah.setString(4, username);
            perintah.setString(5, waktu);            
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }   
    public void hapusRuang(int id, String member_id, String nama_ruang, int tersedia, String username, String waktu){
        try{
            String sql = "delete from tr_info_ruangan where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id);            
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
        
    public void cariRuang(String id){
        try{
            String sql = "select*from tr_info_ruangan where id=?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            ResultSet data  = perintah.executeQuery();
            while(data.next()){
                System.out.println("ID Ruangan            : "+data.getString("id"));
                System.out.println("ID Member             : "+data.getString("member_id"));
                System.out.println("Nama Ruangan          : "+data.getString("nama_ruang"));
                System.out.println("Jmlh Ruangan Tersedia : "+data.getString("tersedia"));
                System.out.println("Username              : "+data.getString("username"));
                System.out.println("Waktu                 : "+data.getString("waktu"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void showRuang(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select*from tr_info_ruangan order by id  asc");
            while(baris.next()){
                System.out.println(baris.getString("id")+" | "+
                                   baris.getString("member_id")+" | "+
                                   baris.getString("nama_ruang")+" | "+
                                   baris.getString("tersedia")+" | "+
                                   baris.getString("username")+" | "+
                                   baris.getString("waktu"));
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
        
        
}
