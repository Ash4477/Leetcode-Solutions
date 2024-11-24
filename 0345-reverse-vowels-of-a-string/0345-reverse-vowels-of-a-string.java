import java.util.ArrayList;
 class Solution 
 {
    public String reverseVowels(String s) 
    {
      StringBuilder builderstr = new StringBuilder(s);
      ArrayList <Character>  arr1= new ArrayList<>();
      ArrayList <Integer>  arr2=new ArrayList<>(); 
      for (int i=0;i<s.length();i++)
      {
        if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
        {
           arr1.add(s.charAt(i));
           arr2.add(i);
        }
        else if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
        { 
           arr1.add(s.charAt(i));
           arr2.add(i);
        }
      }
      for (int i=0;i<arr2.size();i++)
      {
          builderstr.setCharAt(arr2.get(i),arr1.get(arr1.size()-i-1));
      }
      String finalstr=builderstr.toString();
      return finalstr;
    }
    public static void main(String[] args) 
    {
      Solution obj=new Solution();
      String result=obj.reverseVowels("hemanths");
      System.out.print(result);
    }
  }