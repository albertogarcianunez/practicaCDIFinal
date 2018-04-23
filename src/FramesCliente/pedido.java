/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramesCliente;

/**
 *
 * @author Alber
 */
public class pedido {
    
    private static String primero;
    private static String segundo;
    private static String postre;
    private static double precio;
    private static boolean bebida;
    private static boolean cafe;
    private static boolean menu;
    
    
    public pedido(){
        
    }
    
    public void setPrimero(String primero){
        pedido.primero= primero;
    }
    
    public void setSegundo(String segundo){
        pedido.segundo = segundo;
    }
    
    public void setPostre(String postre){
        pedido.postre = postre;
    }
    
    public void setBebida(boolean bebida){
        pedido.bebida = bebida;
    }
    
    public void setCafe(boolean cafe){
        pedido.cafe= cafe;
    }
    
    public void setMenu(boolean menu){
        pedido.menu = menu;
    }
    
    public String crearTicket(){
        String ticket;
        if(!menu){
            precio= 22.75; 
            ticket="<html><body>Platos:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                    + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Precio:<br><br>"+
                        primero+"&nbsp&nbsp&nbsp&nbsp&nbsp;9.50$<br><br>"+
                        segundo+"&nbsp&nbsp&nbsp&nbsp&nbsp;9,50$<br><br>"+
                        postre+"&nbsp&nbsp&nbsp&nbsp&nbsp;3,75$<br><br>";
            if(bebida){
                precio= precio +2.5;
                ticket = ticket +"Bebida&nbsp&nbsp&nbsp&nbsp;2.50$<br>";
            }
            if(cafe){
                precio= precio +1;
                ticket = ticket +"Café&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;1,00$<br>";
            } 
            ticket = ticket + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                    + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Total:&nbsp;"+precio+"$</body></html>";
        }
        else{
            precio=12.50;
            ticket="<html><body>Platos:<br><br>"+
                        primero+"<br><br>"+
                        segundo+"<br><br>"+
                        postre+"<br><br>";
            if(bebida){
                precio= precio +2.5;
                ticket = ticket +"Bebida&nbsp&nbsp&nbsp&nbsp;2.50$<br>";
            }
            if(cafe){
                precio= precio +1;
                ticket = ticket +"Café&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;1,00$<br>";
            }             
            ticket = ticket + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                    + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Total:&nbsp;"+precio+"$</body></html>";
        }
        return ticket;
    }
    
    
}
