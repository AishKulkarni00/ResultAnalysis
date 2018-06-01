/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class test
{
    result a;
    public test() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        a=new result();
    }
    
    @After
    public void tearDown()
    {
    }

   
     @Test
     public void inputdetail()
     {
         assertEquals(1,a.inputdetail("anagha"));
          assertEquals(1,a.inputdetail(" "));
     }
     
      @Test
     public void inputmarks()
     {
         assertEquals(1,a.inputmarks(1,2,3,4,5,6));
         assertEquals(1,a.inputmarks(1,2,3,4,5,'a'));
     }
     
     
      @Test
     public void total()
     {
         assertEquals(50,a.total(10,10,10,10,10));
         assertEquals(100,a.total(10,20,30,20,20));
     }
     
     @Test
      public void classtopper()
     {
         assertEquals(100,a.classtopper(100,50));
         assertEquals(200,a.classtopper(70,200));
     }
      
      @Test
       public void classpass()
     {
         assertEquals(1,a.classpass(300));
          assertEquals(0,a.classpass(150));
     }
       
       @Test
         public void mathtopper()
     {
         assertEquals(100,a.mathtopper(100,50));
           assertEquals(70,a.mathtopper(20,70));
     }
         
         @Test
           public void mmctopper()
     {
         assertEquals(100,a.mmctopper(100,50));
         assertEquals(70,a.mmctopper(20,70));
     }
          
           @Test
             public void dbmstopper()
     {
         assertEquals(100,a.dbmstopper(100,50));
         assertEquals(70,a.dbmstopper(20,70));
     }
           
             @Test
               public void daatopper()
     {
         assertEquals(100,a.daatopper(100,50));
         assertEquals(70,a.daatopper(20,70));
     }
               
               @Test
                 public void ostopper()
     {
         assertEquals(100,a.ostopper(100,50));
         assertEquals(70,a.ostopper(20,70));
     }
                 
                 @Test
                 public void mathsubjpass()
                 {
                     assertEquals(0,a.mathsubjpass(56));
                     assertEquals(1,a.mathsubjpass(20));
                 }
                 
                 @Test
                  public void mmcsubjpass()
                 {
                     assertEquals(0,a.mmcsubjpass(56));
                     assertEquals(1,a.mmcsubjpass(20));
                 }
                  
                  @Test
                   public void daasubjpass()
                 {
                     assertEquals(0,a.daasubjpass(56));
                     assertEquals(1,a.daasubjpass(20));
                 }
                   
                   @Test
                    public void dbmssubjpass()
                 {
                     assertEquals(0,a.dbmssubjpass(56));
                     assertEquals(1,a.dbmssubjpass(20));
                 }
                    
                    @Test
                     public void ossubjpass()
                 {
                     assertEquals(0,a.ossubjpass(56));
                     assertEquals(1,a.ossubjpass(20));
                 }
}
