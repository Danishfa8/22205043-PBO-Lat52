package pkg22205043.pbo.lat52;

/* Nama : Danish Fadlan Azam Nim : 22205043 
 * Prodi : Teknik Informatika
 * Semseter : 3/pagi
 */

class Manusia {

    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu() {
        System.out.println("Saya Manusia");
    }
}

class Mahasiswa extends Manusia {

    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya Danish Fadlan Azam umur 19 tahun sedang balajar dikelas PBO");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}

class Dosen extends Manusia {

    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");

    }
}

public class PBOLat52 {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        System.out.println("NIP DOSEN   : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        
        mhs.setNim("22205043");
        mhs.setNama("Danish Fadlann Azam");
        mhs.setUmur(19);
        mhs.setKelas("PBO");
        
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }

}
