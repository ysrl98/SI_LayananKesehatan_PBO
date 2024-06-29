 package jadwaldokter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import CRUD.database;
import gui.mainframe;
public class JadwalDokter  {
//    private MsMember member;
//
//    public JadwalDokter(int id, int memberId, String namaDokter, String spesialisasi, String hari, String jam, String username, String waktu, MsMember member) {
//        super(id, memberId, namaDokter, spesialisasi, hari, jam, username, waktu);
//        this.member = member;
//    }
//
//    public MsMember getMember() {
//        return member;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() + "\n" + member.toString();
//    }

    public static void main(String[] args) {
        new mainframe().setVisible(true);
        
        
        
        
        
        
        // Sample data
//        MsMember member1 = new MsMember(1, " Dokter ", " ", "Jl. Kesehatan No. 1", "0274-123456", "www.rspku.com");
//        MsMember member2 = new MsMember(2, " Dokter ", "Apotek Sehat", "Jl. Sehat No. 2", "0275-654321", "www.apoteksehat.com");
//        MsMember member3 = new MsMember(3, " Dokter ", "RS PKU Muhammadiyah", "Jl. Kesehatan No. 1", "0276-123456", "www.rspku.com");
//        MsMember member4 = new MsMember(4, " Dokter ", "Apotek Sehat", "Jl. Sehat No. 2", "0277-654321", "www.apoteksehat.com");
//        MsMember member5 = new MsMember(5, " Dokter ", "RS PKU Muhammadiyah", "Jl. Kesehatan No. 1", "0278-123456", "www.rspku.com");
//	MsMember member6 = new MsMember(6, " Dokter ", "Apotek Sehat", "Jl. Sehat No. 2", "0279-654321", "www.apoteksehat.com");
//        MsMember member7 = new MsMember(7, " Dokter ", "RS PKU Muhammadiyah", "Jl. Kesehatan No. 1", "0270-123456", "www.rspku.com");
//        MsMember member8 = new MsMember(8, " Dokter ", "Apotek Sehat", "Jl. Sehat No. 2", "0271-654321", "www.apoteksehat.com");
//        MsMember member9 = new MsMember(9, " Mantri ", "RS PKU Muhammadiyah", "Jl. Kesehatan No. 1", "0272-123456", "www.rspku.com");
//	MsMember member10 = new MsMember(10, " Mantri ", "RS PKU Muhammadiyah", "Jl. Kesehatan No. 1", "0273-123456", "www.rspku.com");
//
//
//        List<JadwalDokter> jadwalList = new ArrayList<>();
//        jadwalList.add(new JadwalDokter(1, 1, "Dr. Ahmad", "Spesialis Jantung", "Senin", "07:00-12:00", "ahmad", "2024-05-20", member1));
//        jadwalList.add(new JadwalDokter(2, 2, "Dr. Budi", "Spesialis Anak", "Selasa", "07:00-12:00", "budi", "2024-05-21", member2));
//        jadwalList.add(new JadwalDokter(3, 3, "Dr. Ali", "Spesialis Jantung", "Rabu", "07:00-12:00", "ali", "2024-05-20", member3));
//        jadwalList.add(new JadwalDokter(4, 4, "Dr. Yusril", "Spesialis Anak", "Kamis", "07:00-12:00", "ysrl", "2024-05-21", member4));
//        jadwalList.add(new JadwalDokter(5, 5, "Dr. Diki", "Spesialis Jantung", "Jumat", "07:00-10:00", "dki", "2024-05-20", member5));
//        jadwalList.add(new JadwalDokter(6, 6, "Dr. Madi", "Spesialis Anak", "Senin", "13:00-17:00", "mdi", "2024-05-21", member6));
//        jadwalList.add(new JadwalDokter(7, 7, "Dr. Rahmad", "Spesialis Jantung", "Selasa", "13:00-17:00", "rhmt", "2024-05-20", member7));
//        jadwalList.add(new JadwalDokter(8, 8, "Dr. Rizki", "Spesialis Anak", "Rabu", "13:00-17:00", "rzk", "2024-05-21", member8));
//        jadwalList.add(new JadwalDokter(9, 9, "Dr. Ahok", "Spesialis Jantung", "Kamis", "13:00-17:00", "ahk", "2024-05-20", member9));
//        jadwalList.add(new JadwalDokter(10, 10, "Dr. Rina", "Spesialis Anak", "Jumat", "14:00-17:00", "rn", "2024-05-21", member10));
//
//        // User input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cek Jadwal Dokter\n1. Cari Waktu\n2. Cari ID Dokter");
//        System.out.print("Pilihan: ");
//        int pilihan = scanner.nextInt();
//        scanner.nextLine(); // consume newline
//
//        if (pilihan == 1) {
//            System.out.print("Input hari: ");
//            String hari = scanner.nextLine();
//            System.out.print("========================");
//            for (JadwalDokter jadwal : jadwalList) {
//                if (jadwal.getHari().equalsIgnoreCase(hari)) {
//                    System.out.println(jadwal);
//                }
//            }
//        } else if (pilihan == 2) {
//            System.out.print("Input ID Dokter: ");
//            int idDokter = scanner.nextInt();
//            System.out.print("========================");
//            for (JadwalDokter jadwal : jadwalList) {
//                if (jadwal.getId() == idDokter) {
//                    System.out.println(jadwal);
//                }
//            }
//        } else {
//            System.out.println("Pilihan tidak valid.");
//        }
////        scanner.close();
//          database dbConnect = new database();
          
//        dbConnect.simpanMember("2", "Apotek", "Zulfikar", "Pelaihari", "083111212221", "paranormal.com");
          //dbConnect.ubahMember("1", "Apoteker", "M. Yusril Maulana", "Kurau", "083150058587", "yusril.com");
//        dbConnect.hapusMember("1", "", "", "");
//        dbConnect.cariMember("2");
//         dbConnect.showMember();

//        dbConnect.simpanJadwal(2, "2", "Dr. Adul", "Dokter Mata", "Senin, Rabu, Kamis", "08:00 - 14:00", "adul", "WITA");
        //dbConnect.ubahJadwal("1", "Apoteker", "M. Yusril Maulana", "Kurau", "083150058587", "yusril.com");
//        dbConnect.hapusJadwal("1", "", "", "");
//          dbConnect.cariJadwal("2");
//          dbConnect.showJadwal();

//        dbConnect.simpanLogin("adul", "admin", "2");
//        dbConnect.ubahLogin("yusril1212", "admin", "1");
//        dbConnect.hapusLogin("yusril", "", "");
//          dbConnect.cariLogin("2");
//          dbConnect.showLogin();

//          dbConnect.simpanRuang(2, "2", "Ruang Mawar", 2, "adul", "07:00-17:00");
        //  dbConnect.ubahRuang(1, "1", "Ruang PMI", 5, "ysrl", "07:00-17:00");
//            dbConnect.hapusRuang(1, "", "", 0, "", "");
//          dbConnect.cariRuang("2");
//          dbConnect.showRuang();
    }
}
