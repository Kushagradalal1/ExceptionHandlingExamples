
public class Exone {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        System.out.println("Start of main...");
        try{
        x= Integer.parseInt(args[0]);
        y= Integer.parseInt(args[1]);
        z=x/y;
        }catch(ArithmeticException e){
            z=x/2;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficents Values..");
        }catch(NumberFormatException e){
            System.out.println("Invail Numbers..");
        }catch(Exception e){
            System.out.println("Unknown Problem..");
        }
        System.out.println("Results : "+z);
        System.out.println("End of Main..");
    }
}
