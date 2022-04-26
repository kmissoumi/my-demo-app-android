package com.saucelabs.mydemoapp.android;

import com.saucelabs.mydemoapp.android.utils.Network;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class DeviceVitalsDemo {

	private final TimerTask fetchJavascript = new TimerTask() {

		private static final String url = "https://ajax.googleapis.com/ajax/libs/webfont/1.6.26/webfont.js";

		@Override
		public void run() {
			Network.fetch(url);
		}
	};

	private final TimerTask fetchImage = new TimerTask() {

		private static final String url = "https://www.wikipedia.org/portal/wikipedia.org/assets/img/Wikipedia-logo-v2.png";

		@Override
		public void run() {
			Network.fetch(url);
		}
	};

	private final TimerTask postAnalytics = new TimerTask() {

		private static final String url = "https://my-demo-app.net/api/analytics/collect/";

		@Override
		public void run() {
			String randomness = UUID.randomUUID().toString();
			Network.post(url, randomness, "application/text");
		}
	};

	private final TimerTask memorySawtooth = new TimerTask() {

		private int step = 0;
		private final List<Byte[]> items = new ArrayList<>();

		@Override
		public void run() {
			step++;
			if (step == 10) {
				step = 0;
				items.clear();
			}

			items.add(new Byte[2 * 1024 * 1024]);
		}
	};

	public void kickstart() {
		Timer timer = new Timer();
		timer.schedule(fetchJavascript, 2000);
		timer.schedule(fetchImage, 4000);
		timer.schedule(postAnalytics, 5000);
		timer.schedule(memorySawtooth, 0, 1000);
	}
}
