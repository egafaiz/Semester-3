/**
 * Merepresentasikan alamat dengan nama jalan.
 */

public class Address {
    private String street;

    /**
     * Membuat objek Address dengan nama jalan yang diberikan.
     *
     * @param street nama jalan dari alamat
     */
    public Address(String street) {
        this.street = street;
    }

    /**
     * Mengembalikan nama jalan dari alamat ini.
     *
     * @return nama jalan
     */
    public String getStreet() {
        return street;
    }

    /**
     * Mengatur nama jalan dari alamat ini.
     *
     * @param street nama jalan yang baru
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
