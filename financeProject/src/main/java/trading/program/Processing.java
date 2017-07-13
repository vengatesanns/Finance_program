package trading.program;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.CsvToBean;
import java.io.*;
import java.util.*;
import java.sql.*;
import trading.program.Trade_details;
import trading.program.Filtering;
import trading.connection.DBConnection;
 class Fun
{
    static List<Trade_details> data;
    public static void upload()
{
Connection conn=DBConnection.getDBConnection();
  try 
{    //String val= "ENCLOSED BY '"';
                String loadQuery = "LOAD DATA LOCAL INFILE '" + "C://Users//vengatesan.n//Downloads//Exchange.csv" + "' INTO TABLE exchange FIELDS TERMINATED BY ','"  +  " LINES TERMINATED BY '\n' (cCode, cName,cPrice,Nifty_listed) ";
                System.out.println(loadQuery);
                Statement stmt = conn.createStatement();
                stmt.execute(loadQuery);
                System.out.println("Upload successfully");
        }
      catch (Exception e)
        {
                e.printStackTrace();
        }
}
    public void downloading()
      {
    Connection conn=DBConnection.getDBConnection();
  try 
{  
                String loadQuery = "SELECT * FROM exchange INTO OUTFILE '" + "C://Users//vengatesan.n//Downloads//Exchange.csv" + "'  FIELDS TERMINATED BY ','"  +  " LINES TERMINATED BY '\n' ";
               // System.out.println(loadQuery);
                Statement stmt = conn.createStatement();
                stmt.execute(loadQuery);
                System.out.println("DOWNLOADED successfully");
        }
      catch (Exception e)
        {
                e.printStackTrace();
        }
      }
        public static  void read()
              {
                  CSVReader cr=null;
                         try{
                        cr=new CSVReader(new FileReader("C:\\Users\\vengatesan.n\\Downloads\\Exchange.csv"),',','"');
                        ColumnPositionMappingStrategy<Trade_details> cm=new ColumnPositionMappingStrategy<Trade_details>();
                        cm.setType(Trade_details.class);
                        cm.setColumnMapping( new String[]{"cCode","cName","cPrice","Nifty_listed"});
                        CsvToBean<Trade_details> cb=new CsvToBean<Trade_details>();
                         data=cb.parse(cm,cr);
                        System.out.println(data);
                        cr.close();
                               }
                                catch(Exception ex)
                            {
                                ex.printStackTrace();
                            }

                  }



}
public class Processing
{
    
            public static void main(String a[]) throws IOException
            {

               Fun f=new Fun();
               Filtering ff=new Filtering();
            //   f.downloading();
            f.upload();
               f.read();
              System.out.println(ff.filter_value(f.data,ff.isPopular()));
  
            }
}
