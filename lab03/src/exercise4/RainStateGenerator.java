package exercise4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing byte-based data using DataOuputStream.
 * The data is written in its original type into the stream.
 * 
 * The data represent the 6 days of daily rainfall in 2 station per district 
 * in Melaka
 * 
 * @author USER
 *
 */

public class RainStateGenerator {

	public static void main(String[] args) {
		//File for 1st station in Alor Gajah state
		// 1. Declare output file
		String outFile = "exercise4-1.txt";
		
		// Data Declaration
		String stationID = "2222002";
		String stationName = "Durian Tunggal";
		String district = "Alor Gajah";
		String date [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall [] = {0.00,0.00,1.00,0.00,2.00,0.00};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
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
		
		//File for 2nd station in Alor Gajah state
		// 1. Declare output file
		String outFile2 = "exercise4-2.txt";

		// Data Declaration
		String stationID2 = "2421003";
		String stationName2 = "Simpang Ampat";
		String district2 = "Alor Gajah";
		String date2 [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall2 [] = {4.00,0.00,3.00,0.00,0.00,22.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile2));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID2);
				dos.writeUTF(stationName2);
				dos.writeUTF(district2);
				dos.writeUTF(date2[index]);
				dos.writeDouble(rainfall2[index]);

				// 4. Flush for each writing
				dos.flush();
			}

			// 5. Close stream
			dos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//File for 1st station in Jasin district
		// 1. Declare output file
		String outFile3 = "exercise4-3.txt";

		// Data Declaration
		String stationID3 = "2225044";
		String stationName3 = "Sg. Chohong";
		String district3 = "Jasin";
		String date3 [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall3 [] = {1.00,0.00,0.00,0.00,0.00,0.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile3));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID3);
				dos.writeUTF(stationName3);
				dos.writeUTF(district3);
				dos.writeUTF(date3[index]);
				dos.writeDouble(rainfall3[index]);

				// 4. Flush for each writing
				dos.flush();
			}

			// 5. Close stream
			dos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//File for 2nd station in Jasin district
		// 1. Declare output file
		String outFile4 = "exercise4-4.txt";

		// Data Declaration
		String stationID4 = "2125002";
		String stationName4 = "Telok Rimba";
		String district4 = "Jasin";
		String date4 [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall4 [] = {1.00,0.00,28.00,2.00,0.00,0.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile4));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID4);
				dos.writeUTF(stationName4);
				dos.writeUTF(district4);
				dos.writeUTF(date4[index]);
				dos.writeDouble(rainfall4[index]);

				// 4. Flush for each writing
				dos.flush();
			}

			// 5. Close stream
			dos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//File for 1st station in Melaka Tengah district
		// 1. Declare output file
		String outFile5 = "exercise4-5.txt";

		// Data Declaration
		String stationID5 = "2223023";
		String stationName5 = "Sg. Duyong";
		String district5 = "Melaka Tengah";
		String date5 [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall5 [] = {1.00,0.00,14.00,0.00,0.00,0.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile5));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID5);
				dos.writeUTF(stationName5);
				dos.writeUTF(district5);
				dos.writeUTF(date5[index]);
				dos.writeDouble(rainfall5[index]);

				// 4. Flush for each writing
				dos.flush();
			}

			// 5. Close stream
			dos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//File for 2nd station in Melaka Tengah district
		// 1. Declare output file
		String outFile6 = "exercise4-6.txt";

		// Data Declaration
		String stationID6 = "2222033";
		String stationName6 = "Batu Hampar";
		String district6 = "Melaka Tengah";
		String date6 [] = {"24/3/2022","25/3/2022","26/3/2022","27/3/2022",
				"28/3/2022","29/3/2022"};
		double rainfall6 [] = {0.00,0.00,29.00,0.00,3.00,1.00};

		try {

			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile6));

			// Process data
			for (int index = 0; index < date.length; index++) {

				// 3. Write data into data stream
				dos.writeUTF(stationID6);
				dos.writeUTF(stationName6);
				dos.writeUTF(district6);
				dos.writeUTF(date6[index]);
				dos.writeDouble(rainfall6[index]);

				// 4. Flush for each writing
				dos.flush();
			}

			// 5. Close stream
			dos.close();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile +"\n" 
		+ outFile2 + "\n" + outFile3 +"\n"+ outFile4 +"\n"+ outFile5 +"\n"
		+ outFile6); 
	}

}
