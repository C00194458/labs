public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int numTracks) {
        super(type, ID);
        setBand(band);
        setTitle(title);
        setNumTracks(numTracks);
    }

    @Override
    public double calculatePrice() {
        return 10;
    }

    // setters and getters
    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public int getNumTracks() {
        return numTracks;
    }
}