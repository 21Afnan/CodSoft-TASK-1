import java.util.Scanner;
public class GradeCal {
    double[] marks;
    double  Totalmarks;
    double totalmarksobt;
    String[] SubjectName;
    // n stands for number of subjects
    int n;
    double percentage;
    void Markscal() {
        System.out.println("Enter Number of your subjects ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        marks=new double[n];
        SubjectName=new String[n];
        System.out.println("Enter subject name ");
        for (int i = 0; i <  n; i++) {
            SubjectName[i] = s.nextLine();
        }
        System.out.println("   Enter your marks out of 100 in each subject ");
        for (int i = 0; i < n; i++) {
            marks[i] = s.nextDouble();
            totalmarksobt+=marks[i];
        }
        System.out.println("Printing Name and marks of subjects");
        for (int i=0;i < n;i++){
            System.out.println("Subject "  + (i+1)+":"+ SubjectName[i]+"  Marks : "+ marks[i]);
        }
        System.out.println(" Total Marks obtained are  : "+ totalmarksobt);
        s.close();
    }
    void percCal(){
        Totalmarks =n*100;
        percentage=(totalmarksobt/Totalmarks)*100;
        System.out.println(" Percenatge is   : "+ percentage + " % ");
    }
char grade(){
        if(percentage>=90){
            return 'A';
         }
          else if(percentage>=80){
                   return 'B';
         }
          else if(percentage>=70){
                   return 'C';
         }
          else if(percentage>=60){
                  return 'D';
         } else  if(percentage>=50){
             return 'E';
         }
          else{
           return 'F';
       }
   }
void Result(){
    System.out.println("............................................");
    System.out.println("Displaying Result of a student ");
    System.out.println(".............................................");
    System.out.print(" Total Marks obtained are  : "+ totalmarksobt+", Percenatge is   : "+ percentage + " % ");
    System.out.print(", Grade is :  "+grade());
}
}



public class Main {
    public static void main(String[] args) {
        GradeCal c=new GradeCal();
        c.Markscal();
        c.percCal();
        c.Result();

    }
    }
