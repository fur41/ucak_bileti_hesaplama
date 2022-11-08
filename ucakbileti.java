
import java.util.Scanner;

    
    public class ucakbileti {

        public static void main(String[] args) {
            
            Scanner inp = new Scanner(System.in);

                
                
            int km ,yaş , tip; double normalTutar,yaşindirimi,tipindirimi;

        System.out.print("\nMesafeyi km cinsinden giriniz :");
        
            km=inp.nextInt();

           
            System.out.print("\nYaşınızı giriniz :");

                yaş=inp.nextInt();
               
                
            System.out.print("\nYolculuk tipini seçiniz\n \n1=> Gidiş  2=> Gidiş-Dönüş :");
            
                tip=inp.nextInt();
normalTutar=km*0.30;
                if ( km > 0 && yaş > 0 && tip == 2 || tip == 1 ){
                    normalTutar=km*0.30;
              
                 if((yaş>=12)&&(yaş<=24))
                 
                 {yaşindirimi=normalTutar*0.20;normalTutar-=yaşindirimi;}
                 

                        else if (yaş <= 12 && 0 <= yaş){yaşindirimi=normalTutar* 0.50;normalTutar-=yaşindirimi;}
                        
                       
                 
                        else if ( yaş >=65){yaşindirimi=normalTutar* 0.30;normalTutar-=yaşindirimi; }                 
                        
                    

                        else if(yaş>=25 &&yaş<65){yaşindirimi=normalTutar* 0;normalTutar-=yaşindirimi;}
                        
                        if(tip==2)
                        
                        {tipindirimi=normalTutar*0.20; tipindirimi=(normalTutar-tipindirimi)*2;}

                      System.out.println("Toplam ücret :"+normalTutar);
                }
                                        else{System.out.println("\nGeçersiz giriş yaptınız \n");}
          
        
                    
}}
    