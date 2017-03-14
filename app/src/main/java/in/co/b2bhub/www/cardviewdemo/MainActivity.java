package in.co.b2bhub.www.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Contact> list =new ArrayList<Contact>();
    int[] img_id={R.drawable.album1,R.drawable.album2,R.drawable.album3,R.drawable.album4,R.drawable.album5,R.drawable.album6,R.drawable.album7,R.drawable.album8,
    R.drawable.album9,R.drawable.album10};
    String[] name,email,mobile;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.person_name);
        email=getResources().getStringArray(R.array.person_email);
        mobile=getResources().getStringArray(R.array.person_mobile);
        int count=0;
        for (String Name: name)
        {
            Contact contact=new Contact(img_id[count],Name,email[count],mobile[count]);
            count++;
            list.add(contact);
        }
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new ContactAdapter(list,this);
        recyclerView.setAdapter(adapter);


    }
}
