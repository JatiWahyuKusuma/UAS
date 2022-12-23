public class Notebook extends Komputer implements Mouse, Keyboard, Print {
    public String merkOS = "Menggunakan OS Linux";
    public String merkKeyboard = "Menggunakan Keyboard Logitech";
    public String merkMouse = "Menggunakan Mouse Votre KM310";
    public String merkPrint = "Menggunakan Print Fuji Xerox CM155W";

    public void hidupkanOs(){
        System.out.println("hidupkan OS pada Notebook "+ merkOS);
    }

    public void matikanOs(){
        System.out.println("matikan OS pada Notebook "+ merkOS);
    }

    public void klikKanan(){
        System.out.println("Klik mouse kanan Notebook "+ merkMouse);
    }

    public void klikKiri(){
        System.out.println("Klik Mouse kiri Notebook "+ merkMouse);
    }

    public void tekanEnter(){
        System.out.println("Tekan enter pada Keyboard Notebook "+ merkKeyboard);
    }

    public void cetakData(){
        System.out.println("Cetak data melalui Notebook "+ merkPrint);
    }
}
