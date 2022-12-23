public class Laptop extends Komputer implements Mouse, Keyboard, Print {
    public String merkOS = "Menggunakan OS Microsoft Windows";
    public String merkKeyboard = "Menggunakan Keyboard Rexus";
    public String merkMouse = "Menggunakan Mouse Ryzen";
    public String merkPrint = "Menggunakan Print HP";

    public void hidupkanOs(){
        System.out.println("hidupkan OS Laptop " + merkOS);
    }

    public void matikanOs(){
        System.out.println("Matikan OS Laptop "+ merkOS);
    }

    public void klikKanan(){
        System.out.println("Klik mouse kanan Laptop "+ merkMouse);
    }

    public void klikKiri(){
        System.out.println("Klik Mouse kiri Laptop "+ merkMouse);
    }

    public void tekanEnter(){
        System.out.println("Tekan Enter pada Keyboard Laptop " + merkKeyboard);
    }

    public void cetakData(){
        System.out.println("cetak data melalui Laptop "+ merkPrint);
    }
}
