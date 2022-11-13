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
    
    private static final java.lang.String C_TYPE_NAME = "GtkAlternativeTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AlternativeTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AlternativeTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AlternativeTrigger if its GType is a (or inherits from) "GtkAlternativeTrigger".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AlternativeTrigger} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAlternativeTrigger", a ClassCastException will be thrown.
     */
    public static AlternativeTrigger castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAlternativeTrigger"))) {
            return new AlternativeTrigger(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAlternativeTrigger");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.ShortcutTrigger first, @NotNull org.gtk.gtk.ShortcutTrigger second) {
        java.util.Objects.requireNonNull(first, "Parameter 'first' must not be null");
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_new.invokeExact(
                    first.handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        first.yieldOwnership();
        second.yieldOwnership();
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
        super(constructNew(first, second), Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_first.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_second.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_alternative_trigger_new = Interop.downcallHandle(
            "gtk_alternative_trigger_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_first = Interop.downcallHandle(
            "gtk_alternative_trigger_get_first",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_second = Interop.downcallHandle(
            "gtk_alternative_trigger_get_second",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
