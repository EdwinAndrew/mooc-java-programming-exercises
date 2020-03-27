
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if (id.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()){
                break;
            }
            
            Archive listItem = new Archive(id,name);
            if(list.contains(listItem)){
                
            }else{
                list.add(listItem);
            }
            
        }
        System.out.println("==Items==");
        for (Archive listing:list){
            System.out.println(listing.toString());
        }
       
        


    }
}
