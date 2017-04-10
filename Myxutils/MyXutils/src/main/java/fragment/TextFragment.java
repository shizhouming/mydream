package fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.librarylistview.XListView;
import com.example.myweek1.R;

import Utils.Url;
import Utils.xutlis;

public class TextFragment extends Fragment {
    private static final String KEY_CONTENT = "TestFragment:Content";
    private static String str;
    private XListView mListView;


    public static TextFragment newInstance(String content) {
        TextFragment fragment = new TextFragment();
            str=content;
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            builder.append(content).append(" ");
//        }
//        builder.deleteCharAt(builder.length() - 1);
//        fragment.mContent = builder.toString();

        return fragment;
    }

    private String mContent = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mContent = savedInstanceState.getString(KEY_CONTENT);
        }*/
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mListView = (XListView) getView().findViewById(R.id.xlistview);
        xutlis.getjson(getActivity(),str,mListView);
    }

   /* @Override
     public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_CONTENT, mContent);
    }*/


}

