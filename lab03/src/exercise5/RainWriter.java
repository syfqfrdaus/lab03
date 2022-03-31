package exercise5;

import java.io.Writer;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class RainWriter {

	public static void main(String[] args) {

		//File for 1st station in Alor Gajah state
		// 1. Declare output file
		Writer outFile = new FileWriter("exercise5-1.txt");

		// Data Declaration
		String stationID = "2222002";
		String stationName = "Durian Tunggal";
		String district = "Alor Gajah";
		String date [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall [] = {0.00,0.00,1.00,0.00,2.00,0.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream
					(new FileWriter(outFile));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID);
				dos.writeUTF(stationName);
				dos.writeUTF(district);
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

	}

}
