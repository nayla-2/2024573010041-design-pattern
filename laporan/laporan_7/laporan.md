# Laporan praktikum 7: Strategy Pattern
**Mata Kuliah:** [Parikum Desain Pattern]
**Nama:** [NAYLA RAMADHANI]  
**NIM:** [2024573010041]  
**Kelas:** [TI / 2A]

----

## 1. Abstrak
#### Strategy Pattern adalah sebuah pola desain (design pattern) dalam pemrograman yang memungkinkan definisi serangkaian algoritma terpisah, mengenkapsulasi setiap algoritma, dan membuatnya dapat saling bertukar secara dinamis sesuai kebutuhan. Pola ini memisahkan algoritma dari kelas yang menggunakannya, sehingga memungkinkan perubahan algoritma tanpa mengubah kelas klien yang memanfaatkannya.
Dalam Strategy Pattern, algoritma diimplementasikan sebagai objek terpisah yang disebut strategi (strategy). Kelas klien yang menggunakan algoritma memiliki referensi ke salah satu objek strategi tersebut, dan menggunakan strategi tersebut untuk mengeksekusi algoritma tertentu.

## 2. Praktikum_7 - Strategy Pattern
### bagian_1 - Program Navigasi Sederhana
#### Dasar Teori
Aplikasi navigasi bisa menggunakan berbagai strategi rute: jalan kaki, berkendara, atau transportasi umum.

#### Langkah Praktikum
1. Buat sebuah package baru di dalam modul_9 dan beri nama praktikum_1
2. Kemudian buat sebuah interface RouteStrategy dan isikan kode berikut:
3. Buat class WalkingRoute dan isikan kode berikut:
4. Buat class DrivingRoute dan isikan kode berikut:
5. Buat class PublicTransportRoute dan isikan kode berikut:
6. Buat class Navigator dan isikan kode berikut:
7. Buat class Main dan isikan kode berikut:
8. Jalankan dan lihat hasilnya

#### Analisa dan Pembahasan
navigasi sederhana. Terdapat beberapa strategi rute yang dapat digunakan, yaitu WalkingRoute, DrivingRoute, dan PublicTransportRoute. Ketiga strategi tersebut mengimplementasikan interface RouteStrategy yang memiliki method buildRoute().
Class Navigator berperan sebagai Context yang menggunakan salah satu strategi rute yang dipilih saat runtime. Dengan demikian, pengguna dapat mengganti jenis rute tanpa perlu mengubah kode pada class Navigator.
Penerapan Strategy Pattern pada kasus ini membuat program lebih fleksibel karena penambahan strategi baru, misalnya BicycleRoute, dapat dilakukan tanpa mengubah kode yang sudah ada. Selain itu, kode menjadi lebih mudah dipelihara karena setiap algoritma rute dipisahkan ke dalam class yang berbeda.

### bagian_2 - Program Filter Foto Sederhana
#### Dasar Teori
Aplikasi editing foto menyediakan berbagai filter: hitam-putih, sephia, dan cerah. Pengguna dapat memilih filter saat runtime.

#### Langkah Praktikum
1. Buat sebuah package baru di dalam modul_9 dan beri nama praktikum_2
2. Kemudian buat sebuah interface FilterStrategy dan isikan kode berikut:
3. Buat class BlackWhiteFilter dan isikan kode berikut:
4. Buat class SepiaFilter dan isikan kode berikut:
5. Buat class BrightFilter dan isi kan kode berikut:
6. Buat class PhotoEditor dan isikan kode berikut:
7. Buat class Main dan isikan kode berikut:
8. Jalankan dan lihat hasilnya.
9. 
#### Analisa dan Pembahasan
Strategy Pattern digunakan pada aplikasi editor foto. Setiap filter foto direpresentasikan sebagai strategi yang berbeda, yaitu BlackWhiteFilter, SepiaFilter, dan BrightFilter. Semua filter mengimplementasikan interface FilterStrategy.
Class PhotoEditor bertindak sebagai Context yang dapat menggunakan filter yang berbeda sesuai pilihan pengguna. Saat program dijalankan, pengguna dapat memilih filter yang diinginkan dan filter tersebut akan diterapkan pada foto yang diproses.
Keuntungan penggunaan Strategy Pattern pada aplikasi editor foto adalah kemudahan dalam menambahkan filter baru tanpa memodifikasi kode yang sudah ada. Selain itu, setiap filter memiliki tanggung jawab yang terpisah sehingga kode lebih terstruktur dan mudah dikembangkan.

