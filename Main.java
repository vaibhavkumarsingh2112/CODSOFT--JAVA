import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     System.out.println("  STUDENT GRADE CALCULATOR \n\n");
    Scanner sc=new Scanner(System.in);
    float phy,chem,bio,maths,comp,total,avgper;
    System.out.print("  Enter the marks of Physics: ");
    phy=sc.nextFloat();
    System.out.println();
    System.out.print("  Enter the marks of Chemistry: ");
    chem=sc.nextFloat();
    System.out.println();
    System.out.print("  Enter the marks of Biology: ");
    bio=sc.nextFloat();
    System.out.println();
      System.out.print("  Enter the marks of Mathematics: ");
    maths=sc.nextFloat();
    System.out.println();
    System.out.print("  Enter the marks of Computer: ");
    comp=sc.nextFloat();
    System.out.println();

    total=phy+chem+bio+maths+comp;
    avgper=total/5;

System.out.println("  Total Marks: "+total);
    System.out.println("  Average Percentage: "+avgper);

    
    if (avgper >= 90) {
        System.out.println("  Grade: A");
    } else if (avgper >= 80) {
        System.out.println("  Grade: B");
    } else if (avgper >= 70) {
        System.out.println("  Grade: C");
    } else if (avgper >= 60) {
        System.out.println("  Grade: D");
    } else if (avgper >= 40) {
        System.out.println("  Grade: E");
    } else {
        System.out.println("  Grade: F You Need To Work Hard");
    }
    
  }

}
