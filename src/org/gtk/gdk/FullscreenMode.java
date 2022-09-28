package org.gtk.gdk;

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public class FullscreenMode {

    /**
     * Fullscreen on current monitor only.
     */
    public static final FullscreenMode CURRENT_MONITOR = new FullscreenMode(0);
    
    /**
     * Span across all monitors when fullscreen.
     */
    public static final FullscreenMode ALL_MONITORS = new FullscreenMode(1);
    
    private int value;
    
    public FullscreenMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FullscreenMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
