import java.util.Scanner;
public class TokoKomputer {
	// method total / non void
	static int total(int jumlah, int harga) {
		int jumlahTotal = jumlah * harga;

		return jumlahTotal;
	}

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("============== Beyourself Computer ===============");
		System.out.println("=========== Menjual Laptop/Dekstop PC ============");
		System.out.println();
		System.out.println("list Item Tersedia :");
		System.out.println("1.	Laptop ASUS Vivobook		|| (Rp. 8.000.000)");
		System.out.println("2.	Laptop Lenovo Thinkpad		|| (Rp. 5.000.000)");
		System.out.println("3.	Laptop Dell Latitude		|| (Rp. 4.000.000)");
		System.out.println("4.	Laptop HP Pavilion 5		|| (Rp. 3.000.000)");
		System.out.println("5.	Laptop Acer Aspire 3 		|| (Rp. 3.600.000)");
		System.out.println("6.	Dekstop Asus D340 MC		|| (Rp. 11.000.000)");
		System.out.println("7.	Dekstop HP ProOne 600 G6	|| (Rp. 17.000.000)");
		System.out.println("8.	Dekstop HP ProDesk 40G5		|| (Rp. 10.000.000)");
		System.out.println("9.	Dekstop Lenovo ThinkCentre 	|| (Rp. 11.300.000)");
		System.out.println("10.	Dekstop Dell Inspirion 3470	|| (Rp. 10.000.000)");
		
		// input pilihan
		System.out.println();
		System.out.print("Ingin Membeli? (iya/tidak) : ");
		String membeli = input.nextLine();

		// input iya
		if(membeli.equals("iya")) {
			System.out.print("Masukan No list Item Yang Dipilih : ");
			int pilihan = input.nextInt();
			System.out.println();

			// pilihan no1
			if(pilihan == 1) {
				System.out.println("ASUS Vivobook");
				System.out.println("Harga Rp. 8.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 8_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no2
			else if(pilihan == 2) {
				System.out.println("Lenovo Thinkpad");
				System.out.println("Harga Rp. 5.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 5_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no3
			else if(pilihan == 3) {
				System.out.println("Dell Latitude");
				System.out.println("Harga Rp. 4.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 4_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no4
			else if(pilihan == 4) {
				System.out.println("HP Pavilion 5");
				System.out.println("Harga Rp. 3.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 3_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no5
			else if(pilihan == 5) {
				System.out.println("Acer Aspire 3");
				System.out.println("Harga Rp. 3.600.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 3_600_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no6
			else if(pilihan == 6) {
				System.out.println("Asus D340 MC");
				System.out.println("Harga Rp. 11.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 11_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no7
			else if(pilihan == 7) {
				System.out.println("HP ProOne 600 G6");
				System.out.println("Harga Rp. 17.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 17_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no8
			else if(pilihan == 8) {
				System.out.println("HP ProDesk 40G5");
				System.out.println("Harga Rp. 10.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 10_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no9
			else if(pilihan == 9) {
				System.out.println("Lenovo ThinkCentre");
				System.out.println("Harga Rp. 11.300.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 11_300_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// pilihan no10
			else if(pilihan == 10) {
				System.out.println("Dell Inspirion 3470");
				System.out.println("Harga Rp. 10.000.000");
				System.out.println();
				System.out.print("Jumlah Item : ");
				int jumlah = input.nextInt();

				// jumlah total
				System.out.println();
				System.out.println("Harga total Rp. " + total(jumlah, 10_000_000));
				System.out.println("Terimakasih Sudah Berkunjung");
			}

			// input diluar list
			else {
				System.out.println();
				System.out.println("Maaf, list yang di input tidak tersedia..");
			}
		}

		// input tidak
		else if(membeli.equals("tidak")) {
			System.out.println();
			System.out.println("Pembelian Dibatalkan");
		}

		// input tak sesuai
		else {
			System.out.println();
			System.out.println("Maaf, input yang anda masukan tidak sesuai..");
		}
	}
}