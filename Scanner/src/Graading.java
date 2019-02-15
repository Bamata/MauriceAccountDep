import java.util.ArrayList;
import java.util.Scanner;

public class Graading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader=new Scanner(System.in);
		/* System.out.print("Enter Student:"); */
		int[] Marks;
		Marks=new int [6];
		int computerApplication=Marks[0];
		int OPP=Marks[1];
		int WebDesin=Marks[2];
		int ResearchMethod=Marks[3];
		int Calculus=Marks[4];
		int Netowrks=Marks[5];
		
		
		
		ArrayList<String> names= new ArrayList();
		int n=1;
		while(true) {
			System.out.print("Enter student"+n+" ");
			
			String name=new Scanner(System.in).nextLine();
			
			
			if (name.toLowerCase().equals("exit"))
				break;
			else 
				names.add(name);
			
			for (int i=0;i<6;i++) {
				
				if (Marks[i]>=0 && Marks[i]<100) {
				
					System.out.print("  "+"ComputerApplication  :"+"    ");
					
					Marks[0]=reader.nextInt();
					
					System.out.print("  "+"OOP  :"+"   ");
					Marks[1]=reader.nextInt();
				
					System.out.print("  "+"WebDesin:"+"   ");
					Marks[2]=reader.nextInt();		
					
					System.out.print("  "+"ResearchMethod:"+"   ");
		            Marks[3]=reader.nextInt();
		            
		            System.out.print("  "+"Calculus:"+"   ");
		            Marks[4]=reader.nextInt();
		            
		            System.out.print("  "+"NetWorks:"+"    ");
		            Marks[5]=reader.nextInt();
		            
		            int Sum=Marks[0]+Marks[1]+Marks[2]+Marks[3]+Marks[4]+Marks[5];
		            
		            
		            
		            System.out.println();
		            
		            System.out.print(" "+"Sum="+Sum);
		            
		            System.out.println();
		          
		            
		            System.out.println();
		            
		            int Average=Sum/6;
		            
		            System.out.print("   "+"Average="+ Average);
		            
		            System.out.println();
		            
				    break;
				    
				}
				
				else 
					System.out.print("error");
					
					
				}
			 n++;
			}
		     
		   
			
		}
	
	
  }


