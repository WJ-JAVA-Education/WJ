package com.example.myapplication;

import static com.example.myapplication.RetrofitClient.API_SERVICE;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    TextView pid, title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.btn);


        button.setOnClickListener(view -> {
            API_SERVICE.getAllBoardList().enqueue(new Callback<Board>() {
                @Override
                public void onResponse(Call<Board> call, Response<Board> response) {
                    if (response.isSuccessful()) {
                        Log.d("===", response.body().toString());


                    }
                }

                @Override
                public void onFailure(Call<Board> call, Throwable t) {
                    Log.d("==DEBUG==", t.getMessage());
                }
            });
        });


    }

    public class MyAdapter extends BaseAdapter {

        Context mContext = null;
        LayoutInflater mLayoutInflater = null;
        ArrayList<Long> pidList;
        ArrayList<String> titleList;
        ArrayList<String> contentList;


        public MyAdapter(Context context, ArrayList<Long> pidList, ArrayList<String> titleList, ArrayList<String> contentList) {
            mContext = context;
            this.pidList = pidList;
            this.titleList = titleList;
            this.contentList = contentList;
            mLayoutInflater = LayoutInflater.from(mContext);
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = mLayoutInflater.inflate(R.layout.activity_main, null);


            pid = findViewById(R.id.pid);
            title = findViewById(R.id.title);
            content = findViewById(R.id.content);


            return view;

        }
    }
}

