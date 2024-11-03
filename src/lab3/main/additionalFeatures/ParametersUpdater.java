package lab3.main.additionalFeatures;

import lab3.main.items.*;

public class ParametersUpdater {
    public Item[] items;

    public ParametersUpdater(Item[] items) {
        this.items = items;
    }

    public void updateAfterDay() {
        for (Item item : items) {
            item.updateParameters();
        }
    }
}
