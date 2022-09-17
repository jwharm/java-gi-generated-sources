package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkShortcutLabel</code> displays a single keyboard shortcut or gesture.
 * <p>
 * The main use case for <code>GtkShortcutLabel</code> is inside a {@link org.gtk.gtk.ShortcutsWindow}.
 */
public class ShortcutLabel extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ShortcutLabel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutLabel */
    public static ShortcutLabel castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutLabel(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String accelerator) {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_label_new(Interop.allocateNativeString(accelerator).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkShortcutLabel</code> with @accelerator set.
     */
    public ShortcutLabel(java.lang.String accelerator) {
        super(constructNew(accelerator));
    }
    
    /**
     * Retrieves the current accelerator of @self.
     */
    public java.lang.String getAccelerator() {
        var RESULT = gtk_h.gtk_shortcut_label_get_accelerator(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the text that is displayed when no accelerator is set.
     */
    public java.lang.String getDisabledText() {
        var RESULT = gtk_h.gtk_shortcut_label_get_disabled_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the accelerator to be displayed by @self.
     */
    public void setAccelerator(java.lang.String accelerator) {
        gtk_h.gtk_shortcut_label_set_accelerator(handle(), Interop.allocateNativeString(accelerator).handle());
    }
    
    /**
     * Sets the text to be displayed by @self when no accelerator is set.
     */
    public void setDisabledText(java.lang.String disabledText) {
        gtk_h.gtk_shortcut_label_set_disabled_text(handle(), Interop.allocateNativeString(disabledText).handle());
    }
    
}
