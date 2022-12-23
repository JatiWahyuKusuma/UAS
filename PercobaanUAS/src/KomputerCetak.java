final class KomputerCetak{
    final static void cetak(Komputer []obj){
        for(Komputer kmp : obj){
            if(kmp instanceof PC){
                System.out.println("======================================================");
                System.out.println("|                   UAS PRAKTIKUM PBO                |");
                System.out.println("======================================================");
                kmp.hidupkanOs();
                kmp.matikanOs();
                kmp.klikKiri();
                kmp.klikKanan();
                kmp.tekanEnter();
                kmp.cetakData();
            }else if(kmp instanceof Laptop){
                System.out.println("======================================================");
                kmp.hidupkanOs();
                kmp.matikanOs();
                kmp.klikKiri();
                kmp.klikKanan();
                kmp.tekanEnter();
                kmp.cetakData();
            }else if(kmp instanceof Notebook){
                System.out.println("======================================================");
                kmp.hidupkanOs();
                kmp.matikanOs();
                kmp.klikKiri();
                kmp.klikKanan();
                kmp.tekanEnter();
                kmp.cetakData();
                System.out.println("======================================================");
            }
        }       
    }
    public static void main(String [] args){
        PC pc1 = new PC();
        Laptop ltp = new Laptop();
        Notebook ntb = new Notebook();
        Komputer[] kmp ={pc1, ltp, ntb};
        cetak(kmp);
    }
    
}

