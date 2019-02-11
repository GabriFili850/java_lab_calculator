public class Bottle {
    private int volume;

    public Bottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        int newVolume =  this.volume - 10;
        return  newVolume;

    }















}


