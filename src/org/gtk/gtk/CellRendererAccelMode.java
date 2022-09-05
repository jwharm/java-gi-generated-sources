package org.gtk.gtk;

/**
 * The available modes for [property@Gtk.CellRendererAccel:accel-mode].
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
