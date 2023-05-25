

public class Main{
    public static void main(String[] args){

        
        AdultUser a_User = new AdultUser(); 
        int adultcheck = a_User.registerAccount();
        if(adultcheck > 12){
            a_User.requestBook();
        }
        
        
        System.out.print("\n");
    
        //clear console 
        //System.out.print("\033[2J\033[1;1H");
    

        KidsUser k_User = new KidsUser();
        int kidcheck = k_User.registerAccount();
        if(kidcheck <= 12){
            k_User.requestBook();
        }
        
    }
}
