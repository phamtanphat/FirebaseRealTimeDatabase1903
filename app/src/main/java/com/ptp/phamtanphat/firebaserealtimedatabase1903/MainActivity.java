package com.ptp.phamtanphat.firebaserealtimedatabase1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cau lenh khoi tao database neu chua co
        firebaseDatabase = FirebaseDatabase.getInstance();
        //Ket noi va viet du len cho firebase
        mData = firebaseDatabase.getReference();

//        String text = "Chao firebase";
        HashMap<String,String> mangten = new HashMap<>();
        mangten.put("Nguyen Van A","Quan 1");
        mangten.put("Nguyen Van B","Quan 2");
        mData.child("Truong tieu hoc").child("Truong Duong Minh Chau").setValue("Quan 10");
        mData.child("Danh sach nguoi dan").setValue(mangten);

    }
}
