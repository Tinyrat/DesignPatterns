package com.tinyrat.pattern.composite;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Application {
    public static void main(String[] args) {
        MilitaryPerson lianzhang = new MilitaryOfficer("连长", 5000);
        MilitaryPerson paizhang1 = new MilitaryOfficer("一排长", 4000);
        MilitaryPerson paizhang2 = new MilitaryOfficer("二排长", 4000);
        MilitaryPerson banzhang11 = new MilitaryOfficer("一班长", 2000);
        MilitaryPerson banzhang12 = new MilitaryOfficer("二班长", 2000);
        MilitaryPerson banzhang13 = new MilitaryOfficer("三班长", 2000);
        MilitaryPerson banzhang21 = new MilitaryOfficer("一班长", 2000);
        MilitaryPerson banzhang22 = new MilitaryOfficer("二班长", 2000);
        MilitaryPerson banzhang23 = new MilitaryOfficer("三班长", 2000);
        MilitaryPerson[] persons = new MilitaryPerson[60];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new MilitarySoldier("士兵", 1000);
        }
        lianzhang.add(paizhang1);
        lianzhang.add(paizhang2);
        paizhang1.add(banzhang11);
        paizhang1.add(banzhang12);
        paizhang1.add(banzhang13);
        paizhang2.add(banzhang21);
        paizhang2.add(banzhang22);
        paizhang2.add(banzhang23);
        for (int i = 0; i <= 9; i++) {
            banzhang11.add(persons[i]);
            banzhang12.add(persons[i + 10]);
            banzhang13.add(persons[i + 20]);
            banzhang21.add(persons[i + 30]);
            banzhang22.add(persons[i + 40]);
            banzhang23.add(persons[i + 50]);
        }
        System.out.println("一排军饷："+ComputerSalary.computerSalary(paizhang1));
        System.out.println("二排军饷："+ComputerSalary.computerSalary(paizhang2));
        System.out.println("全连军饷："+ComputerSalary.computerSalary(lianzhang));
    }
}
