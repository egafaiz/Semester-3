# Manajemen Sederhana Pengguna dan Alamat dalam Java

Proyek ini adalah aplikasi Java sederhana yang memodelkan entitas `User` (pengguna) yang memiliki atribut nama, umur, dan alamat (`Address`). Tujuan dari proyek ini adalah untuk mendemonstrasikan teknik enkapsulasi dalam pemrograman berorientasi objek serta beberapa teknik refaktorisasi dalam Java untuk meningkatkan keterbacaan dan struktur kode. Proyek ini dapat menjadi referensi dasar bagi pemula untuk memahami konsep dasar OOP dan cara membangun aplikasi Java sederhana.

## Fitur Proyek

1. **Kelas Address**: Mewakili alamat pengguna dengan atribut `street` (nama jalan).
2. **Kelas User**: Mewakili pengguna dengan atribut `name` (nama), `age` (umur), dan `address` (alamat).
3. **Metode Pengelolaan Data**: Termasuk metode getter dan setter untuk mengakses dan mengubah data pengguna serta alamat secara terpisah.
4. **Pesan Sapaan**: Menyediakan metode untuk membuat pesan sapaan yang berisi nama dan alamat pengguna.
5. **Ringkasan Data Pengguna**: Menyediakan metode untuk mendapatkan detail lengkap pengguna dalam format yang mudah dibaca.

## Struktur Proyek

Proyek ini terdiri dari dua file utama:

- **src/Address.java**:
    - Mendefinisikan kelas `Address` yang menyimpan data alamat pengguna.
    - Metode utama dalam kelas ini adalah `getStreet()` dan `setStreet()` untuk mengakses dan mengatur nama jalan.

- **src/User.java**:
    - Mendefinisikan kelas `User` yang menyimpan data pengguna.
    - Menyediakan metode seperti `getUserDetails()` untuk menampilkan data pengguna dalam format teks serta `createGreetingMessage()` untuk membuat pesan sapaan.

## Cara Menjalankan Program

Ikuti langkah-langkah berikut untuk menjalankan proyek ini dan memahami cara mengisi parameter pada kelas `main`:

1. **Buka File `User.java`**:
    - Buka file `User.java` di editor teks atau IDE (seperti IntelliJ atau VS Code). Di dalam file ini terdapat metode `main` yang menjadi titik awal program.

2. **Modifikasi Parameter di dalam Kelas `main`**:
    - Di dalam metode `main`, terdapat baris kode untuk membuat objek `User` dengan nilai parameter awal:

      ```java
      public static void main(String[] args) {
          User user = new User("John", 30, new Address("123 Street"));
          System.out.println(user.getUserDetails());
          System.out.println(user.createGreetingMessage());
      }
      ```

    - Parameter `"John"`, `30`, dan `"123 Street"` adalah contoh data yang bisa dimodifikasi. Anda dapat menggantinya dengan informasi lain sesuai kebutuhan:

      ```java
      public static void main(String[] args) {
          User user = new User("Jane", 25, new Address("456 Avenue"));
          System.out.println(user.getUserDetails());
          System.out.println(user.createGreetingMessage());
      }
      ```

      Dalam contoh ini, pengguna diubah menjadi "Jane" dengan umur 25 tahun, dan alamatnya menjadi "456 Avenue".

3. **Kompilasi dan Jalankan Program**:
    - Setelah melakukan perubahan, simpan file tersebut.
    - Lalu buka terminal atau command prompt, navigasikan ke direktori `src` di dalam folder proyek, dan jalankan perintah berikut untuk mengompilasi:

      ```bash
      javac Address.java User.java
      ```

    - Jalankan program dengan perintah berikut:

      ```bash
      java User
      ```

4. **Hasil Output**:
    - Output yang akan muncul berdasarkan contoh di atas adalah:

      ```
      Nama: Jane, Umur: 25, Alamat: 456 Avenue
      Halo, nama saya Jane dan saya tinggal di 456 Avenue
      ```

Dengan cara ini, Anda dapat mengubah data pengguna langsung di dalam kelas `main`, yang memudahkan testing dengan berbagai informasi tanpa harus mengubah struktur program.

---

Penjelasan di atas menekankan cara pengguna dapat mengatur parameter secara langsung di dalam kode Java pada metode `main`, sehingga fleksibel untuk mencoba berbagai data dengan mudah.
