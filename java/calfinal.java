import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class calfinal extends Frame implements ActionListener,ItemListener,TextListener,FocusListener,MouseMotionListener,Runnable
{
		Thread t;
		static GregorianCalendar gc;
        static Calendar c;
        static calfinal calfinal;
        static Calendar call;
        static int n=2;
        static int con_mon=0;
        static int total=31;
        static int select_list=0;
        static int int_year=2007,int_date=1;
        static String str_mon="JANUARY";
        static String str_date="1";
        static String str_year="2007";
        Font fhead=new Font("Arial",Font.BOLD,20);
        Font flower1=new Font("TYPE1_FONT",Font.PLAIN,13);
        Font flower2=new Font("TYPE1_FONT",Font.PLAIN,13);
        Frame mainf;
        String heading="CALENDAR - ";
        String shead="",ssmonth="MONTH : ",syear="YEAR : ",sdate="DATE : ";
        String smonth[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String sweek[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String sampm[]={"AM","PM"};
        int month31[]={0,2,4,6,7,9,11};
        int month30[]={1,3,5,8,10};
      	Label lhead,lmonth,lyear,ldate,ltime;
        Label l_hur,l_min,l_sec,l_date,l_mm,l_yr,l_ampm;
                
        Panel phead,pmonth_year,pweek,pbutton,ptime,pdate;
        Panel pd1,pd2,pd3,pd4,pd5,pd6,pd7,pd8,pd9,pd10,pd11,pd12;
        java.awt.Choice monthlist,yearlist,datelist;
        Button bprev,bnext,bexit;
        public void run()
        {
        		try
        		{
        			for(int itime=0;;itime++)	
        			{
        					Calendar cal_time=Calendar.getInstance();
        				
        					l_date.setText(Integer.toString(cal_time.get(Calendar.DATE))+"-");
        					l_mm.setText(smonth[cal_time.get(Calendar.MONTH)]+"-");
        					l_yr.setText(Integer.toString(cal_time.get(Calendar.YEAR)));
        					l_hur.setText(Integer.toString(cal_time.get(Calendar.HOUR_OF_DAY))+" :");
        					l_min.setText(Integer.toString(cal_time.get(Calendar.MINUTE))+" :");
        					l_sec.setText(Integer.toString(cal_time.get(Calendar.SECOND)));
        					l_ampm.setText(sampm[cal_time.get(Calendar.AM_PM)]);
        					Thread.sleep(1000);
        					
        			}
                        }catch(Exception ie){}
        		
        }
        public calfinal() throws Exception
        {
        		l_hur=new Label("",Label.RIGHT);
                l_min=new Label("",Label.CENTER);
                l_sec=new Label("",Label.LEFT);
                l_ampm=new Label("",Label.LEFT);
                l_date=new Label("",Label.RIGHT);
                l_mm=new Label("",Label.CENTER);
                l_yr=new Label("",Label.LEFT);
                t=new Thread(this);
        		t.start();
        		call=Calendar.getInstance();
        		pd1=new Panel();
        		pd2=new Panel();
        		pd3=new Panel();
        		pd4=new Panel();
        		pd5=new Panel();
        		pd6=new Panel();
        		pd7=new Panel();
        		pd8=new Panel();
        		pd9=new Panel();
        		pd10=new Panel();
        		pd11=new Panel();
        		pd12=new Panel();
        		ptime=new Panel();
        		ltime=new Label("",Label.RIGHT);
        		ltime.setForeground(Color.blue);
                mainf =new Frame(heading);
                mainf.setLayout(new GridLayout(16,1));
                mainf.setSize(800,900);
                mainf.setVisible(true);
                mainf.setState(Frame.MAXIMIZED_BOTH);
                //panel time
                /*pd2.setLayout(new GridLayout(1,3,80,0));
                ltime.setText(Integer.toString(call.get(Calendar.DATE))+"-"+smonth[call.get(Calendar.MONTH)]+"-"+Integer.toString(call.get(Calendar.YEAR))+" "+Integer.toString(call.get(Calendar.HOUR))+":"+Integer.toString(call.get(Calendar.MINUTE))+":"+Integer.toString(call.get(Calendar.SECOND))+" "+sampm[call.get(Calendar.AM_PM)]);
                pd2.add(pd1);
                pd2.add(ltime);
                pd2.add(pd3); */ //commt
                //HEAD PANEL
                phead=new Panel();
                //phead.setBackground(Color.cyan);
                lhead=new Label(shead,Label.CENTER);
                lhead.setFont(fhead);            
                lhead.setForeground(Color.magenta);    
                phead.setFont(fhead);            
                phead.add(lhead);
                mainf.add(pd1);
                mainf.add(phead);
                mainf.add(pd2);
                //month_year panel
                pmonth_year=new Panel();
                pmonth_year.setLayout(new GridLayout(1,8));
                pmonth_year.setForeground(Color.red);
                String sdf;
                sdf=ssmonth;
                ldate=new Label(sdate,Label.CENTER);
                pmonth_year.add(ldate);
                date_list();
                datelist.select(int_date-1);
                datelist.addItemListener(this);
                pmonth_year.add(datelist);
                lmonth=new Label(sdf,Label.RIGHT);
                lmonth.setFont(flower2);
                pmonth_year.add(lmonth);
                month_list();
                monthlist.select(select_list);
                monthlist.addItemListener(this);
                pmonth_year.add(monthlist);
                lyear=new Label(syear,Label.RIGHT);
                lyear.setFont(flower1);
                year_list();
                yearlist.select(int_year-1980);
                yearlist.addItemListener(this);
                //date
                pdate=new Panel();
                pdate.setLayout(new GridLayout(1,3));
                pdate.add(l_date);
                pdate.add(l_mm);
                pdate.add(l_yr);
                
                //time
                
                ptime.setLayout(new GridLayout(1,4));
                ptime.add(l_hur);
                ptime.add(l_min);
                ptime.add(l_sec);
                ptime.add(l_ampm);
                pmonth_year.add(lyear);
				
         
                pmonth_year.add(yearlist);
                pmonth_year.add(pdate);
                pmonth_year.add(ptime); 				             
                mainf.add(pmonth_year);
                mainf.add(pd3);
                //week panel
                pweek=new Panel();
                pweek.setLayout(new GridLayout(1,7));
                week_panel();
                mainf.add(pweek);
                mainf.add(pd4);

                //day panel
                day_panel();

                //button panel
                pbutton=new Panel();
                pbutton.setLayout(new GridLayout(1,5,20,0));
                        bprev=new Button("PREVIOUS");
                        bexit=new Button("EXIT");
                        bnext=new Button("NEXT");
                        bexit.addActionListener(this);
                        bprev.addActionListener(this);
                        bnext.addActionListener(this);
                        bprev.setBackground(Color.blue);
                        bprev.setForeground(Color.white);
                        bnext.setBackground(Color.blue);
                        bnext.setForeground(Color.white);
                        bexit.setBackground(Color.blue);
                        bexit.setForeground(Color.white);
                        bprev.addFocusListener(this);
                        bnext.addFocusListener(this);
                        bexit.addFocusListener(this);
                        bprev.addMouseMotionListener(this);
                        bnext.addMouseMotionListener(this);
                        bexit.addMouseMotionListener(this);
                pbutton.add(pd7);
                pbutton.add(bprev);
                pbutton.add(bexit);
                pbutton.add(bnext);
                pbutton.add(pd10);
                //footer
                Label lfoot1=new Label("(c)copyrights reserved.",Label.CENTER);
                Label lfoot2=new Label("",Label.CENTER);
                lfoot1.setForeground(Color.magenta);
                lfoot2.setForeground(Color.magenta);
                
                pd6.setLayout(new GridLayout(1,1));
                pd6.add(lfoot1);
                pd11.setLayout(new GridLayout(1,1));
                pd11.add(lfoot2);
                mainf.add(pbutton);
                mainf.add(pd6);
                mainf.add(pd11);
                mainf.add(pd2);               
                mainf.setCursor(HAND_CURSOR);
                mainf.setState(MAXIMIZED_BOTH);
               
        }
        public void date_list()
        {
        		datelist=new java.awt.Choice();
                        for(int i=1;i<=total;i++)
                datelist.add(Integer.toString(i));
        }
        public void month_list()
        {
        		int ili,klk=0;
                monthlist=new java.awt.Choice();
                if(int_date==31)
                for(ili=0;ili<12;ili++)
                {
                		if(month31[klk]==ili&&month31.length>klk)
                		{monthlist.add(smonth[ili]);klk++;}
                		else
                		monthlist.add("");
                }
                else
                {
                if(int_date==30)
                for(ili=0;ili<12;ili++)
                {
                		if(ili==1)
                		monthlist.add("");
                		else
                		monthlist.add(smonth[ili]);
                }
                else
                {
                	if(int_date==29)
                	{
                			for(ili=0;ili<12;ili++)
                			{if((!gc.isLeapYear(int_year))&&ili==1)
                			monthlist.add("");
                			else	
                			monthlist.add(smonth[ili]);}
                	}
                	else
                	for(ili=0;ili<12;ili++)
                	monthlist.add(smonth[ili]);
                }
                }
                	
        }
        public void year_list()
        {
        		yearlist=new java.awt.Choice();
                for(int i=1980;i<=2099;i++)
                {	
                		String sint=Integer.toString(i);
                		yearlist.add(sint);		
                }
                
        }
        public void week_panel()
        {
                for(int i=0;i<7;i++)
                {
                        Label l=new Label(sweek[i],Label.CENTER);
                        if(i%2!=0)
                        	l.setBackground(Color.darkGray);
                        else
                        	l.setBackground(Color.lightGray);
                        pweek.add(l);
                }
        }
        public void day_panel()
        {
                int k=0,day=1;
                String s="";
                for(int i=0;i<6;i++)
                {

                        Panel p=new Panel();
                        p.setLayout(new GridLayout(1,7));
                        int j;
                        if(i==0)
                        {
                        	for(int l=0;l<n-1;l++)
                        	{
                        			Label l22=new Label("",Label.CENTER);
                        			p.add(l22);
                        	}
                        	j=n-1;
                        }
                        else 
                        {
                        	n=0;j=0;
                        }                        	
                        
                        for(int m=0;j<7&&k<35;j++,m++,day++)
                        {
                                s=Integer.toString(day);
                                Label l=new Label(s,Label.CENTER);
                                if(day==int_date)
                                {
                                		l.setForeground(Color.red);
                                		l.setFont(new Font("ARIAL",Font.BOLD,18));
                                }	
                                if((i==4||i==5)&&day>total)		
                                {
                                		Label l1=new Label();
                                		p.add(l1);
                                }
                                else p.add(l);
                        }
                        mainf.add(p);
                }
        }
        public void next_month()
        {				
        						int ii;
                                Calendar c=Calendar.getInstance();
                                
                                
                                for(ii=0;ii<smonth.length;ii++)
                                	if(smonth[ii].compareTo(str_mon)==0)
                                	break;
                                if(ii!=11)
                                {
                                ii++;
                                str_mon=smonth[ii];
                                select_list=ii;
                                }
                                else
                                {
                                ii=0;
                                int_year++;
                                str_year=Integer.toString(int_year);
                                select_list=ii;
                                str_mon=smonth[ii];
                                }
                                        mainf.setVisible(false);
                                
                                switch(ii)
                                {
                                		case 0:
                                			total=31;
                                			c.set(int_year,Calendar.JANUARY,1);break;
                                		case 1:
                                			total=28;
                                			c.set(int_year,Calendar.FEBRUARY,1);break;
                                		case 2:
                                			total=31;
                                			c.set(int_year,Calendar.MARCH,1);break;
                                		case 3:
                                			total=30;
                                			c.set(int_year,Calendar.APRIL,1);break;
                                		case 4:
                                			total=31;
                                			c.set(int_year,Calendar.MAY,1);break;
                                		case 5:
                                			total=30;
                                			c.set(int_year,Calendar.JUNE,1);break;
                                		case 6:
                                			total=31;
                                			c.set(int_year,Calendar.JULY,1);break;
                                		case 7:
                                			total=31;
                                			c.set(int_year,Calendar.AUGUST,1);break;
                                		case 8:
                                			total=30;
                                			c.set(int_year,Calendar.SEPTEMBER,1);break;
                                		case 9:
                                			total=31;
                                			c.set(int_year,Calendar.OCTOBER,1);break;
                                		case 10:
                                			total=30;
                                			c.set(int_year,Calendar.NOVEMBER,1);break;
                                		case 11:
                                			total=31;
                                			c.set(int_year,Calendar.DECEMBER,1);
                                }
                                n=c.get(Calendar.DAY_OF_WEEK);
                             
                                try{
                                calfinal=new calfinal();}catch(Exception e){}
                                
        		
        }
        public void prev_month()
        {				
        						int ii;
                                Calendar c=Calendar.getInstance();
                                
                              
                                for(ii=0;ii<smonth.length;ii++)
                                	if(smonth[ii].compareTo(str_mon)==0)
                                	break;
                                if(ii!=0)
                                {
                                ii--;
                                str_mon=smonth[ii];
                                select_list=ii;
                                }
                                else
                                {
                                ii=11;
                                int_year--;
                                str_year=Integer.toString(int_year);
                                select_list=ii;
                                str_mon=smonth[ii];
                                }
                                mainf.setVisible(false);
                                switch(ii)
                                {
                                		case 0:
                                			c.set(int_year,Calendar.JANUARY,1);total=31;break;
                                		case 1:
                                			c.set(int_year,Calendar.FEBRUARY,1);total=28;break;
                                		case 2:
                                			c.set(int_year,Calendar.MARCH,1);total=31;break;
                                		case 3:
                                			c.set(int_year,Calendar.APRIL,1);total=30;break;
                                		case 4:
                                			c.set(int_year,Calendar.MAY,1);total=31;break;
                                		case 5:
                                			c.set(int_year,Calendar.JUNE,1);total=30;break;
                                		case 6:
                                			c.set(int_year,Calendar.JULY,1);total=31;break;
                                		case 7:
                                			c.set(int_year,Calendar.AUGUST,1);total=31;break;
                                		case 8:
                                			c.set(int_year,Calendar.SEPTEMBER,1);total=30;break;
                                		case 9:
                                			c.set(int_year,Calendar.OCTOBER,1);total=31;break;
                                		case 10:
                                			c.set(int_year,Calendar.NOVEMBER,1);total=30;break;
                                		case 11:
                                			c.set(int_year,Calendar.DECEMBER,1);total=31;
                                }
                                n=c.get(Calendar.DAY_OF_WEEK);
         
                                try{

                                calfinal=new calfinal();}
                                catch(Exception e){}
                               
                                		
	    }
	            public void actionPerformed(ActionEvent a)
        {
        		if(a.getSource()==bexit)
        			System.exit(0);
        		if(a.getSource()==bnext)
        			next_month();
        		if(a.getSource()==bprev)
        			prev_month();
	}
        public void textValueChanged(TextEvent te)
        {
        		
        
        }
        public void itemStateChanged(ItemEvent i)
        {
        		if((i.getSource()==monthlist||i.getSource()==yearlist||i.getSource()==datelist)&&monthlist.getSelectedItem().compareTo("")!=0)
        		{
        						int ii,iidate;
        						if(i.getSource()==yearlist)
        								str_year=yearlist.getSelectedItem();
        						if(i.getSource()==datelist)
        								str_date=datelist.getSelectedItem();
        						
        						try
        						{
        								int_year=Integer.parseInt(str_year);
        								int_date=Integer.parseInt(str_date);
        						}
        						catch(Exception e)
        						{
        						}
        						for(ii=0;ii<smonth.length;ii++)
                                if(smonth[ii].compareTo(monthlist.getSelectedItem())==0)
                                break;
                                
                                select_list=ii;
                                str_mon=smonth[ii];
                               
                                mainf.setVisible(false);
								
								c=Calendar.getInstance();
                                gc=new GregorianCalendar(int_year,Calendar.FEBRUARY,1);
                                switch(ii)
                                {
                                		case 0:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.JANUARY,1);break;
                                		case 1:
                                			if(gc.isLeapYear(int_year))
                                			total=29;
                                			else
                                			total=28;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.FEBRUARY,1);break;
                                		case 2:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.MARCH,1);break;
                                		case 3:
                                			total=30;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.APRIL,1);break;
                                		case 4:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.MAY,1);break;
                                		case 5:
                                			total=30;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.JUNE,1);break;
                                		case 6:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.JULY,1);break;
                                		case 7:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.AUGUST,1);break;
                                		case 8:
                                			total=30;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.SEPTEMBER,1);break;
                                		case 9:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.OCTOBER,1);break;
                                		case 10:
                                			total=30;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.NOVEMBER,1);break;
                                		case 11:
                                			total=31;
                                			if(int_date<=total)
                                			c.set(int_year,Calendar.DECEMBER,1);
                                }
                                n=c.get(Calendar.DAY_OF_WEEK);
                             
                                try{calfinal=new calfinal();}catch(Exception e){}
        		}
        		if("".compareTo(monthlist.getSelectedItem())==0)
        		monthlist.select(select_list);
        }
        		public void mouseDragged(MouseEvent f){}
               public void mouseMoved(MouseEvent f)
        {
                        if(f.getSource()==bprev)
        		{
                                        bprev.setBackground(Color.lightGray);
                                        bprev.setForeground(Color.blue);
										bnext.setBackground(Color.blue);
                                        bnext.setForeground(Color.white);
 										bexit.setBackground(Color.blue);
                                        bexit.setForeground(Color.white);
                                        
        		}
        		       if(f.getSource()==bnext)
        		{
                                        bnext.setBackground(Color.lightGray);
                                        bnext.setForeground(Color.blue);
                                        bexit.setBackground(Color.blue);
                                        bexit.setForeground(Color.white);
                                        bprev.setBackground(Color.blue);
                                        bprev.setForeground(Color.white);
                                        
        		}
        		       if(f.getSource()==bexit)
        		{
                                        bexit.setBackground(Color.lightGray);
                                        bexit.setForeground(Color.blue);
                                        bnext.setBackground(Color.blue);
                                        bnext.setForeground(Color.white);
                                        bprev.setBackground(Color.blue);
                                        bprev.setForeground(Color.white);
                                        
        		}
		}
         public void focusGained(FocusEvent f)
        {
                        if(f.getSource()==bprev)
        		{
                                        bprev.setBackground(Color.lightGray);
                                        bprev.setForeground(Color.blue);
                                        
        		}
        		       if(f.getSource()==bnext)
        		{
                                        bnext.setBackground(Color.lightGray);
                                        bnext.setForeground(Color.blue);
                                        
        		}
        		       if(f.getSource()==bexit)
        		{
                                        bexit.setBackground(Color.lightGray);
                                        bexit.setForeground(Color.blue);
                                        
        		}
		}
       public void focusLost(FocusEvent f)
        {
                         if(f.getSource()==bprev)
        		{
                                        bprev.setForeground(Color.white);
                                        bprev.setBackground(Color.blue);
                                        
        		}
        		       if(f.getSource()==bnext)
        		{
                                        bnext.setForeground(Color.white);
                                        bnext.setBackground(Color.blue);
                                        
        		}
        		       if(f.getSource()==bexit)
        		{
                                        bexit.setForeground(Color.white);
                                        bexit.setBackground(Color.blue);
                                        
        		}
        }
        public static void main(String arg[])throws Exception
        {
				new calfinal();
        }
}        				
/*<applet code="calfinal.class" width=600 height=600></applet>*/


