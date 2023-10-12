package Pertemuan_3;

public class RunBangunDatar {

    public static void main(String[] args) {
    LuasMasterBangunDatar ST = new LuasMasterBangunDatar();
        System.out.println("Hasil Method Prosedur");
        ST.hitungLST(10, 7);
        
        System.out.println("\nHasil Method Fungsi");
        System.out.println("Luas Segitiga = " + ST.hitungLST_0(14, 7));
        
        System.out.println("\nHasil Method Static Prosedur");
        LuasMasterBangunDatar.hitungLST_1(14, 10);
        
        System.out.println("\nHasil Method Static Fungsi");
        System.out.println("Luas Segi Tiga = "+ LuasMasterBangunDatar.hitungluas_2(10, 7));
    }
    
}
