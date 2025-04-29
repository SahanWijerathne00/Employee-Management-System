/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colomboios;


public class ColomboIOS {

   
    public static void main(String[] args) {
      
       Welcome welc = new Welcome();
       welc.setVisible(true);
       try
       {
           for(int x=0; x<=100; x++)
           {
               Thread.sleep(40);
               welc.p1.setValue(x);
           }
           
          
           Interface inter = new Interface();
           inter.setVisible(true);
           welc.setVisible(false);
       }
       
       
       catch(Exception ex)
       {
           
       }
    }
    }

