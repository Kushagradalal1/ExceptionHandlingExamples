
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CheckedAndUncheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        
        String fname=args[0];
      
        FileReader fr=new FileReader(fname);
        
        
            Class.forName("abcd");
        
    }
    
}
/*

    ArrayIndexOutOfBoundsExceptions Are Unchecked Exceptions And FileNotFoundExceptions Are the
    Example of Checked Exceptions.

*/