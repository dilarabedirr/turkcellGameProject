package org.turkcell;

public class GamerUserManager extends BaseUserManager{

    private CheckUserService checkUserService;

    public GamerUserManager(CheckUserService checkUserService) {
        this.checkUserService = checkUserService;
    }

    @Override
    public void save(User user) {
        super.save(user);
        checkUserService.checkUser();
    }
}
