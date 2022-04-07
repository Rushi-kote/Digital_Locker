import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation implements FileOps {
	private int options =0;
	private Scanner in = new Scanner(System.in);
	private String path ="directry";
	@Override
	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("enter File Name to add");
		String fname = in.next();
		File file = new File(path+"\\\\"+fname); 
		if(file.exists()) {
			System.out.println("File alredy exists");	
		}else {
			try {
				if(file.createNewFile()) {
					System.out.println("file is created succesfully");
					this.showFiles();
				}
				else {
					System.out.println("Error while creating file");					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
	}

	@Override
	public void showFiles() {
		// TODO Auto-generated method stub
		System.out.println("\nList of Files:");
		File loc = new File(path);
		String container[] = loc.list();
		if(container.length==0) {
		 System.out.println("No Files to show");
		}	
		else{ 
			for(int i=0; i<container.length; i++) {
	         System.out.println(container[i]);
	      }
		}	
	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("enter File Name to delete");
		String fname = in.next();
		File file = new File(path+"\\\\"+fname); 
		if(!file.exists()) {
			System.out.println("File alredy not exists");	
		}else {
			if(file.delete()) {
				System.out.println("file is deleted succesfully");
				this.showFiles();
			}
			else {
				System.out.println("Error while creating file");					
			}
				
		}
	}

	@Override
	public void searchFile() {
		// TODO Auto-generated method stub
		System.out.println("enter File Name to Search");
		String fname = in.next();
		System.out.println("You are searching for a file named: " + fname);
		File file = new File(path+"\\\\"+fname); 
		if(file.exists()) {
			System.out.println("File is existed in the Directory");	
		}else {
			
			System.out.println("File not Found");		
		}
	}

	@Override
	public void showInnerMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n");

		options =0;
		while(options!=4) {
			System.out.println(" 1--> Add a file in Directory");
			System.out.println(" 2--> Delete a file from Directory");
			System.out.println(" 3--> Search a file in Directory");
			System.out.println(" 4--> Go back to main menu");
			System.out.println("Select the option");
			options = in.nextInt();
			
			switch(options) {
	
	        case 1: // Add File in Directory
	            this.addFile();
	            
	            break;
	            
	        case 2: // Delete a file from Directory 
	        	this.deleteFile();
	            
	            break;
	        case 3: // Search a file in Directory 
	        	this.searchFile();
	            
	            break; 
	        case 4: // Go back to main menu 
	        	
	            
	            break;
	        
	            
	        default:
	            System.out.println("Invalid Option");
	            break;
			   }
		}
	}

}
