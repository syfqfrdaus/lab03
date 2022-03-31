package exercise3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing byte-based data using DataOuputStream.
 * The data is written in its original type into the stream.
 * 
 * The data represent the 6 days of daily rainfall in Cheng(Taman Merdeka)
 * 
 * @author USER
 *
 */

public class RainDataGenerator {

	public static void main(String[] args) {
		
		// 1. Declare output file
		String outFile = "exercise3.txt";
		
		// Data Declaration
		String date[] = {"18/03/2022", "19/03/2022", "20/03/2022", "21/03/2022",
				"22/03/2022", "23/03/2022"};
		double rainfall[] = {7.00, 0.00, 0.00, 8.00, 0.00, 0.00};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < date.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(date[index]);
				dos.writeDouble(rainfall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
