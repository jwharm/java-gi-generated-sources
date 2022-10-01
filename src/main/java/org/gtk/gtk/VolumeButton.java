package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkVolumeButton} is a {@code GtkScaleButton} subclass tailored for
 * volume control.
 * <p>
 * <img src="./doc-files/volumebutton.png" alt="An example GtkVolumeButton">
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
     * Creates a {@code GtkVolumeButton}.
     * <p>
     * The button has a range between 0.0 and 1.0, with a stepping of 0.02.
     * Volume values can be obtained and modified using the functions from
     * {@link ScaleButton}.
     */
    public VolumeButton() {
        super(constructNew());
    }
    
}
