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

    public int emptyVolume() {
        int noVolume = this.volume - this.volume;
        return noVolume;
    }

    public int fillBottle() {
        int noVolume = this.volume - this.volume;
        int fullVolume = noVolume + this.volume;
        return fullVolume;
    }
















}


