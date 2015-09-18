package cz.ampertech.remotedevicemanager.view.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import cz.ampertech.remotedevicemanager.R;

/**
 * Created by Jan on 17.09.2015.
 */
public class AddRemoteButtonDialog extends DialogFragment implements View.OnClickListener{

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_dialog_add_button, container, false);
//        Button submitButton = (Button) view.findViewById(R.id.dialog_add_button_submit);
//        submitButton.setOnClickListener(this);
//        return view;
//    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.fragment_dialog_add_button, null, false);

        Button submitButton = (Button) dialogView.findViewById(R.id.dialog_add_button_submit);
        submitButton.setOnClickListener(this);

        AlertDialog.Builder dialogBuidler = new AlertDialog.Builder(getActivity());
        dialogBuidler.setView(dialogView);

        Dialog dialog = dialogBuidler.create();
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        return dialog;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Submit clicked!", Toast.LENGTH_SHORT).show();
        dismiss();
    }
}
