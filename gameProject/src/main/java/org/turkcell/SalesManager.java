package org.turkcell;

public class SalesManager implements SalesService{
    private CampaignService campaignService;

    public SalesManager(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @Override
    public void sales(Game game, User user) {
        System.out.println("Satış Gerçekleşti : "+game.getName()+" - "+ user.getEmail());
        System.out.println("Oyun Fiyatı : "+game.getPrice()+"\nİndirimli Fiyat : "+campaignService.discount(game.getPrice()));
    }
}
