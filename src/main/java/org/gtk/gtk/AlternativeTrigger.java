package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutTrigger} that combines two triggers.
 * <p>
 * The {@code GtkAlternativeTrigger} triggers when either of two trigger.
 * <p>
 * This can be cascaded to combine more than two triggers.
 */
public class AlternativeTrigger extends ShortcutTrigger {

    public AlternativeTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AlternativeTrigger */
    public static AlternativeTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new AlternativeTrigger(gobject.refcounted());
    }
    
    private static Refcounted constructNew(ShortcutTrigger first, ShortcutTrigger second) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_alternative_trigger_new(first.refcounted().unowned().handle(), second.refcounted().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * either of the two given triggers gets triggered.
     * <p>
     * Note that nesting is allowed, so if you want more than two
     * alternative, create a new alternative trigger for each option.
     */
    public AlternativeTrigger(ShortcutTrigger first, ShortcutTrigger second) {
        super(constructNew(first, second));
    }
    
    /**
     * Gets the first of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getSecond} will return
     * the other one.
     */
    public ShortcutTrigger getFirst() {
        var RESULT = gtk_h.gtk_alternative_trigger_get_first(handle());
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the second of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getFirst} will return
     * the other one.
     */
    public ShortcutTrigger getSecond() {
        var RESULT = gtk_h.gtk_alternative_trigger_get_second(handle());
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
}
