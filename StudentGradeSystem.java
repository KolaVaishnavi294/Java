public class StudentGradeSystem {
   public char calculateGrade(int marks)
   {
            if(marks>=90 && marks<=100)
                return 'A';
            else if(marks>=80 && marks<90)
               return 'B';
            else if(marks>=70 && marks<80)
               return 'C';
            else if(marks>=60 && marks<70)
               return 'D';
            else if(marks>=50 && marks<60)
               return 'E';
            else
               return 'F';
   }
   public char calculateGrade(int marks[])
   {
         double tot_marks=0;
         for(int ele:marks)
         {
            tot_marks+=ele;
         }
         double avg_marks=tot_marks/marks.length;
         char result=calculateGrade((int)avg_marks);
      return result;
   }
   public char calculateGrade(double GPA)
   {
         //GPA assumption is 1 to 10
         char result=calculateGrade((int)GPA*10);
        return result;
   }
   public char calculateGrade(int testScore,int assignment)
   {
       double finalScore=0.7*testScore+0.3*assignment;
       System.out.println(finalScore);
       char result=calculateGrade((int)finalScore);
      return result;
   } 
   public static void main(String args[])
   {
       StudentGradeSystem s=new StudentGradeSystem();
       System.out.println("Grade with Subject Marks: "+s.calculateGrade(76));
       int marks[]=new int[]{80,60,70,93};
       System.out.println("Grade Calculation with Array of Subject Marks: "+s.calculateGrade(marks));
       System.out.println("Grade Calculation with GPA: "+s.calculateGrade(78.5));
       System.out.println("Grade Calculation with Test Score and Assignment: "+s.calculateGrade(59,27));
    }
}