package main.java.command;

import main.java.HrFunction;


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
