package adapter;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myweek1.MainActivity;

import Utils.Url;
import fragment.TextFragment;
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    String len[];
    String []url={"gj","ss","cj","kj","js","ty","yl","gn","shehui","tt"};

    public MyFragmentPagerAdapter(FragmentManager fm, String[] len) {
        super(fm);
        this.len = len;
    }

    @Override
    public Fragment getItem(int position) {
        return TextFragment.newInstance(url[position]);
    }

    @Override
    public int getCount() {
        return len.length;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return len[position%len.length].toUpperCase();
    }
}
