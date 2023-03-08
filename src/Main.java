import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        int nums[]=new int[4];
//         nums[0]=2;
//         nums[1]=4;
//         nums[2]=8;
//         nums[3]=8;
//
//        // for(int i=0;i<4;i++){
//             System.out.println(nums.length);
//       //  }
//        System.out.println("Hello world!");
//        int nums[][]=new int[3][4];
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//
//                nums[i][j]=(int)(Math.random()*10);
//                System.out.print(nums[i][j]+ " ");
//            }
//            System.out.println();
//
//        }
//        for(int n[] : nums){
//            for(int m:n){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//        int nums[][] = new int[3][]; //jagged array
//        //jagged means we dont need to specify columns. what if we want different size for internal array
//        nums[0]=new int[3];
//        nums[1]=new int[4];
//        nums[2]=new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums[i].length;j++){
//                nums[i][j]=(int)(Math.random()*10);
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();

        Students s1 = new Students();
        s1.rollno=1;
        s1.name="Hari";
        s1.marks=88;
        Students s2=new Students();
        s2.rollno=2;
        s2.name="Srikanth";
        s2.marks=97;
        Students s3=new Students();
        s3.rollno=3;
        s3.name="Vijaya";
        s3.marks=86;
        Students students[]=new Students[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " " + students[i].marks);
        }

        System.out.println();
        for(Students stud:students){
            System.out.println(stud.name + " : " +stud.marks);
        }
        }

//        for(int n[]:nums){
//            for(int m:n){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
//    }
}