package sg.edu.rp.c346.boxlist;

/**
 * Created by 15007803 on 24/7/2018.
 */

public class BoxItem {

    private String box;

    public BoxItem(String box) {
        this.box = box;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "box='" + box + '\'' +
                '}';
    }
}
