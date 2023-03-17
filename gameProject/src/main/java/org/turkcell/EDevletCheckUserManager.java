package org.turkcell;

import java.util.ArrayList;
import java.util.List;

public class EDevletCheckUserManager implements CheckUserService{
    @Override
    public void checkUser() {
        System.out.println("E devlet ile kontrol edildi.");
    }
}
