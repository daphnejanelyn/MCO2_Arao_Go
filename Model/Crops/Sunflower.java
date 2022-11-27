package Model.Crops;

public class Sunflower extends Crop implements Flower {
    public Sunflower(String cropName, String cropType) {
        super("Sunflower", "Flower", 3, 20, 19, 7.5, 1, 1, 2, 3, 1, 2);
    }

    @Override
    public int generateProduce() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double computeSellPrice(double basePrice, int productsProduced) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double addFlowerBonus() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void updateWaterCount() {
        // TODO Auto-generated method stub

        if (this.waterCount < this.waterLimit) {

            this.waterCount += 1;

        } else {
            System.out.println("Water limit reached. Bonus will not be applied");
        }
    }

    @Override
    public void updateFertilizerCount() {
        // TODO Auto-generated method stub

        if (this.fertilizerCount < this.fertilizerLimit) {
            this.fertilizerLimit += 1;
        } else {
            System.out.println("Fertilizer Limit reached. Bonus will not be appleid.");
        }
    }

    @Override
    public void updateFertilizerLimit(int increase) {
        // TODO Auto-generated method stub

        this.fertilizerLimit += increase;

    }

    @Override
    public void updateWaterLimit(int increase) {
        // TODO Auto-generated method stub

        this.waterLimit += increase;

    }
}
