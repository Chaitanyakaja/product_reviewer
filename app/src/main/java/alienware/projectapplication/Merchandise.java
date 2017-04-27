package alienware.projectapplication;


public class Merchandise {

    private String name;

    private String ProductDescription;

    private String ProductPhotoLocation;

    public Merchandise() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductPhotoLocation() {
        return ProductPhotoLocation;
    }

    public void setProductPhotoLocation(String ProductPhotoLocation) {
        this.ProductPhotoLocation = ProductPhotoLocation;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }
}
