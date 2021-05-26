/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

import java.util.Scanner;
/**
 *
 * @author MSI - PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactManager MyContactManager = new ContactManager();
        String name , phoneNumber, email;
      
        name = "Qowwiyyan Abdullah";
        email = "koko@gmail.com";
        phoneNumber = "091274048347";
        Contact contact1 = new Contact(name , email, phoneNumber);
        MyContactManager.addContact(contact1);

        name = "Quthbie Zayyan";
        email = "QuthbieZZ@gmail.com";
        phoneNumber = "081213141516";
        Contact contact2 = new Contact(name , email, phoneNumber);
        MyContactManager.addContact(contact2);
        
        name = "Aligar";
        email = "Ali@gmail.com";
        phoneNumber = "082123242526";
        Contact contact3 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact3);
        
        name = "Giant";
        email = "GiantGanteng@gmail.com";
        phoneNumber = "+6287876757434";
        Contact contact4 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact4);
        
        name = "Ramayana";
        email = "RamayaRame@gmail.com";
        phoneNumber = "07217033517";
        Contact contact5 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact5);
       
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("Cari Nama Kontak   = ");
        name = input.nextLine();
        name = name.toLowerCase();
        
        Contact result = MyContactManager.searchContact(name);
        if(result != null){
        System.out.println("Sedang Mencari Data" + "\n");
        System.out.println("Nama  = " + result.getName());
        System.out.println("Nomor = " + result.getPhoneNumber());
        System.out.println("Email = " + result.getEmail() + "\n");
        }
        else{
            System.out.println("\n"  + "Tidak ditemukan" + "\n");
        }
        
        char xy;
        System.out.print("Again?(y/n) : ");
        xy = input.next().charAt(0);
        if(xy == 'n' || xy == 'N'){    
        System.exit(0);}
        }while(true);
    }
    
}
