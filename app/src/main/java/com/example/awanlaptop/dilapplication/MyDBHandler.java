package com.example.awanlaptop.dilapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
//dont need to change name of db? No I think

public class MyDBHandler extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "oop.db";
  //  public static final String TABLE_SIGNUP="MyDilData";
    public static final String Id="_id";
    public static final String COLOUMNS_EMAIL1="EmailId";
    public static final String COLOUMNS_PASSWORD1="Password";


// for basic info

    public static final String TABLE_DilDetails="DilDetails";
    public static final String COLOUMNS_InterviewerName="NameOfInterviewer";
    public static final String COLOUMNS_Number="ContactNumber";
    public static final String COLOUMNS_Dates="Date";
    public static final String COLOUMNS_Desig="Designation";
    public static final String COLOUMNS_Start="StartTime";
    public static final String COLOUMNS_End="EndTime";
    public static final String COLOUMNS_NOV="VillageName";
    public static final String COLOUMNS_PN="ProjectName";

    // for respondent
    public static final String StdName="StudentName";
    public static final String StudentCN="StudentContactNumber";
    public static final String SchName="SchoolName";
    public static final String EmailAddress="RespondentEmailId";
    public static final String dateOfBirth="DateOfBirth";
    public static final String gender="Gender";
    public static final String motherTongue="MotherTongue";
    public static final String maritalStatus="MaritalStatusActivity";
    public static final String homeAddress="HomeAddress";
    // for marital status
    public static final String sectionname="SectionName";
    public static final String questions="Questions";
    public static final String responses="Responses";
    public static final String other="Other";
    public static final String feedback="Feedback";
    public static final String rating="Rating";

    public static ContentValues values;


    public Context context;//This variabble will save context from constructor for me.
    public static long last_row_id= 0;//This was not static


    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //In this context we have context.
        //But we can't use out side this constructor
        this.context = context;//understand?yes
        //values=new ContentValues();
    }
    public void newContentValues(){
        values = new ContentValues();
    }
    public void onCreate(SQLiteDatabase db) {

        String querry= "CREATE TABLE  " +TABLE_DilDetails+  " (" +
                Id + " INTEGER PRIMARY KEY AUTOINCREMENT DEFAULT 1, " +
                COLOUMNS_EMAIL1  + " TEXT, " +
                COLOUMNS_PASSWORD1 + " TEXT, " +
                COLOUMNS_InterviewerName  + " TEXT, " +
                COLOUMNS_Number + " TEXT, " +
                COLOUMNS_Dates  + " TEXT, " +
                COLOUMNS_Desig  + " TEXT, " +
                COLOUMNS_Start  + " TEXT, " +
                COLOUMNS_End  + " TEXT, " +
                COLOUMNS_NOV  + " TEXT, " +
                COLOUMNS_PN + " TEXT, " +
                // respondent fields
                StdName  + " TEXT, " +
                StudentCN  + "  TEXT, " +
                SchName  + " TEXT, " +
                EmailAddress  + " TEXT, " +
                dateOfBirth  + " TEXT, " +
                gender  + " TEXT, " +
               motherTongue  + " TEXT, " +
               maritalStatus  + " TEXT, " +
                homeAddress  + " TEXT, " +
                sectionname  + " TEXT, " +
                questions  + " TEXT, " +
               responses + " TEXT, " +
                other  + " TEXT, " +
                feedback  + " TEXT, " +
                rating + " TEXT " +






                ");";

       /* String querry1= "CREATE TABLE IF NOT EXISTS " +TABLE_BasicInfo+  " (" +
                COLOUMNS_InterviwerName  + " TEXT, " +
                COLOUMNS_Number+ " TEXT " +
                COLOUMNS_Dates  + " TEXT, " +
                COLOUMNS_Desig  + " TEXT, " +
                COLOUMNS_Start  + " TEXT, " +
                COLOUMNS_End  + " TEXT, " +
                COLOUMNS_NOV  + " TEXT, " +
                COLOUMNS_PN+ " TEXT " +

                ");";*/



        db.execSQL(querry);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL("DROP TABLE IF EXISTS"+TABLE_DilDetails);
        onCreate(db);

    }
    public void insertlogindata(Login a)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(COLOUMNS_EMAIL1, a.get_email());
        values.put(COLOUMNS_PASSWORD1,a.get_password());

        //Log.d("Waseem","1");
        //last_row_id = db.insert(TABLE_DilDetails,null,values);

       // Log.d("Waseem id = ", Long.toString(last_row_id) );

        //String myQuery = "SELECT * FROM " + TABLE_DilDetails + "  ;";






    }
