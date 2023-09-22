package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operasi {

    public static void updateData() throws IOException {

        Scanner terminalInput = new Scanner(System.in);

        File database, tempDB;
        FileReader fileInput; FileWriter fileOutput;
        BufferedReader bufferedInput; BufferedWriter bufferedOutput;
        StringTokenizer st;

        int updateNum, entryCounts;
        boolean isUpdate, isExist;
        String data, originalData;
        String[] fieldData, tempData;
        long nomorEntry;
        String penulis, tahun, penerbit, judul, penulisTanpaSpasi, primaryKey;

        // ambil database original
        database = new File("database.txt");
        fileInput = new FileReader(database);
        bufferedInput = new BufferedReader(fileInput);

        // buat database sementara
        tempDB = new File("tempDB.txt");
        fileOutput = new FileWriter(tempDB);
        bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku");
        tampilkanData();

        // ambil user input / pilihan data
        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        updateNum = terminalInput.nextInt();

        // tampilkan data yang ingin dihapus
        entryCounts = 0;
        data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;

            st = new StringTokenizer(data, ",");

            if (updateNum == entryCounts) {
                System.out.println("\nData yang ingin anda update adalah: ");
                System.out.println("---------------------------------------");
                System.out.println("Referensi           : " + st.nextToken());
                System.out.println("Tahun               : " + st.nextToken());
                System.out.println("Penulis             : " + st.nextToken());
                System.out.println("Penerbit            : " + st.nextToken());
                System.out.println("Judul               : " + st.nextToken());

                // update data

                // mengambil input dari user
                fieldData = new String[]{"tahun", "penulis", "penerbit", "judul"};
                tempData = new String[4];

                st = new StringTokenizer(data, ",");
                originalData = st.nextToken();

                for (int i = 0; i < fieldData.length; i++) {
                    isUpdate = Utility.getYesOrNo("Apakah anda ingin merubah " + fieldData[i]);

                    originalData = st.nextToken();
                    if (isUpdate) {
                        // user input

                        if (fieldData[i].equalsIgnoreCase("tahun")) {
                            System.out.print("Masukan tahun terbit, format=(YYYY): ");
                            tempData[i] = Utility.ambilTahun();
                        } else {
                            terminalInput = new Scanner(System.in);
                            System.out.print("\nMasukan " + fieldData[i] + " baru: ");
                            tempData[i] = terminalInput.nextLine();
                        }

                    } else {
                        tempData[i] = originalData;
                    }
                }

                // tampilkan data baru ke layar
                st = new StringTokenizer(data, ",");
                st.nextToken();
                System.out.println("\nData baru anda adalah anda update adalah: ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun               : " + st.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis             : " + st.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit            : " + st.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul               : " + st.nextToken() + " --> " + tempData[3]);

                isUpdate = Utility.getYesOrNo("Apakah anda yakin ingin mengupdate data tersebut?");

                if (isUpdate) {

                    // cek data baru di database
                    isExist = Utility.cekBukuDiDatabase(tempData,false);

                    if (isExist) {
                        System.out.println("Data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
//                        bufferedOutput.write(data);
                    } else {

                        // format data baru ke dalam database
                        tahun = tempData[0];
                        penulis = tempData[1];
                        penerbit = tempData[2];
                        judul = tempData[3];

                        // buat primary key
                        nomorEntry = Utility.ambilEntryPerTahun(penulis, tahun) + 1;

                        penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // tulis data ke database
                        bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                    }
                } else {
                    // copy data
                    bufferedOutput.write(data);
                }

            } else {
                // copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }

        // menulis data ke file
        bufferedOutput.flush();

        // tutup file
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();
        System.gc();

        // delete original file
        database.delete();

        // rename file sementara ke database
        tempDB.renameTo(database);

    }

    public static void deleteData() throws IOException{

        Scanner terminalInput = new Scanner(System.in);

        File database, tempDB;
        FileReader fileInput; FileWriter fileOutput;
        BufferedReader bufferedInput; BufferedWriter bufferedOutput;
        StringTokenizer st;

        int deleteNum, entryCounts;
        boolean isDelete, isFound;
        String data;

        // ambil database original
        database = new File("database.txt");
        fileInput = new FileReader(database);
        bufferedInput = new BufferedReader(fileInput);

        // buat database sementara
        tempDB = new File("tempDB.txt");
        fileOutput = new FileWriter(tempDB);
        bufferedOutput = new BufferedWriter(fileOutput);

        // tampilkan data
        System.out.println("\nList Buku");
        tampilkanData();

        // ambil user input untuk mendelete data
        System.out.print("\nMasukan nomor buku yang akan dihapus: ");
        deleteNum = terminalInput.nextInt();

        // tampilkan data yang ingin dihapus
        isFound = false;
        entryCounts = 0;
        data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            isDelete = false;

            st = new StringTokenizer(data,",");


            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah: ");
                System.out.println("---------------------------------------");
                System.out.println("Referensi           : " + st.nextToken());
                System.out.println("Tahun               : " + st.nextToken());
                System.out.println("Penulis             : " + st.nextToken());
                System.out.println("Penerbit            : " + st.nextToken());
                System.out.println("Judul               : " + st.nextToken());

                isDelete = Utility.getYesOrNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if (isDelete) {
                // skip pindahkan data dari original ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                // kita pindahkan data dari original ke sementara
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if (!isFound){
            System.err.println("Buku tidak ditemukan");
        }

        // menulis data ke file
        bufferedOutput.flush();

        // tutup file
        bufferedOutput.close();
        fileOutput.close();
        bufferedInput.close();
        fileInput.close();
        System.gc();

        // delete original file
        database.delete();

        // rename file sementara ke database
        tempDB.renameTo(database);
    }

    public static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader bufferedInput;
        String data;
        StringTokenizer stringToken;
        int nomorData;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.out.println("\nDatabase tidak ditemukan");
            System.out.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        data = bufferedInput.readLine();
        nomorData = 0;
        while(data != null){
            nomorData++;

            stringToken = new StringTokenizer(data,",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ",stringToken.nextToken());
            System.out.printf("|\t%-20s   ",stringToken.nextToken());
            System.out.printf("|\t%-20s   ",stringToken.nextToken());
            System.out.printf("|\t%s   ",stringToken.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------");

    }

    public static void cariData() throws IOException{

        Scanner terminalInput = new Scanner(System.in);
        File file;

        String cariString;
        String[] keywords;

        // membaca database ada atau tidak
        try {
            file = new File("database.txt");
        } catch (Exception e){
            System.out.println("\nDatabse tidak ditemukan");
            System.out.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // ambil keyword dari user
        System.out.print("Masukan kata kunci untuk mencari buku: ");
        cariString = terminalInput.nextLine();

        keywords = cariString.split("\\s+");

        // cek keyword di database
        Utility.cekBukuDiDatabase(keywords, true);

    }

    public static void tambahData() throws IOException{

        FileWriter fileOuput = new FileWriter("database.txt",true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOuput);
        Scanner terminalInput = new Scanner(System.in);

        String penulis, judul, penerbit,  tahun;
        String[] keywords;
        String penulisTanpaSpasi, primaryKey;
        long nomorEntry;

        // Mengambil input dari user
        System.out.print("\nMasukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, format=(YYYY): ");
        tahun = Utility.ambilTahun();

        // Cek buku di database
        keywords = new String[]{tahun + "," + penulis + "," + penerbit + "," + judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = Utility.cekBukuDiDatabase(keywords, false);

        // Menulis buku di database
        if (!isExist) {
            System.out.println(Utility.ambilEntryPerTahun(penulis, tahun));
            nomorEntry = Utility.ambilEntryPerTahun(penulis, tahun) + 1;

            penulisTanpaSpasi = penulis.replaceAll("\\s+","");
            primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;
            System.out.println("\nData yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Penerbit     : " + penerbit);
            System.out.println("Judul        : " + judul);

            boolean isTambah = Utility.getYesOrNo("Apakah anda ingin menambah data tersebut?");

            if (isTambah) {
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
            }
        } else {
            System.out.print("\nBuku yang anda akan masukan sudah tersedia di database dengan data berikut");
            Utility.cekBukuDiDatabase(keywords, true);
        }

        bufferedOutput.close();
    }

}
