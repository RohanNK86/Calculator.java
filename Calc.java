import java.util.Scanner ;
     public class Calculator {
             public static void main(String [] args) {
                 Scanner in = new Scanner(System.in); 
                  int ans = 0;
                  
                  System.out.println("Enter the Operator :") ;
                  char op = in.next().trim().charAt(0) ;
                  System.out.println() ;
                  
         if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter the two numbers :") ;
                     int num1 = in.nextInt();
                     int num2 = in.nextInt();
                      System.out.println();
                      
                      if ( op == '+') {
                          ans = num1 + num2;
                     }   System.out.println("The sum is : " +ans) ;
                     
                      
                      if ( op == '-') {
                          ans = num1 - num2;
                      }
                      
                      if ( op == '*') {
                          ans = num1*num2;
                      }
                      
                      if ( op == '/') {
                          if ( num2 !=0) {
                              ans = num1/num2;
                          }
                      }
                            System.out.println(ans);
                          }
                      }
                      } 
