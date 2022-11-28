package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcut} describes a keyboard shortcut.
 * <p>
 * It contains a description of how to trigger the shortcut via a
 * {@link ShortcutTrigger} and a way to activate the shortcut
 * on a widget via a {@link ShortcutAction}.
 * <p>
 * The actual work is usually done via {@link ShortcutController},
 * which decides if and when to activate a shortcut. Using that controller
 * directly however is rarely necessary as various higher level
 * convenience APIs exist on {@code GtkWidget}s that make it easier to use
 * shortcuts in GTK.
 * <p>
 * {@code GtkShortcut} does provide functionality to make it easy for users
 * to work with shortcuts, either by providing informational strings
 * for display purposes or by allowing shortcuts to be configured.
 */
public class Shortcut extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcut";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Shortcut proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Shortcut(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Shortcut if its GType is a (or inherits from) "GtkShortcut".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Shortcut} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcut", a ClassCastException will be thrown.
     */
    public static Shortcut castFrom(org.gtk.gobject.Object gobject) {
            return new Shortcut(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_new.invokeExact(
                    (Addressable) (trigger == null ? MemoryAddress.NULL : trigger.handle()),
                    (Addressable) (action == null ? MemoryAddress.NULL : action.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        trigger.yieldOwnership();
        action.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by
     * {@code trigger} and then activates {@code action}.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon
     *    triggering
     */
    public Shortcut(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action) {
        super(constructNew(trigger, action), Ownership.FULL);
    }
    
    private static Addressable constructNewWithArguments(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_new_with_arguments.invokeExact(
                    (Addressable) (trigger == null ? MemoryAddress.NULL : trigger.handle()),
                    (Addressable) (action == null ? MemoryAddress.NULL : action.handle()),
                    (Addressable) (formatString == null ? MemoryAddress.NULL : Interop.allocateNativeString(formatString)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        trigger.yieldOwnership();
        action.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkShortcut} that is triggered by {@code trigger} and then activates
     * {@code action} with arguments given by {@code format_string}.
     * @param trigger The trigger that will trigger the shortcut
     * @param action The action that will be activated upon
     *   triggering
     * @param formatString GVariant format string for arguments or {@code null} for
     *   no arguments
     * @param varargs arguments, as given by format string.
     * @return a new {@code GtkShortcut}
     */
    public static Shortcut newWithArguments(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        return new Shortcut(constructNewWithArguments(trigger, action, formatString, varargs), Ownership.FULL);
    }
    
    /**
     * Gets the action that is activated by this shortcut.
     * @return the action
     */
    public @Nullable org.gtk.gtk.ShortcutAction getAction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutAction(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the arguments that are passed when activating the shortcut.
     * @return the arguments
     */
    public @Nullable org.gtk.glib.Variant getArguments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_arguments.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the trigger used to trigger {@code self}.
     * @return the trigger used
     */
    public @Nullable org.gtk.gtk.ShortcutTrigger getTrigger() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_get_trigger.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutTrigger(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the new action for {@code self} to be {@code action}.
     * @param action The new action.
     *   If the {@code action} is {@code null}, the nothing action will be used.
     */
    public void setAction(@Nullable org.gtk.gtk.ShortcutAction action) {
        try {
            DowncallHandles.gtk_shortcut_set_action.invokeExact(
                    handle(),
                    (Addressable) (action == null ? MemoryAddress.NULL : action.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        action.yieldOwnership();
    }
    
    /**
     * Sets the arguments to pass when activating the shortcut.
     * @param args arguments to pass when activating {@code self}
     */
    public void setArguments(@Nullable org.gtk.glib.Variant args) {
        try {
            DowncallHandles.gtk_shortcut_set_arguments.invokeExact(
                    handle(),
                    (Addressable) (args == null ? MemoryAddress.NULL : args.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the new trigger for {@code self} to be {@code trigger}.
     * @param trigger The new trigger.
     *   If the {@code trigger} is {@code null}, the never trigger will be used.
     */
    public void setTrigger(@Nullable org.gtk.gtk.ShortcutTrigger trigger) {
        try {
            DowncallHandles.gtk_shortcut_set_trigger.invokeExact(
                    handle(),
                    (Addressable) (trigger == null ? MemoryAddress.NULL : trigger.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        trigger.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Shortcut.Build} object constructs a {@link Shortcut} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Shortcut} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Shortcut} using {@link Shortcut#castFrom}.
         * @return A new instance of {@code Shortcut} with the properties 
         *         that were set in the Build object.
         */
        public Shortcut construct() {
            return Shortcut.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Shortcut.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The action that gets activated by this shortcut.
         * @param action The value for the {@code action} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAction(org.gtk.gtk.ShortcutAction action) {
            names.add("action");
            values.add(org.gtk.gobject.Value.create(action));
            return this;
        }
        
        /**
         * Arguments passed to activation.
         * @param arguments The value for the {@code arguments} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setArguments(org.gtk.glib.Variant arguments) {
            names.add("arguments");
            values.add(org.gtk.gobject.Value.create(arguments));
            return this;
        }
        
        /**
         * The trigger that triggers this shortcut.
         * @param trigger The value for the {@code trigger} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTrigger(org.gtk.gtk.ShortcutTrigger trigger) {
            names.add("trigger");
            values.add(org.gtk.gobject.Value.create(trigger));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_new = Interop.downcallHandle(
            "gtk_shortcut_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_new_with_arguments = Interop.downcallHandle(
            "gtk_shortcut_new_with_arguments",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_shortcut_get_action = Interop.downcallHandle(
            "gtk_shortcut_get_action",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_get_arguments = Interop.downcallHandle(
            "gtk_shortcut_get_arguments",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_get_trigger = Interop.downcallHandle(
            "gtk_shortcut_get_trigger",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_set_action = Interop.downcallHandle(
            "gtk_shortcut_set_action",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_set_arguments = Interop.downcallHandle(
            "gtk_shortcut_set_arguments",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_set_trigger = Interop.downcallHandle(
            "gtk_shortcut_set_trigger",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_get_type = Interop.downcallHandle(
            "gtk_shortcut_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
