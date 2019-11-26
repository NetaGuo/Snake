package com.youngfeng.snake.demo.useextends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.youngfeng.snake.demo.R;

/**
 * The third fragment.
 *
 * @author Scott Smith 2017-12-24 17:03
 */
//@EnableDragToClose()
public class ThirdFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ((FragmentSample2Activity)requireActivity()).setTitle(ThirdFragment.class.getSimpleName());
    }
}
