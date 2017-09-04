package com.triphunt.sparrow.sample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by WARIS on 2/16/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public final static String Database_Name = "NewMainTripHunt.db";
    public final static String Table_Months = "Months";
    public final static String Table_Places = "Places";
    public final static String Table_Purpose = "Purpose";
    public final static String Table_Hotels = "Hotels";
    public final static String Table_Visit_Place = "Visit_Place";
    public final static String Table_Malls = "Malls";
    public final static String Table_Multiplexes = "Multiplexes";
    public final static String Table_Customers = "Customers";
    public final static String Months_Col1 = "N_M_Id";
    public final static String Months_Col2 = "M_Id";
    public final static String Months_Col3 = "M_Name";
    public final static String Months_Col4 = "M_P_Id";
    public final static String Places_Col1 = "P_Id";
    public final static String Places_Col2 = "P_Name";
    public final static String Places_Col3 = "Budget";
    public final static String Places_Col4 = "Regional_Food";
    public final static String Places_Col5 = "P_M_Id";
    public final static String Purpose_Col1 = "Pur_Id";
    public final static String Purpose_Col2 = "Purpose";
    public final static String Purpose_Col4 = "Pur_P_Id";
    public final static String Visit_Place_Col1 = "V_P_Id";
    public final static String Visit_Place_Col2 = "V_P_Name";
    public final static String Visit_Place_Col3 = "V_P_Addr";
    public final static String Visit_Place_Col5 = "P_V_Id";
    public final static String Hotels_Col1 = "H_Id";
    public final static String Hotels_Col2 = "H_Name";
    public final static String Hotels_Col3 = "H-Addr";
    public final static String Hotels_Col4 = "H_Price";
    public final static String Hotels_Col5 = "Local_Market";
    public final static String Hotels_Col6 = "P_H_Id";
    public final static String Malls_Col1 = "MallS_Id";
    public final static String Malls_Col2 = "Malls_Name";
    public final static String Malls_Col3 = "Malls_Addr";
    public final static String Malls_Col4 = "P_Malls_Id";
    public final static String Multiplexes_Col1 = "M_id";
    public final static String Multiplexes_Col2 = "M_Name";
    public final static String Multiplexes_Col3 = "M_Addr";
    public final static String Multiplexes_Col4 = "P_M_Id";
    public final static String Customers_Col1 = "Book_Id";
    public final static String Customers_Col2 = "Fb_Id";
    public final static String Customers_Col3 = "Name";
    public final static String Customers_Col4 = "Journey_Date";
    public final static String Customers_Col5 = "Place";


    public DatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        //Month Table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Months + "(N_M_Id INTEGER PRIMARY KEY, M_Id TEXT, M_Name TEXT, M_P_Id INTEGER, FOREIGN KEY(M_P_Id) REFERENCES Places(P_Id))");

        db.execSQL("INSERT INTO " + Table_Months + " VALUES (01, '01', 'January', 01)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (02, '01', 'January', 02)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (03, '01', 'January', 03)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (04, '01', 'January', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (05, '01', 'January', 06)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (06, '01', 'January', 27)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (07, '01', 'January', 24)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (08, '01', 'January', 22)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (09, '01', 'January', 11)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (10, '01', 'January', 32)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (11, '01', 'January', 13)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (12, '01', 'January', 17)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (13, '02', 'February', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (14, '02', 'February', 05)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (15, '02', 'February', 06)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (16, '02', 'February', 01)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (17, '02', 'February', 20)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (18, '02', 'February', 32)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (19, '02', 'February', 09)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (20, '03', 'March', 07)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (21, '03', 'March', 08)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (22, '03', 'March', 09)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (23, '03', 'March', 01)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (24, '03', 'March', 18)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (25, '03', 'March', 19)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (26, '03', 'March', 20)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (27, '03', 'March', 13)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (28, '03', 'March', 36)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (29, '03', 'March', 22)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (30, '04', 'April', 10)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (31, '04', 'April', 11)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (32, '04', 'April', 12)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (33, '04', 'April', 07)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (34, '04', 'April', 36)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (35, '04', 'April', 02)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (36, '05', 'May', 13)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (37, '05', 'May', 14)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (38, '05', 'May', 15)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (39, '05', 'May', 19)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (40, '05', 'May', 16)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (41, '05', 'May', 22)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (42, '05', 'May', 08)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (43, '05', 'May', 16)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (44, '06', 'June', 17)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (45, '06', 'June', 18)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (46, '06', 'June', 15)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (47, '06', 'June', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (48, '06', 'June', 21)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (49, '06', 'June', 02)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (50, '06', 'June', 33)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (51, '07', 'July', 19)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (52, '07', 'July', 20)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (53, '07', 'July', 21)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (54, '07', 'July', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (55, '07', 'July', 15)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (56, '07', 'July', 16)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (57, '07', 'July', 18)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (58, '07', 'July', 22)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (59, '08', 'August', 22)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (60, '08', 'August', 23)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (61, '08', 'August', 24)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (62, '08', 'August', 01)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (63, '08', 'August', 05)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (64, '08', 'August', 12)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (65, '08', 'August', 18)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (66, '08', 'August', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (67, '09', 'September', 25)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (68, '09', 'September', 26)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (69, '09', 'September', 27)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (70, '09', 'September', 19)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (71, '09', 'September', 20)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (72, '09', 'September', 10)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (73, '10', 'October', 28)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (74, '10', 'October', 29)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (75, '10', 'October', 30)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (76, '10', 'October', 17)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (77, '11', 'November', 31)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (78, '11', 'November', 32)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (79, '11', 'November', 33)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (80, '11', 'November', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (81, '11', 'November', 07)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (82, '11', 'November', 26)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (83, '11', 'November', 17)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (84, '12', 'December', 34)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (85, '12', 'December', 35)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (86, '12', 'December', 36)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (87, '12', 'December', 11)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (88, '12', 'December', 02)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (89, '12', 'December', 15)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (90, '12', 'December', 04)");
        db.execSQL("INSERT INTO " + Table_Months + " VALUES (91, '12', 'December', 29)");
        //Ending of Month Table
        //Places Table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Places + "(P_Id INTEGER PRIMARY KEY, P_Name TEXT, Budget INTEGER, Regional_Food TEXT, P_M_Id TEXT, FOREIGN KEY(P_M_Id) REFERENCES Months(M_Id))");


        db.execSQL("INSERT INTO " + Table_Places + " VALUES (01, 'Andaman & Nicobar', 28000, '1.Rice, 2.Sea food', '01')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (02, 'Auli (uttarakhand)', 15000, '1.Non-Veg dishes, 2.Kachmauli', '01')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (03, 'Kalpetta(kerala)', 20000, '1.Konkani, 2.Biryani with fried fish, 3.kadala', '01')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (04, 'Goa', 18000, '1.Fish Recheado, 2.Pork Vindaloo, 3.chicken xacti', '02')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (05, 'Pondicherry', 8000, '1.French cuisines , 2.Quiche, 3.steak fritter', '02')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (06, 'jaisalmer, Rajasthan', 7000, '1.Dal baati Choorma, 2.Ker-sangri, 3.Kadhi-pakoda', '02')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (07, 'Manali', 7000, '1.Masala omlet, 2.Kadhi chaawal dham', '03')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (08, 'Sikkim', 15000, '1.Thukpa, 2.Daal bhat, 3.phoyshapa', '03')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (09, 'Kochi', 10000, '1.Appam, 2.Stew, 3.Fish Molly', '03')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (10, 'Srinagar', 8000, '1.Rogunjosh, 2.Levash, 3.Sheer', '04')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (11, 'Shimla', 7000, '1.Channa madra, 2.Rice, 3.White bread', '04')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (12, 'Kanyakumari', 14000, '1.lentil rice, 2.Fenugreek stew, 3.Kinnathappam,elay', '04')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (13, 'Lakshadweep island', 25000, '1.Coconut, 2.Seafoods', '05')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (14, 'Tirthan valley(HP)', 15000, '1.Siddu, 2.Kullu dham, 3.Lingri sabji', '05')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (15, 'Leh,ladakh', 40000, '1.Paba, 2.Tangtur, 3.Khambir', '05')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (16, 'Kashmir', 15000, 'null', '06')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (17, 'Nainital', 8000, '1.Ras, 2.Baadi, 3.Arsa', '06')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (18, 'Mount abu', 7000, '1.Makhaniya lassi, 2.Ghewar, 3.Pakori', '06')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (19, 'shilong(Meghalaya)', 12000, '1.Ja doh, 2.Doh khleh, 3.Doh ngiong', '07')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (20, 'Khandala(Maharshtra)', 8000, '1.Vada pav', '07')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (21, 'Amarnath, j & k', 14000, '1.Yakhni, 2.Dum olav, 3.Matschgand,', '07')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (22, 'Munnar, Kerala', 5000, '1.Sadhya, 2.Malabar biryani, 3.Kalluneymeen,crab', '08')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (23, 'Lahaul-Spiti(Himachal Pradesh)', 12000, '1.Patande, 2.Sidu', '08')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (24, 'Bikaner,Rajasthan', 14000, '1.Bikaneri bhujiya, 2.Roti, 3.Khichdi,', '08')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (25, 'Lachen, Sikkim', 12000, '1.Rice, 2.Millet, 3.Pork', '09')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (26, 'Amritsar, Punjab', 10000, '1.Kulchas, 2.Lassi, 3.Jalebi', '09')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (27, 'Bundi, Rajasthan', 11000, '1.dal-bati', '09')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (28, 'Pachmarhi,(Mp)', 6000, '1.Gujarati 2.Maharashtrian cuisine', '10')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (29, 'Kutch,Gujarat', 7000, '1.Chakri, 2.Dhokla, 3.Khakra', '10')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (30, 'Digha,west Bengal', 5000, '1.Bengali dishes, 2.Sea foods', '10')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (31, 'kohima,Nagaland', 11000, '1.Tathu, 2.Axone dishes, 3.Meats', '11')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (32, 'Delhi', 12000, '1.Aaloo chat, 2.Chole kulche, 3.Dahi bhalla', '11')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (33, 'Bodhgaya', 10000, 'Null', '11')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (34, 'konark,odisa', 6000, '1.Pakhala, 2.Khechidi, 3.Palau', '12')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (35, 'Chennai,tamil nadu', 10000, '1.Idli, 2.Dosa, 3.Vadai', '12')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (36, 'Bangalore', 7000, '1.Khottige, 2.Mudde tovey, 3.kori rotti', '12')");
        //Ending of main database table

        //Costomer Table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Customers + "(Book_Id INTEGER PRIMARY KEY AUTOINCREMENT, Fb_Id TEXT, Name TEXT, Journey_Date TEXT, Place TEXT)");
        //Ending of Customer table
        //Purpose Table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Purpose + "(Pur_Id INTEGER PRIMARY KEY, Purpose TEXT, Pur_P_Id INTEGER, FOREIGN KEY(Pur_P_Id) REFERENCES Places(P_Id))");

        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (101, 'Honeymoon', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (102, 'Picnic', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (103, 'Summer', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (104, 'Winter', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (105, 'Pilgrimage', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (106, 'Other', 01)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (107, 'Honeymoon', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (108, 'Picnic', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (109, 'Summer', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (110, 'Winter', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (111, 'Pilgrimage', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (112, 'Other', 02)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (113, 'Honeymoon', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (114, 'Picnic', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (115, 'Summer', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (116, 'Winter', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (117, 'Pilgrimage', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (118, 'Other', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (119, 'Honeymoon', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (120, 'Picnic', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (121, 'Summer', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (122, 'Winter', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (123, 'Pilgrimage', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (124, 'Other', 04)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (125, 'Honeymoon', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (126, 'Picnic', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (127, 'Summer', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (128, 'Winter', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (129, 'Pilgrimage', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (130, 'Other', 05)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (131, 'Honeymoon', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (132, 'Picnic', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (133, 'Summer', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (134, 'Winter', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (135, 'Pilgrimage', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (136, 'Other', 06)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (137, 'Honeymoon', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (138, 'Picnic', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (139, 'Summer', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (140, 'Winter', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (141, 'Pilgrimage', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (142, 'Other', 07)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (143, 'Honeymoon', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (144, 'Picnic', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (145, 'Summer', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (146, 'Winter', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (147, 'Pilgrimage', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (148, 'Other', 08)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (149, 'Honeymoon', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (150, 'Picnic', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (151, 'Summer', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (152, 'Winter', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (153, 'Pilgrimage', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (154, 'Other', 09)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (155, 'Honeymoon', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (156, 'Picnic', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (157, 'Summer', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (158, 'Winter', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (159, 'Pilgrimage', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (160, 'Other', 10)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (161, 'Honeymoon', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (162, 'Picnic', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (163, 'Summer', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (164, 'Winter', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (165, 'Pilgrimage', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (166, 'Other', 11)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (167, 'Honeymoon', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (168, 'Picnic', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (169, 'Summer', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (170, 'Winter', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (171, 'Pilgrimage', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (172, 'Other', 12)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (173, 'Honeymoon', 13)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (174, 'Picnic', 13)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (175, 'Summer', 13)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (176, 'Winter', 13)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (178, 'Pilgrimage', 03)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (179, 'Other', 13)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (180, 'Honeymoon', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (181, 'Picnic', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (182, 'Summer', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (183, 'Winter', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (184, 'Pilgrimage', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (185, 'Other', 14)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (186, 'Honeymoon', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (187, 'Picnic', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (188, 'Summer', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (189, 'Winter', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (190, 'Pilgrimage', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (191, 'Other', 15)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (192, 'Honeymoon', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (193, 'Picnic', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (194, 'Summer', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (195, 'Winter', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (196, 'Pilgrimage', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (197, 'Other', 16)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (198, 'Honeymoon', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (199, 'Picnic', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (200, 'Summer', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (201, 'Winter', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (202, 'Pilgrimage', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (203, 'Other', 17)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (204, 'Honeymoon', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (205, 'Picnic', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (206, 'Summer', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (208, 'Winter', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (209, 'Pilgrimage', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (210, 'Other', 18)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (211, 'Honeymoon', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (212, 'Picnic', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (213, 'Summer', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (214, 'Winter', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (215, 'Pilgrimage', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (216, 'Other', 19)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (217, 'Honeymoon', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (218, 'Picnic', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (219, 'Summer', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (220, 'Winter', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (221, 'Pilgrimage', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (222, 'Other', 20)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (223, 'Honeymoon', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (224, 'Picnic', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (225, 'Summer', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (226, 'Winter', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (227, 'Pilgrimage', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (228, 'Other', 21)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (229, 'Honeymoon', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (230, 'Picnic', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (231, 'Summer', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (232, 'Winter', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (233, 'Pilgrimage', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (234, 'Other', 22)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (235, 'Honeymoon', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (236, 'Picnic', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (237, 'Summer', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (238, 'Winter', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (239, 'Pilgrimage', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (240, 'Other', 23)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (241, 'Honeymoon', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (242, 'Picnic', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (243, 'Summer', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (244, 'Winter', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (245, 'Pilgrimage', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (246, 'Other', 24)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (247, 'Honeymoon', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (248, 'Picnic', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (249, 'Summer', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (250, 'Winter', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (251, 'Pilgrimage', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (252, 'Other', 25)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (253, 'Honeymoon', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (254, 'Picnic', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (255, 'Summer', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (256, 'Winter', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (257, 'Pilgrimage', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (258, 'Other', 26)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (259, 'Honeymoon', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (260, 'Picnic', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (261, 'Summer', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (262, 'Winter', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (263, 'Pilgrimage', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (264, 'Other', 27)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (265, 'Honeymoon', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (266, 'Picnic', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (267, 'Summer', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (268, 'Winter', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (269, 'Pilgrimage', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (270, 'Other', 28)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (271, 'Honeymoon', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (272, 'Picnic', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (273, 'Summer', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (274, 'Winter', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (275, 'Pilgrimage', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (276, 'Other', 29)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (277, 'Honeymoon', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (278, 'Picnic', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (279, 'Summer', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (280, 'Winter', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (281, 'Pilgrimage', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (282, 'Other', 30)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (283, 'Honeymoon', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (284, 'Picnic', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (285, 'Summer', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (286, 'Winter', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (287, 'Pilgrimage', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (288, 'Other', 31)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (289, 'Honeymoon', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (290, 'Picnic', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (291, 'Summer', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (292, 'Winter', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (293, 'Pilgrimage', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (294, 'Other', 32)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (295, 'Honeymoon', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (296, 'Picnic', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (297, 'Summer', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (298, 'Winter', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (299, 'Pilgrimage', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (300, 'Other', 33)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (301, 'Honeymoon', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (302, 'Picnic', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (303, 'Summer', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (304, 'Winter', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (305, 'Pilgrimage', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (306, 'Other', 34)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (307, 'Honeymoon', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (308, 'Picnic', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (309, 'Summer', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (310, 'Winter', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (311, 'Pilgrimage', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (312, 'Other', 35)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (313, 'Honeymoon', 36)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (314, 'Picnic', 36)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (315, 'Summer', 36)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (316, 'Winter', 36)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (317, 'Pilgrimage', 36)");
        db.execSQL("INSERT INTO " + Table_Purpose + " VALUES (318, 'Other', 36)");

        //Ending of Purpose Table
        //Visit place table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Visit_Place + "(V_P_Id INTEGER PRIMARY KEY, V_P_Name TEXT, V_P_Addr TEXT, P_V_Id INTEGER, FOREIGN KEY(P_V_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (101, 'Radhanagar Beach', 'Havelock Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (102, 'Cellular Jail', 'Port Blair in the Territory of Andaman and Nicobar Islands, India.', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (103, 'Jolly Buoy Island', 'Mahatma Gandhi National Park, Port Blair, South Andaman Island, India.', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (104, 'Neil Island', 'Experience Andamans Tours Pvt. Ltd.Opposite Cooperative Bank,Dairy Farm, Port Blair,Andaman and Nicobar Islands, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (105, 'Ross Island', '2 km east of Port Blair, Port Blair, South Andaman Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (106, 'Elephant Beach', 'Havelock Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (107, 'Kaala Pathar Beach', 'Port Blair, Havelock Island 744211, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (108, 'Makruzz', 'Airport Authority Colony, Delanipur, Port Blair, Andaman and Nicobar Islands 744102', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (109, 'Samudrika Marine Museum', 'Airport Authority Colony, Haddo, Port Blair, Andaman and Nicobar Islands 744102', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (110, 'Anthropological Museum', 'Phoenix Bay, Port Blair, South Andaman Island 744104, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (111, 'Corbyn s Cove', 'Carbyns Cove, Port Blair, Andaman and Nicobar Islands 744112', 01)");
        //Auli (uttarakhand) Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (112, 'Trishul Peak', 'Garhwal Region | Auli Joshimath, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (113, 'Gorson Bugyal', 'Auli, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (114, 'Auli Ski & Snowboard School', 'Joshimath, Chamoli, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (115, 'Chenab Lake', 'Dang Village | Thang Village, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (116, 'Bhavishya Badri', '3 Km From Tapovan | Subhai Village Saldhar, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (117, 'Vanshinarayan Kalpeshwar', '10 Km From Helang Village | Urgam Village, Auli 246443, India', 02)");
        //Kalpetta Place details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (118, 'Chembra Peak', 'Meppadi, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (119, 'Thirunelli Temple', 'Thirunelli, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (120, 'Lakkidi View Point', 'Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (121, 'Soochippara Falls(Sentinel Rock Waterfall)', 'Vythri | Forest Range Office. Meppadi., Kalpetta 673577, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (122, 'Banasura Hill', 'Padinjarathara, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (123, 'Meenmutty Falls', 'Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (124, 'Kabini River', 'Near Kabini Reservoir, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (125, 'Puliyarmala Jain Temple', 'Kalpetta | 6 Km from Kalpetta, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (126, 'Thirunelli Temple', 'Thirunelli, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (127, 'Wayanad Wildlife Sanctuary', 'Muthanga and Tholpetty, Kalpetta, India', 03)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (128, 'Pookot Lake', ' Vythiri, Kalpetta, India', 03)");


        //Goa Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (129, 'Dona Paula', '7 km from Panaji Centre | Lovers Paradise, Panjim, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (130, 'Fort Aguada', 'Shore of the Mandovi river, Sinquerim, India.', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (131, 'Old Goa Churches', 'Old Goa, Panjim 403402, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (132, 'Palolem Beach', 'Within 2.5 kilometres of the market town of Chaudi, Canacona, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (133, 'Panjim City & the Church', 'Panjim, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (134, 'Majorda Beach', 'Majorda Village, Salcette, Majorda 403713, India.', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (135, 'Cansaulim Monte', 'Cansaulim Monte Goa, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (136, 'Martin’s Corner', '69, Binwaddo, Betalbatim, Salcette, Salcette, Goa 403713, India', 04)");

        //Pondicherry Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (137, 'Arulmigu Manakula Vinayagar Temple', 'Manakula Vinyanagar, Pondicherry, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (138, 'Paradise Beach', 'Chinnayanpeth Main Road | 8 Km away from Town, Pondicherry 605013, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (139, 'Seaside Promenade', 'Pormenede Beach, Pondicherry, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (140, 'The Basilica of the Sacred Heart of Jesus', 'Mahatma Gandhi Road, Pondicherry 605001, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (141, 'Eglise de Notre Dame des Anges', 'Rue Dumas | White Town, Puducherry, Pondicherry 605001, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (142, 'Rock Beach', 'White Town, Pondicherry 605001, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (143, 'Immaculate Conception Cathedral', 'Pondicherry 605001, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (144, 'Serenity Beach', 'Pondicherry, India', 05)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (145, 'French War Memorial', 'Goubert Avenue, Pondicherry 605001, India', 05)");

        //Jaisalmer Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (146, 'Jaisalmer Fort', 'Fort Road | Amar Sagar Pol, Jaisalmer 345001, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (147, 'Tanot Mata Temple', 'Village Tanot, 120 Km From Jaisalmer, Jaisalmer, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (148, 'Jaisalmer War Museum', 'Jaisalmer Jodhpur Highway, Jaisalmer, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (149, 'Jain Temples', 'Golden Fort | Off the Jaisalmer-Sam Road, Jaisalmer 345001, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (150, 'Longewala War Memorial', 'Longewala, Jaisalmer, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (151, 'Patwaon-Ki-Haveli', 'Near Patwa Complex, Patwa Haveli, Jaisalmer 345001, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (152, 'Bada Bagh', 'Ramgarh Road | 6 Km North of Jaisalmer on the road to Ramgarh, Jaisalmer 345001, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (153, 'Desert National Park', 'Jaisalmer, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (154, 'Desert Culture Centre & Museum', 'Gadi Sagar Road, Jaisalmer, India', 06)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (155, 'Real Desert Man Camel Safari', 'Madarsa Road | Near Fort Parking Dhibba Para, Jaisalmer 345001, India', 06)");

        //Manali Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (156, 'Beas River', 'Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (157, 'Hidimba Devi Temple', 'Hadimba Temple Road, Manali, Manali Tehsil 175131, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (158, 'Solang Valley', 'Lies on the western bank of the Beas River, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (159, 'Manikaran Gurudwara', 'Manikaran, Manali, Manali Tehsil 175105, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (160, 'Jogini waterfall', 'Vashisht Village, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (161, 'Naggar Castle', 'Naggar, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (162, 'Van Vihar National Park', 'National Highway 21 | Kullu District, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (163, 'Solang-Nullah', '13 kilometers north of Manali, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (164, 'Gulaba', 'Rotang Pass Road, Manali, Manali Tehsil, India', 07)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (165, 'Manu Temple', 'Old Manali | 3 Km From Main Bazaar, Manali, Manali Tehsil, India', 07)");

        //Sikkim Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (166, 'Nathula Pass', 'Gangtok 737101, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (167, 'Tsomgo Lake', 'Gangtok, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (168, 'Buddha Park', 'Ravangla, Ravangla, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (169, 'Yume Samdong (Zero Point)', 'Lachung, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (170, 'MG Marg', 'M G Marg, Gangtok 737101, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (171, 'Hanuman Tok', 'Gangtok, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (172, 'Ranka Monastery', 'Lingdum, Gangtok, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (173, 'Baba Harbhajan Singh Memorial Temple', 'Between Nathula And Jelepla Pass, Gangtok, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (174, 'Kanchenjunga Falls', 'Pelling, India', 08)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (175, 'Namgyal Institute of Tibetology', 'outh of Gangtok Centre, Gangtok 737101, India', 08)");

        //Kochi Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (176, 'Kerala Kathakali Centre', 'near Santa Cruz Basilica | K.B. Jacob Road, Fort Kochi, Kochi (Cochin) 682001, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (177, 'Wonderla Amusement Park', 'Kakkanad Pallikara Rd, Pallikara, Kochi (Cochin) 683565, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (178, 'Kerala Folklore Museum', 'Folklore Jn | Thevare, Kochi (Cochin) 682013, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (179, 'Santa Cruz Basilica', 'Parade & KB Jacob Road | Fort Cochin, Kochi (Cochin) 682001, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (180, 'Mattancherry', 'Kochi (Cochin), India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (181, 'Vallarpadam Church', 'Near Vallarpadam Island, Kochi (Cochin), India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (182, 'Kashi Art Gallery', 'Bugar St | Fort Nagar, Kochi (Cochin) 844000, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (183, 'LuLu Mall', '34/1000 | N.H 47, Kochi (Cochin) 682 024, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (184, 'Sri Chottanikkara Bhagavathy Temple', 'Chottanikkara Mulanthuruthy Road, Ernakulam, Kochi (Cochin) 682 312, India', 09)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (185, 'Hill Palace of Tripunithura', 'Tripunithura, Kochi (Cochin) 682301, India', 09)");

        //Shrinagar Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (186, 'Dal Lake', 'Boulevard Rd, Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (187, 'Indira Gandhi Tulip Garden', 'foothills of the Zabarwan hills on the banks of Dal Lake, Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (188, 'Nigeen Lake', 'Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (189, 'Shankaracharya Hill', 'Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (190, 'Sonamarg', 'Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (191, 'Betab Valley', 'Pehelgam, Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (192, 'Mughal Gardens', 'Boulevard Rd, Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (193, 'Nishat Garden', 'Dal Lake, Srinagar 191121, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (194, 'Shalimar Bagh', 'Srinagar, India', 10)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (195, 'Sinthan Top', '48 Kms from Kokernag and 132 Kms from Srinagar, Srinagar, India', 10)");

        //Shimla Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (196, 'Viceregal Lodge', 'Shimla, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (197, 'Jakhu Temple', 'Shimla, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (198, 'Indian Institute of Advanced Study', 'H P University Road, Shimla 171005, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (199, 'Kalka - Shimla Railway', 'Shimla, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (200, 'The Ridge', 'Mall Road, Shimla, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (201, 'Shimla Christ Church', 'Near Municipal Library, Shimla 171001, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (202, 'Gaiety Heritage Cultural Complex', 'The Mall, Shimla 171001, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (203, 'Annandale', 'Nr. the Ridge | Near to Vidhan Sabha, Shimla 171001, India', 11)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (204, 'Green Valley', 'Nr. Kufri, Shimla, India', 11)");

        //kanyakumari place details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (205, 'Vivekananda Rock Memorial', 'Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (206, 'Padmanabhapuram Palace', 'Padmanabhapuram Village | Near Thuckalay, Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (207, 'Thanumalayan temple - Sthanumalayan Kovil', 'Suchindram, Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (208, 'Kanyakumari Beach', 'Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (209, 'Bhagavathy Amman Temple', 'Temple Road, Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (210, 'Sunset View Point', 'Sunset View point, The Hidden Twin Beach, Kanyakumari 629001, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (211, 'Thirparappu Falls', 'Thirunandhikarai, Kanyakumari 629161, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (212, 'Olakaruvi Falls', 'Azhagiapandipuram Village, Kanyakumari, India', 12)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (213, 'Courtallam Falls', 'Tirunelveli District, Kanyakumari, India', 12)");

        //Lakshadweep Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (214, 'Bangaram Island', 'Near Agatti Island, Bangaram, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (215, 'Minicoy Island', 'Lakshadweep, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (216, 'Kalpeni Islands', 'Union Territory | 71 km south of Androth, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (217, 'Agatti Island', 'Agatti Beach, Laksadweep | 682553, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (218, 'Kavaratti Island Lagoon', 'Kavaratti Island, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (219, 'Kadmat Islands', 'Amindivi Subgroup, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (220, 'Island of Thinnakara', '8 km northeast from Agatti, Agatti, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (221, 'Kavaratti Island Marine Aquarium', 'Kavaratti Island, India', 13)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (222, 'Society for Promotion of Nature Tourism and Sports (SPORTS)', 'Willingdon Island, Kadmat 682555, India', 13)");


        //Leh, Ladakh Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (223, 'Pangong Tso', 'Leh, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (224, 'Drass War Memorial', 'Kargil, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (225, 'Hall of Fame', 'Leh-Spituk highway south of Leh, Leh, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (226, 'Thiksey Monastery', 'Leh, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (227, 'Khardung La', 'India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (228, 'Gurdwara Pathar Sahib', 'Leh-Kargil Road | Ropar, Leh, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (229, 'Shanti Stupa', 'Chanspa, 194101, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (230, 'Deskit Monastery', 'Diskit, Nubra Valley, Leh, India', 15)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (231, 'Confluence of the Indus and Zanskar Rivers', 'Leh, India', 15)");


        //Kashmir place details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (232, 'Apharwat Peak', 'Near Alpather Lake | Khilanmarg, Gulmarg, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (233, 'Shankaracharya Hill', 'Srinagar, India' ,16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (234, 'Indira Gandhi Tulip Garden', 'foothills of the Zabarwan hills on the banks of Dal Lake, Srinagar, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (235, 'Dal Lake', 'Boulevard Rd, Srinagar, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (236, 'Gulmarg Gondola', 'Gulmarg Ski Area, Gulmarg, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (237, 'Nigeen Lake', 'Srinagar, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (238, 'Sonamarg', 'Srinagar, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (239, 'Betab Valley', 'Pehelgam, Srinagar, India', 16)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (240, 'Mughal Gardens', 'Srinagar, India', 16)");


        //Nainital Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (241, 'Nainital Lake', 'Nainital 263002, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (242, 'Goddess Naina Devi', 'Near Mallital, Nainital, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (243, 'Mukteshwar Temple', 'Mukteshwar | Near Chauli Ki Jali, Nainital 263138, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (244, 'High Altitude Zoo', 'Nainital, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (245, 'Eco Cave Gardens', 'Kaladungi Road | Mallital, Nainital, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (246, 'Kainchi Dham', '9 Km From Bhowali, Nainital 263132, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (247, 'Naina Peak', '6 Km From Nainital Town, Nainital 263001, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (248, 'Tiffin Top (Dorothy Seat)', 'Ayarpatta Hills, Nainital, India', 17)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (249, 'Nainital Governor`s House', 'Raj Bhawan, Nainital, India', 17)");


        //Mount Abu Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (250, 'Dilwara Jain Temples', 'Dilwara Rd, Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (251, 'Guru Shikhar', '15 Km From Mount Abu, Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (252, 'Mount Abu', 'Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (253, 'Sunset Point Mount Abu', 'Mount Abu, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (254, 'Nakki Lake', 'Mount Abu, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (255, 'Brahma Kumari World Spiritual University', ' Post Box No 2, Pandav Bhawan, Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (256, 'Adhar Devi Temple', 'Sirohi District, Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (257, 'Mount Abu Adventures', 'Mount Abu 307501, India', 18)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (258, 'Mount Abu Wildlife Sanctuary', 'Aravali Ranges, Mount Abu, India', 18)");

        //Shilong Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (259, 'Mawjymbuin Cave', 'Mawsynram Village, Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (260, 'Shillong View Point', 'Shillong Peak, Air Force Station, Shillong 793010, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (261, 'Don Bosco Centre for Indigenous Cultures', 'Mawlai, Shillong 793008, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (262, 'Mawphlang Sacred Forest', 'Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (263, 'All Saints Church', 'Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (264, 'Umiam Lake', 'Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (265, 'Elephant Falls', 'Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (266, 'Laitlum Canyons', 'Shillong, India', 19)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (267, 'Ward Lake', 'Centre Of the city, Shillong, India', 19)");


        //Khandala Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (268, 'Lohagad Fort', 'Lohagad Trek Rd | Near Visapur Fort, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (269, 'Bhaja Caves', 'Lonavala | Near Malavali Railway Station, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (270, 'Rajmachi Fort', 'Tungarli Lake | 6.5 Km from Lonavala, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (271, 'Kune Waterfalls', 'Lonavala-Khandala Valley, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (272, 'Bhushi Lake', '5 Km From Lonavala, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (273, 'Nagphani (Duke Nose)', 'Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (274, 'Shooting Point', 'St Mary Villa Road, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (275, 'Reversing Station', 'Hill Station, Khopoli Town | Outside Tunnel No. 26, Khandala, Lonavala, India', 20)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (276, 'Pavana Lake', 'Near Lonavala, Khandala, Lonavala, India', 20)");


        //Amarnath Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (277, 'Amarnath Cave', 'Baltal Amarnath Trek, Forest Block, Anantnag 192230, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (278, 'Amarnath Temple', 'Sonamarg, Anantnag 190001, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (279, 'Botanical Garden Kokernag', 'Kokernag, Anantnag, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (280, 'Kherbawani Asthapan', 'Near Masjid Baba Dawood Khaki, Anantnag, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (281, 'Aishmuqam Shrine', 'Hillock | Inside Deep Cave, Anantnag, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (282, 'Ziarat Baba Hyder Reshi', 'Danter Village, Anantnag, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (283, 'Nadeem`s house', 'Jamia Mohallah, Anantnag, India', 21)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (284, 'Masjid Baba Dawood Khaki', 'Reshi Bazaar, Anantnag, India', 21)");



        //Munnar Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (285, 'Top Station', 'Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (286, 'Photo Point', 'Towards Mattuppetty, Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (287, 'Rajamalai (Eravikulam) National Park', 'Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (288, 'Lock Heart Gap', 'Munnar _ Madurai National Highway, Mattupatty, Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (289, 'Kannan Devan Tea Museum', 'Nullatani Estate, Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (290, 'Kolukkumalai Tea Estate', 'Bodinayakanur, Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (291, 'Tea Gardens', 'Munnar 685612, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (292, 'Mattupetty Dam', 'In the way to top Station, Munnar, India', 22)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (293, 'Kundala Dam Lake', 'Top Station, Munnar, India', 22)");


        //Lahaul Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (294, 'Dhankar Gompa', 'Spiti Valley | Between Kaza And Tabo Town, India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (295, 'Kye Monastery', 'Spiti Valley | Near Spiti River, India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (296, 'Pin Valley National Park', 'Pin Valley National India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (297, 'Lahaul Valley', 'Near Indo-Tibetan Border, India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (298, 'Key Monastery', 'Key Monastery India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (299, 'Komick Village', 'Spiti Valley, India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (300, 'Baralacha Pass', 'Manali -Leh Highway, Keylong, India', 23)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (301, 'Suraj Tal', 'CB Range, Lahaul Valley, Himachal, Keylong, India', 23)");


        //Bikaner Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (302, 'Gajner Lake', 'Gajner Wildlife Sanctuary | Near Gajner Palace, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (303, 'The Royal Cenotaphs', 'Sagar, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (304, 'Kote Gate', 'Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (305, 'Prachina Museum', 'Junagarh Fort, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (306, 'Junagarh Fort', 'Thar Desert, Bikaner 334001, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (307, 'Shri Laxminath Temple', '4 Km From Junagarh Fort, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (308, 'Lalgarh Palace and Museum', 'Lalgarh Palace, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (309, 'National Research Centre on Camel', 'Jorbeer, Bikaner, India', 24)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (310, 'Jain Temple Bhandasar', 'Near Laxminath temple, Bikaner, India', 24)");


        //Lachen, Sikkim Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (311, 'Chopta Valley', 'Lachen, India', 25)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (312, 'Singba Rhododendron Sanctuary', 'Yumthang Valley, Lachen, India', 25)");



        //Amritsar place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (313, 'Harmandir Sahib', 'Golden Temple Road, Amritsar 143006, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (314, 'Akal Takht', 'Harmandir Sahib Complex | Opp. Darshani Deohri, Amritsar 143001, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (315, 'Jallianwala Bagh', 'Amritsar | Near golden temple, Amritsar 143001, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (316, 'Durgiana Temple', 'Near Hathi Gate Chownk | Opposite Goal Bagh., Amritsar 143001, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (317, 'Khalsa College', 'Ranjeet Avenue Main Road, Amritsar 143001, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (318, 'Tarn Taran Sahib', 'Tarn Taran Road, Amritsar 143022, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (319, 'Wagah Border', 'Attari-Wagah Border | Attari, Amritsar 143001, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (320, 'Mandir Mata Lal Devi', 'Amritsar, India', 26)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (321, 'Tempio d Oro', 'Golden Temple Rd., Amritsar, India', 26)");


        //Bundi place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (322, 'Cave Paintings', 'infront City Police station, Bundi 323001, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (323, 'Garh Palace', 'Nahar ka Chotta, Bundi 323001, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (324, 'Taragarh Fort', 'Nagpahari Hill, Bundi 323001, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (325, 'Chitrashala - Ummed Mahal', 'Garh Palace, Bundi 323001, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (326, 'Step Wells', 'Hadoti Region | Near Kota, Bundi, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (327, 'Nawal Sagar', 'Bundi, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (328, 'Dhabhai Kund', 'Near Raniji ki Baori, Bundi, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (329, 'Sukh Niwas Mahal', 'Bundi, India', 27)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (330, 'Raniji-ki-Baori', '35 Km From Kota Station, Bundi 323001, India', 27)");


        //Pachmarhi place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (331, 'Jata Shankar Cave', 'Hoshangabad District, Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (332, 'Bade Mahadev', 'Near Goddess Parvati, Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (333, 'Dhoopgarh', 'Satpura Mountain Range, Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (334, 'Bee Falls', 'Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (335, 'Satpura National Park', 'Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (336, 'Jata Shankar', 'Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (337, 'Pandav Caves', 'Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (338, 'Mahadeo Temple', 'Pachmarhi, India', 28)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (339, 'Reechgarh', 'Pachmarhi, India', 28)");


        //Kutch Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (340, 'Great Rann of Kutch', 'Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (341, 'Kala Dungar', 'near Dattatreya temple, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (342, 'Desh Devi Maa Ashapura', 'Mata no Madh, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (343, 'Indian Wild Ass Sanctuary', 'Little Rann, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (344, 'Koteshwar Mahadev Temple', 'Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (345, 'Shyamji Krishna Varma Smarak', 'Mandvi | Near Lohana Mahajan Wadi, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (346, 'Chhari Dhand', 'Kutch District, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (347, 'Ambe Dham Temple', 'Godhra, Kutch, India', 29)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (348, 'Kandla Port', 'Kutch, India', 29)");


        //Digha Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (349, 'Udaipur Beach', 'Digha, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (350, 'Talseri Beach', 'Digha, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (351, 'Digha', 'Digha 721428, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (352, 'Shankarpur Beach', 'Shankarpr Digha Road, Digha, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (353, 'Chandaneswar Temple', 'Digha, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (354, 'Marine Aquarium', 'Foreshore Road, Digha 721428, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (355, 'Amarabati Park', 'New Digha, Digha 721428, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (356, 'Wonder Land (Kajal Dighi)', 'Palsandapur Digha, Digha 721428, India', 30)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (357, 'Chandpur Beach', 'Digha, India', 30)");


        //Kohima Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (358, 'Kohima War Cemetery', 'NH 39, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (359, 'Naga Heritage Village', 'Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (360, 'Kisama Heritage Village', 'Kisama, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (361, 'Khonoma Village', 'Khonoma Village, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (362, 'Kohima Museum', 'Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (363, 'The Catholic Cathedral', 'Aradura Hill, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (364, 'Japfu Peak', '15 km south of Kohima Centre, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (365, 'Shilloi Lake', 'Phek, Hills Area, Kohima, India', 31)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (366, 'Intanki Wildlife Sanctuary', 'NH-39 | 35 kms from Dimapur, Kohima, India', 31)");


        //Delhi Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (367, 'Swaminarayan Akshardham', 'Nh 24, New Delhi 110002, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (368, 'Qutub Minar', 'Mahrauli, New Delhi 110030, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (369, 'Humayun Tomb', 'East Nizamudhin | Opp Nizamuddin Mosque, New Delhi 110002, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (370, 'Lodi Gardens', 'Lodi Road, New Delhi 110002, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (371, 'Rashtrapati Bhavan', 'Rajpath, New Delhi 110004, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (372, 'India Gate', 'Near Connaught Place New Delhi, New Delhi 110001, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (373, 'Rajpath', 'New Delhi, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (374, 'Bahai Lotus Temple', 'Lotus Temple Rd | Shambhu Dayal Bagh, Bahapur, Shambhu Dayal Bagh, Kalkaji, New Delhi 110019, India', 32)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (375, 'ISKCON Temple', 'Hari Krishna Hill, Sant Nagar | East of Kailash, New Delhi 110065, India', 32)");


        //Bodhgaya Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (376, 'Mahabodhi Temple', 'Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (377, 'Bodhi Tree', 'Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (378, 'Great Buddha Statue', 'Great Buddha Statue Road | Daijokyo Buddhist Temple, Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (379, 'Thai Monastery', 'Near Buddha Statue, Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (380, 'Royal Bhutan Monastery', 'Buddhist Town, Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (381, 'Indosan Nippon Japanese Temple', 'Near the Giant Buddha Statue, Bodh Gaya, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (382, 'Cankamana', 'Northern Bodhi Temple Complex, Bodh Gaya 824231, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (383, 'Root Institute', 'Gaya District, Bodh Gaya 824231, India', 33)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (384, 'Archaeological Society of India Museum', 'Gaya Center, Bodh Gaya 824231, India', 33)");


        //Konark Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (385, 'Konark Sun Temple', 'Kasia-Tamkuhi Road, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (386, 'Chandrabhaga Beach', 'Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (387, 'Ramchandi Beach', 'On Marine Drive | 7 Km From Konark, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (388, 'Ramachandi Temple', 'Near Sun Temple | On Banks Of Kusabhadra River, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (389, 'Archaeological Museum', 'Puri District, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (390, 'ASI Museum', 'Outside the Sun Temple, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (391, 'Vishnu Temple', 'Behind Ramachandi Temple, Konark, India', 34)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (392, 'Konark Natya Manadap', 'Arka Vihar, Konark 752111, India', 34)");


        //Chennai Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (393, 'Freemasons hall', 'Egmore area, chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (394, 'Fort st. George', 'Banks of bay of bengal, chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (395, 'Senate house', 'Campus of university of madras, near marina beach, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (396, 'Elliots beach', 'Anne besant nagar, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (397, 'Covelong beach', 'Coromandel coast, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (398, 'Velakanni church', 'Elliots beach at basant nagar, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (399, 'Kapaleeswarar temple', 'Mylapore, Chechen, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (400, 'Parthasarathy temple', 'Triplicane, Chennai, India', 35)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (401, 'Vadapalani temple', 'Bhakthavachalam colony 1st street, Vadapalani, Chennai, Tamil Nadu 600026, India', 35)");


        //Bangalore Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (402, 'Lal bagh', 'Mavalli,bengaluru,Karnataka 560004 Bangalore India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (403, 'Cubbon park', 'Behind high court of Karnataka,ambedkar veedhi,sampangi rama nagar,bengluru,Karnataka 560001 India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (404, 'Bannerghatta national park', 'Bannerghatta road,bengaluru,Karnataka 560083 India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (405, 'Iskcon temple', 'Hare krishnna hill,chord road,rajaji nagar,bengaluru,karnataka 560010', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (406, 'Visvesvaraya industrial and technological museum', 'p.B. No. 5216,Kasturba Road,Ambedkar veedhi,sampangi rama nagar,benaluru,karnataka 560001 India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (407, 'Ulsoor', 'Near eastern terminus of MG road, bangalore, Karnataka, India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (408, 'Wonderla', 'Mysore road,bengaluru,karnataka 562109 India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (409, 'Nandi temples', 'Bull temple rd,basavanagudi,bengaluru,Karnataka 560004', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (410, 'St. Marys basilica', 'Msgr.F.Noronha road,shivaji nagar,bengaluru,karnataka 560051 India', 36)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (411, 'Butterfly park', 'Zoo road,byrappanahalli,Karnataka 560083 India', 36)");


        //End of visited place table

        //Hotel name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Hotels + "(H_Id INTEGER PRIMARY KEY, H_Name TEXT, H_Addr TEXT, H_Price TEXT, Local_Market TEXT, P_H_Id INTEGER, FOREIGN KEY(P_H_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (101, 'Munjoh Ocean', 'Havelock, Andaman and Nicobar Islands, India', '12,928/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (102, 'Hotel Sentinel', 'Port Blair, Andaman and Nicobar Islands, India', '8,359/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (103, 'Sea Shell', 'Havelock, Andaman and Nicobar Islands, India', '7,866/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (104, 'Andaman Galley', 'Port Blair, Andaman and Nicobar Islands, India', '3,251/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (105, 'Mainak', 'Port Blair, Andaman and Nicobar Islands, India', '2,233/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (106, 'Anugama Resort', 'Port Blair, Andaman and Nicobar Islands, India', '2,775/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (107, 'Islander Inn', 'Port Blair, Andaman and Nicobar Islands, India', '3,031/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (108, 'Wild Orchid', 'Port Blair, Andaman and Nicobar Islands, India', '5,552/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (109, 'Hotel Galaxy', 'Port Blair, Andaman and Nicobar Islands, India', '1,592/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (110, 'Aparupa', 'Port Blair, Andaman and Nicobar Islands, India', '1,943/nyt', 'null', 01)");

        //Auli Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (111, 'XRA Cottage', 'Lower Auli, Near TV Tower,Auli,Uttarakhand,India', '3702/nyt', 'null', 02)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (112, 'Auli Resort', 'Govt SkiResort, Joshimath, Auli, Uttarakhand, India', '2542/nyt', 'null', 02)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (113, 'Hotel Auli D', 'Badrinath Road, Near Petrol Pump, Auli, India', '2508/nyt', 'null', 02)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (114, 'Alpine Camp', 'Joshimath, Chamoli - 246443, Lower Auli, Near TV Tower, Auli, India', '1858/nyt', 'null', 02)");


        //kalpetta Hotels Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (115, 'Wayanad Coffee Trail', 'Kalpetta, Muttil, Wayanad, Kalpetta', '11,227/nyt', 'null', 03)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (116, 'Peters Hill View Residency', 'Opposite Fire Station, Main Road NH212, Madiyoor, Kalpetta', '2,500/nyt', 'null', 03)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (117, 'The Summer Villa Homestay', 'Pramod gladson, mahathma nagar, kalpetta', '2,000/nyt', 'null', 03)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (118, 'Misty Hills Resort and Hotel', 'Eranjivayal, Pinangode Road Kalpetta Wayanad Near Chamanure Jewellery, Kalpetta', '1,100/nyt', 'null', 03)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (119, 'Icon Residency', 'iCon Residency, CPI Office Road , Opp-HIMUP School, Near Old Bus Stand, Kalpetta', '700/nyt', 'null', 03)");


        //Goa Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (120, 'Radisson blu resort', 'Cavelossim Beach, Mobor 403001 Goa India', '25,999/nyt', '1.Sagar Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (121, 'Hardrock hotel', '370/14, Near KFC, Porba Vaddo, Calangute, Bardez, Goa 403516, India', '12,500/nyt', '1.Anjuna Flea Market, 2.Baga Night Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (122, 'Fortune acron regina', 'Off Fort Aguada Road, Candolim, Bardez, Goa 403515, India', '7999/nyt', '1.Candolim Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (123, 'Hotel fidalgo', 'Panjim, Goa 403001, India', '5136/nyt', '1,Ponda Market, 2.Bagayatdar Bazaar', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (124, 'The tree house blue', 'Curilo, Pacheco Vaddo, Majorda Salcete, Margao, Goa 403713, India', '3800/nyt', 'null', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (125, 'The Queeny', 'Queeny Nagar, Velsao - Pale, Near Airport Road, Vasco da Gama, Goa 403712, India', '3000/nyt', '1.Queen Nagar Market, 2.Nagoa Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (126, 'The Palm Trees Resort', 'Patnem Beach, Canacona, Goa 403702, India', '4500/nyt', '1.Calangute Market Square', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (127, 'Castle House Palolem', 'Major District Road 49, Palolem, Canacona, Goa 403702, India', '2,898/nyt', '1.Palolem Market', 04)");


        //Pondicherry Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (128, 'Sasirekha Residency', '100,subbayasalai, Pondicherry', '2,000/nyt', 'null', 05)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (129, 'Jp Residency', 'Ajees Nagar, Puducherry to Villupuram Road, Reddiyarpalayam, Pondicherry - 605010', '1,919/nyt', 'null', 05)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (130, 'Hotel Abirami Residency', 'No.92, Anna Salai, Pondicherry', '1,900/nyt', 'null', 05)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (131, 'Aditya Inn', 'No14, Ayyanar Koil Street, Raja Nagar, Near Pondicherry Bus stand, Pondicherry - 605013', '1444/nyt', 'null', 05)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (132, 'Sri Sabthagiri', '2125 5 Maraimalai Adigal Salai Opposite to Main Bus Stand, Pondicherry, India', '1,200/nyt', 'null', 05)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (133, 'Hotel Suriyapriya - Cuddalore', 'No 1 Nethaji Road Manjakuppam, Pondicherry', '634/nyt', 'null', 05)");


        //Jaisalmer Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (134, 'Adventure Camp By Stunning Jaisalmer', 'Lakhmana Road, Desert campsite, Jaisalmer', '2946/nyt', 'null', 06)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (135, 'Desert Safari Experts', 'Sam Sand Dunes, Jaisalmer', '900/nyt', 'null', 06)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (136, 'Hotel Jeet Mahal', 'Near Fort Gate, Aasni Road , Jaisalmer', '812/nyt', 'null', 06)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (137, 'Backpacker Panda Oasis', 'Near SBBJ Bank and Near Govt Bus Stand, Shiv Road, Jisalmer', '400/nyt', 'null', 06)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (138, 'Pol Haveli', 'Near Hanuman Circle, Dedansar Road, Jaisalmer', '366/nyt', 'null', 06)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (139, 'Hotel Tokyo Palace', 'Near Fort, Airforce Circle, Dhibba Para, Jaisalmer', '260/nyt', 'null', 06)");


        //Manali Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (140, 'Hotel Mahajan', 'Hadimba Temple Road, Tehsil Manali', '1,200/nyt', 'null', 07)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (141, 'Rising Star', 'Hadimba Road Manali, Dist kullu HP175131, Manali', '1,012/nyt', 'null', 07)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (142, 'Aroma Cottages', 'Simsa Road, Manali', '878/nyt', 'null', 07)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (143, 'The Lost Tribe Hostels', 'The Lost Tribe Hostels, Manali-Naggar Road, Manali', '371/nyt', 'null', 07)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (144, 'Hotel Beas View', 'Loghut road, Manali', '846/nyt', 'null', 07)");


        //Sikkim Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (145, 'The royal plaza', 'Upper syari,gangtok,Sikkim 737102', '9235/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (146, 'Hotel mount siniolchu', 'VIP colony road,near enchey monastery,gangtok,Sikkim 737103', '8405/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (147, 'Norbu ghang resort', 'Pelling west ,Sikkim 737113', '7696/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (148, 'Hotel yangthang heritage', 'Kazi road,gangtok,Sikkim 737101', '6451/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (149, 'Summit golden crescent resort & spa', 'Near sichey co-operative taxi stand,lower sichey,gangtok,Sikkim 737101', '5178/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (150, 'Hotel new orchid', 'Development area rd, sungava gangtok,Sikkim 7371010', '4696/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (151, 'The nettle & fern hotel', 'Jiwan theeng marg,development area,gangtok,Sikkim 737101', '3270/nyt', 'null', 08)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (152, 'Maya inn', 'Indira bypass Rd,Amdo Golai,Vishal gaon,gangtok,Sikkim 737102', '2976/nyt', 'null', 08)");


        //kochi Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (153, 'The Gateway Hotel Marine Drive', 'Shanmugham Road, Kochi', '6,545/nyt', 'null', 09)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (154, 'The PGS Vedanta', 'Lissie Junction, Banerji Rd, Ernakulam North, Kaloor, Kochi', '3500/nyt', 'null', 09)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (155, 'Keys Hotel Kochi', 'Pandit Karuppan Road, Santhi Nagar, Behind Folklore Museum, Kochi', '3,040/nyt', 'null', 09)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (156, 'Pearl Palace', 'Behind Shenoys, Ymca Junction, Chittoor Road, Kochi', '2,500/nyt', 'null', 09)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (157, 'Palm Grove Service Villa', 'Opp: Edappally Traffic Police Station , Market road, Kochi', '1,350/nyt', 'null', 09)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (158, 'Hotel St. Antonys Lodge', 'Basin Road, Canal Side, Near High Court Junction, Ernakulam City Market, Kochi', '297/nyt', 'null', 09)");


        //Srinagar Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (159, 'Iram houseboat', 'GOLDEN DAL LAKE OPPOSITE GHAT no 9, Srinagar', '2,750/nyt', 'null', 10)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (160, 'Hotel Grand Hill', 'Kursoo Rajbagh, near masjib , Srinagar', '2,358/nyt', 'null', 10)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (161, 'Royal Pearl Hotel, Srinagar', 'Khayam Road, Near Khyber Hospital, Srinagar', '2,000/nyt', 'null', 10)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (162, 'Hotel Heaven Canal', 'Ghat no 1, Dal Gate, Srinagar', '1,707/nyt', 'null', 10)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (163, 'Hotel Kashmir Inn', 'khayam Chowk, Opp lane of Khyber hospital, Srinagar', '1,000/nyt', 'null', 10)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (164, 'Switzerland Houseboat', 'boulevard road ,front line ghat no 12, Srinagar', '825/nyt', 'null', 10)");


        //Shimla Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (165, 'The Oberoi Cecil', 'Chaura Maidan Road, Shimla', '19,000/nyt', 'null', 11)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (166, 'Hotel Willow Banks', 'Mall Road, Near Tourism Lift, Shimla', '8,092/nyt', 'null', 11)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (167, 'Snow Valley Resorts Shimla', 'Ghora Chowki, Near Dargah, Shimla', '5,635/nyt', 'null', 11)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (168, 'Cedar Height Resorts', 'CHAIL-KUFRI ROAD, KOTI SHIMLA', '2,300/nyt', 'null', 11)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (169, 'Hotel Basant', 'Near Guru Dwara Singh Sabha , Cart Road, Shimla', '900/nyt', 'null', 11)");


        //Kanyakumari Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (170, 'Anantya Resorts', 'State Highway 45, Kaliel Village, Chittar Lake, Kanyakumari District - 629103, Tamil Nadu, India', '6,798/nyt', 'null', 12)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (171, 'Sea View', 'Hotel Seaview, East Car Street,Kanyakumari - 627 702 Tamilnadu, India', '3,375/nyt', 'null', 12)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (172, 'New Cape Hotel', '5/69 main road,Church Road', '1214/nyt', 'null', 12)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (173, 'Hotel Bharani', 'Near Railway Station, Main Road, Kanyakumari', '1,150/nyt', 'null', 12)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (174, 'Hotel Shyama', 'Thalavai Street, Meenakshipuram, Nagercoil', '941/nyt', 'null', 12)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (175, 'Hotel Sri Maniya', 'Sannathi Street, Kanyakumari, Tamil Nadu 629702', '691/nyt', 'null', 12)");


        //Lakshawadeep Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (176, 'Doctor Villa- By Rightstay', 'Agatti, Lakshadweep', '9,210/nyt', 'null', 13)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (177, 'Island Home Stay', 'PP Junction,Aggatti, Lakshadweep, 682553', '10000/nyt', 'null', 13)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (178, 'Kasims Homestay', 'Gandhi Road, Agatti Island', '11000/nyt', 'null', 13)");


        //Leh Ladakh Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (179, 'ladakh view home stay', 'near leh palace Stalam Leh', '3,007/nyt', 'null', 15)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (180, 'Hotel Padma', 'Fort Road, Leh', '2,331/nyt', 'null', 15)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (181, 'Hotel Snow Leopard Hunder', 'HUNDER NUBRA LEH LADAKH', '2,130/nyt', 'null', 15)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (182, 'Nezer View Guest House', 'Old Road, Ladakh, Leh', '1,850/nyt', 'null', 15)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (183, 'Rainbow Guest House', 'karzoo - chanspa, Leh', '1,515/nyt', 'null', 15)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (184, 'Spacious & Well-Kept Dormitory with Kitchen in Yortung Leh', 'Shanti Stupa Road Shanti Stupa Road', '261/nyt', 'null', 15)");


        //Kashmir Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (185, 'The vintage gulmarg', '2739,circular road,gulmarg,jammu & Kashmir 193403', '8245/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (186, 'Hotel Dar-Es-Salam', 'Hazratbal road,Srinagar,jammu & Kashmir 190006', '8194/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (187, 'Hotel hilltop', 'Near gondola,opposite ice skating ring,gulmarg,jammu & Kashmir 193403', '7600/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (188, 'RK sarovar portico', 'Next to united nations head office,Srinagar,jammu & Kashmir 190001', '5500/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (189, 'Hillscape Inn', '44 dewan bagh,nishat Dal lake,Srinagar,jammu & Kashmir 191121', '3694/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (190, 'Hotel shefaf', 'Near JLNM hospital,rainwari hazratbal road,karapura,Srinagar,jammu & Kashmir 190003', '2800/nyt', 'null', 16)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (191, 'Hotel pacific', 'Opposite chinar garden,kohna khan,dalgate,Srinagar,jammu & Kashmir 190001', '2634/nyt', 'null', 16)");


        //Nainital Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (192, 'UNA Comfort Misty Oaks Bhowali', 'Shyamkhet, Ramgarh Road,Bhowali,Nainital', '5,702/nyt', 'null', 17)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (193, 'High mountain trekking camp', 'High mountain trekking Camp', '4,284/nyt', 'null', 17)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (194, 'Gemini Inn, Bhowali', '11 km from Nainital, Ramgarh Road, Bhowali Nainital', '3,450/nyt', 'null', 17)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (195, 'United - 21 Nature Paradise Resort', 'Bahuguna Niwas, Naukuchia Tal Rd., Naukluchiata', '3,060/nyt', 'null', 17)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (196, 'Hotel Lake Inn', 'Bhimtal 20 Kms from Nainital, Near TRC, Bhimtal, Nanital', '1,275/nyt', 'null', 17)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (197, 'Fiesta Hotel', '2 kms from Kathgodam Railway Station,Ranibagh, Kathgodam, Nainital', '1,200/nyt', 'null', 17)");


        //Mount Abu Hotel details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (198, 'Hotel Vinayak', 'Near Toll-Naka Old ,St.Mary road, Mount Abu', '1,020/nyt', 'null', 18)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (199, 'Hotel Rahul', 'Gaumukh Circle, Main Road, Mount Abu', '1,111/nyt', 'null', 18)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (200, 'Hotel Da Kabras Jasoda', 'Hotel Da Kabra`s Jasoda, Behind Patel Hostel, Sunset Road, Mount Abu, Rajasthan - 307501, India', '990/nyt', 'null', 18)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (201, 'Hotel Blue Valley', 'Behind Check Post, Mount Abu', '1,455/nyt', 'null', 18)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (202, 'Hotel Silver Oak', 'Near Hotel Vrindavan,Opp.Bus Stand Mount Abu', '4,320/nyt', 'null', 18)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (203, 'Welcome Heritage Connaught House', 'Rajendra Marg, Mount Abu', '8,200/nyt', 'null', 18)");


        //Shillong Hotel details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (204, 'Hotel Poinisuk', 'Lady Veronica lane,Nongkynrih,Shillong', '5,431/nyt', 'null', 19)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (205, 'Centre Point', 'Police Bazar Khyndailad E K Hills', '5,190/nyt', 'null', 19)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (206, 'Hotel Silk Route', 'Keating Road, Police Bazar', '4,644/nyt', 'null', 19)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (207, 'Hotel Polo Towers', 'Oak land Road, Near Oakland Post Office, Shillong', '4,096/nyt', 'null', 19)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (208, 'Hotel Barbareek Inn', 'Lewdu Mawlonghat, Anjali Shillong', '3,000/nyt', 'null', 19)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (209, 'Eden Residency', 'Modrina Bhavan,poloce bazar,shillong', '2,838/nyt', 'null', 19)");


        //Khandala Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (210, 'Hilton Shillim Estate Retreat and Spa', 'Village: Shilimb | Post: Pawana Nagar | Taluka: Maval | Dist: Pune, Maharashtra, India', '19,430/nyt', 'null', 20)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (211, 'Obetel Grande Resort', '53/3 opposite Lagoona Resort', '5,949/nyt', 'null', 20)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (212, 'Picaddle Boutique Resort', '137 A, Opp Tata Power House, Khandala', '5,759/nyt', 'null', 20)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (213, 'Aroma Cottage', 'Opp Girivihar, Near Raj Bhavan,Gold Valley Rd,Lonavala - 410401', '2,600/nyt', 'null', 20)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (214, 'Kings Inn Holiday Home', 'Plot No - 2, Bara Bungalow Road, Behind Shahani Holiday Home', '2135/nyt', 'null', 20)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (215, 'Hotel Sai Niwas', 'Near wax museum, Opp old Mumbai-Pune Highway Toll Plaza', '1,260/nyt', 'null', 20)");



        //Amarnath Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (216, 'Pine Grove Resorts', 'Nunwan Near Amarnath Base Camp, Pahalgam', '1,715/nyt', 'null', 21)");


        //Munnar Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (217, 'Plum Judy - The Leisure Hotel', 'KSEB Tunnel Road, Munnar', '13,141/nyt', 'null', 22)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (218, 'Golden Ridge Mountain Resort', 'Chinnakani PO, Periyakanal Muttukad road, Munnar', '5,998/nyt', 'null', 22)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (219, 'Bracknell Forest', 'Bison Valley Road, Ottamaram, Munnar', '2,685/nyt', 'null', 22)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (220, 'Summer breeze resorts', 'Near sengulam dam, Muthuvankudi, Munnar', '1,720/nyt', 'null', 22)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (221, 'CHAI Guest House', 'Near St. Lourdes Church, Vattiyar P.O, Kallar, Munnar', '1,088/nyt', 'null', 22)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (222, 'The Green Dale Homestay', 'Near Pallivasal Power House,Chithirapuram PO, Munnar,Iduki, India', '1,098/nyt', 'null', 22)");


        //Lahaul-Spiti Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (223, 'Sisu Camp', 'Village Sisu', '5,781/nyt', 'null', 23)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (224, 'Jispa Journey Camps', 'Village Gemur Lahaul Spiti', '2,351/nyt', 'null', 23)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (225, 'Cosy rooms in a guesthouse in Kaza', 'Village & P.O Kaza', '1,540/nyt', 'null', 23)");



        //Bikaner Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (226, 'The Lallgarh Palace - A Heritage Palace Hotel', 'Ganganagar Road, Mehron Ka Bas, Bikaner', '4,629/nyt', 'null', 24)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (227, 'Vesta Bikaner Palace', '10th Mile Stone,  Jaipur- Bikaner Highway Himmatsar', '2,584/nyt', 'null', 24)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (228, 'Hotel Chirag', 'Sudershna nagar', '2,537/nyt', 'null', 24)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (229, 'Hotel Marudhar', 'Ambedkar Circle, Hospital Road', '850/nyt', 'null', 24)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (230, 'Hotel Pooja Palace', 'Near Pooja Cyber World, x ray lane, opp pbm child hospital', '633/nyt', 'null', 24)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (231, 'Shri Ram Heritage', 'A-228, Sardul Ganj, Bikaner', '167/nyt', 'null', 24)");


        //Lachen Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (232, 'Hotel Midland', 'Near Police check post,Lachen', '3,684/nyt', 'null', 25)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (233, 'Hotel Yangla', 'Lachen', '3,262/nyt', 'null', 25)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (234, 'Snow Retreat', 'Beside BSNL Tower,Lachen', '2,750/nyt', 'null', 25)");


        //Amritsar Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (235, 'Taj Swarna', 'Plot No. C-3, Outer Circular Road , Opp. Basant Avenue', '10,530/nyt', 'null', 26)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (236, 'Ranjitvilas', 'PEARL LANE,PALM GROVE,AIRPORT ROAD', '4,655/nyt', 'null', 26)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (237, 'Hotel Abode', 'Golden Temple Rd, Jallan Wala Bagh, Katra Ahluwalia', '2,650/nyt', 'null', 26)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (238, 'Hotel Basera', '223, Queens Rd, Amritsar, Punjab 143001', '1,972/nyt', 'null', 26)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (239, 'Hotel Golden Castle', 'Near Jalianwalah bagh, Chownk Ghanta ghar, Near Golden Temple', '1,016/nyt', 'null', 26)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (240, 'Hotel Amritsar inn by HK Group', 'Adjoining Hotel HK Continental, Inder Palace Road, Near Civil Hospital', '1,109/nyt', 'null', 26)");


        //Bundi Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (241, 'Ishwari Niwas Palace', '1-Civil Lines,Bundi', '3,000/nyt', 'null', 27)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (242, 'Hotel Bundi Haveli', '107 BALCHAND PARA', '2,257/nyt', 'null', 27)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (243, 'Kasera Paradise', 'Below the Palace, Near Surang Gate Bundi', '1,551/nyt', 'null', 27)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (244, 'Dev Niwas A Heritage Hotel', 'Maaji Sahib Ki Haveli, Opp Purani Kotwali, Bundi', '877/nyt', 'null', 27)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (245, 'Bundi Inn', 'Near Elephant Memorial , Nahar ka Chotta Bundi Palace Road, Bundi', '848/nyt', 'null', 27)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (246, 'Haveli Prince', 'haveli prince,near sagar lake', '632/nyt', 'null', 27)");


        //Pachmarhi Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (247, 'WelcomHeritage The Golf View', 'Mahadev Road, Near Forest Colony, Pachmarhi Cantt', '10,277/nyt', 'null', 28)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (248, 'Hotel Park View', 'Patel road, Pachmarhi', '3,817/nyt', 'null', 28)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (249, 'Misty Meadows', 'Patel Road,Pachmarhi', '2,395/nyt', 'null', 28)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (250, 'Hotel Pandav Panchmarhi', 'Arvind Marg, Pachmarhi 461881, India', '1,933/nyt', 'null', 28)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (251, 'ARK RESORT', 'ARK Resort , Civil Lines, Pachmarhi, Madya Pradesh India , 461881', '1,858/nyt', 'null', 28)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (252, 'Woodland', 'Near Pachmarhi Lake, Dhupgarh Road Pachamrhi', '2,207/nyt', 'null', 28)");

        //Kutch hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (253, 'TORAN RANN', 'DHORDO KUTCH', '7,498/nyt', 'null', 29)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (254, 'Toran Resort Dhrobana', 'Kalo Dungar Road, Near Kalo Dungar', '6,403/nyt', 'null', 29)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (255, 'Serena Beach Resort Kutch', 'Near Shyamji Krishna Varma Ashram, Border Line, Salaya Maska Road, Kutch, Mandvi', '4,376/nyt', 'null', 29)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (256, 'RANN VILLIAGE', 'Near Bhirandiyara Border Check Post, White Desert - Khavda Road, Village Bhirandiyara, Dhordo, Bhuj', '3,702/nyt', 'null', 29)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (257, 'LA KAMP', 'RUDRAMATA', '3,020/nyt', 'null', 29)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (258, 'RANN KANDHI', 'GOREVALI, DHORDO', '2,345/nyt', 'null', 29)");

        //Digha Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (259, 'Suncity Resort', 'East midnapur,mandanmani,bengal', '4,947/nyt', 'null', 30)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (260, 'HOTEL GREEN HOUSE', 'Barister Colony, Old Digha', '3,875/nyt', 'null', 30)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (261, 'Hotel Mahamaya Dham', 'purba medinipur, new digha, digha, west bengal', '3,819/nyt', 'null', 30)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (262, 'United - 21 Beach View - Mandarmoni', 'Village and P.O. Dadanpatrabar, Dist - Medinipur East', '2,795/nyt', 'null', 30)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (263, 'Lahari Guest Inn', 'Purba Midnapore, New Township, Digha - 721463, Near Yuba Abhas', '2,453/nyt', 'null', 30)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (264, 'Hotel Rubina', 'Economic Hotel sector, Digha', '2,142/nyt', 'null', 30)");


        //kohima Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (265, 'Hotel Legacy', 'Upper Bayavu Hills', '5,909/nyt', 'null', 31)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (266, 'de Oriental Grand', 'Themezie, High School Road, National Highway 61', '5,465/nyt', 'null', 31)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (267, 'Hotel Japfu', 'NH39, B.O.C', '3,951/nyt', 'null', 31)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (268, 'Hotel Vivor', 'NH -61 KOHIMA, NAGALAND', '2,991/nyt', 'null', 31)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (269, 'Heritage Hotel', 'DC Bunglow Raj Bhawan', '2,685/nyt', 'null', 31)");


        //Delhi hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (270, 'The Lalit New Delhi', 'Near Modern School, Barakhamba Avenue', '12,031/nyt', 'null', 32)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (271, 'Welcome Hotel Dwarka - ITCs hotel group', 'Plot No 3, District Center, Sector 10, Dwarka', '7,590/nyt', 'null', 32)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (272, 'The Pllazio Hotel - Gurgaon', 'Plot No. 292-296, Sec 29,City Centre', '7,419/nyt', 'null', 32)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (273, 'Pride Plaza Hotel Aerocity New Delhi', 'Aseet 5 A, Hospitality District, Indira Gandhi International Airport', '5,549/nyt', 'null', 32)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (274, 'Hotel Hari Piorko', '4775, Main Baza, Paharganj, New Delhi Near Chhe Totti chowk (2 minutes Walking distance from NDLS)', '2,221/nyt', 'null', 32)");


        //Bodhgaya Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (275, 'Bodhgaya Regency Hotel', 'Near Japanese Temple', '8,295/nyt', 'null', 33)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (276, 'Hotel The Imperial', 'Village mastpura NH 83, Gaya Dobhi Road Bodhgaya India', '5,371/nyt', 'null', 33)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (277, 'Hotel Sujata', 'Near Japanese Temple, Japanese Temple Road', '3,702/nyt', 'null', 33)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (278, 'Kundan Bazar Guest House', 'Kundan Bazar Guest House, New Taridih Village, Bodhgaya, Bihar', '1,500/nyt', 'null', 33)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (279, 'RAMA GUEST HOUSE', 'Near North Kalachakra Ground', '570/nyt', 'null', 33)");


        //Konark Hotel Detais
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (280, 'Lotus Resort', 'Lotus Resort Konark, Near Ramachandi Temple, Marine Drive Road', '4,180/nyt', 'null', 34)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (281, 'Nature Camp Konark Retreat', 'Village - Khalakata Patna, Po - Konark', '1,887/nyt', 'null', 34)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (282, 'Sun Temple Hotel', 'NEAR BUS STAND', '1,505/nyt', 'null', 34)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (283, 'Pagoda Inn', 'NEAR NEW BUS STAND', '1,226/nyt', 'null', 34)");


        //Chennai Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (284, 'Trident', '1/24,grand southern trunk road,meenabakkam,Chennai tamilnadu 600027 India', '9900/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (285, 'The accord metropolitan', 'Plot no 35,GN chetty road,T nagare,Chennai,tamil nadu 600017 India', '5500/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (286, 'Turyaa Chennai', '144/7,old mahabalipuram Rd,okkiyampet,Indira nagar,Kottivakkam,Chennai,tamil nadu 600041 India', '4852/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (287, 'The pride hotel', '216,E V R periyar salai,near sangam cinema,mount poonamalle hign Rd,kilpauk,Chennai,tamil nadu 600010 India', '3788/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (288, 'Emerald hotel', '22,poonmallee high road,near Everest bus stop,periamet ,near central railway station,Chennai,tamilnadu 60003 India', '2486/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (289, 'Hotel Chennai gate', 'Egmore,Chennai,tamilnadu,India', '1800/nyt', 'null', 35)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (290, 'Hotel city tower', '148,waltax road,park town central,Chennai,tamil nadu 60003,India', '1450/nyt', 'null', 35)");


        //Bangalore Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (291, 'The oberoi', '37-39,MG road,yellappa garden,yellappa chetty layout,sivanchetti gardens,bengluru 560001 Karnataka India', '13,915/nyt', '1.Sobha Alexander Plaza, 2.Ulsoor Market, 3.Malik Bazar', 36)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (292, 'Lemon tree premier', '2/1,st johns road,hermit colony,ulsoor,bengaluru,Karnataka 560042 India', '7940/nyt', '1.Commercial street, 2.Russel Market', 36)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (293, 'The fern citadel hotel', 'No. 41,seshadri road,Ananda rao circle,Bengaluru,Karnataka 560004 India', '4932/nyt', '1.Jayanmahal Janatha Bazaar, 2.Hajen Shopping centre, 3.Ranasinghpete Shopping complex', 36)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (294, 'Nandhana hometel', 'No 4033,100ft road,hal 2nd stage,next to domlur flyover,Indiranagar,bengaluru,karnataka 560038 India', '2466/nyt', '1.KM Plaza, 2.Prakash Plaza, 3.kemp fort shopping complex', 36)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (295, 'Arra suites', 'Vidya nagar cross road behind aviation college,chikkajala, bengaluru,Karnataka 562157 India', '2466/nyt', '1.sante Market, 2.Government silk cocoon market', 36)");


        //End of hotel name table

        //Mall name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Malls + "(Malls_Id INTEGER PRIMARY KEY, Malls_Name TEXT, Malls_Addr TEXT, P_Malls_Id INTEGER, FOREIGN KEY(P_Malls_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (101, 'Aberdeen Bazaar', 'Aberdeen Bazar, Aberdeen, Port Blair, Andaman and Nicobar Islands 744104', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (102, 'Sagarika Emporium', 'DAG Colony, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (103, 'Mahananda Complex Mall', 'Great Andaman Trunk Rd, Rangat, Andaman and Nicobar Islands 744205', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (104, 'City Super Shoppe', 'Aberdeen Bazar, Rajiv Gandhi Nagar, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (105, 'Sapna Complex', 'VIP Rd, Pathergudda, Bhathu Basti, Port Blair, Andaman and Nicobar Islands 744103', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (106, 'Oasis Plaza', 'Great Andaman Trunk Rd, Dairy Farm, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (107, 'DiveIndia', 'SH5, 744211', 01)");

        //Kalpetta Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (108, 'Focus Mall', 'Rajaji Rd, Tazhekkod, Kozhikode', 03)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (109, 'Markaz Shopping Complex', 'Markaz complex, Mavoor road, JafferKhan Colony Rd, Arayidathupalam, Kozhikode', 03)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (110, 'City Point Shopping mall', 'City Point Shopping Mall, Kozhikode Road, Kozhikode - Nilambur - Gudalur Rd, Karuvambram, Manjeri', 03)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (111, 'C D Tower', 'Mini-Bypass Rd, Thiruthiyad, Kozhikode', 03)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (112, 'City Mall', 'National Highway 17, Vellayil, Kozhikode', 03)");

        //Goa Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (113, 'Valanka Shopping Mall', 'Calangute - Anjuna Rd, Naika Vaddo, Bardez, Calangute, Goa 403516, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (114, 'Caculo Mall', '16, Shanta, St. Inez Road, Near Vintage, Hospital, Panjim, Goa 403001, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (115, 'Mall De Goa', 'Mall De Goa, NH 17, Alto Porvorim, Penha de França, Goa 403521, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (116, 'Brioni', 'Winifred Towers, Dongrim, Goa 403104, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (117, 'Bkmskmxs', 'Hksxk ksks lksam, Goa 403104, India', 04)");

        //Pondicherry Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (118, 'Mega Mart', 'No. 107, Mission Street', 05)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (119, 'Takla Makan', 'Kuruchikuppam, Puducherry, 605012', 05)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (120, 'Providence Mall', 'Ambedkar Nagar, Orleanpet, Puducherry, 605005', 05)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (121, 'Gulf Shopping', 'M.G. Road, MG Road, Near Hamdam Hospital, Kottakuppam, Puducherry, 605104', 05)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (122, 'Annamalai Complex', '63, Cuddalore Road, Cuddalore Road, Near Village Administrative Office, Ariyankuppam, Puducherry 605007', 05)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (123, 'Max Fashion', '193, Opp. Atithi Hotel, Mahatma Gandhi Rd, Heritage Town, Puducherry, 605001', 05)");


        //Jaisalmer Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (124, 'Poonam Plaza', 'Jai Narayan Vyas Colony, Jaisalmer, Rajasthan 345001', 06)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (125, 'Shree Shanker Complex', 'Hanuman Cir Rd, Sadar Bazar, Jaisalmer, Rajasthan 345001', 06)");


        //Sikkim Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (126, 'Metro Point Shopping Complex', 'NH-31A, Tadong, Gangtok, Sikkim 737102', 08)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (127, 'Kanchenjunga Shopping Complex', 'Tadong, Gangtok, Sikkim 737102', 08)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (128, 'Mg Marg Market', 'MG Marg, Arithang, Gangtok, Sikkim 737101', 08)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (129, 'Sypraj Plaza', 'Lal Market Rd, Arithang, Gangtok, Sikkim 737101', 08)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (130, 'NHPC Complex', 'NH-31A, Tadong, Gangtok, Sikkim 737102', 08)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (131, 'Pawan Mega Mart', 'MG Marg, Arithang, Gangtok, Sikkim 737101', 08)");


        //Kochi Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (132, 'LuLu International Shopping Mall', '34/1000, N.H 47, Edapally, Kochi, Kerala 682024', 09)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (133, 'Abad Nucleus Mall', 'NH 49, Maradu Kochi, Poonithura, Maradu, Ernakulam, Kerala 682304', 09)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (134, 'Centre Square Mall', ' 40/6972, Rajaji Junction, Mahatma Gandhi Road, Shenoys, Kochi, Kerala 682035', 09)");


        //Srinagar Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (135, 'M S Shopping Mall', 'Residency Road, Regal Chowk, Munshi Bagh, Srinagar, Jammu and Kashmir 190001', 10)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (136, 'I Q Shopping Mall', 'Airport Road, Hyderpora, Srinagar, Jammu and Kashmir 190014', 10)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (137, 'Fair Deal Shopping Complex', 'Lambert Lane, Regal Chowk, Srinagar, Jammu and Kashmir 190001', 10)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (138, 'Badami Bagh Cantonment Shopping Centre', 'M A Road, Sonawar Bagh, Sonwar Bagh, Srinagar, Jammu and Kashmir 190004', 10)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (139, 'Aksa Mall', 'Airport (IG) Rd, Hari Singh High Street, Saraibal, Srinagar, Jammu and Kashmir 190008', 10)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (140, 'Chinar Mega Mall', 'Chinar Bagh, Srinagar, Jammu and Kashmir 190001', 10)");


        //Shimla Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (141, 'The Mall Shimla', 'Rivoli to Ridge Road, The Mall, Shimla, Himachal Pradesh 171001', 11)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (142, 'Nabha Shopping Complex', 'Shopping Complex, Cart Road-Nabha-Phagli Rd, Nabha, Shimla, Himachal Pradesh 171004', 11)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (143, 'REC Padam Dev Complex', 'Mall Rd, The Mall, Shimla, Himachal Pradesh 171001', 11)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (144, 'Aossum', '5, Exchange Building, Mall Rd, The Mall, Shimla, Himachal Pradesh 171001', 11)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (145, 'Banna Mall Ganda Mall', 'Ground Floor, Gunj Rd, Lower Bazar, Shimla, Himachal Pradesh 171001', 11)");


        //Kanyakumari Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (146, 'Tamilnadu Shopping Center', '5/21, Main Road, Near Sivanthi Hospital, Kanyakumari, Tamil Nadu 629702', 12)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (147, 'Noor Shopping Centre', 'Vivekanandapuram, Kanyakumari, Tamil Nadu 629702', 12)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (148, 'Rajas Mall', 'Chettikulam Junction, Nagercoil, Tamil Nadu 629001', 12)");


        //Leh Ladakh Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (149, 'Antelope complex', 'Main Bazaar Rd, Leh, 194101', 14)");


        //Kashmir Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (150, 'Vermani Shopping Mall', '1/4, Near Shivaji Chowk, Guru Nanak Nagar, Jammu, Jammu and Kashmir 180004', 15)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (151, 'Fair Deal Shopping Complex', 'Lambert Lane, Regal Chowk, Srinagar, Jammu and Kashmir 190001', 15)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (152, 'Wave - The Wave Mall', 'GS Malls Private Limited, Opposite Bathindi Road, Malik Market, Guru Tegh Bahadur Nagar, Channi Rama, Jammu, Jammu and Kashmir 181152', 15)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (153, 'M S Shopping Mall', 'Residency Road, Regal Chowk, Munshi Bagh, Srinagar, Jammu and Kashmir 190001', 15)");


        //Nainital Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (154, 'Earthcon City Mall', 'Tallital, Nainital, Uttarakhand 263002', 16)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (155, 'Princes Mega Store', 'Mall Rd, Mallital, Nainital, Uttarakhand 263002', 16)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (156, 'New Brij Shopping Complex', 'NH 87, Tallital, Nainital, Uttarakhand 263002', 16)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (157, 'Vishal Mega Mart', 'Pritam Tower, Opposite Naini Valley School ,Nainital Road, Haldwani, Uttarakhand 263126', 16)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (158, 'Naina Mohan Complex', 'Main Market, Kotabagh, Nainital, Uttarakhand 263159', 16)");


        //Shilong Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (159, 'OB Shopping Mall', 'Jail Road, Police Bazar, Shillong, Meghalaya 793001', 18)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (160, 'Reliance Trends', 'Quinton Road, Police Bazar, Shillong, Meghalaya 793001', 18)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (161, 'Vishal Mega Mart', 'Jail Road, Police Bazar, Eldorado,Near-Meghalaya Transport Corporation, Golf Links, Shillong, Meghalaya 793001', 18)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (162, 'Pantaloons', 'Assam Auto Complex, Opp. St. Edmund`s College, Jowai Road, Laitumkhrah, Shillong, Meghalaya 793003', 18)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (163, 'Synod Shopping Complex', 'Mawkhar Main Rd, Mawkhar, Shillong, Meghalaya 793002', 18)");


        //Khandala Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (164, 'Lonavala Square Mall', '2, Old Mumbai - Pune Hwy, Gautam Park Society, Rao Colony, Lonavala, Maharashtra 410401', 19)");


        //Munnar Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (165, 'Krishnas Shopping Mall', 'Market Junction, Munnar, Kerala 685612', 20)");


        //Bikaner Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (166, 'Heeralal Mall', 'Station Rd, Bikaner, Rajasthan 334001', 21)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (167, 'Shiv Shakti Mall', 'Gangashahar Rd, Dhobi Talai, Bikaner, Rajasthan 334001', 21)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (168, 'Vijay Shopping Mall', 'Kote Gate, Bikaner, Rajasthan 334005', 21)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (169, 'Vishal Mega Mart', 'Shiv Shakti Mall, Dak Bangla,Daga Maidan, Bikaner, Rajasthan 334001', 21)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (170, 'FAMILY MART', '4-B, SAMTA NAGAR, Opp. Karshi Upaj Mandi Gate No 2, Sri Ganganagar Rd, Samta Nagar, Bikaner, Rajasthan 334001', 21)");


        //Amritsar Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (171, 'Trilium Mall amritsar', 'Plot No. C-4, Circular Road, Opp. Basant Avenue, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (172, 'Mall of Amritsar', 'MBM Farms, Sultan Wind Sub Urban Main GT Road, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (173, 'The Celebration Mall', 'Brij Bhushan Mehra Square, Batala Road, Gagan Colony, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (174, 'Omaxe Value Mall', 'Ajnala Rd , Airport Rd, Near Village Heir, Heir, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (175, 'Eminent Mall', '10, Mall Road, Kennedy Avenue, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (176, 'Novelty Mall', '7, Lawrence Road, Joshi Colony, Amritsar, Punjab 143001', 26)");


        //Bundi Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (177, 'Amit K Garg And Co Ca Gopal Singh Plaza', 'Gopal Singh Plaza, Nainwa Road, Hospital Area, Bundi, Rajasthan 323001', 27)");


        //Kutch Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (178, 'D Mart Shopping Mall', 'Yogeswar Nagar, Bhuj, Gujarat 370001', 28)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (179, 'Palav The Fashion Mall', 'Opp. Bank of India, Market Rd, Navavas, Madhapar, Bhuj, Gujarat 370020', 28)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (180, 'Arjan Malls', 'Sector 8, Gandhidham, Gujarat 370203', 28)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (181, 'Reliance Super Mall', 'Ward 12B, Gandhidham, Gujarat 370201', 28)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (182, 'Mahakali Shopping Mall', 'GJ SH 42, Vijay Nagar, Bhuj, Gujarat 370001', 28)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (183, 'The Mumbai Central', 'Vaniya Vad, Vaniyavad Rd, Bhuj, Gujarat 370001', 28)");


        //Kohimma Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (184, 'West Road Mall', 'Jail Colony, Kohima, Nagaland 797005', 30)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (185, 'K.A.K.', 'NH 61, Naga Bazaar, Kohima, Nagaland 797001', 30)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (186, 'Topaz Plaza', 'NH 61, Kohima, Nagaland 797001', 30)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (187, 'Crossword', 'Mohonkola,, NH29, Aradurah Hill, Mohankhola, Kohima, Nagaland 797005', 30)");


        //Delhi Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (188, 'DLF EMPORIO', '4,nelson Mandela road,vasant kunj,new delhi 110070', 32)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (189, 'Select citywalk', 'A-3 district centre saket ,new delhi,110017', 32)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (190, 'Pacific mall', 'Tagore garden,najafgarh road,subhash nagar metro station,new delhi 110018', 32)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (191, 'Ansal plaza', 'Hudco place,khel gaon marg,new delhi 110049', 32)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (192, 'The great Indian place', 'Plot no A-2,sector 38-A,noida ,uttar Pradesh 201301', 32)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (193, 'Ambience mall vasant kunj', 'Plot no-2 , nelson Mandela marg,vasant kunj,new delhi 110070', 32)");


        //Bodhgaya Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (194, 'Apr City Centear Mall Gaya', 'Jain Mandir Marg, Dulhingunj, Gaya, Bihar 823001', 33)");


        //Chennai Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (195, 'Express avenue', 'NO.2,club house road,royapettah,Chennai tamil nadu 600002, India', 35)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (196, 'Chennai citi centre', 'No.10&11 Dr. Radhakrishnan salai,mylapore,Chennai,tamil nadu 600004, India', 35)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (197, 'Abirami mega mall', '#152,purasaiwakkam high road,Chennai,tamil nadu 600010, India', 35)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (198, 'The grand mall', '137,seetharam nagar main road,velachery,Chennai,tamil nadu 600042, India', 35)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (199, 'Spencer  plaza', 's-72,spencer plaza 769,anna salai,Chennai,tamilnadu 600002, India', 35)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (200, 'Spectrum mall', 'No.114A&114B,paper mills road,perambur ,Chennai,tamilnadu 600011, India', 35)");


        //Bangalore Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (201, 'Orion malls', 'Brigade gateway,26/1 Dr. Rajkumar road,malleshwaram west,bengaluru,Karnataka 560055, India', 36)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (202, 'Garuda mall', '15,magrath rd,craig park layout,ashok nagar,bengaluru,Karnataka 560025, India', 36)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (203, 'Phoenix marketcity', 'Whitefield main road,mahadevpura,bengaluru,Karnataka 560048, India', 36)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (204, 'Esteem mall', 'SY NO 127/128, hebbal,bengaluru,Karnataka 560024, India', 36)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (205, 'UB city', '24,vital mallya road,bengaluru,Karnataka 560001, India', 36)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (206, 'VR Bengaluru', '60/2, ITPL Road,bengaluru Karnataka 560048, India', 36)");


        //End of Mall Name table

        //Multiplex name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Multiplexes + "(M_Id INTEGER PRIMARY KEY, M_Name TEXT, M_Addr TEXT, P_M_Id INTEGER, FOREIGN KEY(P_M_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Multiplex Details

        //Andaman & Nicobar Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (101, 'Diviyum Talkies', 'Great Andaman Trunk Road, Prothrapur, Port Blair, Andaman and Nicobar Islands 744103', 01)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (102, 'Swapna Theatre', 'Pahargaon, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (103, 'Anand Paradise Theatre', 'Andaman Housing Coop Society, Port Blair, Andaman and Nicobar Islands 744103', 01)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (104, 'Hyundai Workshop', 'Garacharama, Port Blair, Andaman and Nicobar Islands 744103', 01)");


        //Kalpetta Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (105, 'Mahaveer Movies', 'Bangalore-Calicut Highway, Mandayapuram, Kalpetta, Kerala 673121', 03)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (106, 'Anantha Veera', 'Kerala Kaumudi Road, Subhash Nagar, Kalpetta, Kerala 673122', 03)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (107, 'Jaithra Theatre', 'Silver Hills, Kalpetta, Kerala 673123', 03)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (108, 'illam Creations, Studio, illam Band', 'Emily, Wayanad, Kalpetta, Kerala 673122', 03)");
        //Goa Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (109, 'Inox Cinemas Mall De Goa', 'Old GMC Heritage Precinct, D.B. Road, Campal, Panjim, Goa 403001, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (110, 'Hira Talkies', 'Bicholim Goa', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (111, 'Z-Square Multiplex', 'Opp. Auto Service India, Fl Gomes Rd, Vasco da Gama, Goa 403802, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (112, 'Cine World', 'Omkar Hotel Building, Opp. Bus Stand, Marcel, Orgao, Goa 403107, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (113, 'Inox Theater', 'Fatorda, Goa 403601, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (114, 'Vishant Talkies', 'Aquem, Margao, Goa 403601, India', 04)");

        //Pondicherry Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (115, 'Raja Cinema Hall', '246, Anna Salai, Nehru Street Cutting, Puducherry, 605001', 05)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (116, 'Muruga Cinema Hall', 'Kamaraj Salai, Near Rajiv Gandhi File, Ellaipillaichavady, Puducherry, 605015', 05)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (117, 'Carnival Cinemas - Jeeva Rukmani', 'No. 65, Kamaraj Salai, Puducherry, 605011', 05)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (118, 'Balaji Theatre', 'Kamaraj Salai, Sithankudi, Brindavanam, Puducherry, 605001', 05)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (119, 'Rathna theatre', 'No. 466, Anna Salai, Opposite Guber Bazaar, Puducherry, 605001', 05)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (120, 'Vasantha Raja Theatre', 'Pichaiveerampattinam - Moolakulam Road, Marie Oulgaret, Puducherry, 605009', 05)");


        //Jaisalmer Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (121, 'Ramesh talkies', 'Patwon Ki Haveliyan Road, Jaisalmer, Rajasthan 345001', 06)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (122, 'Jaisalmer Sunset Point', 'Dr. K. L. Achalvanshi Colony, Jaisalmer, Rajasthan 345001', 06)");


        //Manali Mutiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (123, 'Piccadily Multiplex', 'The Mall Road, The Mall Road, Near Indian Petrol Bunk, Manali, Himachal Pradesh 175131, India', 07)");


        //Sikkim Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (124, 'Denzong Cinema', 'Lal Bazar Rd, Vishal Gaon, Gangtok, Sikkim 737101', 08)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (125, 'Vajra Cinema Hall', 'Baluakhani Rd, Sungava, Gangtok, Sikkim 737101', 08)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (126, 'Imperial Talkies', 'NMC museum building,singithang, Namchi, Sikkim 737126', 08)");


        //Kochi Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (127, 'Q Cinemas - Gold Souk Grande', 'Gold Souk Grande, Gold Souk Grande, Vytilla, Kochi, Kerala 682019', 09)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (128, 'Cinemax - Oberon, Kochi', 'Wildcraft, Survey No. 154/8.1,8.3, 9A1,9A2, 9B, NH Bypass Edappally junction, Ernakulam, Kochi, Kerala 682024', 09)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (129, 'EVM Cinema', 'Chullickal, Kochi, Kerala 682002', 09)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (130, 'Ajanta Theatre', 'LG Pai Rd, Pandikudy, Thamaraparambu, Fort Kochi, Kochi, Kerala 682002', 09)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (131, 'Central Talkies', 'Puthusherri Rd, Thrippunithura, Kochi, Kerala 682301', 09)");


        //Srinagar Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (132, 'Neelam Cinema', 'Nohata, Srinagar, Jammu and Kashmir 190009', 10)");


        //Shimla Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (133, 'SRS Cinemas', 'ISBT Tutikandi, Tutikandi, Shimla, Himachal Pradesh 171004', 11)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (134, 'Ritz Cineplex', 'Ridge To US Club, Near Christ Church Shimla, Shimla, Himachal Pradesh 171001', 11)");


        //Kanyakumari Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (135, 'Chakravarthy Cinemas', 'Rajas Mall, Rajas Mall, State Highway 46, Chetti Kulam, Nagercoil, Tamil Nadu 629901', 12)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (136, 'Rajas Picture Palace', 'Krishnam Coil, Ozhuginasery, Nagercoil, Tamil Nadu 629001', 12)");


        //Kashmir Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (137, 'Apsara Multiplex', ' Gandhi Nagar, Jammu, Jammu and Kashmir 180004', 16)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (138, 'Hari Cinema', 'Raghunath Bazar, Resham Ghar Colony, Jammu, Jammu and Kashmir 180001', 16)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (139, 'Raj Theater', 'NH 1A, Indra Nagar, Udhampur, Jammu and Kashmir 182101', 16)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (140, 'Neelam Cinema', 'Nohata, Srinagar, Jammu and Kashmir 190009', 16)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (141, 'AMR Multiplex', 'National Highway 1C, AMR Mall Multiplex Hotel, Katra Vaishnodevi, Jammu and Kashmir 182301', 16)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (142, 'KC Cineplex', ' B.C Road, Bakshi Nagar Flyover, Canal Road, Jammu, Jammu and Kashmir 180001', 16)");


        //Nainital Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (143, 'New Capitol Cinema', 'Jubilee Hall Apartments, Mall Rd, Mallital, Nainital, Uttarakhand 263002', 17)");


        //Mount Abu Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (144, 'Vishnu Talkies', 'MDR49, Kesar Ganj, Abu Road, Rajasthan 307026', 18)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (145, '7D/9D Cinema Game Zone', 'Nakki Lake, Sani Gaon, Mount Abu, Rajasthan 307501', 18)");


        //Shilong Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (146, 'Gold Cinema - Shillong', 'Umsohsun, Police Bazar, Shillong, Meghalaya 793001', 19)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (147, 'Galleria Anjalee Cinema', 'Ïewduh, Bara Bazar, Shillong, Meghalaya 793001', 19)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (148, 'Bijou Cinema', 'Police Bazar, Shillong, Meghalaya 793001', 19)");


        //Khandala Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (150, 'Cinebliss Neelkamal Cinema', 'Neelkamal, Lonavala, Maharashtra 410401', 20)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (151, 'Gold Digital Cinema', 'Yashwant Tower, Near Swanand Hotel, On Old Mumbai-Pune Highway, Khopoli, Maharashtra 410203', 20)");


        //Munnar Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (152, 'Darsana', 'Munnar-Kumily Hwy, Nedumkandam, Kerala 685553', 22)");


        //Bikaner Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (153, 'Carnival Cinemas', 'Road No. 5, Agarsen Nagar, Near Industrial Area, Rani Bazar, Kishmideshar, Bikaner, Rajasthan 334001', 24)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (154, 'Suraj Talkies', 'N.H. 89, Rani Bazar Rd, Bikaner, Rajasthan 334001', 24)");


        //Amritsar Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (155, 'INOX', 'Plot C-4, 5th Floor, Trilium Mall, Circular Road, Opp. Basant Avenue, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (156, 'Cinepolis', 'Celebration Mall, Bhatala Road, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (157, 'Aanaam Cinema', 'Taylor Road, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (158, 'Cinepolis - Alpha One', 'Mall of Amritsar, 2nd Floor, Alpha One Mall, Main G.T. Road, East Gobind Nagar, Maqbool Pura, Amritsar, Punjab 143001', 26)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (159, 'Carnival - Suraj Chanda Tara', 'Near Bus Stand, City Centre, Mahan Singh Gate Road, Amritsar, Punjab 143001', 26)");


        //Bundi Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (160, 'Ranjit Talkies', 'RJ SH 29, Hospital Area, Bundi, Rajasthan 323001', 27)");


        //Kutch Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (161, 'Vinay Cinemas', 'Ward 2A, Adipur, Near Post Office, Gandhidham, Gujarat 370205', 29)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (162, 'SurMandir Cineplex', 'Bus Station Road, Old Dhatia Falia, Bhuj, Gujarat 370001', 29)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (163, 'Seven Sky Multiplex', 'Airport Road, Bhuj, Gujarat 370001', 29)");


        //Delhi Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (164, 'Delite Diamond', 'Gate No. 4/1, Asaf Ali Road, Opposite G B Pant Hospitals, Delhi Gate, New Delhi, Delhi 110002', 32)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (165, 'M2K Cinemas Rohini', '16 Mangalam Place District Centre, Sector-3, Rohini, Delhi, 110085', 32)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (167, 'Regal Cinema', 'Connaught Circus, Hanuman Road Area, Connaught Place, New Delhi, Delhi 110001', 32)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (168, 'DT - DLF Place - Saket', 'DLF Place Saket, A 4, District Center, Press Enclave Road, Saket, New Delhi, 110017', 32)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (169, 'PVR Vikaspuri', 'G-1, Community Centre, Vikaspuri, Delhi, 110018', 32)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (170, 'Wave', 'Wave Infratech Pvt. Ltd., TDI Paragon Mall, Plot No., 2, Raja Garden, Shivaji Place, New Delhi, Delhi 110027', 32)");


        //Bodhgaya Multiplex details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (171, 'APR Cinemas', 'Rai kashinath more,, Gaya, Bihar 823001', 33)");


        //konark Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (172, 'UTAM TAKIG KONARK', 'Ranihatsahi, Konark, Odisha 752111', 34)");


        //Chennai Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (173, 'Sangam multiplex', '870,poonamallee high road,near Hindustan petrol bunk,kilpuk,Chennai,tamil nadu 600010, India', 35)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (174, 'Mayajaal multiplex', '34 east coast road,kanathur,Chennai,tamilnadu 603112, India', 35)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (175, 'Escape cinemas', 'Express avenue,3rd floor,express mall,white road,express estate ,royapettah,Chennai,tamilnadu 600014, India', 35)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (176, 'Devi complex', '48,anna salai,border thottam,padupakkam,triplicane,Chennai,tamilnadu 600002', 35)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (177, 'Sathyam cinemas', '8,thiru vi ka road,royapettah,Chennai,tamilnadu 600014, India', 35)");

        //Bangalore Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (178, 'Innovative multiplex', '135,marathalli-sarajapur outernring road,bengaluru,Karnataka,India', 36)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (179, 'Pvr cinemas', '3rd and 4th floor,the forum mall,#29,hosur road,5th block, koramangala,bangluru,karnataka,India', 36)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (180, 'Urvashi cinemas', 'Lalbagh main road(Doddamavalli and sudhama nagar),Banglore,Karnataka', 36)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (181, 'PVR  IMAX', 'Forum mall,Banglore,Karnataka,India', 36)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (182, 'Inox jp nagar', '5th floor,Bangalore central (mantra junction,45th cross,jp nagar 2nd phase) Bangalore,karnataka,India', 36)");
        //End of Multiplex name table

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Months);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Places);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Purpose);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Visit_Place);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Hotels);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Malls);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Multiplexes);
        onCreate(db);

    }
    public Cursor getAllData(String budget, String no_person, String date, String purpose, String no_day) {
        int budget2 = Integer.parseInt(budget);
        int no_person2 = Integer.parseInt(no_person);
        int no_day2 = Integer.parseInt(no_day);
        budget2 = budget2 / no_person2;
        budget2 = (budget2/no_day2)*5;

        SQLiteDatabase db = this.getReadableDatabase();
        //String selectQuery = "SELECT p.P_Name FROM " + Table_Places + " p, " + Table_Months + " m, " + Table_Purpose + " p1 WHERE m." + Months_Col2 + " = '" + date + "' AND p1." + Purpose_Col2 + " = '" + purpose + "' AND m." + Months_Col4 + " = p." + Places_Col1 + " AND p1." + Purpose_Col4 + " = p." + Places_Col1 + " AND p." + Places_Col3 + " <= " + budget2;

        String selectQuery = "SELECT p.P_Name, p.Budget FROM " + Table_Places + " p, " + Table_Months + " m, " + Table_Purpose + " p1 WHERE m." + Months_Col4 + " = p." + Places_Col1 + " AND p1." + Purpose_Col4 + " = p." + Places_Col1 + " AND m." + Months_Col2 + " = '" + date + "' AND p." + Places_Col3 + " <= " + budget2 + " AND p1." + Purpose_Col2 + " = '" + purpose + "'";
        //String selectQuery = "SELECT p.P_Name FROM " + Table_Places + " p, " + Table_Months + " m WHERE m." + Months_Col2 + " = '" + date + "' AND m." + Months_Col4 + " = p." + Places_Col1 + " AND p." + Places_Col3 + " <= " + budget2;
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Cursor getHotelData(String name)
    {
        //int id2 = Integer.parseInt(id);
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT h.H_Name, h.H_Addr, h.H_Price FROM "+Table_Hotels+" h, "+Table_Places+" p WHERE p."+Places_Col2+" = '"+name+"' AND p."+Places_Col1+" = h."+Hotels_Col6;
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Cursor getVisitPlaceData(String name)
    {
        // int id2 = Integer.parseInt(id);
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT v.V_P_Name, v.V_P_Addr FROM "+Table_Visit_Place+" v, "+Table_Places+" p WHERE p."+Places_Col2+" = '"+name+"' AND p."+Places_Col1+" = v."+Visit_Place_Col5;
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Cursor getMallsData(String name)
    {
        //int id2 = Integer.parseInt(id);
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT m.Malls_Name, m.Malls_Addr FROM "+Table_Malls+" m, "+Table_Places+" p WHERE p."+Places_Col2+" = '"+name+"' AND p."+Places_Col1+" = m."+Malls_Col4;
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Cursor getMultiplexesData(String name)
    {
        //int id2 = Integer.parseInt(id);
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT m.M_Name, m.M_Addr FROM "+Table_Multiplexes+" m, "+Table_Places+" p WHERE p."+Places_Col2+" = '"+name+"' AND p."+Places_Col1+" = m."+Multiplexes_Col4;
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Cursor getRegionalFoodData(String name)
    {
        //int id2 = Integer.parseInt(id);
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT Regional_Food FROM "+Table_Places+" WHERE "+Places_Col2+" = '"+name+"'";
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public boolean insertData(String id, String name, String date, String place)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(Customers_Col2, id);
        cv.put(Customers_Col3, name);
        cv.put(Customers_Col4, date);
        cv.put(Customers_Col5, place);
        long result = db.insert(Table_Customers,null,cv);
        if(result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData(String id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "SELECT Book_Id, Journey_Date, Place FROM "+Table_Customers+" WHERE "+Customers_Col2+" = '"+id+"'";
        Cursor res = db.rawQuery(selectQuery, null);
        return res;
    }
    public Integer deleteData(String Sic1)
    {
        //int tour = Integer.parseInt(Sic1);
        SQLiteDatabase db = this.getWritableDatabase();
        //String selectQuery = Customers_Col1+" = "+Sic1;
        return db.delete(Table_Customers, Customers_Col1+" = ?", new String[] {Sic1});
    }
}
