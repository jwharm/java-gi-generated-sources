package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An event related to a key-based device.
 */
public class KeyEvent extends Event {

    public KeyEvent(io.github.jwharm.javagi.interop.Reference reference) {
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_get_consumed_modifiers(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the keycode from a key event.
     */
    public int getKeycode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_get_keycode(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the keyval from a key event.
     */
    public int getKeyval() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_get_keyval(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the layout from a key event.
     */
    public int getLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_get_layout(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts the shift level from a key event.
     */
    public int getLevel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_get_level(HANDLE());
        return RESULT;
    }
    
    /**
     * Extracts whether the key event is for a modifier key.
     */
    public boolean isModifier() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_is_modifier(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Matches a key event against a keyval and modifiers.
     * 
     * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     * 
     * Partial matches are possible where the combination matches
     * if the currently active group is ignored.
     * 
     * Note that we ignore Caps Lock for matching.
     */
    public KeyMatch matches(int keyval, int modifiers) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_key_event_matches(HANDLE(), keyval, modifiers);
        return KeyMatch.fromValue(RESULT);
    }
    
}
