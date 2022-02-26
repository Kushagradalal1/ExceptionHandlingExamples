public class ExTwo {
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
            System.out.println("Can't be Divide by Zero");
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Invaild Values..");
        }
        catch(Exception e){
            System.out.println("Unknown Problem..");
        }
        System.out.println("Results : "+z);
        System.out.println("End of Main..");
    }
}
