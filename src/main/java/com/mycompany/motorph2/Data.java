/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph2;

/**
 *
 * @author Cha
 */
public class Data {
    String[] header = {"Employee #:\t\t","Last Name:\t\t","First Name:\t\t","Birthday:\t\t","Address:\t\t","Phone Number:\t\t",
                           "SSS #:\t\t\t","Philhealth #:\t\t","TIN #:\t\t\t","Pag-ibig #:\t\t","Status:\t\t\t","Position:\t\t",
                           "Immediate Supervisor:\t","Basic Salary:\t\t","Rice Subsidy:\t\t","Phone Allowance:\t",
                           "Clothing Allowance:\t", "Semi-monthly Rate:\t","Hourly Rate:\t\t"};
        //Employee Number array for easy indexing 
        //Data type as int so it can be used for referencing
    private  int[] empNum = {10001,10002,10003,10004,10005,10006,10007,10008,10009,10010,
                        10011,10012,10013,10014,10015,10016,10017,10018,10019,10020,
                        10021,10022,10023,10024,10025};
        //Last Name array
    private String[] lastName = {"Crisostomo","Mata","San Jose","Salcedo","Romualdez","Atienza",
                            "Farala","Martinez","San Jose","Rosario","Lopez","De Leon","Romualdez",
                            "Bautista","Lazaro","Delos Santos","Santos","Del Rosario","Tolentino","Gutierrez",
                            "Manalaysay","Villegas","Ramos","Maceda","Aguilar"};
        //first name array
    private String[] firstName = {"Jose","Christian","Brad","Anthony","Alice","Rosie","Martha","Leila","Allison",
                                "Cydney","Josie","Selena","Fredrick","Mark","Darlene","Kolby","Vella","Tomas",
                                "Jacklyn","Percival","Garfield","Lizeth","Carol","Emelia","Delia"};
        //birthday array
    private String[] birthday = {"February 14, 1988","October 21, 1987","March 15, 1996","September 14, 1993",
                              "May 14, 1992","September 24, 1948","January 11, 1942","July 11, 1970","June 24, 1986",
                              "October 6, 1996","January 14, 1937","February 20, 1945","March 10, 1985","February 12, 1961",
                              "November 25, 1985","February 26, 1980","December 31, 1983","December 18, 1978","May 19, 1944",
                              "December 18, 1970","August 28, 1966","December 12, 1981","August 20, 1978","April 14, 1963",
                              "January 27, 1939"};
        //address array
    private  String[] address = {"17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands",
                            "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu",
                            "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi",
                            "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate",
                            "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte",
                            "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte",
                            "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte",
                            "37/46 Kulas Roads, Maragondon 0962 Quirino",
                            "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union",
                            "93A/21 Berge Points, Tapaz 2180 Quezon",
                            "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro",
                            "89A Armstrong Trace, Compostela 7874 Maguindanao",
                            "22A/52 Lubowitz Meadows, Pililla 4895 Zambales",
                            "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino",
                            "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino",
                            "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur",
                            "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur",
                            "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque",
                            "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao",
                            "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur",
                            "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur",
                            "66/77 Mann Views, Luisiana 1263 Dinagat Islands",
                            "72/70 Stamm Spurs, Bustos 4550 Iloilo",
                            "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija",
                            "95 Cremin Junction, Surallah 2809 Cotabato"};
        //phone number arrays
    private  String[] phoneNum = {"918-621-603","783-776-744","797-009-261","070-766-300","983-606-799","266-036-427",
                            "329-034-366","877-110-749","179-075-129","868-819-912","478-355-427","975-432-139",
                            "023-079-009","683-725-348","740-721-558","739-443-033","955-879-269","882-550-989",
                            "675-757-366","512-899-876","948-628-136","332-372-215","250-700-389","973-358-041",
                            "529-705-439"};
        //SSS Number Array
    private  String[] sssNum = {"49-1632020-8","49-2959312-6","40-2400714-1","26-9647608-3","55-4476527-2","41-0644692-3",
                           "45-5656375-0","27-2090996-4","45-3251383-0","49-1629900-2","44-8563448-3","27-2090208-8",
                           "26-8768374-1","49-1647342-5","45-5617168-2","52-0109570-6","52-9883524-3","45-5866331-6",
                           "47-1692793-0","40-9504657-8","45-3298166-4","40-2400719-4","60-1152206-4","54-1331005-0",
                           "52-1859253-1"};
        //Phil health Number Array
    private String[] phNum = {"382189453145","824187961962","239192926939","126445315651","545652640232","708988234853",
                          "233693897247","515741057496","745148459521","579253435499","431709011012","587272469938",
                          "308366860059","399665157135","606386917510","357451271274","548670482885","953901539995",
                          "753800654114","797639382265","810909286264","934389652994","351830469744","465087894112",
                          "136451303068"};
        //Tin Number Array
    private String[] tinNum = {"317-674-022-000","103-100-522-000","672-474-690-000","210-805-911-000","888-572-294-000",
                           "604-997-793-000","210-835-851-000","275-792-513-000","121-203-336-000","122-244-511-000",
                           "218-489-737-000","482-259-498-000","598-065-761-000","273-970-941-000","354-650-951-000",
                           "187-500-345-000","101-558-994-000","560-735-732-000","841-177-857-000","502-995-671-000",
                           "336-676-445-000","210-395-397-000","395-032-717-000","215-973-013-000","599-312-588-000"};
        
