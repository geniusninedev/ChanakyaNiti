package com.genius.android.chanakyaniti.ChanakyaNiti;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.genius.android.chanakyaniti.Chapters.ChapterEight;
import com.genius.android.chanakyaniti.Chapters.ChapterEleven;
import com.genius.android.chanakyaniti.Chapters.ChapterFifteen;
import com.genius.android.chanakyaniti.Chapters.ChapterFive;
import com.genius.android.chanakyaniti.Chapters.ChapterFour;
import com.genius.android.chanakyaniti.Chapters.ChapterFourteen;
import com.genius.android.chanakyaniti.Chapters.ChapterNine;
import com.genius.android.chanakyaniti.Chapters.ChapterOne;
import com.genius.android.chanakyaniti.Chapters.ChapterSeven;
import com.genius.android.chanakyaniti.Chapters.ChapterSeventeen;
import com.genius.android.chanakyaniti.Chapters.ChapterSix;
import com.genius.android.chanakyaniti.Chapters.ChapterTen;
import com.genius.android.chanakyaniti.Chapters.ChapterThirteen;
import com.genius.android.chanakyaniti.Chapters.ChapterThree;
import com.genius.android.chanakyaniti.Chapters.ChapterTwelve;
import com.genius.android.chanakyaniti.Chapters.ChapterTwo;
import com.genius.android.chanakyaniti.Chapters.ChaptersSixteen;
import com.genius.android.chanakyaniti.R;
import com.genius.android.chanakyaniti.SettingsActivity;

public class ChapterEnglish extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listView;
    //TextView Chankya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_english);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.BLACK);

        listView=(ListView)findViewById(R.id.listView);
     //   Chankya=(TextView)findViewById(R.id.textView1);
        String[] values = new String[] {  "Chapter 1","Chapter 2","Chapter 3","Chapter 4","Chapter 5","Chapter 6","Chapter 7","Chapter 8","Chapter 9"
,"Chapter 10","Chapter 11","Chapter 12","Chapter 13","Chapter 14","Chapter 15","Chapter 16","Chapter 17"
        };
        toolbar.setBackgroundColor(Color.BLACK);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.content_chapter_english, R.id.textView1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i=new Intent(ChapterEnglish.this,ChapterOne.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i=new Intent(ChapterEnglish.this,ChapterTwo.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i=new Intent(ChapterEnglish.this,ChapterThree.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i=new Intent(ChapterEnglish.this,ChapterFour.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i=new Intent(ChapterEnglish.this,ChapterFive.class);
                    startActivity(i);
                }
                if(position==5){
                    Intent i=new Intent(ChapterEnglish.this,ChapterSix.class);
                    startActivity(i);
                }
                if(position==6){
                    Intent i=new Intent(ChapterEnglish.this,ChapterSeven.class);
                    startActivity(i);
                }
                if(position==7){
                    Intent i=new Intent(ChapterEnglish.this,ChapterEight.class);
                    startActivity(i);
                }
                if(position==8){
                    Intent i=new Intent(ChapterEnglish.this,ChapterNine.class);
                    startActivity(i);
                }

                if(position==9){
                    Intent i=new Intent(ChapterEnglish.this,ChapterTen.class);
                    startActivity(i);
                } if(position==10){
                    Intent i=new Intent(ChapterEnglish.this,ChapterEleven.class);
                    startActivity(i);
                } if(position==11){
                    Intent i=new Intent(ChapterEnglish.this,ChapterTwelve.class);
                    startActivity(i);
                } if(position==12){
                    Intent i=new Intent(ChapterEnglish.this,ChapterThirteen.class);
                    startActivity(i);
                } if(position==13){
                    Intent i=new Intent(ChapterEnglish.this,ChapterFourteen.class);
                    startActivity(i);
                }
                if(position==14){
                    Intent i=new Intent(ChapterEnglish.this,ChapterFifteen.class);
                    startActivity(i);
                }
                if(position==15){
                    Intent i=new Intent(ChapterEnglish.this,ChaptersSixteen.class);
                    startActivity(i);
                }
                if(position==16){
                    Intent i=new Intent(ChapterEnglish.this,ChapterSeventeen.class);
                    startActivity(i);
                }
            }
        });















     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i=new Intent(ChapterEnglish.this, SettingsActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();





        if (id == R.id.nav_camera) {
            Intent i = new Intent(ChapterEnglish.this, Home.class);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(ChapterEnglish.this, AboutChanakya.class);
            startActivity(i);


        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(ChapterEnglish.this, ChapterEnglish.class);
            startActivity(i);


        } else if (id == R.id.nav_manage) {
            Intent i = new Intent(ChapterEnglish.this, ChapterHindi.class);
            startActivity(i);


        }
        if (id == R.id.nav_about) {
            Intent i = new Intent(ChapterEnglish.this, ChanakyaQuotes.class);
            startActivity(i);
        }


        else if (id == R.id.nav_share) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "Hello");
            startActivity(Intent.createChooser(i, "Share via"));
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
