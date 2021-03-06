package shanyao.simpleapp.fragment.main;

import android.support.v4.app.Fragment;

import shanyao.simpleapp.R;
import shanyao.simpleapp.activity.ClickButtonActivity;
import shanyao.simpleapp.fragment.BasePagerFragment;
import shanyao.simpleapp.fragment.FragmentFactory;
import shanyao.simpleapp.utils.CommonUtils;


/**
 * Created by zs on 2016/5/9.
 */
public class ManagerCenterFragment extends BasePagerFragment {

    @Override
    protected Fragment setFragment(int position) {
        return FragmentFactory.createForManager(position);
    }

    @Override
    protected String[] setTitles() {
        return CommonUtils.getStringArray(R.array.manager_center);
    }

    @Override
    protected void setActionBar() {
        ClickButtonActivity activity = (ClickButtonActivity) getActivity();
        activity.tvTitle.setText("管理中心");
    }
}