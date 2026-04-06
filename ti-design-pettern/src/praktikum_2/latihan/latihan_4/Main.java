package praktikum_2.latihan.latihan_4;

    public class Main {
        public static void main(String[] args) {
            // Membuat object
            Mahasiswa mhs = new Mahasiswa();

            // Mengisi data menggunakan setter
            mhs.setNama("Nayla Ramadhani");
            mhs.setNim("2024573010041");

            // Menampilkan data menggunakan getter
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
        }
    }
