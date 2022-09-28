package org.gtk.gtk;

/**
 * The available modes for {@code Gtk.CellRendererAccel:accel-mode}.
 */
public class CellRendererAccelMode {

    /**
     * GTK accelerators mode
     */
    public static final CellRendererAccelMode GTK = new CellRendererAccelMode(0);
    
    /**
     * Other accelerator mode
     */
    public static final CellRendererAccelMode OTHER = new CellRendererAccelMode(1);
    
    private int value;
    
    public CellRendererAccelMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CellRendererAccelMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
