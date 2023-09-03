class narrowing1
{
    public static void main (String[] args)
    {
        int x = (int)2.2323;//
        System.out.println(x);//
        char ch1 = (int)98;//
        char ch2 = (int)33;//
        System.out.println(ch2);//
        System.out.println(ch1);//
        char ch3 = (int)34;//
        System.out.println(ch3);//
        char ch4 = (int)35;
        System.out.println(ch4);//
        byte b = (short)2;
        System.out.println(b);
        short s = (byte)2.3333;
        System.out.println(s);
        long l = (short)1200;
        System.out.println(l);
        float f = (int)2.2;
        System.out.println(f);
        byte b1 = (short)111;
        System.out.println(b1);
        int num = (char)321;
        System.out.println(num);
        char ch6 =(int)1;
        System.out.println(ch6);
        float a =(char)5;
        System.out.println(a);
        double d =(char)10;
        System.out.println(d);
        long l1 =(long)23.2f;
        System.out.println(l1);
        int i=10;
        int ans = i='k';
        System.out.println(ans);
         
    
         
    }
}