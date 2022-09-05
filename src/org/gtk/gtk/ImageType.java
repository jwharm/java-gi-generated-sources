package org.gtk.gtk;

/**
 * Describes the image data representation used by a [class@Gtk.Image].
 * 
 * If you want to get the image from the widget, you can only get the
 * currently-stored representation; for instance, if the gtk_image_get_storage_type()
 * returns %GTK_IMAGE_PAINTABLE, then you can call gtk_image_get_paintable().
 * 
 * For empty images, you can request any storage type (call any of the "get"
 * functions), but they will all return %NULL values.
 */
public enum ImageType {

    /**
     * there is no image displayed by the widget
     */
    EMPTY,
    
    /**
     * the widget contains a named icon
     */
    ICON_NAME,
    
    /**
     * the widget contains a `GIcon`
     */
    GICON,
    
    /**
     * the widget contains a `GdkPaintable`
     */
    PAINTABLE;
    
    public static ImageType fromValue(int value) {
        return switch(value) {
            case 0 -> EMPTY;
            case 1 -> ICON_NAME;
            case 2 -> GICON;
            case 3 -> PAINTABLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case EMPTY -> 0;
            case ICON_NAME -> 1;
            case GICON -> 2;
            case PAINTABLE -> 3;
        };
    }

}
