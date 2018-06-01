class result {
        int i=0,j=0,n=0;
            private int sum=0;
            private int max;
            private int roll; 
            private int math;
            private int mmc;
            private int dbms;
            private int os;
            private int daa;
            private String name;
            private String topper;
            private int topperroll;
            private int p,p1,p2,p3,p4,p5;
            private int f,f1,f2,f3,f4,f5;
            private int mathmax;
            private String mathtopper;
            private int mathtopperroll;         
            private int mmcmax;
            private String mmctopper;
            private int mmctopperroll;
            private int osmax;
            private String ostopper;
            private int ostopperroll;
            private int dbmsmax;
            private String dbmstopper;
            private int dbmstopperroll;
            private int daamax;
            private String daatopper;
            private int daatopperroll;
            
    public int inputdetail(String a)
    {
                    name=a;
                    if(name==null )
                    
                    {
                        return 0;
                    }
                    else return 1;
                        
    }
    
              
    public int inputmarks(int a,int b,int c,int d,int e,int f)
    {
        roll=a;
        math=b;
        mmc=c;
        dbms=d;
        os=e;
        daa=f;
        if(roll>0 && math>=0 && mmc>=0 && dbms>=0 && os>=0 && daa>=0)
        {
            return 1;
        } 
        else return 0;
        
    }
    
      
            public int total(int a,int b,int c,int d,int e)
            {
               math=a;
               mmc=b;
               dbms=c;
               os=d;
               daa=e;
              
                   int sum=0;
                  sum=sum+(math +mmc +dbms+ os +daa);
             
                  return sum;
          
            }
            
            public int classtopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }

    public int classpass(int i) 
    {
        
            int sum=i;
            if(sum>175)
                return 1;
            else
                return 0;
    }
    
    public int mathtopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }
    
    public int mmctopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }
    
    public int dbmstopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }
    
    public int daatopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }
    
    public int ostopper(int s1,int s2)
            {
               int sum1=s1;
               int sum2=s2;
               
               if(sum1>sum2)
               {
                   return sum1;
               }
               else if(sum2>sum1)
                   return sum2;
               else 
                   return sum1;
               
              
             }
    
    

            public int mathsubjpass(int m)
            {
                 math = m;
           
                     if(math<35)
                     return 1;
                     else
                         return 0;

                }

            public int mmcsubjpass(int m)
            {
                 mmc = m;
           
                     if(mmc<35)
                     return 1;
                     else
                         return 0;

                }
            
            public int ossubjpass(int m)
            {
                 os = m;
           
                     if(os<35)
                     return 1;
                     else
                         return 0;

                }
            
            public int daasubjpass(int m)
            {
                 daa = m;
           
                     if(daa<35)
                     return 1;
                     else
                         return 0;

                }
            
            public int dbmssubjpass(int m)
            {
                 dbms = m;
           
                     if(dbms<35)
                     return 1;
                     else
                         return 0;

                }







	
            }
               
        

    

