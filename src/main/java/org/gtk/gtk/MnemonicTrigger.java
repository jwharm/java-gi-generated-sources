package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific mnemonic is pressed.
 * <p>
 * Mnemonics require a <em>mnemonic modifier</em> (typically &lt;kbd&gt;Alt&lt;/kbd&gt;) to be
 * pressed together with the mnemonic key.
 */
public class MnemonicTrigger extends org.gtk.gtk.ShortcutTrigger {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMnemonicTrigger";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MnemonicTrigger proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MnemonicTrigger(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MnemonicTrigger if its GType is a (or inherits from) "GtkMnemonicTrigger".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MnemonicTrigger} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMnemonicTrigger", a ClassCastException will be thrown.
     */
    public static MnemonicTrigger castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MnemonicTrigger.getType())) {
            return new MnemonicTrigger(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMnemonicTrigger");
        }
    }
    
    private static Addressable constructNew(int keyval) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mnemonic_trigger_new.invokeExact(
                    keyval);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever the key with
     * the given {@code keyval} is pressed and mnemonics have been activated.
     * <p>
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     * @param keyval The keyval to trigger for
     */
    public MnemonicTrigger(int keyval) {
        super(constructNew(keyval), Ownership.FULL);
    }
    
    /**
     * Gets the keyval that must be pressed to succeed triggering {@code self}.
     * @return the keyval
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_mnemonic_trigger_get_keyval.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_mnemonic_trigger_get_type.invokeExact();
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
         * A {@link MnemonicTrigger.Build} object constructs a {@link MnemonicTrigger} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MnemonicTrigger} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MnemonicTrigger} using {@link MnemonicTrigger#castFrom}.
         * @return A new instance of {@code MnemonicTrigger} with the properties 
         *         that were set in the Build object.
         */
        public MnemonicTrigger construct() {
            return MnemonicTrigger.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MnemonicTrigger.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The key value for the trigger.
         * @param keyval The value for the {@code keyval} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKeyval(int keyval) {
            names.add("keyval");
            values.add(org.gtk.gobject.Value.create(keyval));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_mnemonic_trigger_new = Interop.downcallHandle(
            "gtk_mnemonic_trigger_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_mnemonic_trigger_get_keyval = Interop.downcallHandle(
            "gtk_mnemonic_trigger_get_keyval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mnemonic_trigger_get_type = Interop.downcallHandle(
            "gtk_mnemonic_trigger_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
