package pl.akademiakodu.toDo;
// klasa, Task.java
public class Task {

    // co zawiera zadanie:
    private String carBrand;
    private String carModel;
    private String carPictureUrl;
    private String carPictureTitle;
    private String carPictureUrlDescription;
    private boolean isDemaged;

    public Task(String carBrand, String carModel, String carPictureUrl, String carPictureTitle, String carPictureUrlDescription) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPictureUrl = carPictureUrl;
        this.carPictureTitle = carPictureTitle;
        this.carPictureUrlDescription = carPictureUrlDescription;
    }

    public Task(String carBrand, String carModel, String carPictureUrl, String carPictureTitle, String carPictureUrlDescription, boolean isDemaged) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPictureUrl = carPictureUrl;
        this.carPictureTitle = carPictureTitle;
        this.carPictureUrlDescription = carPictureUrlDescription;
        this.isDemaged = isDemaged;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarPictureUrl() {
        return carPictureUrl;
    }

    public String getCarPictureTitle() {
        return carPictureTitle;
    }

    public String getCarPictureUrlDescription() {
        return carPictureUrlDescription;
    }

    public boolean isDemaged() {
        return isDemaged;
    }


    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarPictureUrl(String carPictureUrl) {
        this.carPictureUrl = carPictureUrl;
    }

    public void setCarPictureTitle(String carPictureTitle) {
        this.carPictureTitle = carPictureTitle;
    }

    public void setCarPictureUrlDescription(String carPictureUrlDescription) {
        this.carPictureUrlDescription = carPictureUrlDescription;
    }

    public void setDemaged(boolean demaged) {
        isDemaged = demaged;
    }

    @Override
    public String toString() {
        return getCarBrand() + " " + getCarModel() +
                (isDemaged ? " uszkodzony" : " nieuszkodzony");
        // ? : skrócona składnia ifa
        // ? - if , : oznacza else
        /*
            linijka isDemaged oznacza to samo co/
                        isDemaged == true
         */


    }
}
