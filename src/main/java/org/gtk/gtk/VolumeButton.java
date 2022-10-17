package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkVolumeButton} is a {@code GtkScaleButton} subclass tailored for
 * volume control.
 * <p>
 * <img src="./doc-files/volumebutton.png" alt="An example GtkVolumeButton">
 */
public class VolumeButton extends ScaleButton implements Accessible, Buildable, ConstraintTarget, Orientable {

    public VolumeButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to VolumeButton */
    public static VolumeButton castFrom(org.gtk.gobject.Object gobject) {
        return new VolumeButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_volume_button_new = Interop.downcallHandle(
        "gtk_volume_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_volume_button_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
