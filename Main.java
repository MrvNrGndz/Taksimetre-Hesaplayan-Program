package patikaOrnekler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double km, tutar, startPrice = 10, perKm = 2.20;
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		km = input.nextDouble();
		tutar = (km*perKm);
		tutar +=startPrice;
		tutar = (tutar<20)?20 : tutar;
		System.out.println("�denecek tutar: " +tutar);
		
	}
}
