package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific keyval and modifiers are pressed.
 */
public class KeyvalTrigger extends ShortcutTrigger {

    public KeyvalTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to KeyvalTrigger */
    public static KeyvalTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new KeyvalTrigger(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int keyval, org.gtk.gdk.ModifierType modifiers) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_keyval_trigger_new(keyval, modifiers.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * the key with the given {@code keyval} and {@code modifiers} is pressed.
     */
    public KeyvalTrigger(int keyval, org.gtk.gdk.ModifierType modifiers) {
        super(constructNew(keyval, modifiers));
    }
    
    /**
     * Gets the keyval that must be pressed to succeed
     * triggering {@code self}.
     */
    public int getKeyval() {
        var RESULT = gtk_h.gtk_keyval_trigger_get_keyval(handle());
        return RESULT;
    }
    
    /**
     * Gets the modifiers that must be present to succeed
     * triggering {@code self}.
     */
    public org.gtk.gdk.ModifierType getModifiers() {
        var RESULT = gtk_h.gtk_keyval_trigger_get_modifiers(handle());
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
}
