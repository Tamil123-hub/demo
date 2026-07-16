
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class except{
    public static void main(String[] args) throws IOException{
        Scanner s=new Scanner(System.in);
        DataInputStream d=new DataInputStream(System.in);
        //Arithmetic expression
        try {
            int b,a;
            System.out.println("Enter the divide number:");
            a=s.nextInt();
            b=20/a;
            System.out.println("Result:"+b);
        } catch (ArithmeticException e) {
            System.out.println("The number not divided by ZERO!!!"+e.getMessage());
        }
        //array
        try {
            char a[]={'a','e','i','o','u'};
            int d1;
            System.out.println("List of Vowels:");
            for(int i=0;i<=a.length;i++)
            {
                System.out.println(a[i]);
                if(i==4){
                    break;
                }
            }
            System.out.println("Enter the number 0-4:");
            d1=s.nextInt();
            System.out.println("Your Vowel Choice:"+a[d1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index number is does not exist!!");

        }
        //String
        try {
            String h;
            int j;
            System.out.println("Enter your words without gap:");
            h=s.next();
            System.out.println("Your word is "+h+" and the word length is:"+h.length());
            int l=h.length()-1;
            System.out.println("Enter the index number between 0-"+l);
            j=s.nextInt();
            System.out.println("Your selected letter of word is "+h.charAt(j));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Your index is not found in this words!!!");
        }
        //null
            
     
      try {
          String z;
            System.out.println("Enter:");
            z=s.nextLine();
            if(z.isBlank()||z.isEmpty()){
                z=null;
            }
            System.out.println("Given string is "+z+"and length is "+z.length());
      } catch (NullPointerException e) {
        System.out.println("Null Pointer occur!!");}
    //numberformat
    try {
        String e;
        System.out.println("Enter the String:");
        e=s.nextLine();
        System.out.println("Given String:"+Integer.parseInt(e));
    } catch (NumberFormatException e) {
        System.out.println("Error!!!!");
    }
    //illegal
    try {
        int year;
        System.out.println("Enter the year:");
        year=s.nextInt();
        if(year<0){
       throw new IllegalArgumentException("Error!!!");
        }
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+" is a LEAP YEAR!");
        }
        else{
            System.out.println(year+" is not a LEAP YEAR!");
        }
    } catch (IllegalArgumentException e) {
        System.out.println("Wrong argument passed!!");
    }
    try{
        System.out.println("File to read:");
        String file1=s.next();
        BufferedReader read=new BufferedReader(new FileReader(file1));
        System.out.println("File content:"+read.readLine());
    }
    catch(IOException e){
            System.out.println("File does not Exist!!");
    }

            }
}
