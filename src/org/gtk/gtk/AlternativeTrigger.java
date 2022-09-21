package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutTrigger} that combines two triggers.
 * <p>
 * The {@code GtkAlternativeTrigger} triggers when either of two trigger.
 * <p>
 * This can be cascaded to combine more than two triggers.
 */
public class AlternativeTrigger extends ShortcutTrigger {

    public AlternativeTrigger(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AlternativeTrigger */
    public static AlternativeTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new AlternativeTrigger(gobject.getReference());
    }
    
    private static Reference constructNew(ShortcutTrigger first, ShortcutTrigger second) {
        Reference RESULT = References.get(gtk_h.gtk_alternative_trigger_new(first.getReference().unowned().handle(), second.getReference().unowned().handle()), true);
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
        return new ShortcutTrigger(References.get(RESULT, false));
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
        return new ShortcutTrigger(References.get(RESULT, false));
    }
    
}
