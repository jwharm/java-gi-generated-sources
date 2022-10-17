package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_alternative_trigger_new = Interop.downcallHandle(
        "gtk_alternative_trigger_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull ShortcutTrigger first, @NotNull ShortcutTrigger second) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_alternative_trigger_new.invokeExact(first.refcounted().unowned().handle(), second.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * either of the two given triggers gets triggered.
     * <p>
     * Note that nesting is allowed, so if you want more than two
     * alternative, create a new alternative trigger for each option.
     */
    public AlternativeTrigger(@NotNull ShortcutTrigger first, @NotNull ShortcutTrigger second) {
        super(constructNew(first, second));
    }
    
    private static final MethodHandle gtk_alternative_trigger_get_first = Interop.downcallHandle(
        "gtk_alternative_trigger_get_first",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the first of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getSecond} will return
     * the other one.
     */
    public @NotNull ShortcutTrigger getFirst() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_alternative_trigger_get_first.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_alternative_trigger_get_second = Interop.downcallHandle(
        "gtk_alternative_trigger_get_second",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the second of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getFirst} will return
     * the other one.
     */
    public @NotNull ShortcutTrigger getSecond() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_alternative_trigger_get_second.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
}
