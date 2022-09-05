public class Printer {
    private int paperSheets;
    private int tonerLevel;

    public Printer(int paperSheets, int tonerLevel) {
        this.paperSheets = paperSheets;
        this.tonerLevel = tonerLevel;
    }

    public int getPaperSheets() {
        return paperSheets;
    }

    public void setPaperSheets(int paperSheets) {
        this.paperSheets = paperSheets;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }


    public void print(int copies, int pages){
        int pagesToPrint = copies*pages;
        if (this.paperSheets >= pagesToPrint && this.tonerLevel >= pagesToPrint*5 ){
            this.paperSheets -= pagesToPrint;
            this.tonerLevel -= pagesToPrint * 5;
        }
    }

}
