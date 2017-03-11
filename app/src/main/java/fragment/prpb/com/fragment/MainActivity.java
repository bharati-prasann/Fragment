package fragment.prpb.com.fragment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Fragment {

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onStart","Inside onStart");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("onStart","Inside onStart");
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onDestroyView() {
        Log.i("onStart","Inside onStart");
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.i("onStart","Inside onStart");
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onStart","Inside onStart");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("onStart","Inside onStart");
    }
}
