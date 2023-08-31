class student
{
    int rollno;
    String branch,name;
    student()
    {
        rollno=1;
        branch="comp";
        name="pranvi";
    }
    void compDisplay()
    {
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
    }
}
//this is report class that extends student: simple inheritance
class Report extends student
{
    int totalmarks;
    double perc;
    String grade;
    Report(){totalmarks=580;}
    void computePerc()
    {
        perc=(totalmarks/6);
    }
    void computeGrade()
    {
        if(perc>90 && perc<=100)
        {
            grade="A++";
        }
        else if (perc>80 && perc<=90)
        {
            grade="A";
        }
        else if (perc>70 && perc<=80)
        {
            grade="B";
        }
        else if (perc>60 && perc<=70)
        {
            grade="C";
        }
        else if (perc>50 && perc<=60)
        {
            grade="D";
        }
        else
        {
           grade="fail";
        }
    }
    void percDisplay()
    {
        
        System.out.println("Percentage:"+perc);
    
    }
    void gradeDisplay()
    {
        System.out.println("Grade:"+grade);
    }
    public static void main(String args[])
    {
        Report r1=new Report();
        r1.compDisplay();
        r1.computePerc();
        r1.computeGrade();
        r1.percDisplay();
        r1.gradeDisplay();
    }
    

}