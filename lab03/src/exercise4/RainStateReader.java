package exercise4;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading byte-based data as it intended type 
 * it is using DataInputStream.
 * 
 * The data represent the 6 days of daily rainfall in 2 station per district 
 * in Melaka
 * @author USER
 *
 */

public class RainStateReader {

	public static void main(String[] args) {
		
		//Read from File 1st station in Alor Gajah state
		// 1. Declare output file 
		String sourceFile = "exercise4-1.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfall = 0;
			double totalRainfall = 0;
			int noOfRecords = 0;
			String date = "";
			String stationID = "";
			String stationName = "";
			String district = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID = dis.readUTF();
				stationName = dis.readUTF();
				district = dis.readUTF();
				date = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println(stationID + "\t:" + stationName +"\t:" 
				+ district);
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
			System.out.print("\nAverage Rainfall for Durian Tunggal in "
					+ "Alor Gajah district for " + noOfRecords 
					+ " days: " + formattedAverage + "%\n");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//Read from File 2nd station in Alor Gajah state
		// 1. Declare output file 
		String sourceFile2 = "exercise4-2.txt";
		System.out.println("\nReading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile2));

			// Variables for processing byte-based data
			double rainfall2 = 0;
			double totalRainfall2 = 0;
			int noOfRecords2 = 0;
			String date2 = "";
			String stationID2 = "";
			String stationName2 = "";
			String district2 = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID2 = dis.readUTF();
				stationName2 = dis.readUTF();
				district2 = dis.readUTF();
				date2 = dis.readUTF();
				rainfall2 = dis.readDouble();
				System.out.println(stationID2 + "\t:" + stationName2 +"\t:" 
						+ district2);
				System.out.println( date2 + "\t" + rainfall2);

				// Calculate total utilization
				totalRainfall2 += rainfall2;
				noOfRecords2 ++;
			}

			// 4. Close stream
			dis.close();

			// Calculate average Rainfall
			double averageRainfall = totalRainfall2 / noOfRecords2;
			String formattedAverage2 = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for Simpang Ampat in "
					+ "Alor Gajah district for " + noOfRecords2 
					+ " days: " + formattedAverage2 + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//Read from File 1st station in Jasin district
		// 1. Declare output file 
		String sourceFile3 = "exercise4-3.txt";
		System.out.println("\nReading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile3));

			// Variables for processing byte-based data
			double rainfall3 = 0;
			double totalRainfall3 = 0;
			int noOfRecords3 = 0;
			String date3 = "";
			String stationID3 = "";
			String stationName3 = "";
			String district3 = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID3 = dis.readUTF();
				stationName3 = dis.readUTF();
				district3 = dis.readUTF();
				date3 = dis.readUTF();
				rainfall3 = dis.readDouble();
				System.out.println(stationID3 + "\t:" + stationName3 +"\t:" 
						+ district3);
				System.out.println( date3 + "\t" + rainfall3);

				// Calculate total utilization
				totalRainfall3 += rainfall3;
				noOfRecords3 ++;
			}

			// 4. Close stream
			dis.close();

			// Calculate average Rainfall
			double averageRainfall = totalRainfall3 / noOfRecords3;
			String formattedAverage3 = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for Sg Chohong in "
					+ "Jasin district for " + noOfRecords3 
					+ " days: " + formattedAverage3 + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//Read from File 2nd station in Jasin district
		// 1. Declare output file 
		String sourceFile4 = "exercise4-4.txt";
		System.out.println("\nReading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile4));

			// Variables for processing byte-based data
			double rainfall4 = 0;
			double totalRainfall4 = 0;
			int noOfRecords4 = 0;
			String date4 = "";
			String stationID4 = "";
			String stationName4 = "";
			String district4 = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID4 = dis.readUTF();
				stationName4 = dis.readUTF();
				district4 = dis.readUTF();
				date4 = dis.readUTF();
				rainfall4 = dis.readDouble();
				System.out.println(stationID4 + "\t:" + stationName4 +"\t:" 
						+ district4);
				System.out.println( date4 + "\t" + rainfall4);

				// Calculate total utilization
				totalRainfall4 += rainfall4;
				noOfRecords4 ++;
			}

			// 4. Close stream
			dis.close();

			// Calculate average Rainfall
			double averageRainfall = totalRainfall4 / noOfRecords4;
			String formattedAverage4 = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for Teluk Rimba in "
					+ "Jasin district for " + noOfRecords4 
					+ " days: " + formattedAverage4 + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//Read from File 1st station in Melaka Tengah district
		// 1. Declare output file 
		String sourceFile5 = "exercise4-5.txt";
		System.out.println("\nReading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile5));

			// Variables for processing byte-based data
			double rainfall5 = 0;
			double totalRainfall5 = 0;
			int noOfRecords5 = 0;
			String date5 = "";
			String stationID5 = "";
			String stationName5 = "";
			String district5 = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID5 = dis.readUTF();
				stationName5 = dis.readUTF();
				district5 = dis.readUTF();
				date5 = dis.readUTF();
				rainfall5 = dis.readDouble();
				System.out.println(stationID5 + "\t:" + stationName5 +"\t:" 
						+ district5);
				System.out.println( date5 + "\t" + rainfall5);

				// Calculate total utilization
				totalRainfall5 += rainfall5;
				noOfRecords5 ++;
			}

			// 4. Close stream
			dis.close();

			// Calculate average Rainfall
			double averageRainfall = totalRainfall5 / noOfRecords5;
			String formattedAverage5 = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for Sg. Duyonh in "
					+ "Melaka Tengah district for " + noOfRecords5 
					+ " days: " + formattedAverage5 + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
		//Read from File 2nd station in Melaka Tengah district
		// 1. Declare output file 
		String sourceFile6 = "exercise4-6.txt";
		System.out.println("\nReading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile6));

			// Variables for processing byte-based data
			double rainfall6 = 0;
			double totalRainfall6 = 0;
			int noOfRecords6 = 0;
			String date6 = "";
			String stationID6 = "";
			String stationName6 = "";
			String district6 = "";

			// 3. Process data until end-of-file
			while(dis.available() > 0) {

				// Read data
				stationID6 = dis.readUTF();
				stationName6 = dis.readUTF();
				district6 = dis.readUTF();
				date6 = dis.readUTF();
				rainfall6 = dis.readDouble();
				System.out.println(stationID6 + "\t:" + stationName6 +"\t:" 
						+ district6);
				System.out.println( date6 + "\t" + rainfall6);

				// Calculate total utilization
				totalRainfall6 += rainfall6;
				noOfRecords6 ++;
			}

			// 4. Close stream
			dis.close();

			// Calculate average Rainfall
			double averageRainfall = totalRainfall6 / noOfRecords6;
			String formattedAverage6 = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage Rainfall for Batu Hampar in "
					+ "Melaka Tengah district for " + noOfRecords6 
					+ " days: " + formattedAverage6 + "%");

		} catch (Exception ex) {

			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");

	}

}
