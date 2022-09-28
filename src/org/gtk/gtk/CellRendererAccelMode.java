package org.gtk.gtk;

/**
 * The available modes for {@code Gtk.CellRendererAccel:accel-mode}.
 */
public class CellRendererAccelMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * GTK accelerators mode
     */
    public static final CellRendererAccelMode GTK = new CellRendererAccelMode(0);
    
    /**
     * Other accelerator mode
     */
    public static final CellRendererAccelMode OTHER = new CellRendererAccelMode(1);
    
    public CellRendererAccelMode(int value) {
        super(value);
    }
    
}
