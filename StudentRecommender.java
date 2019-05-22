import java.util.*;



class Student

{



  private String name = "";



  private String email_id = "";



  private int backlogs = 0;



  private int percentage = 0;



    Student (String name, String email_id, int backlogs, int percentage)

  {



    this.name = name;



    this.email_id = email_id;



    this.backlogs = backlogs;



    this.percentage = percentage;



  }

  public String getName ()

  {



    return this.name;



  }



}





class StudentDB

{



  ArrayList < Student > studentarr;



  StudentDB ()

  {



    studentarr = new ArrayList <> ();



  }



  public void addStudent (Student std)

  {



    studentarr.add (std);



  }

  public ArrayList < Student > getList ()

  {



    return studentarr;



  }



}





public class StudentRecommender

{



  public static void main (String args[])

  {



    int num = 1;



    int i;



    StudentDB lol = new StudentDB ();



    String mname = "";



    String memail_id = "";



    int mbacklogs = 0;



    int mpercentage = 0;



    while (num == 1)



      {



	System.out.println

	  ("Enter name,email id, no. of backlogs and %age of student");



	Scanner obj = new Scanner (System.in);



	  mname = obj.nextLine ();



	  memail_id = obj.nextLine ();



	  mbacklogs = obj.nextInt ();



	for (i = 0; mbacklogs > 6; i++)



	  {



	    System.out.println

	      ("Student can't have more than 6 backlogs ,enter valid data");



	    mbacklogs = obj.nextInt ();



	  }



	mpercentage = obj.nextInt ();



	for (i = 0; mpercentage > 100; i++)



	  {



	    System.out.println ("Invalid percentage ,enter again");



	    mpercentage = obj.nextInt ();



	  }



	Student std = new Student (mname, memail_id, mbacklogs, mpercentage);



	if (mbacklogs == 0 && mpercentage > 60)



	  {



	    lol.addStudent (std);



	  }



	System.out.print

	  ("Enter 1 to add more students or enter 0 to display recommended students list");



	num = obj.nextInt ();



      }



    ArrayList < Student > hmm = new ArrayList <> ();



    hmm = lol.getList ();



  for (Student display:hmm)



      {



	System.out.println ("Recommended Students:");



	System.out.println (display.getName ());



      }



  }



}


