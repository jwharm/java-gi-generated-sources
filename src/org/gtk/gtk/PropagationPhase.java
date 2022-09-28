package org.gtk.gtk;

/**
 * Describes the stage at which events are fed into a {@link EventController}.
 */
public class PropagationPhase {

    /**
     * Events are not delivered.
     */
    public static final PropagationPhase NONE = new PropagationPhase(0);
    
    /**
     * Events are delivered in the capture phase. The
     *   capture phase happens before the bubble phase, runs from the toplevel down
     *   to the event widget. This option should only be used on containers that
     *   might possibly handle events before their children do.
     */
    public static final PropagationPhase CAPTURE = new PropagationPhase(1);
    
    /**
     * Events are delivered in the bubble phase. The bubble
     *   phase happens after the capture phase, and before the default handlers
     *   are run. This phase runs from the event widget, up to the toplevel.
     */
    public static final PropagationPhase BUBBLE = new PropagationPhase(2);
    
    /**
     * Events are delivered in the default widget event handlers,
     *   note that widget implementations must chain up on button, motion, touch and
     *   grab broken handlers for controllers in this phase to be run.
     */
    public static final PropagationPhase TARGET = new PropagationPhase(3);
    
    private int value;
    
    public PropagationPhase(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PropagationPhase[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
