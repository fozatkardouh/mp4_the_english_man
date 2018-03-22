package at.refugeescode.mp4_the_english_man.models;

public class Cigar {

    private boolean isLit;

    public void setIsLit(boolean isLit) {
        this.isLit = isLit;
    }

    public boolean smoke() throws Exception {
        if (!isLit) {
            throw new Exception();
        }
        return true;
    }

}
