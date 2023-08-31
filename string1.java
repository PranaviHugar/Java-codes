class string1 
{
  public static void main(String[] args) 
  {

    String h="gobblesticks";
    char h1[]=new char[h.length()-5];
    h.getChars(0,h.length()-5,h1,0);
    System.out.println("using getChars():");
    for(int i=0;i<h1.length;i++)
    {
        System.out.println(h1[i]);  
    }
    char h2[]=new char[h.length()];
    h2=h.toCharArray();
    System.out.println("\n\nusing toChar():");
    for(int i=0;i<h2.length;i++)
    {
        System.out.println(h2[i]);  
    }  
    System.out.println("\n\n h.substring(3,7):"+h.substring(3,7));  

  }
}