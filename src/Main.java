public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower(FlowerType.Chamomile, FlowerColor.Black, 10, true, 10);
        Flower flower2 = new Flower(FlowerType.Peony, FlowerColor.Green, 12, false, 8);
        Flower flower3 = new Flower(FlowerType.Rose, FlowerColor.White, 14, true, 16);
        Flower flower4 = new Flower(FlowerType.Chamomile, FlowerColor.Red, 14, false, 16);
        FlowerSpec flower1_ = new FlowerSpec(FlowerType.Chamomile, 10, true, 10);
        FlowerSpec flower2_ = new FlowerSpec(FlowerType.Rose, 10, true, 10);
        FlowerSpec flower3_ = new FlowerSpec(FlowerType.Peony, 12, false, 8);
        FlowerBucket newBucket = new FlowerBucket();
        newBucket.addFlower(flower1);
        newBucket.addFlower(flower2);
        newBucket.addFlower(flower3);
        newBucket.addFlower(flower4);
        System.out.println(newBucket.getFlower(flower1_));
        System.out.println(newBucket.getFlower(flower2_));
        System.out.println(newBucket.getFlower(flower3_));
        System.out.println(newBucket.searchFlower(flower1));
    }
}


