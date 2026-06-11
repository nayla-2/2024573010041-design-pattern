# Laporan praktikum 6: SOLID Principle : Liskov Subtitution Principle (LSP)
**Mata Kuliah:** [Parikum Desain Pattern]
**Nama:** [NAYLA RAMADHANI]  
**NIM:** [2024573010041]  
**Kelas:** [TI / 2A]

----

## 1. Abstrak
#### Liskov Substitution Principle (LSP) adh salah satu prinsip dalam SOLID yang menyatakan bahwa objek dari subclass harus dapat menggantikan objek dari superclass tanpa mengubah perilaku program. Praktikum dilakukan melalui beberapa studi kasus, yaitu sistem notifikasi, sistem posting media sosial, dan sistem pembayaran e-commerce. Pada setiap studi kasus dilakukan perbandingan antara implementasi yang melanggar LSP dan implementasi yang menerapkan LSP dengan benar. Hasil praktikum menunjukkan bahwa penerapan LSP menghasilkan kode yang lebih fleksibel, mudah dipelihara, dan mudah dikembangkan. Selain itu, penerapan LSP mendukung penggunaan kembali kode (reusability) serta mengurangi ketergantungan antar kelas dalam sistem berorientasi objek. Oleh karena itu, LSP menjadi salah satu prinsip penting dalam perancangan perangkat lunak yang berkualitas.
## 2. Praktikum_6 - Rectangle-Square Problem
### bagian_1 - tanpa_lsp
#### Dasar Teori
Liskov Substitution Principle (LSP) merupakan prinsip ketiga dalam SOLID yang dikemukakan oleh Barbara Liskov. Prinsip ini menyatakan bahwa objek dari kelas turunan harus dapat menggantikan objek dari kelas induk tanpa menyebabkan perubahan perilaku yang tidak diharapkan pada program.
Pada implementasi tanpa LSP, subclass sering kali mengubah atau membatasi perilaku yang telah ditetapkan oleh superclass sehingga menyebabkan ketidaksesuaian saat objek subclass digunakan sebagai pengganti superclass.

#### Langkah Praktikum

#### Analisa dan Pembahasan
subclass yang tidak dapat menggantikan superclass secara sempurna. Hal ini menyebabkan terjadinya pelanggaran terhadap prinsip LSP.
Dampak dari pelanggaran tersebut antara lain:
* Program menjadi kurang fleksibel.
* Sulit melakukan pengembangan fitur baru.
* Potensi munculnya bug lebih besar.
* Kode menjadi lebih sulit dipelihara.
Dengan demikian, desain yang tidak menerapkan LSP dapat menurunkan kualitas perangkat lunak karena hubungan antara superclass dan subclass tidak berjalan sebagaimana mestinya.
### bagian_2 - dengan_lsp
#### Dasar Teori
Implementasi LSP bertujuan agar setiap subclass dapat digunakan sebagai pengganti superclass tanpa mengubah perilaku program. Untuk mencapai hal tersebut, seluruh subclass harus mengikuti kontrak dan perilaku yang telah ditentukan oleh superclass atau interface.
Penerapan LSP membantu menciptakan kode yang lebih modular, mudah diperluas, dan mudah dipelihara.

#### Langkah Praktikum

#### Analisa dan Pembahasan
seluruh subclass memiliki perilaku yang konsisten dengan superclass. Program dapat menggunakan objek turunan tanpa perlu mengetahui implementasi spesifik yang digunakan.
Keuntungan penerapan LSP antara lain:
* Memudahkan pengembangan sistem.
* Mengurangi ketergantungan antar kelas.
* Mendukung prinsip Open-Closed Principle.
* Meningkatkan fleksibilitas dan reusability kode.
Hasil pengujian menunjukkan bahwa seluruh subclass dapat digunakan sebagai pengganti superclass tanpa mengubah logika program utama.

## 3. Praktikum_6 - Sistem Posting Media Sosial
### bagian_1 - tanpa_lsp
#### Dasar Teori
sistem posting media sosial, setiap jenis posting seharusnya memiliki perilaku yang konsisten. Namun, apabila terdapat subclass yang membatasi atau mengubah fungsi dasar superclass, maka terjadi pelanggaran terhadap LSP.
jika superclass menyediakan fungsi publish(), tetapi subclass mengubah perilakunya sehingga tidak dapat digunakan sebagaimana mestinya, maka subclass tersebut tidak dapat menggantikan superclass secara sempurna.

