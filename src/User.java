/**
 * Merepresentasikan pengguna dengan nama, umur, dan alamat.
 */

/** dsanasdsda
 *
 */
public class User {
    private String name;
    private int age;
    private Address address;

    /**
     * Membuat objek User dengan nama, umur, dan alamat yang diberikan.
     *
     * @param name nama dari pengguna
     * @param age umur dari pengguna
     * @param address alamat dari pengguna
     */
    public User(String name, int age, Address address) {
        this.name = name;
        setAge(age); // Menggunakan setAge untuk validasi umur
        this.address = address;
    }

    /**
     * Mengembalikan nama dari pengguna.
     *
     * @return nama pengguna
     */
    public String getName() {
        return name;
    }

    /**
     * Mengatur nama dari pengguna.
     *
     * @param name nama baru dari pengguna
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mengembalikan umur dari pengguna.
     *
     * @return umur pengguna
     */
    public int getAge() {
        return age;
    }

    /**
     * Mengatur umur dari pengguna.
     * Menambahkan validasi agar umur tidak negatif atau lebih dari batas maksimal yang realistis.
     *
     * @param age umur baru dari pengguna
     * @throws IllegalArgumentException jika umur kurang dari 0 atau lebih dari 120
     */
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Batas usia realistis
            this.age = age;
        } else {
            throw new IllegalArgumentException("Umur tidak valid.");
        }
    }

    /**
     * Mengembalikan alamat dari pengguna.
     *
     * @return alamat pengguna
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Mengatur alamat dari pengguna.
     *
     * @param address alamat baru dari pengguna
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Membuat pesan sapaan untuk pengguna.
     *
     * @return pesan sapaan yang berisi nama dan alamat pengguna
     */
    public String createGreetingMessage() {
        return "Halo, nama saya " + name + " dan saya tinggal di " + address.getStreet();
    }

    /**
     * Menyediakan ringkasan detail pengguna.
     *
     * @return string berformat yang berisi nama, umur, dan alamat pengguna
     */
    public String getUserDetails() {
        return "Nama: " + name + ", Umur: " + age + ", Alamat: " + address.getStreet();
    }

    /**
     * Metode utama untuk mendemonstrasikan detail pengguna dan sapaan.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        User user = new User("John", 30, new Address("123 Street"));
        System.out.println(user.getUserDetails());
        System.out.println(user.createGreetingMessage());
    }
}
