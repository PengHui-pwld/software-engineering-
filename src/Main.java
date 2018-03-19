import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Main { 
    
    public static void main(String args[])
    { 
    	class ab 
        {
            String f()
            {
            	int k;
            	String p1 = "";
            	switch(k=(int)(Math.random()*4))
        	   	{
		        	   case 0:
		                   {
		                 	   p1="+";
		                 	  
		                    }
		                   break;
		        	   	case 1:
		                {
		             	   p1="-";
		             	  
		                }
		                break;
		        	   	case 2:
		                {
		             	   p1="*";
		             	  
		                }
		                break;
		        	   	case 3:
		                {
		                	
		             	   p1="/";
		             	  
		                }
		                break;
        	   	}
                return p1;
            	
            }
        }
    	
    	   String a,b,a1,b1;
    	   String c,d,e,f;
           int k;
           int N = 0;
           int writer=0;
           ab L=new ab();
           System.out.println("Pleae Input Number："); 
           Scanner sc = new Scanner(System.in);
          
		      try {
		
		           N = sc.nextInt();
		           
		      }catch (InputMismatchException r) {
		      	   
		    	    System.out.println("输入有误！");
		    	
		    	}
           
           for(int n=0;n<N;n++)
           {
              
               int i=(int)(Math.random()*10);
               int j=(int)(Math.random()*10)+1;
               int l=(int)(Math.random()*10)+1;
               int m=(int)(Math.random()*10)+1;
               int o=(int)(Math.random()*10)+1;
               int count;
               
               String L2,L3,L4,L5;
               String p1,p2,p3,p4;
               a1=String.valueOf(i);
        	   b1=String.valueOf(j);
        	   c=String.valueOf(l);
        	   d=String.valueOf(m);
        	   e=String.valueOf(o);
        	   L2=L.f();
        	   L3=L.f();
        	   L4=L.f();
        	   L5=L.f();
        	   
      try {
        		      //如果文件存在，则追加内容；如果文件不存在，则创建文件
        		      File f1 = new File("result.txt");
        		      FileWriter fw = new FileWriter(f1, true);
        		 
        		      PrintWriter pw = new PrintWriter(fw);
        		      if(writer==0)
        		      {
        		    	  pw.println("201571030124  彭辉");
        		    	  writer=1;
        		      }
        		      //java数据，可以转成json字符串存储
      	
           switch((int)(Math.random()*3))
              {
               case 0://三个数字
            	   
            	   p1=a1+L2+b1+L3+c;
            	   count=arithmetic(p1);
            	   if(INT(count))
            	   {
            		   if(L2!="/"&&L3!="/")
                	   {
                		    System.out.println(p1+"=");
             	   			//System.out.println("答案："+arithmetic(p1));
             	   			pw.println(p1+"="+arithmetic(p1));
             	   			break;
                	   }
                	   else
                	   {  
                		   int m1=(int)(Math.random()*10);
                           int o1=(int)(Math.random()*10)+1;
                           int m2=(int)(Math.random()*10)+1;
                           int m3=(int)(Math.random()*10);
                           if(L2=="/")
                           {
                        	   m1=m3*o1;
                           }
                           if(L3=="/")
                           {
                        	   o1=m2*m3;
                           }
                           if(m1>=o1&&o1>=m2&&m1/o1>=m2)
                           {
                        	   count=arithmetic(m1+L2+o1+L3+m2+"");
                               if(INT(count))
                               {
                               	System.out.println(m1+L2+o1+L3+m2+"=");
                   	   			//System.out.println("答案："+arithmetic(m1+L2+o1+L3+m2+""));
                   	   			pw.println(m1+L2+o1+L3+m2+"="+arithmetic(m1+L2+o1+L3+m2+""));
                               }
                               else
                               	N=N+1;
                           }
                           else
                              	N=N+1;
                            
                	   }
            	   }
            	   else
                   	N=N+1;
           			
            	   	break;
               case 1://四个数字
                    p2=a1+L2+b1+L3+c+L4+d;
                    count=arithmetic(p2);
                    if(INT(count))
                    {
                    if(L2!="/"&&L3!="/"&&L4!="/")
                    {
                    	System.out.println(p2+"=");
         	   			//System.out.println("答案："+arithmetic(p2));
         	   			pw.println(p2+"="+arithmetic(p2));
         	   			break;
                    }
                    else
             	   {  
                    	int m1=(int)(Math.random()*10);
                        int o1=(int)(Math.random()*10)+1;
                        int m2=(int)(Math.random()*10)+1;
                        int m3=(int)(Math.random()*10);
                        int m4=(int)(Math.random()*10)+1;
                        
                        if(L2=="/")
                        {
                     	   m1=m3*o1;
                        }
                        if(L3=="/")
                        {
                     	   o1=m2*m3;
                        }
                        if(L4=="/")
                        {
                     	   m2=m3*m4;
                        }
                        if(m1>=o1&&o1>=m2&&m2>=m4&&m1/o1>=o1/m2&&m1/o1/m2>=m4)
                        {
                        	count=arithmetic(m1+L2+o1+L3+m2+L4+m4+"");
                            if(INT(count))
                            {
                            	System.out.println(m1+L2+o1+L3+m2+L4+m4+"=");
                	   			//System.out.println("答案："+arithmetic(m1+L2+o1+L3+m2+L4+m4+""));
                	   			pw.println(m1+L2+o1+L3+m2+L4+m4+"="+arithmetic(m1+L2+o1+L3+m2+L4+m4+""));
                	   			break;
                            }
                            else
                            	N=N+1;
                        }
                        else
                        	N=N+1;
              
             	   	}
                   }
                    else
                    	N=N+1;
             	   	break;
            	
               case 2://五个数字
            	   p3=a1+L2+b1+L3+c+L4+d+L5+e;
            	   count=arithmetic(p3);
            	   if(INT(count))
            	   {
            		   if(L2!="/"&&L3!="/"&&L4!="/"&&L5!="/")
                       {
                       		System.out.println(p3+"=");
            	   			//System.out.println("答案："+arithmetic(p3));
            	   			pw.println(p3+"="+arithmetic(p3));
            	   			break;
                       }
                       else
                	   {  
                    	   int m1=(int)(Math.random()*10);
                           int o1=(int)(Math.random()*10)+1;
                           int m2=(int)(Math.random()*10)+1;
                           int m3=(int)(Math.random()*10);
                           int m4=(int)(Math.random()*10)+1;
                           int m5=(int)(Math.random()*10)+1;
                           if(L2=="/")
                           {
                        	   m1=m3*o1;
                           }
                           if(L3=="/")
                           {
                        	   o1=m2*m3;
                           }
                           if(L4=="/")
                           {
                        	   m2=m3*m4;
                           }
                           if(L5=="/")
                           {
                        	   m4=m3*m5;
                           }
                           if(m1>=o1&&o1>=m2&&m2>=m4&&m4>=m5&&m1/o1>=o1/m2&&(m1/o1)/(o1/m2)>=m5)
                           {
                        	   count=arithmetic(m1+L2+o1+L3+m2+L4+m4+L5+m5+"");
                               if(INT(count))
                               {
                               	System.out.println(m1+L2+o1+L3+m2+L4+m4+L5+m5+"=");
                   	   			//System.out.println("答案："+arithmetic(m1+L2+o1+L3+m2+L4+m4+L5+m5+""));
                   	   			pw.println(m1+L2+o1+L3+m2+L4+m4+L5+m5+"="+arithmetic(m1+L2+o1+L3+m2+L4+m4+L5+m5+""));
                   	   			break;
                               }
                               else
                            	   N=N+1;
                           }
                           else
                        		N=N+1;
                	   }
            	   }
            	   else
                   	N=N+1;
            	   break;
                 
                 }
     		      pw.flush();
			      pw.close();
			      fw.close();
			    } catch (IOException e1) {
			      e1.printStackTrace();
			    }

           }
      
    }
          
   
    public static boolean INT(int input){  
    	 if (input <0)
             return false;

    	 else
             return true;
    }  

    public static int arithmetic(String exp)
    { 
        String result = parseExp(exp).replaceAll("[\\[\\]]", ""); 
        return (int)Double.parseDouble(result); 
    } 


    public static String parseExp(String expression)
    { 
        expression=expression.replaceAll("\\s+", "").replaceAll("^\\((.+)\\)$", "$1"); 
        String checkExp="\\d"; 
        String minExp="^((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\+\\-\\*\\/]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))$"; 
        //最小表达式计算 
        if(expression.matches(minExp))
        { 
            String result=calculate(expression); 
             
            return Double.parseDouble(result)>=0?result:"["+result+"]"; 
        } 
        //计算不带括号的四则运算 
        String noParentheses="^[^\\(\\)]+$"; 
        String priorOperatorExp="(((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\*\\/]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\])))"; 
        String operatorExp="(((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\]))[\\+\\-]((\\d+(\\.\\d+)?)|(\\[\\-\\d+(\\.\\d+)?\\])))"; 
        if(expression.matches(noParentheses)){ 
            Pattern patt=Pattern.compile(priorOperatorExp); 
            Matcher mat=patt.matcher(expression); 
            if(mat.find()){ 
                String tempMinExp=mat.group(); 
                expression=expression.replaceFirst(priorOperatorExp, parseExp(tempMinExp)); 
            }else{ 
                patt=Pattern.compile(operatorExp); 
                mat=patt.matcher(expression); 
                 
                if(mat.find()){ 
                    String tempMinExp=mat.group(); 
                    expression=expression.replaceFirst(operatorExp, parseExp(tempMinExp)); 
                } 
            } 
            return parseExp(expression); 
        } 
        return parseExp(expression); 
    } 
    
    public static String calculate(String exp){ 
        exp=exp.replaceAll("[\\[\\]]", ""); 
        String number[]=exp.replaceFirst("(\\d)[\\+\\-\\*\\/]", "$1,").split(","); 
        BigDecimal number1=new BigDecimal(number[0]); 
        BigDecimal number2=new BigDecimal(number[1]); 
        BigDecimal result=null; 
          
        String operator=exp.replaceFirst("^.*\\d([\\+\\-\\*\\/]).+$", "$1"); 
        if("+".equals(operator)){ 
            result=number1.add(number2); 
            
        }else if("-".equals(operator)){ 
            result=number1.subtract(number2); 
        }else if("*".equals(operator)){ 
            result=number1.multiply(number2); 
        }else if("/".equals(operator)){ 
            result=number1.divide(number2,2, BigDecimal.ROUND_HALF_EVEN); 
        } 
       
        return result!=null?result.toString():null; 
      
        
    } 
} 