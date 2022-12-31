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
public class Shortcut extends org.gtk.gobject.GObject {
    
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
    protected Shortcut(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Shortcut> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Shortcut(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action) {
        MemoryAddress RESULT;
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
    
    private static MemoryAddress constructNewWithArguments(@Nullable org.gtk.gtk.ShortcutTrigger trigger, @Nullable org.gtk.gtk.ShortcutAction action, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_new_with_arguments.invokeExact(
                    (Addressable) (trigger == null ? MemoryAddress.NULL : trigger.handle()),
                    (Addressable) (action == null ? MemoryAddress.NULL : action.handle()),
                    (Addressable) (formatString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(formatString, null)),
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
        var RESULT = constructNewWithArguments(trigger, action, formatString, varargs);
        return (org.gtk.gtk.Shortcut) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Shortcut.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return (org.gtk.gtk.ShortcutAction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ShortcutAction.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
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
        return (org.gtk.gtk.ShortcutTrigger) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ShortcutTrigger.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Shortcut.Builder} object constructs a {@link Shortcut} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Shortcut.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Shortcut} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Shortcut}.
         * @return A new instance of {@code Shortcut} with the properties 
         *         that were set in the Builder object.
         */
        public Shortcut build() {
            return (Shortcut) org.gtk.gobject.GObject.newWithProperties(
                Shortcut.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The action that gets activated by this shortcut.
         * @param action The value for the {@code action} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAction(org.gtk.gtk.ShortcutAction action) {
            names.add("action");
            values.add(org.gtk.gobject.Value.create(action));
            return this;
        }
        
        /**
         * Arguments passed to activation.
         * @param arguments The value for the {@code arguments} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setArguments(org.gtk.glib.Variant arguments) {
            names.add("arguments");
            values.add(org.gtk.gobject.Value.create(arguments));
            return this;
        }
        
        /**
         * The trigger that triggers this shortcut.
         * @param trigger The value for the {@code trigger} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTrigger(org.gtk.gtk.ShortcutTrigger trigger) {
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
