package org.gtk.glib;

/**
 * A type which is used to hold a process identification.
 * <p>
 * On UNIX, processes are identified by a process id (an integer),
 * while Windows uses process handles (which are pointers).
 * <p>
 * GPid is used in GLib only for descendant processes spawned with
 * the g_spawn functions.
 */
public class Pid {
    private int value;
    
    public Pid(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Pid[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
