import java.util.*;
public class stringD1{
    public static void main(String[] args) {
        //Q1. take a String from user and count  no of upper, lower and number count .
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the String");
        //  String s1=sc.nextLine();
        //  int upperValue=0,lowerValue=0, numberCount=0;
        //  for(int i=0;i<s1.length();i++)
        //  {
        //     char c=s1.charAt(i);

        //     if(c>='A'&& c<='Z')
        //     {
        //         upperValue++;
        //     }
        //     if(c>='a' && c<='z')
        //     {
        //         lowerValue++;
        //     }
        //     if(c>='0' && c<='9')
        //     {
        //         numberCount++;
        //     }
        //  }

        //  System.out.println("upper case alphabets are :"+upperValue);
        //  System.out.println("lower case alphbets are:"+lowerValue);
        //  System.out.println("total numbers are :"+numberCount);


        



            // Q2. convert a sgtroing to uppercase without inbuilt method.

            // String s1="Lal Bahadur Sastri";

            // String s2="";
            // for(int i=0;i<s1.length();i++)
            // {
            //     char c=s1.charAt(i);
            //     if(c>='a' && c<='z')
            //     {
            //         s2=s2+(char) (c-32);
            //     }
            //     else{
            //         s2+=c;
            //     }
                
            // }
            // System.out.println(s2);
            
                




        //Q3. take a senetence input from user and print first charracter of every word.


                // Scanner sc=new Scanner(System.in);
                // System.out.println("Enter the sentence");
                // s1=sc.nextLine();






        // Q4. WAJP to reverse a string.

                // String s1="Rohan";
                // char c[];


        // Q5. WAJP to convert the char Array to String.

        // char c[]={'w','o','r','d'};
        // String s1="";
        // for(int i=0;i<c.length;i++)
        // {
        //     s1+=c[i];
        // }
        // System.out.println(s1);


        // Q5 b) convert the string to char

            // String s1="arman";
            // char c[]=new char[s1.length()];
            // for(int i=0;i<s1.length();i++)
            // {
            //     c[i]=s1.charAt(i);
            //      System.out.print(c[i]);

            // }
           



        // Q6. WAJP to to count the number of words in a sentence 

            // String s1="I am Tasneem aamir from ambedkarnagar";


                 









        // Q8. Take a String input and count no of char present with even ascii value

                // String s1="Siddharth";
                // char c[]=new char[s1.length()];

                // int count=0;
                // for(int i=0;i<s1.length();i++)
                // {   
                //     c[i]=s1.charAt(i);
                //     if(c[i]>='a' && c[i]<='z')
                //     {   
                //         c[i]=(char)(c[i]-32);
                //     }else{
                //     c[i]=(char)(c[i]);
                // }
                //     if(c[i]%2==0)
                //     {
                //         count++;
                //         System.out.println("This character ("+c[i]+") has a even ascii value");
                //     }
                //     else{
                //         System.out.println("This character ("+c[i]+") has not even ascii value");
                //     }
                // }
                
                //     System.out.println("No of character which have even ascii value: "+count);



        // Q9. print first half pf string in upper case and second half in lower case

                // String s1="Shahroze";
                // char c[]=new char[s1.length()];
                // for(int i=0;i<s1.length()/2;i++)
                // {
                //     c[i]=s1.charAt(i);
                //     if(c[i]>='a' && c[i]<='z')
                //     {
                //         c[i]=(char)(c[i]-32);
                //     }
                //     else{
                //         c[i]=(char)(c[i]);
                //     }
                //     System.out.println(c[i]);
                // }
                // for(int i=s1.length()/2;i<s1.length();i++)
                // {
                //     c[i]=s1.charAt(i);
                //     if(c[i]>='A' && c[i]<='Z')
                //     {
                //         c[i]=(char)(c[i]+32);
                //     }
                //     else
                //     {
                //         c[i]=(char)(c[i]);
                //     }
                //     System.out.println(c[i]);
                // }












        // Q11 Print if char is in odd index make it as lowercase and if the char is in even index 
        // then make it as uppercase.


        // String s1="Patel nagar";

        // char c[]=new char[s1.length()];

        // for(int i=0;i<s1.length();i++)
        // {
        //     c[i]=s1.charAt(i);
            
        //     if(i%2==0)
        //     {
        //         if(c[i]>='a' && c[i]<='z')
        //         {
        //             c[i]=(char)(c[i]-32);
        //         }
        //         else{
        //             c[i]=(char)(c[i]);
        //         }
        //     }
        //     else
        //     {
        //         if(c[i]>='A' && c[i]<='Z')
        //         {
        //             c[i]=(char)(c[i]+32);
        //         }
        //     }
        //     System.out.println(c[i]);
        // }
                




        




    // Q12 Write a program to find the sum of numbers in an ALPHA NUMERIC STRING.



    // String s1="Aamir123";

    // char c[]=new char[s1.length()];
    // int sum=0;
    // for(int i=0;i<s1.length();i++)
    // {
    //     c[i]=s1.charAt(i);
    //     if(c[i]>='0' && c[i]<='9')
    //     {   

    //         sum=sum+(c[i]-48);
    //     }
        
    // }
    // System.out.println(sum);
    












    // Q13.WAP to print frequency of each character in a string.
    
    
        // String s1="banana";

        // String visited="";
        // for(int i=0;i<s1.length();i++)
        // {
        //     char c=s1.charAt(i);
            
        //     if(!visited.contains(c+""))
        //     {
        //         int count=0;
        //         for(int j=i;j<s1.length();j++)
        //         {
        //             if(s1.charAt(j)==c)
        //             {
        //                 count++;
        //             }
                    
        //         }
        // // here we print the character
        //         System.out.println(c+"->"+count);
        //             visited +=c;
        //     }


            
        // }





// Q15. WAP to printmaximum occuering character in a string


            String s1="banana";
            String visited="";

            for(int i=0;i<s1.length();i++)
            {
                char c=s1.charAt(i);
                if(!visited.conatines(c+""))
                
                {
                    int count=0;
                    for()
                }
            }












    // Q16. WAP  for the corresponding output (same as question 13)here we store the output in a string and print that string

        String s1="banana";

        String visited="";
        String res="";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            
            if(!visited.contains(c+""))
            {
                int count=0;
                for(int j=i;j<s1.length();j++)
                {
                    if(s1.charAt(j)==c)
                    {
                        count++;
                    }
                    
                }
                // here we store the output in a string and print that string
                    res+=(""+c+count);
                    visited +=c;
            }
           


            
        } System.out.println(res);















    }
}