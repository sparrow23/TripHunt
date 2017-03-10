package com.triphunt.sparrow.sample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by WARIS on 2/16/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public final static String Database_Name = "MainTripHunt.db";
    public final static String Table_Places = "Places";
    public final static String Table_Hotels = "Hotels";
    public final static String Table_Visit_Place = "Visit_Place";
    public final static String Table_Malls = "Malls";
    public final static String Table_Multiplexes = "Multiplexes";
    public final static String Places_Col11 = "P_Id";
    public final static String Places_Col12 = "P_Name";
    public final static String Places_Col13 = "Month_Name";
    public final static String Places_Col14 = "Budget_Range";
    public final static String Places_Col15 = "Regional_Food";
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

    public DatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //main table of Triphunt
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Places + "(Place_Name TEXT PRIMARY KEY, Month_Name TEXT, Budget_Range TEXT, Vehicle_Price TEXT, Regional_Food TEXT, Religious_Place TEXT)");


        db.execSQL("INSERT INTO " + Table_Places + " VALUES (01, 'Andaman & Nicobar', 'January', '28k-30k', '1.Rice, 2.Sea food')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (02, 'Auli (uttarakhand)', 'January', '15k-17k', '1.Non-Veg dishes, 2.Kachmauli')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (03, 'Kalpetta(kerala)', 'January', '20k-25k', '1.Konkani, 2.Biryani with fried fish, 3.kadala')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (04, 'Goa', 'February', '18k-20k', '1.Fish Recheado, 2.Pork Vindaloo, 3.chicken xacti')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (05, 'Pondicherry', 'February', '8k-10k', '1.French cuisines , 2.Quiche, 3.steak fritter')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (06, 'jaisalmer, Rajasthan', 'February', '7k-10k', '1.Dal baati Choorma, 2.Ker-sangri, 3.Kadhi-pakoda')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (07, 'Manali', 'March', '7k-9k', '1.Masala omlet, 2.Kadhi chaawal dham')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (08, 'Sikkim', 'March', '15k-18k', '1.Thukpa, 2.Daal bhat, 3.phoyshapa')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (09, 'Kochi', 'March', '10k-12k', '1.Appam, 2.Stew, 3.Fish Molly')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (10, 'Srinagar', 'April', '8k-10k', '1.Rogunjosh, 2.Levash, 3.Sheer')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (11, 'Shimla', 'April', '7k-10k', '1.Channa madra, 2.Rice, 3.White bread')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (12, 'Kanyakumari', 'April', '14k-17k', '1.lentil rice, 2.Fenugreek stew, 3.Kinnathappam,elay')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (13, 'Lakshadweep island', 'May', '25k-28k', '1.Coconut, 2.Seafoods')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (14, 'Tirthan valley(HP)', 'May', '15k-20k', '1.Siddu, 2.Kullu dham, 3.Lingri sabji')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (15, 'Leh,ladakh', 'May', '40k-45k', '1.Paba, 2.Tangtur, 3.Khambir')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (16, 'Kashmir', 'June', '15k-20k', 'null')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (17, 'Nainital', 'June', '8k-10k', '1.Ras, 2.Baadi, 3.Arsa')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (18, 'Mount abu', 'June', '7k-10k', '1.Makhaniya lassi, 2.Ghewar, 3.Pakori')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (19, 'shilong(Meghalaya)', 'July', '12k-15k', '1.Ja doh, 2.Doh khleh, 3.Doh ngiong')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (20, 'Khandala(Maharshtra)', 'July', '8k-10k', '1.Vada pav')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (21, 'Amarnath, j & k', 'July', '14k-18k', '1.Yakhni, 2.Dum olav, 3.Matschgand,')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (22, 'Munnar, Kerala', 'August', '5k-7k', '1.Sadhya, 2.Malabar biryani, 3.Kalluneymeen,crab')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (23, 'Lahaul-Spiti(Himachal Pradesh)', 'August', '12k-15k', '1.Patande, 2.Sidu')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (24, 'Bikaner,Rajsthan', 'August', '14k-16k', '1.Bikaneri bhujiya, 2.Roti, 3.Khichdi,')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (25, 'Lachen, Sikkim', 'September', '12k-14k', '1.Rice, 2.Millet, 3.Pork')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (26, 'Amritsar, Punjab', 'September', '10k-12k', '1.Kulchas, 2.Lassi, 3.Jalebi')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (27, 'Bundi, Rajasthan', 'September', '11k-13k', '1.dal-bati')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (28, 'Pachmarhi,(Mp)', 'October', '6k-8k', '1.Gujarati 2.Maharashtrian cuisine')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (29, 'Kutch,Gujarat)', 'October', '7k-9k', '1.Chakri, 2.Dhokla, 3.Khakra')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (30, 'Digha,west Bengal', 'October', '5k-7k', '1.Bengali dishes, 2.Sea foods')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (31, 'kohima,Nagaland', 'November', '11k-14k', '1.Tathu, 2.Axone dishes, 3.Meats')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (32, 'Delhi', 'November', '12k-15k', '1.Aaloo chat, 2.Chole kulche, 3.Dahi bhalla,')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (33, 'Bodhgaya', 'November', '10k-12k', 'Null')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (34, 'konark,odisa', 'December', '6k-8k', '1.Pakhala, 2.Khechidi, 3.Palau')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (35, 'Chennai,tamil nadu', 'December', '10k-12k', '1.Idli, 2.Dosa, 3.Vadai')");
        db.execSQL("INSERT INTO " + Table_Places + " VALUES (36, 'Bangalore', 'December', '7k-10k', '1.Khottige, 2.Mudde tovey, 3.kori rotti')");
        //Ending of main database table

        //Visit place table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Visit_Place + "(V_P_Id INTEGER PRIMARY KEY, V_P_Name TEXT, V_P_Addr TEXT, P_V_Id INTEGER, FOREIGN KEY(P_V_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (101, 'Radhanagar Beach', 'Havelock Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (102, 'Cellular Jail', 'Port Blair in the Territory of Andaman and Nicobar Islands, India.', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (103, 'Jolly Buoy Island', 'Mahatma Gandhi National Park, Port Blair, South Andaman Island, India.', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (104, 'Neil Island', 'Experience Andamans Tours Pvt. Ltd.Opposite Cooperative Bank,Dairy Farm, Port Blair,Andaman and Nicobar Islands, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (105, 'Ross Island', '2 km east of Port Blair, Port Blair, South Andaman Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (106, 'Elephant Beach', 'Havelock Island, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (107, 'Kaala Pathar Beach', 'Port Blair,, Havelock Island 744211, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (108, 'Makruzz', 'Airport Authority Colony, Delanipur, Port Blair, Andaman and Nicobar Islands 744102', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (109, 'Samudrika Marine Museum', 'Airport Authority Colony, Haddo, Port Blair, Andaman and Nicobar Islands 744102', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (110, 'Anthropological Museum', 'Phoenix Bay, Port Blair, South Andaman Island 744104, India', 01)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (111, 'Corbyn's Cove', 'Carbyns Cove, Port Blair, Andaman and Nicobar Islands 744112', 01)");
        //Auli (uttarakhand) Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (112, 'Trishul Peak', 'Garhwal Region | Auli Joshimath, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (113, 'Gorson Bugyal', 'Auli, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (114, 'Auli Ski & Snowboard School', 'Joshimath, Chamoli, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (115, 'Chenab Lake', 'Dang Village | Thang Village, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (116, 'Bhavishya Badri', '3 Km From Tapovan | Subhai Village Saldhar, Auli 246443, India', 02)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (117, 'Vanshinarayan Kalpeshwar', '10 Km From Helang Village | Urgam Village, Auli 246443, India', 02)");
        //Goa Place Details
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (101, 'Dona Paula', '7 km from Panaji Centre | Lovers Paradise, Panjim, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (102, ' Fort Aguada', 'Shore of the Mandovi river, Sinquerim, India.', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (103, 'Old Goa Churches', ' Old Goa, Panjim 403402, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (104, 'Palolem Beach ', 'Within 2.5 kilometres of the market town of Chaudi, Canacona, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (105, 'Panjim City & the Church', 'Panjim, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (106, ' Majorda Beach', 'Majorda Village, Salcette, Majorda 403713, India.', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (107, 'Cansaulim Monte', 'Cansaulim Monte Goa, India', 04)");
        db.execSQL("INSERT INTO " + Table_Visit_Place + " VALUES (108, 'Martin’s Corner', '69, Binwaddo, Betalbatim, Salcette, Salcette, Goa 403713, India', 04)");

        //End of visited place table

        //Hotel name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Hotels + "(H_Id INTEGER PRIMARY KEY, H_Name TEXT, H_Addr TEXT, Price TEXT, Local_Market TEXT, P_H_Id INTEGER, FOREIGN KEY(P_H_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (101, 'Munjoh Ocean', 'Havelock, Andaman and Nicobar Islands, India', '12,928/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (102, 'Hotel Sentinel', 'Port Blair, Andaman and Nicobar Islands, India', '8,359/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (103, 'Sea Shell', 'Havelock, Andaman and Nicobar Islands, India', '7,866/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (104, 'Andaman Galley', 'Port Blair, Andaman and Nicobar Islands, India', '3,251/nyt', 'null', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (105, 'Mainak', 'Port Blair, Andaman and Nicobar Islands, India', '2,233/nyt', '', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (106, 'Anugama Resort', 'Port Blair, Andaman and Nicobar Islands, India', '2,775/nyt', '', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (107, 'Islander Inn', 'Port Blair, Andaman and Nicobar Islands, India', '3,031/nyt', '', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (108, 'Wild Orchid', 'Port Blair, Andaman and Nicobar Islands, India', '5,552/nyt', '', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (109, 'Hotel Galaxy', 'Port Blair, Andaman and Nicobar Islands, India', '1,592/nyt', '', 01)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (110, 'Aparupa', 'Port Blair, Andaman and Nicobar Islands, India', '1,943/nyt', '', 01)");
        //Goa Hotel Details
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (101, 'Radisson blu resort', 'Cavelossim Beach, Mobor 403001 Goa India', '25,999/nyt', '1.Sagar Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (102, 'Hardrock hotel', '370/14, Near KFC, Porba Vaddo, Calangute, Bardez, Goa 403516, India', '12,500/nyt', '1.Anjuna Flea Market, 2.Baga Night Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (103, 'Fortune acron regina', 'Off Fort Aguada Road, Candolim, Bardez, Goa 403515, India', '7999/nyt', '1.Candolim Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (104, 'Hotel fidalgo', 'Panjim, Goa 403001, India', '5136/nyt', '1,Ponda Market, 2.Bagayatdar Bazaar', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (105, 'The tree house blue', 'Curilo, Pacheco Vaddo, Majorda Salcete, Margao, Goa 403713, India', '3800/nyt', '', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (106, 'The Queeny', 'Queeny Nagar, Velsao - Pale, Near Airport Road, Vasco da Gama, Goa 403712, India', '3000/nyt', '1.Queen Nagar Market, 2.Nagoa Market', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (107, 'The Palm Trees Resort', 'Patnem Beach, Canacona, Goa 403702, India', '4500/nyt', '1.Calangute Market Square', 04)");
        db.execSQL("INSERT INTO " + Table_Hotels + " VALUES (108, 'Castle House Palolem', 'Major District Road 49, Palolem, Canacona, Goa 403702, India', '2,898/nyt', '1.Palolem Market', 04)");
        //End of hotel name table

        //Mall name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Malls + "(Malls_Id INTEGER PRIMARY KEY, Malls_Name TEXT, Malls_Addr TEXT, P_Malls_Id INTEGER, FOREIGN KEY(P_Malls_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (101, 'Aberdeen Bazaar', 'Aberdeen Bazar, Aberdeen, Port Blair, Andaman and Nicobar Islands 744104', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (102, 'Sagarika Emporium', ' DAG Colony, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (103, 'Mahananda Complex Mall', 'Great Andaman Trunk Rd, Rangat, Andaman and Nicobar Islands 744205', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (104, 'City Super Shoppe', 'Aberdeen Bazar, Rajiv Gandhi Nagar, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (105, 'Sapna Complex', ' VIP Rd, Pathergudda, Bhathu Basti, Port Blair, Andaman and Nicobar Islands 744103', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (106, 'Oasis Plaza', 'Great Andaman Trunk Rd, Dairy Farm, Port Blair, Andaman and Nicobar Islands 744101', 01)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (107, 'DiveIndia', 'SH5, 744211', 01)");
        //Goa Mall Details
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (101, 'Valanka Shopping Mall', 'Calangute - Anjuna Rd, Naika Vaddo, Bardez, Calangute, Goa 403516, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (102, 'Caculo Mall', '16, Shanta, St. Inez Road, Near Vintage, Hospital, Panjim, Goa 403001, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (103, 'Mall De Goa', 'Mall De Goa, NH 17, Alto Porvorim, Penha de França, Goa 403521, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (104, 'Brioni', 'Winifred Towers, Dongrim, Goa 403104, India', 04)");
        db.execSQL("INSERT INTO " + Table_Malls + " VALUES (105, 'Osia Shopping Mall', 'Fatorda, Margao, Goa 403601, India', 04)");
        //End of Mall Name table

        //Multiplex name table
        db.execSQL("CREATE TABLE IF NOT EXISTS " + Table_Multiplexes + "(M_Id INTEGER PRIMARY KEY, M_Name TEXT, M_Addr TEXT, P_M_Id INTEGER, FOREIGN KEY(P_M_Id) REFERENCES Places(P_Id))");

        //Andaman & Nicobar Multiplex Details
        //Goa Multiplex Details
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (101, 'Inox Cinemas Mall De Goa', 'Old GMC Heritage Precinct, D.B. Road, Campal, Panjim, Goa 403001, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (102, 'Hira Talkies', 'Bicholim Goa', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (103, 'Z-Square Multiplex', 'Opp. Auto Service India, Fl Gomes Rd, Vasco da Gama, Goa 403802, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (104, 'Cine World', 'Omkar Hotel Building, Opp. Bus Stand, Marcel, Orgao, Goa 403107, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (105, 'Inox Theater', 'Fatorda, Goa 403601, India', 04)");
        db.execSQL("INSERT INTO " + Table_Multiplexes + " VALUES (106, 'Vishant Talkies', 'Aquem, Margao, Goa 403601, India', 04)");
        //End of Multiplex name table

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Places);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Visit_Place);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Hotels);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Malls);
        db.execSQL("DROP TABLE IF EXISTS "+ Table_Multiplexes);
        onCreate(db);

    }
    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+Table_Places,null);
        return res;
    }
}
