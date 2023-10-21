package Pertemuan_5;
public class MainUtama {
public static void main(String[] args) {
       User user = new User();
       user.SetUsername("Sabbina");
       user.SetPassword("Kamunanya");
       
       System.out.println("Username : " + user.GetUsername());
       System.out.println("Password : " + user.GetPassword());
    }
    
}
