package org.turkcell;

public class SpringFestCampaignManager implements CampaignService {
    private int discountRate = 40;

    @Override
    public double discount(double price) {
        return price - (price * discountRate / 100);
    }
}
