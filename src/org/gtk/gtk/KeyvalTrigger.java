package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers are pressed.
 */
public class KeyvalTrigger extends ShortcutTrigger {

    public KeyvalTrigger(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to KeyvalTrigger */
    public static KeyvalTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new KeyvalTrigger(gobject.getReference());
    }
    
    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * the key with the given @keyval and @modifiers is pressed.
     */
    public KeyvalTrigger(int keyval, int modifiers) {
        super(References.get(gtk_h.gtk_keyval_trigger_new(keyval, modifiers), true));
    }
    
    /**
     * Gets the keyval that must be pressed to succeed
     * triggering @self.
     */
    public int getKeyval() {
        var RESULT = gtk_h.gtk_keyval_trigger_get_keyval(handle());
        return RESULT;
    }
    
    /**
     * Gets the modifiers that must be present to succeed
     * triggering @self.
     */
    public int getModifiers() {
        var RESULT = gtk_h.gtk_keyval_trigger_get_modifiers(handle());
        return RESULT;
    }
    
}