//open the database
    public void insertBasicInfoDetails(BasicInfo b)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(COLOUMNS_InterviewerName,b.getUname());
        values.put(COLOUMNS_Number,b.getUcontactnumber());
        values.put(COLOUMNS_Dates,b.getUdate());
        values.put(COLOUMNS_Desig,b.getUdesignation());
        values.put(COLOUMNS_Start,b.getUstart());
        values.put(COLOUMNS_End,b.getUend());
        values.put(COLOUMNS_NOV,b.getUvillage());
        // String ROW1 = "insert into " +TABLE_DilDetails+ " (" +COLOUMNS_EMAIL1+ ", " +COLOUMNS_PASSWORD1+ ") values(" +login.get_email()+  ",'" +login.get_password()+ "')";
        //  db.execSQL(ROW1);
      // long rowid=cursor.getLong(cursor.getColumnIndex("ID"));
        //int rowid=getrowid();
       Toast.makeText(context, "LastID: " + last_row_id , Toast.LENGTH_SHORT).show();

       // db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);


    }
    public void insertBasicInfoRadioButtonValue(BasicInfo basicinfo)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(COLOUMNS_PN,basicinfo.getUproject());
        // db.insert(TABLE_DilDetails,null,values);
        //db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);


        //String querry= "INSERT INTO TABLE_DilDetails (COLOUMNS_PN)
        //VALUES (projectname)";
    }

    public Cursor getInformations(SQLiteDatabase db)
    {
        Cursor cursor;
        String[] projections={COLOUMNS_EMAIL1,COLOUMNS_PASSWORD1};
        cursor= db.query(TABLE_DilDetails,projections,null,null,null,null,null);
        return cursor;

    }
   public void insertRespondentDetails ( Respondentclass respondentclass)
    {



        SQLiteDatabase db=getWritableDatabase();

        values.put(StdName,respondentclass.getUstudentName());
        values.put(StudentCN,respondentclass.getUcontactNum());
        values.put(SchName,respondentclass.getUschoolName());
        values.put(EmailAddress,respondentclass.getUemailAdd());

       // db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);


    }
 public void insertRespondent2EditText(Respondentclass respondentclass)
 {

     SQLiteDatabase db=getWritableDatabase();

     values.put(dateOfBirth,respondentclass.getUdateofBirth());
     values.put(motherTongue,respondentclass.getUmotherTongue());

     //db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);


 }
    public void insertRespondent2Gender(Respondentclass respondentclass)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(gender,respondentclass.getUstudentGender());
      //  db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);

    }
    public void insertRespondent2Maritalstatus(Respondentclass respondentclass)
    {


        SQLiteDatabase db=getWritableDatabase();

        values.put(maritalStatus,respondentclass.getUmaritalStatus());

        //db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);

    }
    public void insertRespondent3HomeAddress(Respondentclass respondentclass)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(homeAddress,respondentclass.getUhomeAddress());
        values.put(sectionname,respondentclass.getSectionname());
      //  db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);



    }
    public void insertMaritalStatusQuestions(MaritalStatusClass question, int numberofquestions,
                                             MaritalStatusClass  maritalStatusClass1, MaritalStatusClass maritalStatusClass3,
                                             MaritalStatusClass obj2)
    {

        SQLiteDatabase db=getWritableDatabase();


       // ContentValues temporaryvalue= new ContentValues();
        values.put(questions,question.getQuestion1());

        values.put(sectionname,question.getSection());

        values.put(responses,maritalStatusClass1.getAnswer1());

        db.insert(TABLE_DilDetails,null,values);
       // db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);

       // db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);
     for(int i=0; i < numberofquestions ; i ++)
     {

         if(i==0)
         {

        // last_row_id= db.insert(TABLE_DilDetails,null,temporaryvalue);
             values.put(questions,question.getQuestion2());
             values.put(sectionname,question.getSection());
             values.put(responses,obj2.getAnswer2());
            db.insert(TABLE_DilDetails,null,values);
         //db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);
        }
        else if (i==1)
        {


            values.put(questions,question.getQuestion3());
            values.put(sectionname,question.getSection());
            values.put(responses,maritalStatusClass3.getAnswer3());

            //
            // db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);
            db.insert(TABLE_DilDetails,null,values);
        }





        }

    }
    public void insertMaritalStatusQuestionsActivity2(MaritalStatusClass question,MaritalStatusClass maritalStatusClass5,MaritalStatusClass obj4,String section)
    {
        SQLiteDatabase db=getWritableDatabase();

        values.put(questions,question.getQuestion4());


        values.put(sectionname,section);

        values.put(responses,obj4.getAnswer4());
        db.insert(TABLE_DilDetails,null,values);

        values.put(questions,question.getQuestion5());
          values.put(sectionname,section);


        values.put(responses,maritalStatusClass5.getAnswer5());
        db.insert(TABLE_DilDetails,null,values);


    }
   /* public void copyRow()
    {
       SQLiteDatabase db=getWritableDatabase();

        String querry= "INSERT INTO" + TABLE_DilDetails  + " ( " +  COLOUMNS_EMAIL1 + COLOUMNS_PASSWORD1 + COLOUMNS_InterviewerName   + COLOUMNS_Number
                                     + COLOUMNS_Dates  + COLOUMNS_Desig  + COLOUMNS_Start   + COLOUMNS_End   + COLOUMNS_NOV
                                     + COLOUMNS_PN  + StdName + StudentCN  + SchName  + EmailAddress + dateOfBirth
                                     + gender  + motherTongue  + maritalStatus  + homeAddress  + sectionname  + ")" + "(" + "SELECT " + COLOUMNS_EMAIL1 + COLOUMNS_PASSWORD1 + COLOUMNS_InterviewerName   + COLOUMNS_Number
                                     + COLOUMNS_Dates  + COLOUMNS_Desig  + COLOUMNS_Start   + COLOUMNS_End   + COLOUMNS_NOV
                                      + COLOUMNS_PN  + StdName + StudentCN  + SchName  + EmailAddress + dateOfBirth
                                      + gender  + motherTongue  + maritalStatus  + homeAddress  + sectionname  + "FROM" + TABLE_DilDetails +
                                      "WHERE '" + Id + "'=" + 1 + ");";

        db.execSQL(querry);



    }*/



    public void insertFamilyInformationQuestions(FamilyInformationClass Questions,
                                                 FamilyInformationClass answers,int num) {
        SQLiteDatabase db = getWritableDatabase();
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                ;
                values.put(questions, Questions.getQuestion1());
                values.put(sectionname, Questions.getSection());
                values.put(responses, answers.getAnswer1());
                db.insert(TABLE_DilDetails, null, values);

            } else if (i == 1) {
                values.put(questions, Questions.getQuestion2());
                values.put(sectionname, Questions.getSection());
                values.put(responses, answers.getAnswer2());
                db.insert(TABLE_DilDetails, null, values);


            } else if (i == 2) {
                values.put(questions, Questions.getQuestion3());
                values.put(sectionname, Questions.getSection());
                values.put(responses, answers.getAnswer3());
                db.insert(TABLE_DilDetails, null, values);

            }





        }
    }

    public void insertFamilyInformationQuestions2(FamilyInformationClass Questions,
                                                 FamilyInformationClass answers,int num,String section) {
        SQLiteDatabase db = getWritableDatabase();
        for (int i = 0; i < num; i++) {

            if (i == 3) {

                values.put(questions, Questions.getQuestion4());
                values.put(sectionname, section);
                values.put(responses, answers.getAnswer4());
                db.insert(TABLE_DilDetails, null, values);

            } else if (i == 4) {
                values.put(questions, Questions.getQuestion5());
                values.put(sectionname, section);
                values.put(responses, answers.getAnswer5());
                db.insert(TABLE_DilDetails, null, values);


            } else if (i == 5) {
                values.put(questions, Questions.getQuestion6());
                values.put(sectionname,section);
                values.put(responses, answers.getAnswer6());
                db.insert(TABLE_DilDetails, null, values);

            }


        }
    }
    public void insertFamilyInformationQuestions3(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,String section)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion7());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer7a());

        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer7b());

        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer7c());

        db.insert(TABLE_DilDetails, null, values);







    }

    public void insertFamilyInformationQuestions4(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,String section)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion8());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer8());
        db.insert(TABLE_DilDetails, null, values);

    }
    public void insertFamilyInformationQuestions5(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,String section)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion9());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer9());
        db.insert(TABLE_DilDetails, null, values);

    }
    public void insertFamilyInformationQuestions6(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,
                                                  String section,FamilyInformationClass answer10,
                                                  FamilyInformationClass answer13)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion10());
        values.put(sectionname,section);
        values.put(responses, answer10.getAnswer10());


        db.insert(TABLE_DilDetails, null, values);
        values.put(questions, Questions.getQuestion11());
        values.put(sectionname,section);
        values.put(responses,answers.getAnswer11());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion12());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer12());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion13());
        values.put(sectionname,section);
        values.put(responses, answer13.getAnswer13());


        db.insert(TABLE_DilDetails, null, values);

    }


    public void insertFamilyInformationQuestions7(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,
                                                  String section,FamilyInformationClass answer16)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion14());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer14());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion15());
        values.put(sectionname,section);
        values.put(responses,answers.getAnswer15());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion16());
        values.put(sectionname,section);
        values.put(responses, answer16.getAnswer16());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion17());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer17());


        db.insert(TABLE_DilDetails, null, values);

    }
    public void insertFamilyInformationQuestions8(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,
                                                  String section,FamilyInformationClass answer19)
    {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion18());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer18());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion19());
        values.put(sectionname,section);
        values.put(responses,answer19.getAnswer19());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion20());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer20());


        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion21());
        values.put(sectionname,section);
        values.put(responses, answers.getAnswer21());


        db.insert(TABLE_DilDetails, null, values);

    }
    public void insertFamilyInformationQuestions9(FamilyInformationClass Questions,
                                                  FamilyInformationClass answers,int num,
                                                  String section) {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion22());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer22());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion23());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer23());


        db.insert(TABLE_DilDetails, null, values);
    }
