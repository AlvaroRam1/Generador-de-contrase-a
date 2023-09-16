package generadordecontraseña;

  import java.security.SecureRandom;
  import javax.swing.JOptionPane;

public class GeneradorDeContraseña {
 
    public static void main(String[] args) {
        
        //Preguntar al usuario la longitud 
        int length = Integer.parseInt(JOptionPane.showInputDialog("Longitud de la contraseña:"));

        String contraseña = generatePassword(length);
        
        // resultado de la contraseña
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contraseña);
    }

    public static String generatePassword(int length) {
        
        //cadena de carcter
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

        
        SecureRandom random = new SecureRandom();

        String password="";

        for (int i = 0; i < length; i++) {
            
            int randomIndex = random.nextInt(caracteres.length());
            
            password += caracteres.charAt(randomIndex);
        }

        return password.toString();
    }
}


    
  
       
    

