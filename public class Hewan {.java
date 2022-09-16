public class Hewan {
    //sachril Ramadhan
    //202043501443
    //R5R
    String nama;
    int umur;
    boolean status;
    
   
    void setNama(String nama){
        this.nama = nama;
    }
    void setUmur(int umur){
        this.umur = umur;
    }
    void setStatus(boolean status){
        this.status = status;
    }
    
    
    String getNama(){
        return nama;
    }
    int getUmur(){
        return umur;
    }
    boolean getStatus(){
        return status;
    }
    
    public static void main(String[] args){
     
        Hewan PesawatTelpon = new Hewan();
        
        PesawatTelpon.setNama("Sachril Ramadhan");
        PesawatTelpon.setUmur(22);
        PesawatTelpon.setStatus(true);
        
        System.out.println("Nama Saya: "+ PesawatTelpon.getNama());
        System.out.println("Umur Saya: "+ PesawatTelpon.getUmur()+" Tahun");
        System.out.println("Status Saya: "+ PesawatTelpon.getStatus());
    }
}
