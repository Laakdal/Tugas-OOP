public class Main {
    public static void main(String[] args) {
        
        VIPRoom customer_01 = new VIPRoom();
        customer_01.name = "Rei";
        System.out.println("Nama: " + customer_01.name);
        customer_01.TipeKamar();
        customer_01.roomNumber = 720;
        System.out.println("Nomor Kamar: " + customer_01.roomNumber);
        customer_01.SpecialVIPRoomFeature();
        
        System.out.println();

        StandardRoom customer_02 = new StandardRoom();
        customer_02.name = "Danis";
        System.out.println("Nama: " + customer_02.name);
        customer_02.TipeKamar();
        customer_02.roomNumber = 720;
        System.out.println("Nomor Kamar: " + customer_02.roomNumber);
        customer_02.SpecialStandardRoomFeature();

    }
}