public  void  insertSchoolingInformationQuestions1(SchoolingInformationClass Questions,
                                                   SchoolingInformationClass answers,int num){
    SQLiteDatabase db = getWritableDatabase();

    values.put(questions, Questions.getQuestion1());
    values.put(sectionname, Questions.getSection());
    values.put(responses, answers.getAnswer1());
    db.insert(TABLE_DilDetails, null, values);
}

    public  void  insertSchoolingInformationQuestions2(SchoolingInformationClass Questions,
                                                        SchoolingInformationClass answers,int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion2());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer2());
        db.insert(TABLE_DilDetails, null, values);
    }
    public  void  insertSchoolingInformationQuestions3(SchoolingInformationClass Questions,
                                                       SchoolingInformationClass answer3,SchoolingInformationClass answer3a,
                                                       int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion3());
        values.put(sectionname, section);
        values.put(responses, answer3.getAnswer3());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion3a());
        values.put(sectionname, section);
        values.put(responses, answer3a.getAnswer3a());
        db.insert(TABLE_DilDetails, null, values);
    }

    public  void  insertSchoolingInformationQuestions4(SchoolingInformationClass Questions,
                                                       SchoolingInformationClass answer3b,SchoolingInformationClass answer3c,
                                                       int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion3b());
        values.put(sectionname, section);
        values.put(responses, answer3b.getAnswer3b());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion3c());
        values.put(sectionname, section);
        values.put(responses, answer3c.getAnswer3c());
        db.insert(TABLE_DilDetails, null, values);
    }

    public  void  insertSchoolingInformationQuestions5(SchoolingInformationClass Questions,
                                                       SchoolingInformationClass answer5,SchoolingInformationClass answer4,
                                                       int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion4());
        values.put(sectionname, section);
        values.put(responses, answer4.getAnswer4());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, Questions.getQuestion5());
        values.put(sectionname, section);
        values.put(responses, answer5.getAnswer5());
        db.insert(TABLE_DilDetails, null, values);
    }

    public  void  insertSchoolingInformationQuestions6(SchoolingInformationClass Questions,
                                                       SchoolingInformationClass answer6,
                                                       int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion6());
        values.put(sectionname, section);
        values.put(responses, answer6.getAnswer6());
        db.insert(TABLE_DilDetails, null, values);


    }
    public  void  insertSchoolingInformationQuestions6b(String question6,
                                                       SchoolingInformationClass answer6,
                                                       int num,String section,SchoolingInformationClass edittextanswer){
        SQLiteDatabase db = getWritableDatabase();


        values.put(questions, question6);
        values.put(sectionname, section);

        if (edittextanswer.getEdittextanswer().trim().length()>0) {
            values.put(responses,"");
           db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);

            values.put(other, edittextanswer.getEdittextanswer());


            db.insert(TABLE_DilDetails, null, values);
            return;

        }


        values.put(responses, answer6.getAnswer6());


        db.insert(TABLE_DilDetails, null, values);


    }

    public  void  insertSchoolingInformationQuestions7(SchoolingInformationClass Questions,
                                                       SchoolingInformationClass answers,int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion7());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer7());
        db.insert(TABLE_DilDetails, null, values);


    }


    public  void  insertSiblingStatusActivityQuestion1(SiblingsStatusClass question, SiblingsStatusClass answers,
                                                         int num){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, question.getQuestion1());
        values.put(sectionname, question.getSection());
        values.put(responses, answers.getAnswer1a());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, question.getQuestion1());
        values.put(sectionname, question.getSection());
        values.put(responses, answers.getAnswer1b());
        db.insert(TABLE_DilDetails, null, values);




        values.put(questions, question.getQuestion2());
        values.put(sectionname, question.getSection());
        values.put(responses, answers.getAnswer2a());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, question.getQuestion2());
        values.put(sectionname, question.getSection());
        values.put(responses, answers.getAnswer2b());
        db.insert(TABLE_DilDetails, null, values);

    }


    public  void  insertSiblingStatusActivityQuestion2(SiblingsStatusClass question, SiblingsStatusClass answers,
                                                       int num,String section) {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, question.getQuestion3());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer3a());
        db.insert(TABLE_DilDetails, null, values);

        values.put(questions, question.getQuestion3());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer3b());
        db.insert(TABLE_DilDetails, null, values);

    }

    public  void  insertSuggestionActivityQuestion1(SuggestionClass question, SuggestionClass answers,
                                                       int num) {
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, question.getQuestion1());
        values.put(sectionname, question.getSection());
        values.put(responses, answers.getAnswer1a());
        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer1b());
        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer1c());

        db.insert(TABLE_DilDetails, null, values);



    }
    public  void  insertSuggestionActivityQuestion2(SuggestionClass Questions,
                                                       SuggestionClass answers,
                                                       int num,String section){
        SQLiteDatabase db = getWritableDatabase();

        values.put(questions, Questions.getQuestion2());
        values.put(sectionname, section);
        values.put(responses, answers.getAnswer2a());
        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer2b());
        db.insert(TABLE_DilDetails, null, values);
        values.put(responses, answers.getAnswer2c());

        db.insert(TABLE_DilDetails, null, values);


    }

    public  void  insertFeedBack3(SuggestionClass question, SuggestionClass answers,
                                                       String Rating) {
        SQLiteDatabase db = getWritableDatabase();

        values.put(responses,"");
        db.update(TABLE_DilDetails,values,Id + "=" + last_row_id, null);


        values.put(questions, question.getQuestionfeedback());
        values.put(sectionname, "Null");

        values.put(feedback, answers.getFeedback());
        values.put(rating, Rating);


        db.insert(TABLE_DilDetails, null, values);

    }
}
   /* public void addpassword(Signup b)
    {


        values.put(COLOUMNS_PASSWORD, b.get_password());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_SIGNUP,null,values);
        db.close();
    }*/



