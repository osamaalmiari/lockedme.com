package locked_me_dot_com;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WelcomeScreen {
	public static void treeset(String folder_to_sort){
	File Path = new File(folder_to_sort);
	String contents[] = Path.list();
	TreeSet<String> unsorted = new TreeSet<String>();
	for(int i=0; i<contents.length; i++) {
		unsorted.add(contents[i]);
      }
	System.out.println(unsorted);
	

	}
	public static void searchfile(String file_to_search){
		File search = new File(file_to_search);
		if(search.exists()){
			System.out.println("file exists");
		}
		else{
			System.out.println("file doesn't exist");
		}
	}
	
	public static void createfile(String filetype){
		try{
			File file = new File("D:/LockedMe.com/" + filetype);
			file.createNewFile();
				System.out.println("file is created");
			
			}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	
	
	public static void deletefile(String filetype_delete){
		File delete_file = new File("D:/LockedMe.com/" + filetype_delete);
		
		if (delete_file.exists()){
			delete_file.delete();
		}
		else{
			System.out.println("FNF(File Not Found)");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//Welcome screen
		
		System.out.println("     * ------------------------*");
		System.out.println("     * Welcome to LockedMe.com *");
		System.out.println("     * ------------------------*");
		System.out.println(" The best website for managing files");
		System.out.println(" This website is  developed by Lockers Pvt. Ltd.");
		System.out.println(" With our website you can manage delete create ");
		System.out.println(" and search any type of files");
		
		System.out.println("");
		System.out.println(" ****************************************************");
		System.out.println("");
		
		boolean navigate = true;
		
			
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome user,");
		System.out.println("please write your full name:");
		

		String full_name = scanner.nextLine();
		System.out.println("hello, " + full_name );
		
		System.out.println("please write your email adress:");
		String email = scanner.nextLine();
		System.out.println("your profile is done");
		
		while (navigate == true){
			
		System.out.println("Enjoy managing files, check file managing options:");
		System.out.println("");
		System.out.println("***********");
		System.out.println("**Options**");
		System.out.println("***********");
		System.out.println("");
		System.out.println("1. sort and get files");
		System.out.println("2. manage files");
		System.out.println("3. Close Application");
		
		int choices = 0;
		try{
		choices = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("you can enter a string only");
		}
		catch(Exception e){
			System.out.println("you can enter a string only");
		}
		switch(choices)
		{
		case 1 :
			try{
			boolean get_files = true;
			while(get_files == true){
			System.out.println("write the path of main folder");
			String folder_to_sort = scanner.next();
			treeset(folder_to_sort);
			System.out.println("--------------------------------------");
			System.out.println("Do tou want to get more files?(Type yes or no)");
			String check = scanner.next();
			if (check.equals("no")){
				get_files = false;
			}
		
			}
			}
			catch(NullPointerException e){
				System.out.println("please write a valid path");
			}
			//navigate = false;
			break;
		
			
		case 2 :
			System.out.println("1. Create File");
			System.out.println("2. delete file");
			System.out.println("3. search file");
			System.out.println("4. Navigate back to main context");
			System.out.println("");
			int choice_manage_files = scanner.nextInt();
			switch(choice_manage_files)
			{
				case 1 :
					boolean add = true;
					
					while(add == true){
					System.out.println("write file name and type example: abc.txt");
					String file_type = scanner.next();
					createfile(file_type);
					System.out.println("Do tou want to add more files?(Type yes or no)");
					String check = scanner.next();
					if (check.equals("no")){
						add = false;
					}
					
					}
					
					break;
				case 2 :
					boolean want_to_delete = true;
					while(want_to_delete == true){
					System.out.println("write file name you want to delete");
					String file_to_delete = scanner.next();
					deletefile(file_to_delete);
					
					System.out.println("Do tou want to delete for more files?(Type yes or no)");
					String check = scanner.next();
					if (check.equals("no")){
						want_to_delete  = false;		
					}
					
					}
					break;
					
				case 3 :
					boolean want_to_search = true;
					while(want_to_search == true){
					System.out.println("write the path of the file to search");
					String file_to_search = scanner.next();
					searchfile(file_to_search);
					System.out.println("Do tou want to search for more files?(Type yes or no)");
					String check = scanner.next();
					if (check.equals("no")){
						want_to_search  = false;
						
					}
					
					}
					break;
				case 4 :
					continue;
			}
		case 3 :
			System.exit(0);
			break;
		}
	}
	}
	
}
