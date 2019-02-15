import java.util.Scanner;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		double TWS = 0;
		double TotalTWS=0;
		double GPA=0;
		
		
		int []CreditUnit= {4,3,3,3,3,3,4,4};
		double[] Totalweigh;
		Totalweigh=new double[8];
		 double GP = 0;
		
		
		int ComputerApplication=0;
		int ProblemSolving=0;
		int DiscreteMath=0;
		int ComputerSystem=0;
		int Entrepreneurship=0;
		int CommunicationSkills=0;
		int WebDesign=0;
		int ObjectedOreintedProgramming=0;

		
		int[] Marks=new int[8];
		
		Marks[0]=ComputerApplication;
		Marks[1]=ProblemSolving;
		Marks[2]=DiscreteMath;
		Marks[3]=ComputerSystem;
		Marks[4]=Entrepreneurship;
		Marks[5]=CommunicationSkills;
		Marks[6]=WebDesign;
		Marks[7]=ObjectedOreintedProgramming;
		
		System.out.println("Enter Marks for");
		System.out.println("================");
		System.out.print("ComputerApplication " + " ");
		Marks[0]=scn.nextInt();
		System.out.println("================");

		System.out.print("ProblemSolvlinlg" + " ");
		Marks[1]=scn.nextInt();
		System.out.println("================");
		System.out.print("Discrete Math" + " ");
		Marks[2]=scn.nextInt();
		System.out.println("================");
		System.out.print("CommuterSystem" + " ");
		Marks[3]=scn.nextInt();
		System.out.println("================");
		System.out.print("Entrepreneurship" + " ");
		Marks[4]=scn.nextInt();
		System.out.println("================");
		System.out.print("Communication Skills" + " ");
		Marks[5]=scn.nextInt();
		System.out.println("================");
		System.out.print("WebDesign" + " ");
		Marks[6]=scn.nextInt();
		System.out.println("================");
		System.out.print("Objected Oriented programming" + " ");
		Marks[7]=scn.nextInt();


  

		

        
        for (int i=0;i<8;i++) {
        	if (Marks[i]<=100 && Marks[i]>=80) {
        			GP=5.0;
        			TWS=GP*CreditUnit[i];
        		
        			
        		
        		
        	}
        	if (Marks[i]<=79 && Marks[i]>=75) {
        		GP=4.5;
        		
        		TWS=GP*CreditUnit[i];
        	}
            if(Marks[i]<=74 && Marks[i]>=70) {
        	    GP=4.0;
        	    TWS=GP*CreditUnit[i];
            }
            if(Marks[i]<=69 && Marks[i]>=65) {
            	GP=3.5;
            	
            	TWS=GP*CreditUnit[i];
            }
           
            if(Marks[i]<=64 && Marks[i]>=60){
            	GP=3.0;
            	TWS=GP*CreditUnit[i];
            }
            
            if(Marks[i]<=59 && Marks[i]>=55) {
            	GP=2.5;
            	TWS=GP*CreditUnit[i];
            }
           
	        if (Marks[i]<=54 && Marks[i]>=50) {
		        GP=2.0;
		        TWS=GP*CreditUnit[i];
	        }
	        if (Marks[i]<=49 && Marks[i]>=45) {
	        	GP=1.5;
	        }
	        
	        if(Marks [i]<=44 && Marks[i]>=40) {
	    	   GP=1.0;
	    	   TWS=GP*CreditUnit[i];
	       }
	        if(Marks[i]<=39 && Marks[i]>=35) {
	        	
	        	GP=0.5;
	        	TWS=GP*CreditUnit[i];
	        }
	        if (Marks[i]<=34 && Marks[i]>=30) {
	        	GP=0;
	        	TWS=GP*CreditUnit[i];
	        }
	        if(Marks[i]==0) {
	        	GP=0;
	        	TWS=GP*CreditUnit[i];
	       
	        }
			
	          Totalweigh[i]=TWS;
	          
	          TotalTWS=Totalweigh[0]+Totalweigh[1]+Totalweigh[2]+
	        		   Totalweigh[3]+Totalweigh[4]+Totalweigh[5]+Totalweigh[6]+Totalweigh[7];
	          
	          GPA=TotalTWS/27;
	         
        }
        
        
           
          System.out.print("TotalTWS= "+TotalTWS);
          System.out.println();
          System.out.print("GPA= "+GPA);
          
	}
	  
	

}

