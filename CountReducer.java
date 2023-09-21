package stubs;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class CountReducer extends Reducer<Text, Text, Text, IntWritable> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException {
    
	  /*
	   * TODO: implement
	   */
	  //iterate values that are iterable and count the amount of values in it
	  //show key and IntWrtable showing number of values.
	  
	  //initialize count
	  int count = 0;
	  
	  //used to ignore unneccessary warning since we only need to count.
	  for(@SuppressWarnings("unused") Text value: values){
		  
		  //increment count for each item.
		  count++;
	  }
	  context.write(key, new IntWritable(count));
  }
}
