package ra.modal.impl;


import ra.modal.IUser;

public class UserImpl implements IUser {

    @Override
    public void display() {
        System.out.println("Ten nguoi dung: " + name);
    }
}
