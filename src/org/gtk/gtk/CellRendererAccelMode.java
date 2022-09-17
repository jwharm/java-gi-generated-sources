package org.gtk.gtk;

/**
 * The available modes for {@link [property@Gtk.CellRendererAccel:accel-mode] (ref=property)}.
 */
public enum CellRendererAccelMode {

    /**
     * GTK accelerators mode
     */
    GTK,
    
    /**
     * Other accelerator mode
     */
    OTHER;
    
    public static CellRendererAccelMode fromValue(int value) {
        return switch(value) {
            case 0 -> GTK;
            case 1 -> OTHER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case GTK -> 0;
            case OTHER -> 1;
        };
    }

}
