package org.turkcell;

public abstract class BaseUserManager implements UserService {
    @Override
    public void save(User user) {
        System.out.println("Kullanıcı kayıt edildi : " + user.getEmail());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi : " + user.getEmail());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi : " + user.getEmail());
    }
}
