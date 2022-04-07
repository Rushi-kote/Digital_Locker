 import java.util.Scanner;

public class Menu implements Screen {
	int options = 0;
	Scanner in = new Scanner(System.in);
	FileOperation FO = new FileOperation();
	@Override
	public void welcomeScreen() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Digital Locker");
		System.out.println("Devloper: Rushikesh Kote");
	}

	@Override
	public void showScreen() {
		while (options!=3) {
		this.showMenu();
		System.out.println("Select the option");
		
		options = in.nextInt();
		
		switch(options) {

        case 1: // Show Files in Directory
            FO.showFiles();
            break;
            
        case 2: // Show File Options menu
        	FO.showInnerMenu();
            
            break;
        case 3: // exit
        	
            break;   
        default:
            System.out.println("Invalid Option");
            break;
		}
		}
	}
		
	public void showMenu() {
		System.out.println("\n");
		System.out.println("1--> List File in Directory");
		System.out.println("2--> Add, Delete Or Search file in Directory");
		System.out.println("3--> Exit");
		
	}
 
}
