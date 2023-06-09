package ClassIX;

/* name of class - Student
 * member variable - roll, name
 * member method - default constructor, initialize member variable with your roll name
 * void show() - ti display roll and name        */
 
 class Student
 {int roll;
     String name;
     public Student()
     {roll = 21;
         name = "Pinaki";
        }
        
        public void show()
        {System.out.println(roll + "\t" + name);
        }
        
        public static void main(String args[])
        {Student ob = new Student();
            ob.show();
        }
    }