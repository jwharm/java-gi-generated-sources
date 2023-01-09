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
     */
    protected AlternativeTrigger(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AlternativeTrigger> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AlternativeTrigger(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.ShortcutTrigger first, org.gtk.gtk.ShortcutTrigger second) {
        MemoryAddress RESULT;
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
    public AlternativeTrigger(org.gtk.gtk.ShortcutTrigger first, org.gtk.gtk.ShortcutTrigger second) {
        super(constructNew(first, second));
        this.takeOwnership();
    }
    
    /**
     * Gets the first of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getSecond} will return
     * the other one.
     * @return the first alternative trigger
     */
    public org.gtk.gtk.ShortcutTrigger getFirst() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_first.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ShortcutTrigger) Interop.register(RESULT, org.gtk.gtk.ShortcutTrigger.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the second of the two alternative triggers that may
     * trigger {@code self}.
     * <p>
     * {@link AlternativeTrigger#getFirst} will return
     * the other one.
     * @return the second alternative trigger
     */
    public org.gtk.gtk.ShortcutTrigger getSecond() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_alternative_trigger_get_second.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ShortcutTrigger) Interop.register(RESULT, org.gtk.gtk.ShortcutTrigger.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_alternative_trigger_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AlternativeTrigger.Builder} object constructs a {@link AlternativeTrigger} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AlternativeTrigger.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ShortcutTrigger.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AlternativeTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AlternativeTrigger}.
         * @return A new instance of {@code AlternativeTrigger} with the properties 
         *         that were set in the Builder object.
         */
        public AlternativeTrigger build() {
            return (AlternativeTrigger) org.gtk.gobject.GObject.newWithProperties(
                AlternativeTrigger.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The first {@code GtkShortcutTrigger} to check.
         * @param first The value for the {@code first} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFirst(org.gtk.gtk.ShortcutTrigger first) {
            names.add("first");
            values.add(org.gtk.gobject.Value.create(first));
            return this;
        }
        
        /**
         * The second {@code GtkShortcutTrigger} to check.
         * @param second The value for the {@code second} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSecond(org.gtk.gtk.ShortcutTrigger second) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_alternative_trigger_get_type != null;
    }
}
