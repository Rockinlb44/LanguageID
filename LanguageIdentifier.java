package languageidentifier;
import java.util.*;
import java.io.*;
/*
*   This java class file was created by Brett Husar, Logan Bowling, and Fedi. 
*   The main purpose of the program is to read an excerpt of text from either German, English, or Italian, and identify what language is being read.
*   ASCII code will be printed as well as letter frequencies, and finally the answer of either German, Italian, or English.
*   Chicago Cubs are your new 2016 World Series Champions!
*/
public class LanguageIdentifier 
{

    public static void main(String[] args) throws IOException
        {
            long start, stop, elapsed;
            Scanner myScanner = new Scanner(System.in);
            //initializing all variables. ints a-z and A-Z will store the number of times that given letter occurs within the excerpt of text.
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;
            int h = 0;
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            int m = 0;
            int n = 0;
            int o = 0;
            int p = 0;
            int q = 0;
            int r = 0;
            int s = 0;
            int t = 0;
            int u = 0;
            int v = 0;
            int w = 0;
            int x = 0;
            int y = 0;
            int z = 0;
            
            int A = 0;
            int B = 0;
            int C = 0;
            int D = 0;
            int E = 0;
            int F = 0;
            int G = 0;
            int H = 0;
            int I = 0;
            int J = 0;
            int K = 0;
            int L = 0;
            int M = 0;
            int N = 0;
            int O = 0;
            int P = 0;
            int Q = 0;
            int R = 0;
            int S = 0;
            int T = 0;
            int U = 0;
            int V = 0;
            int W = 0;
            int X = 0;
            int Y = 0;
            int Z = 0;
            
            /*
            int germansymbol = 0;
            int germansymbol = 0;
            int germansymbol = 0;
            int germansymbol = 0;
            int germansymbol = 0;
            int germansymbol = 0;
            int germansymbol = 0;
            
            int italiansymbol = 0;
            */
            
            //currentvalue is the current ASCII value that we will be using to manipulate our integers a-z and A-Z from above
            int currentvalue = 0;
            int cc = 0;
            start = System.currentTimeMillis();
            
            //asks user to input the text file name
            System.out.println("Please enter the name of your text file containing the excerpt. It should end in .txt");
            FileReader in = new FileReader(myScanner.nextLine());
            System.out.println("\nASCII values of each letter, space, period, exclamation point, question mark, etc. From start of excerpt to finish ");
            
            //looping through the given language text
            for(int ii = 0; ii < 100000; ii++)
                {
                    cc= in.read();
                    if(cc != -1)
                        {        
                            System.out.println(cc);
                            currentvalue = cc;
                
                            //updates each letters frequency within the text by checking the ASCII value and updated the variable.
                            if(currentvalue == 97)
                                {
                                    a = a + 1;
                                }
                    
                            if(currentvalue == 98)
                                {
                                    b = b + 1;
                                }
                    
                            if(currentvalue == 99)
                                {
                                    c = c + 1;
                                }
                    
                            if(currentvalue == 100)
                                {
                                    d = d + 1;
                                }
                    
                            if(currentvalue == 101)
                                {
                                    e = e + 1;
                                }
                    
                            if(currentvalue == 102)
                                {
                                    f = f + 1;
                                }
                    
                            if(currentvalue == 103)
                                {
                                    g = g + 1;
                                }
                            if(currentvalue == 104)
                                {
                                    h = h + 1;
                                }
                            if(currentvalue == 105)
                                {
                                    i = i + 1;
                                }
                            if(currentvalue == 106)
                                {
                                    j = j + 1;
                                }
                            if(currentvalue == 107)
                                {
                                    k = k + 1;
                                }
                            if(currentvalue == 108)
                                {
                                    l = l + 1;
                                }
                            if(currentvalue == 109)
                                {
                                    m = m + 1;
                                }
                            if(currentvalue == 110)
                                {
                                    n = n + 1;
                                }
                            if(currentvalue == 111)
                                {
                                    o = o + 1;
                                }
                            if(currentvalue == 112)
                                {
                                    p = p + 1;
                                }
                            if(currentvalue == 113)
                                {
                                    q = q + 1;
                                }
                            if(currentvalue == 114)
                                {
                                    r = r + 1;
                                }
                            if(currentvalue == 115)
                                {
                                    s = s + 1;
                                }
                            if(currentvalue == 116)
                                {
                                    t = t + 1;
                                }
                            if(currentvalue == 117)
                                {
                                   u = u + 1;
                                }
                            if(currentvalue == 118)
                                {
                                    v = v + 1;
                                }
                            if(currentvalue == 119)
                                {
                                    w = w + 1;
                                }
                            if(currentvalue == 120)
                                {
                                    x = x + 1;
                                }
                            if(currentvalue == 121)
                                {
                                    z = z + 1;
                                }
                            if(currentvalue == 65)
                                {
                                    A = A + 1;
                                }
                    
                            if(currentvalue == 66)
                                {
                                    B = B + 1;
                                }
                    
                            if(currentvalue == 67)
                                {
                                    C = C + 1;
                               }
                    
                            if(currentvalue == 68)
                                {
                                    D = D + 1;
                                }
                    
                            if(currentvalue == 69)
                                {
                                    E = E + 1;
                                }
                    
                            if(currentvalue == 70)
                                {
                                    F = F + 1;
                                }
                    
                            if(currentvalue == 71)
                                {
                                    G = G + 1;
                                }
                            if(currentvalue == 72)
                                {
                                    H = H + 1;
                                }
                            if(currentvalue == 73)
                                {
                                    I = I + 1;
                                }
                            if(currentvalue == 74)
                                {
                                    J = J + 1;
                                }
                            if(currentvalue == 75)
                                {
                                    K = K + 1;
                                }
                            if(currentvalue == 76)
                                {
                                    L = L + 1;
                                }
                            if(currentvalue == 77)
                                {
                                    M = M + 1;
                                }
                            if(currentvalue == 78)
                                {
                                    N = N + 1;
                                }
                            if(currentvalue == 79)
                                {
                                    O = O + 1;
                                }
                            if(currentvalue == 80)
                                {
                                    P = P + 1;
                                }
                            if(currentvalue == 81)
                                {
                                    Q = Q + 1;
                                }
                            if(currentvalue == 82)
                                {
                                    R = R + 1;
                                }
                            if(currentvalue == 83)
                                {
                                    S = S + 1;
                                }
                            if(currentvalue == 84)
                                {
                                    T = T + 1;
                                }
                            if(currentvalue == 85)
                                {
                                   U = U + 1;
                                }
                            if(currentvalue == 86)
                                {
                                    V = V + 1;
                                }
                            if(currentvalue == 87)
                                {
                                    W = W + 1;
                                }
                            if(currentvalue == 88)
                                {
                                    X = X + 1;
                                }
                            if(currentvalue == 89)
                                {
                                    Y = Y + 1;
                                }
                            if(currentvalue == 90)
                                {
                                    Z = Z + 1;
                                }
                        }
                }
            
            //Prints the letter frequencies
            System.out.println("a: " + a);
            System.out.println("b: " +b);
            System.out.println("c: " +c);
            System.out.println("d: " +d);
            System.out.println("e: " +e);
            System.out.println("f: " +f);
            System.out.println("g: " +g);
            System.out.println("h: " +h);
            System.out.println("i: " +i);
            System.out.println("j: " +j);
            System.out.println("k: " +k);
            System.out.println("l: " +l);
            System.out.println("m: " +m);
            System.out.println("n: " +n);
            System.out.println("o: " +o);
            System.out.println("p: " +p);
            System.out.println("q: " +q);
            System.out.println("r: " +r);
            System.out.println("s: " +s);
            System.out.println("t: " +t);
            System.out.println("u: " +u);
            System.out.println("v: " +v);
            System.out.println("w: " +w);
            System.out.println("x: " +x);
            System.out.println("y: " +y);
            System.out.println("z: " +z);
                        
            System.out.println("A: " +A);
            System.out.println("B: " +B);
            System.out.println("C: " +C);
            System.out.println("D: " +D);
            System.out.println("E: " +E);
            System.out.println("F: " +F);
            System.out.println("G: " +G);
            System.out.println("H: " +H);
            System.out.println("I: " +I);
            System.out.println("J: " +J);
            System.out.println("K: " +K);
            System.out.println("L: " +L);
            System.out.println("M: " +M);
            System.out.println("N: " +N);
            System.out.println("O: " +O);
            System.out.println("P: " +P);
            System.out.println("Q: " +Q);
            System.out.println("R: " +R);
            System.out.println("S: " +S);
            System.out.println("T: " +T);
            System.out.println("U: " +U);
            System.out.println("V: " +V);
            System.out.println("W: " +W);
            System.out.println("X: " +X);
            System.out.println("Y: " +Y);
            System.out.println("Z: " +Z);                  
            
            stop = System.currentTimeMillis();
            elapsed = stop - start;
            System.out.println("\nTime in milliseconds: " + elapsed +" milliseconds");
            System.out.println("\nTime in seconds: " + elapsed / 1000 + " seconds");
            
        }
}
            /*
           counter = ;
            do
            {
                System.out.println(c);
                c = in.read();
                counter++;
            }
            
            while(counter <10);
            */  