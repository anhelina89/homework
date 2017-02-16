package oopPractice;

/**
 * Created by Angelina on 06.02.2017.
 */
public class ElectronicBook extends Book {
    private long sizeInBytes;
    private String format;

    public ElectronicBook(long sizeInBytes, String format) {
        this();
        this.sizeInBytes = sizeInBytes;
        this.format = format;
    }

    public ElectronicBook() {

    }

    public void setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFormat() {
        return format;
    }
}
