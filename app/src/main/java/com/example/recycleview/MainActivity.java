package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecycleview;
    String data []={"data1","hahahah","ttttt","kkkkkk33","eeeeeee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //关联id
        mRecycleview= (RecyclerView) findViewById(R.id.recyview);

        if(mRecycleview!=null){
//           再回收时可以提高性能
            mRecycleview.setHasFixedSize(true);
        }
        //给view设置 item 线性布局
        //linearlayoutmanager 以垂直或水平滚动列表方式显示项目
        mRecycleview.setLayoutManager(new LinearLayoutManager(this));

        //给view设置 item gridview 效果 GridLayoutManage  在网格中显示项目
       //mRecycleview.setLayoutManager(new GridLayoutManager(this,4));

        //StaggeredGridLayoutManager在分散对齐的网格中显示项目
       // mRecycleview.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL));

        MyAdapter adapter=new MyAdapter(data);
        mRecycleview.setAdapter(adapter);
    }
}
