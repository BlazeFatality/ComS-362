package main.java.command;

import main.java.HrFunction;

//create new account if the user name not exist
public class NewAccountCmd implements iCommand {

    HrFunction hrCmd = new HrFunction();



    @Override
    public String getDesc() {
        return "Create new Account";
    }

    @Override
    public void execute() {
    hrCmd.createAccExe();
    }


}

