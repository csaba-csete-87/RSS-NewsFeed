package com.csabacsete.rssnewsfeed;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

abstract class RssTask extends AsyncTask<String, Void, RssResponse> {

    private ProgressDialog mProgress;

    public RssTask(Context c) {
        mProgress = new ProgressDialog(c);
        mProgress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgress.setIndeterminate(true);
        mProgress.setCancelable(false);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgress.show();
    }

    @Override
    protected void onPostExecute(RssResponse rssResponse) {
        mProgress.dismiss();
        super.onPostExecute(rssResponse);
    }
}
