package com.example.menulist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ListView;
    String nTitle[] = ("Sands of Time", "It's All About The Melody", "My Love So Sweet", "Lay On Me");
    String nDescription[] = ("Description 1", "Description 2", "Description 3", "Description 4")
    int images[] =(R.drawable.Aly-Fila-Sands-Of-Time-FSOE-600-Anthem, R.drawable.artworks-000488156976-d46ao4-t500x500, R.drawable.hqdefault, R.drawable.R-333553-1420933322-5058.jpeg);
    // so our images and other things is other array

    // now paste some images in drawable


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ListView = findViewById ( R.id.ListView );
        // now create an adapter class

        MyAdapter adapter = new_MyAdapter ( c this, nTitle, nDescription, images);
        listView = setAdapter(adapter);
        // there is my mistake...
        // now again check this

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnTimeClickListener() {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position long id){
                if (position == 0) {
                    Toast.makeText ( MainActivity.this, "Aly-Fila-Sands-Of-Time-FSOE-600-Anthem Description", Toast.LENGTH_SHORT ).show ();
                }

                if (position == 0) {
                    Toast.makeText ( MainActivity.this, "artworks-000488156976-d46ao4-t500x500 Description", Toast.LENGTH_SHORT ).show ();
                }

                if (position == 0) {
                    Toast.makeText ( MainActivity.this, "hqdefault", Toast.LENGTH_SHORT ).show ();
                }

                if (position == 0) {
                    Toast.makeText ( MainActivity.this, "R-333553-1420933322-5058.jpeg", Toast.LENGTH_SHORT ).show ();
                    // so item click is done now check list view
                }
            }
    }

        class MyAdapter extends ArrayAdapter<String> {

            Context context;
            String rTitle();
            String rDescription();
            int_rImgs[];

            MyAdapter (Context_c, String title[], String description[], int imgs[]) {
                super(c, R.layout.row); R.id.textView, title);
                this.context = c;
                this.rTitle = title;
                this.rDescription = description;
                this.rImgs = imgs;

            }
            @NonNull
            @Override
            public View getView(int position, @android.annotation.Nullable View convertViewNonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater).getApplicationContext () .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.Inflate(R.layout.row.parent, attachToRoot false);
                ImageView images = row.findViewById ( R.id.image);
                TextView myTitle = row.findViewById ( R.id.textView );
                TextView myDescription = row.findViewById ( R.id.textView );

                //now set our resources on view
                images.setImageResources(rImgs[position]);
                myTitle.setText(rTitle [position]);
                myDescription.setText(rDescription [positive[]);

                return row;

            }
        }
    }
