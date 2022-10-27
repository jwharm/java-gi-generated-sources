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
public class AlternativeTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public AlternativeTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AlternativeTrigger */
    public static AlternativeTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new AlternativeTrigger(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.ShortcutTrigger first, @NotNull org.gtk.gtk.ShortcutTrigger second) {
        java.util.Objects.requireNonNull(first, "Parameter 'first' must not be null");
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_alternative_trigger_new.invokeExact(first.refcounted().unowned().handle(), second.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever
     * either of the two given triggers gets triggered.
     * <p>
     * Note that nesting is allowed, so if you want more than two
     * alternative, create a new alternative trigger for each option.
     * @param first The first trigger that may trigger
     * @param second The second trigger that may trigger
     */
    public AlternativeTrigger(@NotNull org.gtk.gtk.ShortcutTrigger first, @NotNull org.gtk.gtk.ShortcutTrigger second) {
        super(constructNew(first, second));
    }
    
    /**
     * Gets the first of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getSecond} will return
     * the other one.
     * @return the first alternative trigger
     */
    public @NotNull org.gtk.gtk.ShortcutTrigger getFirst() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_first.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the second of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getFirst} will return
     * the other one.
     * @return the second alternative trigger
     */
    public @NotNull org.gtk.gtk.ShortcutTrigger getSecond() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_second.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_alternative_trigger_new = Interop.downcallHandle(
            "gtk_alternative_trigger_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_first = Interop.downcallHandle(
            "gtk_alternative_trigger_get_first",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_second = Interop.downcallHandle(
            "gtk_alternative_trigger_get_second",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
