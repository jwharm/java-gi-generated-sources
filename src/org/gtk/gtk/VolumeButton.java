package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkVolumeButton</code> is a <code>GtkScaleButton</code> subclass tailored for
 * volume control.
 * 
 * !{@link [An example GtkVolumeButton]}(volumebutton.png)
 */
public class VolumeButton extends ScaleButton implements Accessible, Buildable, ConstraintTarget, Orientable {

    public VolumeButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to VolumeButton */
    public static VolumeButton castFrom(org.gtk.gobject.Object gobject) {
        return new VolumeButton(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_volume_button_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkVolumeButton</code>.
     * 
     * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * Volume values can be obtained and modified using the functions from
     * {@link org.gtk.gtk.ScaleButton}.
     */
    public VolumeButton() {
        super(constructNew());
    }
    
}
