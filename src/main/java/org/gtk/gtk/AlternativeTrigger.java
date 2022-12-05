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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AlternativeTrigger.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_alternative_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.ShortcutTrigger.Build {
        
         /**
         * A {@link AlternativeTrigger.Build} object constructs a {@link AlternativeTrigger} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AlternativeTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AlternativeTrigger} using {@link AlternativeTrigger#castFrom}.
         * @return A new instance of {@code AlternativeTrigger} with the properties 
         *         that were set in the Build object.
         */
        public AlternativeTrigger construct() {
            return AlternativeTrigger.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AlternativeTrigger.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The first {@code GtkShortcutTrigger} to check.
         * @param first The value for the {@code first} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFirst(org.gtk.gtk.ShortcutTrigger first) {
            names.add("first");
            values.add(org.gtk.gobject.Value.create(first));
            return this;
        }
        
        /**
         * The second {@code GtkShortcutTrigger} to check.
         * @param second The value for the {@code second} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSecond(org.gtk.gtk.ShortcutTrigger second) {
            names.add("second");
            values.add(org.gtk.gobject.Value.create(second));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_alternative_trigger_new = Interop.downcallHandle(
            "gtk_alternative_trigger_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_first = Interop.downcallHandle(
            "gtk_alternative_trigger_get_first",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_second = Interop.downcallHandle(
            "gtk_alternative_trigger_get_second",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_alternative_trigger_get_type = Interop.downcallHandle(
            "gtk_alternative_trigger_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