### bagian_3 - Program Notifikasi
#### Dasar Teori
Sistem dapat mengirim notifikasi dengan berbagai cara tergantung situasi pengguna: email, SMS, atau push.

#### Langkah Praktikum
1. Buat sebuah package baru di dalam modul_9 dan beri nama praktikum_3
2. Kemudian buat sebuah interface NotificationStrategy dan isikan kode berikut:
3. Buat class EmailNotification dan isikan kode berikut:
4. Buat class SMSNotification dan isikan kode berikut:
5. Buat class PushNotificationdan isikan kode berikut:
6. Buat class NotificationService dan isikan kode berikut:
7. Buat class Main dan isikan kode berikut:
8. Jalankan dan lihat hasilnya.

#### Analisa dan Pembahasan
Pada sistem notifikasi, Strategy Pattern digunakan untuk menyediakan berbagai metode pengiriman pesan seperti EmailNotification, SMSNotification, dan PushNotification. Ketiga metode tersebut mengimplementasikan interface NotificationStrategy.
Class NotificationService berfungsi sebagai Context yang menggunakan salah satu strategi notifikasi sesuai kebutuhan pengguna. Program dapat mengganti metode pengiriman notifikasi secara dinamis tanpa perlu mengubah logika utama aplikasi.

#### Latihan - Program Pembayaran E-Commerce (Strategy Pattern)
#### Dasar Teori
Pada sistem e-commerce terdapat berbagai metode pembayaran seperti kartu kredit, e-wallet, dan transfer bank. Masing-masing metode pembayaran memiliki proses yang berbeda, namun semuanya memiliki tujuan yang sama yaitu melakukan pembayaran transaksi.
Strategy Pattern sangat cocok digunakan karena setiap metode pembayaran dapat direpresentasikan sebagai strategi yang berbeda. Dengan demikian, sistem checkout dapat memilih metode pembayaran yang sesuai tanpa perlu mengetahui detail implementasinya.

#### Langkah Praktikum
1. Buat interface PaymentStrategy dengan method pay(double amount).
2. Buat tiga class yang mengimplementasikan PaymentStrategy yaitu: CreditCardPayment, EWalletPayment, dan BankTransferPayment.
3. Buat class Checkout(Contex Class) yang menggunakan PaymentStrategy.
4. Di dalam main, tunjukkan contoh penggunaan masing-masing metode pembayaran.

#### Analisa dan Pembahasan
Strategy Pattern cocok digunakan dalam kasus pembayaran e-commerce karena setiap metode pembayaran memiliki algoritma yang berbeda. Dengan menggunakan interface PaymentStrategy, seluruh metode pembayaran memiliki kontrak yang sama sehingga dapat digunakan secara bergantian oleh class Checkout.
Class Checkout hanya berinteraksi dengan interface PaymentStrategy dan tidak bergantung pada implementasi tertentu. Hal ini membuat kode lebih fleksibel, mudah dipelihara, dan sesuai dengan prinsip Open-Closed Principle.

---

## 3. Kesimpulan
Strategy Pattern merupakan salah satu design pattern yang digunakan untuk memisahkan algoritma ke dalam class-class yang terpisah sehingga dapat dipilih dan diganti saat runtime. Pada praktikum ini, Strategy Pattern diterapkan pada sistem navigasi, editor foto, sistem notifikasi, dan pembayaran e-commerce.

---

## 5. Referensi
Refactoring Guru. Strategy Pattern. https://refactoring.guru/design-patterns/strategy
Oracle Java Documentation. https://docs.oracle.com/javase/tutorial/java/IandI/
Baeldung. Strategy Design Pattern in Java. https://www.baeldung.com/java-strategy-pattern
GeeksforGeeks. Strategy Design Pattern in Java. https://www.geeksforgeeks.org/strategy-design-pattern-in-java/
Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley.

---