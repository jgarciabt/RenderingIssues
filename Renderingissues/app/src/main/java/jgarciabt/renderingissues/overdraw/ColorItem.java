package jgarciabt.renderingissues.overdraw;

/**
 * Created by Jose Garcia on 28/01/2016.
 */
public class ColorItem {

    String name;
    String hexCode;
    int resourceId;

    public ColorItem(String name, String hexCode, int resourceId) {

        this.name = name;
        this.hexCode = hexCode;
        this.resourceId = resourceId;
    }

    public String getName() {

        return name;
    }

    public String getHexCode() {

        return hexCode;
    }

    public int getResourceId() {

        return resourceId;
    }
}
