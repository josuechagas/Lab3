package com.mycompany.lab3;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
 public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		int Rooms;
 		double GallonPrice;
 		
 		System.out.println("What's the number of rooms?");
 		Rooms = input.nextInt();
 		
 		System.out.println("Enter the price of paint per gallon");
 		GallonPrice = input.nextDouble();
 		
 		int RoomCount = 1;
 		double WallSize = 0;
 		
 		while (RoomCount <= Rooms)
 		{
 			System.out.println("Room #" + RoomCount);
 			System.out.println("What's the wall size?");
 			double WallSizePerRoom = input.nextInt();
 			RoomCount += 1;
 			WallSize += WallSizePerRoom;
 		}
 		
 		double PaintRequired = Gallons(WallSize);
 		double laborHoursRequired = Hours(WallSize);
 		double laborCost = WorkCharge(laborHoursRequired);
 		double paintCost = PaintCost(PaintRequired, GallonPrice);
 		totalCostOfPaintJob(laborCost, paintCost, WallSize);
 	}
 	
 	public static double Gallons(double wallSpace)
 	{
 		double paintGallons = wallSpace/115;
 		return paintGallons;
 	}
 	
 	public static double Hours(double wallSpace)
 	{
 		double laborHours = (wallSpace/115) * 8;
 		return laborHours;
 	}
 	
 	public static double PaintCost(double gallons, double price)
 	{
 		double paintCost = gallons * price;
 		return paintCost;
 	}
 	
 	public static double WorkCharge(double hours)
 	{
 		double totalLaborCharges = hours * 18;
 		return totalLaborCharges;
 	}
 	
 	public static void totalCostOfPaintJob(double laborCost, double paintCost, double totalWallSpace)
 	{
 		DecimalFormat twoDecimal = new DecimalFormat("#,##0.00");
 		double totalCost = laborCost + paintCost;
 		System.out.println("Total Wall Size: " + totalWallSpace);
 		System.out.println("Total labor cost: $" + twoDecimal.format(laborCost));
 		System.out.println("Total paint cost: $" + twoDecimal.format(paintCost));
 		System.out.println("The total cost of the paint job is: $" + twoDecimal.format(totalCost));
        }}
