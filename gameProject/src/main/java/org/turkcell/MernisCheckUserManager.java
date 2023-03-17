package org.turkcell;

public class MernisCheckUserManager implements CheckUserService{
    @Override
    public void checkUser() {
        System.out.println("Mernis ile kontrol edildi.");
    }
}