        //PAG-IBIG Number array
    private  String [] pgbNum = {"441093369646","631052853464","210850209964","218002473454","211385556888","260107732354",
                            "631130283546","101205445886","114901859343","265104358643","113071293354","719007608464",
                            "223057707853","260054585575","104907708845","113017988667","360028104576","913108649964",
                            "210546661243","210897095686","211274476563","122238077997","212141893454","515012579765",
                            "110018813465"};
        //Status Array
    private String [] status ={"Regular","Regular","Regular","Regular","Regular","Regular","Regular","Regular","Regular",
                           "Regular","Regular","Regular","Regular","Regular","Probationary","Probationary","Probationary",
                           "Probationary","Probationary","Probationary","Probationary","Probationary","Probationary",
                           "Probationary","Probationary"};
        //Position Array
    private String [] position = {"HR Manager","Account Team Leader","HR Team Leader","Payroll Manager","HR Rank and File",
                              "HR Rank and File","Payroll Rank and File","Payroll Rank and File","Account Rank and File",
                              "Account Rank and File","Payroll Team Leader","Account Team Leader","Account Manager",
                              "Account Rank and File","Account Rank and File","Account Rank and File","Account Rank and File",
                              "Account Rank and File","Account Rank and File","Account Rank and File","Account Rank and File",
                              "Account Rank and File","Account Rank and File","Account Rank and File","Account Rank and File"};
        //Supervisors Array
    private String [] sup = {"N/A","Romualdez, Fredrick","Crisostomo, Jose","Crisostomo, Jose","San Jose, Brad","San Jose, Brad",
                        "Farala, Martha","Farala, Martha","Mata, Christian","Mata, Christian","Salcedo, Anthony",
                        "Romualdez, Fredrick","Crisostomo, Jose","Mata, Christian","Mata, Christian","Mata, Christian",
                        "Mata, Christian","Mata, Christian","De Leon, Selena","De Leon, Selena","De Leon, Selena",
                        "De Leon, Selena","De Leon, Selena","De Leon, Selena","De Leon, Selena"};
        //Salary Array
    private  float [] sal = {62670,42975,42975,60825,22500,22500,24000,24000,22500,22500,38475,41850,63500,23250,23250,24000,
                        22500,22500,24000,24750,24750,24000,22500,22500,22500};
        //Rice Subsidy Array
    private int[] rice = {1500,1500,1500,1500,1500,1500,1500,1500,1500,1500,1500,1500,1500,1500,0,0,0,0,0,0,0,0,0,0,0};        
        
        //Phone Allowance Array
    private int[] phone = {1000,800,800,1000,500,500,500,500,500,500,800,800,1000,500,0,0,0,0,0,0,0,0,0,0,0};
        
        //Clothing Allowance Array
    private int[] cloth = {1000,800,800,1000,500,500,500,500,500,500,800,800,1000,500,0,0,0,0,0,0,0,0,0,0,0};
    
    //getters for all private arrays
    public int[] getempNum(){
        return empNum;   
    }
    public String[] getlastName(){
        return lastName;   
    }
    public String[] getfirstName(){
        return firstName;
    }
    public String[] getbirthday(){
        return birthday;
    }
    public String[] getaddress(){
        return address;
    }
    public String[] getphoneNum(){
        return phoneNum;
    }
    public String[] getsssNum(){
        return sssNum;
    }
    public String[] getphNum(){
        return phNum;
    }
    public String[] gettinNum(){
        return tinNum;
    }
    public String[] getpgbNum(){
        return pgbNum;
    }
    public String[] getstatus(){
        return status;
    }
    public String[] getposition(){
        return position;
    }
    public String[] getsup(){
        return sup;
    }
    public float[] getsal(){
        return sal;
    }
    public int[] getrice(){
        return rice;
    }
    public int[] getphone(){
        return phone;
    }
    public int[] getcloth(){
        return cloth;
    }
    //function for print employee details
    public void printDetails(int n){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Employee Details");
        System.out.println();
        System.out.println(header[0]+empNum[n]);//index header and Employee Number
        
//-------------------------- Application of File Handling-----------------------------------------------------        
        System.out.println(header[1]+lastName[n]);//index header and use lastname from arraylist
        System.out.println(header[2]+firstName[n]);//index header and first name from arraylist
//---------------------------------------------------------------------------------------------------------------        
        
        System.out.println(header[3]+birthday[n]);//index header and birthday
        System.out.println(header[4]+address[n]);//index header and address
        System.out.println(header[5]+phoneNum[n]);//index header and phone number
        System.out.println(header[6]+sssNum[n]);//index header and SSS number
        System.out.println(header[7]+phNum[n]);//index header and Philhealth number
        System.out.println(header[8]+tinNum[n]);//index header and Tin number
        System.out.println(header[9]+pgbNum[n]);//index header and pagibig number
        System.out.println(header[10]+status[n]);//index header and status
        System.out.println(header[11]+position[n]);//index header and position
        System.out.println(header[12]+sup[n]);//index header and supervisor
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Salary and Other Benefits");
        System.out.println();
        
        System.out.println(header[13]+sal[n]);//index header and salary
//---------------------------------------------------------------------------------------------------------------           
        System.out.println(header[14]+rice[n]);//index header and rice subsidy
        System.out.println(header[15]+phone[n]);//index header and phone allowance
        System.out.println(header[16]+cloth[n]);//index header and salary
        System.out.println(header[17]+sal[n]/2);//index header and compute gross semi month rate
        System.out.println(header[18]+sal[n]/(21*8));//index header and compute hourly rate*/        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        }
    
        
    
}
