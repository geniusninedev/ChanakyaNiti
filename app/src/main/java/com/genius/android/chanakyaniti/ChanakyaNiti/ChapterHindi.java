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

import com.genius.android.chanakyaniti.HindiChapters.Eight;
import com.genius.android.chanakyaniti.HindiChapters.Eleven;
import com.genius.android.chanakyaniti.HindiChapters.Fifteen;
import com.genius.android.chanakyaniti.HindiChapters.Five;
import com.genius.android.chanakyaniti.HindiChapters.Four;
import com.genius.android.chanakyaniti.HindiChapters.Fourteen;
import com.genius.android.chanakyaniti.HindiChapters.Nine;
import com.genius.android.chanakyaniti.HindiChapters.One;
import com.genius.android.chanakyaniti.HindiChapters.Seven;
import com.genius.android.chanakyaniti.HindiChapters.Seventeen;
import com.genius.android.chanakyaniti.HindiChapters.Six;
import com.genius.android.chanakyaniti.HindiChapters.Sixteen;
import com.genius.android.chanakyaniti.HindiChapters.Ten;
import com.genius.android.chanakyaniti.HindiChapters.Thirteen;
import com.genius.android.chanakyaniti.HindiChapters.Three;
import com.genius.android.chanakyaniti.HindiChapters.Twelve;
import com.genius.android.chanakyaniti.HindiChapters.Two;
import com.genius.android.chanakyaniti.R;
import com.genius.android.chanakyaniti.SettingsActivity;

public class ChapterHindi extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_hindi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(Color.BLACK);
        listView=(ListView)findViewById(R.id.listView);

        String[] values = new String[] {  "प्रथम अध्याय","द्वितीय अध्याय","तृतीय अध्याय","चतुर्थ अध्याय","पंचम अध्याय","षष्ठ अध्याय ","सप्तम अध्याय","अष्टम अध्याय","नवम अध्याय"
                ,"दशम अध्याय ","एकादश अध्याय","द्वादश अध्याय","त्रयोदश अध्याय","चतुर्दश अध्याय","पंचदश अध्याय","षोडश अध्याय", "सप्तदश अध्याय"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.content_chapter_hindi, R.id.textView1, values);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i=new Intent(ChapterHindi.this,One.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i=new Intent(ChapterHindi.this,Two.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i=new Intent(ChapterHindi.this,Three.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i=new Intent(ChapterHindi.this,Four.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i=new Intent(ChapterHindi.this,Five.class);
                    startActivity(i);
                }
                if(position==5){
                    Intent i=new Intent(ChapterHindi.this,Six.class);
                    startActivity(i);
                }
                if(position==6){
                    Intent i=new Intent(ChapterHindi.this,Seven.class);
                    startActivity(i);
                }
                if(position==7){
                    Intent i=new Intent(ChapterHindi.this,Eight.class);
                    startActivity(i);
                }
                if(position==8){
                    Intent i=new Intent(ChapterHindi.this,Nine.class);
                    startActivity(i);
                }

                if(position==9){
                    Intent i=new Intent(ChapterHindi.this,Ten.class);
                    startActivity(i);
                } if(position==10){
                    Intent i=new Intent(ChapterHindi.this,Eleven.class);
                    startActivity(i);
                } if(position==11){
                    Intent i=new Intent(ChapterHindi.this,Twelve.class);
                    startActivity(i);
                } if(position==12){
                    Intent i=new Intent(ChapterHindi.this,Thirteen.class);
                    startActivity(i);
                } if(position==13){
                    Intent i=new Intent(ChapterHindi.this,Fourteen.class);
                    startActivity(i);
                }
                if(position==14){
                    Intent i=new Intent(ChapterHindi.this,Fifteen.class);
                    startActivity(i);
                }
                if(position==15){
                    Intent i=new Intent(ChapterHindi.this,Sixteen.class);
                    startActivity(i);
                }
                if(position==16){
                    Intent i=new Intent(ChapterHindi.this,Seventeen.class);
                    startActivity(i);
                }
            }
        });








        // Assign adapter to ListView
       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
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
        getMenuInflater().inflate(R.menu.chapter_hindi, menu);
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
            Intent i=new Intent(ChapterHindi.this, SettingsActivity.class);
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
            Intent i = new Intent(ChapterHindi.this, Home.class);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(ChapterHindi.this, AboutChanakya.class);
            startActivity(i);


        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(ChapterHindi.this, ChapterEnglish.class);
            startActivity(i);


        } else if (id == R.id.nav_manage) {
            Intent i = new Intent(ChapterHindi.this, ChapterHindi.class);
            startActivity(i);


        }
        if (id == R.id.nav_about) {
            Intent i = new Intent(ChapterHindi.this, ChanakyaQuotes.class);
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

