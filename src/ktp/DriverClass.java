/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ASPIRE E1-471G
 */
public class DriverClass {
    public static void main(String[] args) {
        int c, d;
        String nm, agm, jk, pk, gd, tl, tgl, kw;
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        setGet st = new setGet();
        
        HashMap<String, ArrayList> dataHash = new HashMap<>();
        ArrayList<String> dataList = new ArrayList<>();

        System.out.println("1. kelurahan bisa");
        System.out.println("2. kelurahan siap");
        System.out.println("masukkan kelurahan : ");
        c = sc.nextInt();
        switch (c) {
            case 1:
                st.setKelurahan("biasa");
                System.out.println("pilih RT");
                System.out.println("1. RT 01");
                System.out.println("2. RT 02");
                System.out.println("3. RT 03");
                System.out.println("4. RT 04");
                System.out.println("5. RT 05");
                System.out.println("masukkan RT : ");
                d = sc.nextInt();

                switch (d) {
                    case 1:
                        st.setRT("01");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                    case 2:
                        st.setRT("02");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                    case 3:
                        st.setRT("03");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                    case 4:
                        st.setRT("04");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                }
                    case 5:
                        st.setRT("05");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
            
            case 2:
                st.setKelurahan("siap");
                System.out.println("pilih RT");
                System.out.println("1. RT 11");
                System.out.println("2. RT 12");
                System.out.println("3. RT 13");
                System.out.println("4. RT 14");
                System.out.println("5. RT 15");
                System.out.println("masukkan RT : ");
                d = sc.nextInt();
                
                switch (d) {
                    case 1:
                        st.setRT("01");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                    case 2:
                        st.setRT("02");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                        
                        case 3:
                        st.setRT("03");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                        
                        case 4:
                        st.setRT("04");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                        
                        case 5:
                        st.setRT("05");
                        System.out.println("masukkan nama :");
                        nm = scn.nextLine();
                        st.setNama(nm);
                        System.out.println("masukkan agama :");
                        agm = scn.nextLine();
                        st.setAgama(agm);
                        System.out.println("masukkan jenis kelamin :");
                        jk = scn.nextLine();
                        st.setJenisKelamin(jk);
                        System.out.println("masukkan pekerjaan :");
                        pk = scn.nextLine();
                        st.setPekerjaan(pk);
                        System.out.println("masukkan golongan darah :");
                        gd = scn.nextLine();
                        st.setGolonganDarah(gd);
                        System.out.println("masukkan tempat lahir :");
                        tl = scn.nextLine();
                        st.setTempatLahir(tl);
                        System.out.println("masukkan tanggal lahir :");
                        tgl = scn.nextLine();
                        st.setTanggalLahir(tgl);
                        System.out.println("masukkan kewarganegaraan :");
                        kw = scn.nextLine();
                        st.setKewarganegaraan(kw);
                        dataList.add("" + st.getNama() + " " + st.getAgama() + " " + st.getJenisKelamin() + " " + st.getPekerjaan() + " " + st.getGolonganDarah() + " " + st.getKelurahan() + " " + st.getRT() + " " + st.getTempatLahir() + " " + st.getTanggalLahir() + " " + st.getKewarganegaraan() + ""); 
                        dataHash.put(st.getNama(), dataList);
                        break;
                }
        }
    }
}
