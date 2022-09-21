package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a key-based device.
 */
public class KeyEvent extends Event {

    public KeyEvent(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to KeyEvent */
    public static KeyEvent castFrom(org.gtk.gobject.Object gobject) {
        return new KeyEvent(gobject.getReference());
    }
    
    /**
     * Extracts the consumed modifiers from a key event.
     */
    public int getConsumedModifiers() {
        var RESULT = gtk_h.gdk_key_event_get_consumed_modifiers(handle());
        return RESULT;
    }
    
    /**
     * Extracts the keycode from a key event.
     */
    public int getKeycode() {
        var RESULT = gtk_h.gdk_key_event_get_keycode(handle());
        return RESULT;
    }
    
    /**
     * Extracts the keyval from a key event.
     */
    public int getKeyval() {
        var RESULT = gtk_h.gdk_key_event_get_keyval(handle());
        return RESULT;
    }
    
    /**
     * Extracts the layout from a key event.
     */
    public int getLayout() {
        var RESULT = gtk_h.gdk_key_event_get_layout(handle());
        return RESULT;
    }
    
    /**
     * Extracts the shift level from a key event.
     */
    public int getLevel() {
        var RESULT = gtk_h.gdk_key_event_get_level(handle());
        return RESULT;
    }
    
    /**
     * Extracts whether the key event is for a modifier key.
     */
    public boolean isModifier() {
        var RESULT = gtk_h.gdk_key_event_is_modifier(handle());
        return (RESULT != 0);
    }
    
    /**
     * Matches a key event against a keyval and modifiers.
     * <p>
     * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     * <p>
     * Partial matches are possible where the combination matches
     * if the currently active group is ignored.
     * <p>
     * Note that we ignore Caps Lock for matching.
     */
    public KeyMatch matches(int keyval, int modifiers) {
        var RESULT = gtk_h.gdk_key_event_matches(handle(), keyval, modifiers);
        return KeyMatch.fromValue(RESULT);
    }
    
}
