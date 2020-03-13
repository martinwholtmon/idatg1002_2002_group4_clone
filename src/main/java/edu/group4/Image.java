package edu.group4;

public class Image {
    private String filename;
    private double date;
    private double filesize;
    private int dimensions;
    private String location;



    public Image (String filename, double date, double filesize, int dimensions, String location)
    {
        this.filename= filename;
        this.date=date;
        this.filesize=filesize;
        this.dimensions= dimensions;
        this.location=location;
    }


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public String getLocation()
    {
        return location;
    }




}
