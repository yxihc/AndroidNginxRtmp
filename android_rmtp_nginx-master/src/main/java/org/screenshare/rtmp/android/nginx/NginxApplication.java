package org.screenshare.rtmp.android.nginx;

import java.io.File;

import org.screenshare.rtmp.android.nginx.utils.NginxConfigureTask;
import org.screenshare.rtmp.nginx.Nginx;

import android.app.Application;

/**
 * Nginx Application.
 */
public class NginxApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		File sdcard = Nginx.create().getPrefix();
		(new NginxConfigureTask(this, sdcard)).execute(
				NginxConfigureTask.NGINX_CONF_FILENAME,
				NginxConfigureTask.NGINX_MIMETYPES_FILENAME);
		}

}
