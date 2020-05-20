package com.example.dialogboxmodule

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_dialog_view.view.*
import org.json.JSONObject

class InfoView(var pContext: Context) {
    fun showDialogView(jsonObject: JSONObject) {
        var view = LayoutInflater.from(pContext).inflate(R.layout.activity_dialog_view, null)
        var alertDialog = AlertDialog.Builder(pContext).setView(view)
        view.track_name.text = jsonObject.getString("TRACK_NAME")
        view.track_artist.text = jsonObject.getString("TRACK_ARTIST")
        view.track_url.text=jsonObject.getString("TRACK_URL")
        alertDialog.show()
    }
}

