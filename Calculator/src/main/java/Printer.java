public class Printer {

    private int paperLevel;
    private int tonerLevel;

    public Printer(int paperLevel, int tonerLevel) {
        this.paperLevel = paperLevel;
        this.tonerLevel = tonerLevel;
    }

    public int getPaperLevel(){
        return paperLevel;
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages < paperLevel){
            this.paperLevel -= totalPages;
            this.tonerLevel -= totalPages;
        }
    }
}
