/**
   The DriverExam class stores data about a driver's license exam
   for the Driver’s License Exam programming challenge.
*/

public class DriverExam
{
        // Minimum # of correct answers to pass

   // Array of correct answers
  public final int MINIMUM = 15;
    private char[] CorrectAnswers = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'}; 
              private char[] StudentsAnswers;  // The student's answers
              private int[] MissedQuestions;  // The missed question numbers
              private int NumberCorrect;  // The number correct
              private int NumberIncorrect;  // The number incorrect
   
   /**
      The constructor copies an array of answers
      to the student field.
      @param s The array of answers to copy.
   */
   DriverExam(char [] s)
    {
   
      // Create an array for the student answers.
      StudentsAnswers = new char [s.length];
      for (int i = 0; i < s.length ; i++)
      {
        StudentsAnswers[i] = s[i];
      }
      // Grade the exam.
      GradeExam();
    } 
   
   /**
      The gradeExam method determines the number of
      correct and incorrect answers. It calls the
      makeMissedArray method.
   */
    private void GradeExam(){
      for (int i = 0; i < StudentsAnswers.length; i++){
        if (StudentsAnswers[i] == CorrectAnswers[i]){
          NumberCorrect += 1;
        }
        else{
          NumberIncorrect += 1;

        }
        makeMissedArray();
      }
    }
   
   
   /**
      The makeMissedArray method makes the missed array and
      stores the numbers of all the questions that the
      student missed in it.
   */
    private void makeMissedArray(){

   
   
          int m = 0;
        // Index for missed array.
          if (NumberIncorrect > 0){

      
      // Did the student miss any questions?
      
         // Make an array of missed question numbers.
                MissedQuestions = new int [NumberIncorrect];     
               // Store the question number (i + 1)
               for (int i = 0; i < StudentsAnswers.length; i++){
                 if(StudentsAnswers[i] != CorrectAnswers[i]){
                   MissedQuestions[m] = i + 1;
                   m++;
                 }
               }
               // in the missed array.
              
                 // Increment missed array index.
        }         
    }
   /**
      The passed method determines whether the student
      passed or failed the exam.
      @return true if the student passed, false otherwise.
   */
   
   
   /**
      The totalCorrect method returns the number of
      questions correctly answered.
      @return The number of questions correctly answered.
   */

   

   /**
      The totalInCorrect method returns the number of
      questions incorrectly answered.
      @return The number of questions incorrectly answered.
   */

   

   /**
      The questionsMissed method returns an array containing
      the numbers of the missed questions. 
      @return An array containing the numbers of the missed
              questions.If no questions were missed, returns null.
   */
    public int[] questionsMissed()
    {
      int[] temp = new int[MissedQuestions.length];
      for(int i = 0; i < MissedQuestions.length; i++)
      {
        temp[i] = MissedQuestions[i];
      }
      return temp;
    }
   
         // First, make a copy of the array.
         
      
      // Return the copy.
      
    }