#### Langkah Praktikum

#### Analisa dan Pembahasan
beberapa subclass memiliki batasan yang tidak dimiliki superclass. Akibatnya, program tidak dapat memperlakukan seluruh subclass secara seragam.
Hal ini menyebabkan:
* Pelanggaran prinsip LSP.
* Sulit melakukan ekspansi sistem.
* Kode menjadi kurang fleksibel.
* Potensi error meningkat.
Karna itu, desain seperti ini tidak direkomendasikan dalam pengembangan perangkat lunak berorientasi objek.

### bagian_2 - dengan_lsp
#### Dasar Teori
Penerapan LSP pada sistem posting media sosial dilakukan dengan memastikan bahwa seluruh jenis posting mengikuti kontrak yang sama. Dengan demikian, setiap objek posting dapat digunakan melalui interface atau superclass yang sama tanpa menimbulkan masalah.
#### Langkah Praktikum

#### Analisa dan Pembahasan
Implementasi dengan LSP menghasilkan sistem yang lebih baik karena setiap jenis posting memiliki perilaku yang konsisten.
Keuntungan yang diperoleh:
* Program lebih mudah dikembangkan.
* Penambahan platform media sosial baru lebih mudah dilakukan.
* Kode lebih terstruktur.
* Pemeliharaan sistem menjadi lebih sederhana.
Dengan demikian, penerapan LSP membantu meningkatkan kualitas desain sistem media sosial.

#### Latihan - Program Pembayaran E-Commerce (Strategy Pattern)
#### Dasar Teori
Studi kasus sistem pembayaran e-commerce yang mendukung beberapa metode pembayaran seperti Kartu Kredit, E-Wallet, dan Transfer Bank.
Setiap metode pembayaran memiliki proses yang berbeda, namun seluruhnya mengikuti kontrak yang sama melalui interface PaymentStrategy. Pendekatan ini memungkinkan penerapan prinsip LSP dan Strategy Pattern secara bersamaan.
#### Langkah Praktikum

#### Analisa dan Pembahasan
Sistem pembayaran e-commerce, setiap metode pembayaran mengimplementasikan interface yang sama sehingga dapat digunakan secara bergantian oleh class Checkout.
* Keuntungan pendekatan ini adalah:
* Checkout tidak bergantung pada metode pembayaran tertentu.
* Mudah menambahkan metode pembayaran baru.
* Mendukung prinsip LSP dan Open-Closed Principle.
* Sistem menjadi lebih fleksibel dan mudah dipelihara.
* 
---

## 3. Kesimpulan
Liskov Substitution Principle (LSP) merupakan salah satu prinsip penting dalam SOLID yang memastikan bahwa subclass dapat digunakan sebagai pengganti superclass tanpa mengubah perilaku program. Melalui praktikum ini dapat dipahami bahwa pelanggaran LSP menyebabkan sistem menjadi kurang fleksibel dan sulit dipelihara. Sebaliknya, penerapan LSP menghasilkan desain perangkat lunak yang lebih baik, lebih mudah dikembangkan, serta mendukung prinsip-prinsip desain berorientasi objek lainnya seperti Open-Closed Principle dan Strategy Pattern.

---

## 5. Referensi
1. Baeldung. (2024). The Liskov Substitution Principle. Diakses dari https://www.baeldung.com/cs/liskov-substitution-principle
2. Baeldung. (2026). Liskov Substitution Principle in Java. Diakses dari https://www.baeldung.com/java-liskov-substitution-principle
3. Refactoring Guru. (n.d.). Strategy Pattern. Diakses dari https://refactoring.guru/design-patterns/strategy
4. SE-EDU. (2025). Liskov Substitution Principle. Diakses dari https://se-education.org/se-book/principles/liskovSubstitutionPrinciple/
5. System Overflow. (n.d.). What is the Liskov Substitution Principle?. Diakses dari https://www.systemoverflow.com/learn/solid-principles/liskov-substitution-principle/what-is-the-liskov-substitution-principle
6. Wikipedia. (n.d.). Liskov Substitution Principle. Diakses dari https://en.wikipedia.org/wiki/Liskov_substitution_principle

---