package SecondRepo;
public class Recursion {

    static void CallFunc(int n, int i1) {
        int i = i1;
        if (i == n) {
            return;
        } else {
            System.out.println("I am number: " + (i + 1));
            CallFunc(n, i + 1);
        }
    }


    static int SumArray(int[] arr, int i1, int n)
    {
        int sum=0;
        int i=i1;
        if(i==n)
        {
            return 0;
        }
        else{
            sum= arr[i] +SumArray(arr,i+1, n);
            return sum;
            
        }

    }



    static int Pallin(char str[], int s, int e)
    {
      if (s>=e) {
        return 1;
      }
      if (str[s]!=str[e]) {
        return 0;
      }

      return Pallin(str, s+1, e-1);

    }


    public static void main(String[] args) {
        int n = 5;
        CallFunc(n, 0);
        int []arr= new int[5];
        arr[0]=12;
        arr[1]=34;
        arr[2]=13;
        arr[3]=22;
        arr[4]=12;
      int d=  SumArray(arr,0, 5);
      System.out.println("sum is "+d);

      String str= "Rohan";
      char ch[]= str.toCharArray();
      int length= str.length();
      int s=0;
      int e= length-1;
      int a =Pallin(ch, s, e);
      System.out.println(a);
    }
}
