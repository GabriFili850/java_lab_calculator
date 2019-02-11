public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public boolean print(int pages, int copies){
        if (pages * copies > this.sheets){
            return false;
        }
        else{
            return true;
        }
    }

}
