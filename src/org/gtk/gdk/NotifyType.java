package org.gtk.gdk;

/**
 * Specifies the kind of crossing for enter and leave events.
 * <p>
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public class NotifyType {

    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    public static final NotifyType ANCESTOR = new NotifyType(0);
    
    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    public static final NotifyType VIRTUAL = new NotifyType(1);
    
    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    public static final NotifyType INFERIOR = new NotifyType(2);
    
    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    public static final NotifyType NONLINEAR = new NotifyType(3);
    
    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    public static final NotifyType NONLINEAR_VIRTUAL = new NotifyType(4);
    
    /**
     * an unknown type of enter/leave event occurred.
     */
    public static final NotifyType UNKNOWN = new NotifyType(5);
    
    private int value;
    
    public NotifyType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NotifyType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
