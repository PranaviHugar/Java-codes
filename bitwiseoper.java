class bitwiseoper
{
    public static void main(String args[])
    {
        byte a=3; //0000 0011
        byte b=5; //0000 0101
        System.out.println("a&b="+(a&b));
        System.out.println("a|b="+(a|b));
        System.out.println("a^b="+(a&b));
        System.out.println("a<<2="+(a<<2));//signed left shift
        System.out.println("a>>2="+(a>>2));//signed right shift
        System.out.println("a>>>2="+(a>>>2));//unsigned right shift
    }
}
//byte is integer data type