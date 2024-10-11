# POSTEST-PBO-2


1.Tampilan awal program

![image](https://github.com/user-attachments/assets/c537bd1d-6885-41af-873f-1556f927e80d)



2.Menu Tambah Tiket


![image](https://github.com/user-attachments/assets/2d84e38c-bba6-4ee6-b825-03fa9f8e8ef9)



3.Menu Lihat Tiket

![image](https://github.com/user-attachments/assets/92159f2c-2b02-4f37-ad08-9754c26b8baf)



4.Menu Update Tiket

![image](https://github.com/user-attachments/assets/04a5a7e2-1c39-4df4-bcdf-eb65baba4f36)



5.Menu Hapus Tiket

![image](https://github.com/user-attachments/assets/8e032c0e-cf05-4113-a4e1-2cf8525d7e28)




6.Menu Keluar

![image](https://github.com/user-attachments/assets/a37141e6-b941-4510-b25e-8d6482a97089)


**Penjelasan penerapan Inheritance,Encapsulation,Abstraction,Interface dan Final Keyword**

1. Inheritance 
Fungsi: Inheritance memungkinkan kelas baru untuk mewarisi atribut dan metode dari kelas yang sudah ada. Ini membantu dalam mengurangi duplikasi kode dan memfasilitasi penggunaan kembali kode (code reuse). Dalam konteks program, TiketVIP dan TiketReguler mewarisi dari TiketAbstract, sehingga mereka dapat menggunakan dan memodifikasi perilaku umum yang didefinisikan di kelas induk.

2. Encapsulation (Getter dan Setter)
Fungsi: Encapsulation membatasi akses langsung ke atribut dari kelas lain dan melindungi data dalam objek. Dengan menggunakan getter dan setter, Anda dapat mengontrol bagaimana atribut kelas diakses dan dimodifikasi. Ini meningkatkan keamanan data dan mengurangi risiko kesalahan. Dalam program, atribut harga dapat diatur melalui setter, sementara akses ke atribut lainnya menggunakan getter.

3. Abstraction (Interface dan Abstraction dapat dijadikan satu)
Fungsi: Abstraction menyembunyikan detail implementasi dan menampilkan hanya fungsionalitas penting kepada pengguna. Dengan menggunakan kelas abstrak dan interface, Anda dapat mendefinisikan kontrak yang harus diikuti oleh subclass, yang meningkatkan keterbacaan dan pemeliharaan kode. Dalam program, TiketAbstract sebagai kelas abstrak mendefinisikan metode umum untuk semua tiket, dan TiketInterface mendefinisikan operasi CRUD yang harus diimplementasikan oleh kelas lain.

4. Interface (Dapat diterapkan untuk CRUD)
Fungsi: Interface mendefinisikan metode yang harus diimplementasikan oleh kelas yang menggunakannya. Dalam konteks CRUD, interface memungkinkan implementasi yang fleksibel dan terpisah dari detail implementasi. Dengan cara ini, Anda dapat mengganti implementasi kelas tanpa mengubah kode yang menggunakan interface tersebut. Dalam program, TiketInterface mendeklarasikan metode untuk operasi CRUD yang digunakan dalam SistemPenjualanTiket.

5. Final Keyword (Class dan Properti)
Fungsi: Menandai kelas atau properti dengan final berarti bahwa kelas tersebut tidak dapat diwarisi (jika kelas) atau nilai atribut tidak dapat diubah setelah diinisialisasi (jika atribut). Ini membantu dalam menjaga integritas dan konsistensi data. Dalam program, kelas SistemPenjualanTiket ditandai sebagai final untuk mencegah subclassing, dan daftar tiket sebagai final untuk memastikan referensi ke koleksi tiket tetap konsisten sepanjang siklus hidup objek.








