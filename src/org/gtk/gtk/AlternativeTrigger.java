package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutTrigger` that combines two triggers.
 * 
 * The `GtkAlternativeTrigger` triggers when either of two trigger.
 * 
 * This can be cascaded to combine more than two triggers.
 */
public class AlternativeTrigger extends ShortcutTrigger {

    public AlternativeTrigger(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AlternativeTrigger */
    public static AlternativeTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new AlternativeTrigger(gobject.getReference());
    }
    
    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * either of the two given triggers gets triggered.
     * 
     * Note that nesting is allowed, so if you want more than two
     * alternative, create a new alternative trigger for each option.
     */
    public AlternativeTrigger(ShortcutTrigger first, ShortcutTrigger second) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_alternative_trigger_new(first.getReference().unowned().HANDLE(), second.getReference().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the first of the two alternative triggers that may
     * trigger @self.
     * 
     * [method@Gtk.AlternativeTrigger.get_second] will return
     * the other one.
     */
    public ShortcutTrigger getFirst() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_alternative_trigger_get_first(HANDLE());
        return new ShortcutTrigger(References.get(RESULT, false));
    }
    
    /**
     * Gets the second of the two alternative triggers that may
     * trigger @self.
     * 
     * [method@Gtk.AlternativeTrigger.get_first] will return
     * the other one.
     */
    public ShortcutTrigger getSecond() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_alternative_trigger_get_second(HANDLE());
        return new ShortcutTrigger(References.get(RESULT, false));
    }
    
}
