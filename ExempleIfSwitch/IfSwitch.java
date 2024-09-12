package ExempleIfSwitch;

public class IfSwitch {
    public static void main(String[] args) {
       
        int note =5;
       System.out.println("Ma note est :" +note);
      
    
        
       if (note<4) {
         System.out.println("Ma note est insuffisante"); 
        }
    }
        else if (note)
            System.out.println("Ma note est suffisante mais peut être améliorée");
       }else(note=6){System.out.println("Parfait!");}else{System.out.println("Ma note est suffisante");}

// Test avec Switch
switch(note){case 1:System.out.println("J'ai triché c'est mal");

break case 2:System.out.println("Y a du boulot");

break case 3:System.out.println("encore un effort");

break case 4:System.out.println("Bien");

break case 5:System.out.println("parfait");

break

}}

}
