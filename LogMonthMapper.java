package stubs;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.util.Arrays;
import java.util.List;

public class LogMonthMapper extends Mapper<LongWritable, Text, Text, Text> {
	  public static List<String> months = Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");

  /**
   * Example input line:
   * 96.7.4.14 - - [24/Apr/2011:04:20:11 -0400] "GET /cat.jpg HTTP/1.1" 200 12433
   *
   */
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
	  
	  /* TODO: implement */
	  /* OLD CODE from logfilemapper
	  	//split input by spaces. 
	  String[] fields = value.toString().split(" ");  
	  if (fields.length > 0) {  
	  
	    	
	  //use first field, ip address, as the key and assign 1 as value.
	  //rest of fields are useless
	  String ip = fields[0];  
	  context.write(new Text(ip), new Text(1)); 
	  }
	  */
	  //String[] months = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	  
	  //split input by spaces
	  String[] fields = value.toString().split(" ");
	  if(fields.length > 3){
		  //get ip field
		  String ip = fields[0];
		  
		  //month field according to example input. split by /. second field contains our month.
		  String dateFields[] = fields[3].split("/");
		  if(dateFields.length > 1){
			  String month = dateFields[1];
			  //send back the ip if valid month
			  if(months.contains(month))
				  context.write(new Text(ip), new Text(month));
		  }
	  }
  }
}
