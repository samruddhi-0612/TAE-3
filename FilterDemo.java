interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image.");
    }

    public void reset_filter() {
        System.out.println("Resetting image filters.");
    }
}

class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data.");
    }

    public void reset_filter() {
        System.out.println("Resetting data filters.");
    }
}

public class FilterDemo {
    public static void main(String[] args) {

        Filterable img = new ImageProcessor();
        Filterable data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}