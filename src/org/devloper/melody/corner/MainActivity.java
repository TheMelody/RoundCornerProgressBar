package org.devloper.melody.corner;

import com.example.pathdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private RoundCornerProgressBar mRoundCornerProgress;
	private ProgressBar mSysProgress;
	private Handler mDelayHandler=new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRoundCornerProgress=(RoundCornerProgressBar) findViewById(R.id.pb_view);
		mSysProgress=(ProgressBar) findViewById(R.id.pb_load);
		findViewById(R.id.btn_load_progress).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mDelayHandler.postDelayed(new Runnable() {
					@Override
					public void run() {
						if(mRoundCornerProgress.getProgress()<mRoundCornerProgress.getMax()){
							mRoundCornerProgress.setProgress(mRoundCornerProgress.getProgress()+1);
							mSysProgress.setProgress(mSysProgress.getProgress()+1);
							mDelayHandler.postDelayed(this,200);
						}
					}
				}, 200);
			}
		});
	}
	@Override
	protected void onStop() {
		super.onStop();
		mDelayHandler.removeCallbacksAndMessages(null);
	}
}
