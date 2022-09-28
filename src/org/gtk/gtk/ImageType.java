package org.gtk.gtk;

/**
 * Describes the image data representation used by a {@link Image}.
 * <p>
 * If you want to get the image from the widget, you can only get the
 * currently-stored representation; for instance, if the gtk_image_get_storage_type()
 * returns {@link ImageType#PAINTABLE}, then you can call gtk_image_get_paintable().
 * <p>
 * For empty images, you can request any storage type (call any of the "get"
 * functions), but they will all return {@code null} values.
 */
public class ImageType {

    /**
     * there is no image displayed by the widget
     */
    public static final ImageType EMPTY = new ImageType(0);
    
    /**
     * the widget contains a named icon
     */
    public static final ImageType ICON_NAME = new ImageType(1);
    
    /**
     * the widget contains a {@code GIcon}
     */
    public static final ImageType GICON = new ImageType(2);
    
    /**
     * the widget contains a {@code GdkPaintable}
     */
    public static final ImageType PAINTABLE = new ImageType(3);
    
    private int value;
    
    public ImageType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ImageType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
