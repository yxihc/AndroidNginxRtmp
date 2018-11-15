package org.screenshare.rtmp.android.nginx.fragment;

import java.util.ArrayList;

import org.screenshare.rtmp.android.nginx.R;
import org.screenshare.rtmp.android.support.fragment.AbstractSettingsFragment;
import org.screenshare.rtmp.android.support.fragment.OpenSourceLicenseFragment.OpenSourceSoftware;

/**
 * Settings Fragment.
 */
public class SettingsFragment extends AbstractSettingsFragment {

    @Override
    protected ArrayList<OpenSourceSoftware> getOpenSourceSoftware() {

        ArrayList<OpenSourceSoftware> softwares = new ArrayList<OpenSourceSoftware>();

        softwares.add(new OpenSourceSoftware("Nginx", R.raw.nginx));
        softwares.add(new OpenSourceSoftware(
                "Android Support Library", R.raw.andorid_support_v4));
        softwares.add(new OpenSourceSoftware("android-support-v4-preferencefragment",
                R.raw.android_support_v4_preferencefragment));

        return softwares;
    }

}
