/*

Project: Browsing Online Store - Software
Description: subclass Software inherits from item

 */

// class Software inherits from Item and initializes its own variable version
class Software extends Item {
    private String version;

    // constructor
    public Software(String title, double price, String version) {
        super(title, price);
        this.version = version;
    }

    // setter and getter for version
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // getType returns software
    @Override
    public String getType() {
        return "software";
    }

}

