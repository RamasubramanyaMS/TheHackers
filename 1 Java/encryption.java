// Java program to create a 
// asymmetric key 
  
package java_cryptography; 
import java.security.KeyPair; 
import java.security 
    .KeyPairGenerator; 
import java.security 
    .SecureRandom; 
import javax.xml.bind 
    .DatatypeConverter; 
  
// Class to create an asymmetric key 
public class Asymmetric { 
  
    private static final String RSA 
        = "RSA"; 
  
    // Generating public and private keys 
    // using RSA algorithm. 
    public static KeyPair generateRSAKkeyPair() 
        throws Exception 
    { 
        SecureRandom secureRandom 
            = new SecureRandom(); 
  
        KeyPairGenerator keyPairGenerator 
            = KeyPairGenerator.getInstance(RSA); 
  
        keyPairGenerator.initialize( 
            2048, secureRandom); 
  
        return keyPairGenerator 
            .generateKeyPair(); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
        throws Exception 
    { 
        KeyPair keypair 
            = generateRSAKkeyPair(); 
  
        System.out.println( 
            "Public Key is: "
            + DatatypeConverter.printHexBinary( 
                  keypair.getPublic().getEncoded())); 
  
        System.out.println( 
            "Private Key is: "
            + DatatypeConverter.printHexBinary( 
                  keypair.getPrivate().getEncoded())); 
    } 
} 