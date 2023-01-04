package com.Assignments;

class  Composite

{

       int imaginary , real;

       public Composite(int imaginary, int real)

       {
               imaginary = imaginary;
               real = real;
       }

 }

public class Main

{

       public static void main(String[] args)

       {

              Composite c = new Composite(786 , 999);

              System.out.println(c.imaginary + " "+  c.real);

       }
   }   
