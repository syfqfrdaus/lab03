package exercise3;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading byte-based data as it intended type 
 * it is using DataInputStream.
 * 
 * The data represents the rainfall for 6 days in Cheng(Taman Merdeka)
 * 
 * The program calculates the average rainfall and display it on the console.
 * @author USER
 *
 */
public class RainDataReader {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "exercise3.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfall = 0;
			double totalRainfall = 0;
			int noOfRecords = 0;
			String date = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				date = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println( date + "\t" + rainfall);
				
				// Calculate total utilization
				totalRainfall += rainfall;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average Rainfall
			double averageRainfall = totalRainfall / noOfRecords;
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for " + noOfRecords 
					+ " days: " + formattedAverage + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
	}
}
