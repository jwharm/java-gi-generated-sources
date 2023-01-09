package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public enum ImageType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * there is no image displayed by the widget
     */
    EMPTY(0),
    
    /**
     * the widget contains a named icon
     */
    ICON_NAME(1),
    
    /**
     * the widget contains a {@code GIcon}
     */
    GICON(2),
    
    /**
     * the widget contains a {@code GdkPaintable}
     */
    PAINTABLE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkImageType";
    
    private final int value;
    
    /**
     * Create a new ImageType for the provided value
     * @param numeric value the enum value
     */
    ImageType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new ImageType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ImageType of(int value) {
        return switch (value) {
            case 0 -> EMPTY;
            case 1 -> ICON_NAME;
            case 2 -> GICON;
            case 3 -> PAINTABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
