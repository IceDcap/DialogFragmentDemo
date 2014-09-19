package com.ddd.demo.dialogfragmentdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends FragmentActivity implements EditNameDialog.EditNameDialogListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showEditDialog();
    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        EditNameDialog dialog = new EditNameDialog();
        dialog.show(fm, "fragment_edit_name");
    }

    @Override
    public void onFinishEditDialog(String inputText) {
        Toast.makeText(this, "Hi " + inputText, Toast.LENGTH_SHORT).show();
    }

}
