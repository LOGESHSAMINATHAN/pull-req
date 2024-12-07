import java.util.Scanner;
class palin{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  Scanner obj = new Scanner(System.in);
  System.out.print("enter the number:"); 
  int n=obj.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
