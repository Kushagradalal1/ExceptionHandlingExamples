
public class FinallyExample {
     public static void main(String[] args) {
        int x=0;
        int y=0;
        int z=0;
        System.out.println("Start of main...");
        try{
            System.out.println("Starting of try..");
        x= Integer.parseInt(args[0]);
        y= Integer.parseInt(args[1]);
        z=x/y;
            System.out.println("Ending of try..");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Starting of catch..");
            System.out.println("Invaild Values..");
            System.out.println("Ending of Catch..");
        }
        finally{
            System.out.println("Inside Finally----Always run !!!");
        }
        System.out.println("Results : "+z);
        System.out.println("End of Main..");
    }
}
