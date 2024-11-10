import java.util.*;
public class StudentGrade {

    
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int SubMarks=s.nextInt();
            int[] marks=new int[SubMarks];
            int totalmarks=0;
            for(int i=0;i<SubMarks;i++){
                System.out.println("Enter the obtained marks in each subject"+(i+1)+":");
                marks[i]=s.nextInt();
                totalmarks+=marks[i];
            }
            double avrPer=(double) totalmarks/(SubMarks*100)*100;
            System.out.println("Your result:");
            System.out.println("Total Marks: "+totalmarks);
            System.out.println("Average Percentage: "+avrPer+"%");
            String grade=calculateGrade(avrPer);
            System.out.println("Grade: "+grade);
            s.close();
        }
        public static String calculateGrade(double Percentage){
            if(Percentage>=90){
                return "A+";
            }else if(Percentage>=80){
                return "A";
            }else if(Percentage>=70){
                return "B";
            }else if(Percentage>=60){
                return "C";
            }else {
                return "Fail";
            }
        }
    }

