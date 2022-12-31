package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMountOperation} is an implementation of {@code GMountOperation}.
 * <p>
 * The functions and objects described here make working with GTK and
 * GIO more convenient.
 * <p>
 * {@code GtkMountOperation} is needed when mounting volumes:
 * It is an implementation of {@code GMountOperation} that can be used with
 * GIO functions for mounting volumes such as
 * g_file_mount_enclosing_volume(), g_file_mount_mountable(),
 * g_volume_mount(), g_mount_unmount_with_operation() and others.
 * <p>
 * When necessary, {@code GtkMountOperation} shows dialogs to let the user
 * enter passwords, ask questions or show processes blocking unmount.
 */
public class MountOperation extends org.gtk.gio.MountOperation {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMountOperation";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.MountOperation.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MountOperation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MountOperation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountOperation> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MountOperation(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Window parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_new.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkMountOperation}.
     * @param parent transient parent of the window
     */
    public MountOperation(@Nullable org.gtk.gtk.Window parent) {
        super(constructNew(parent), Ownership.FULL);
    }
    
    /**
     * Gets the display on which windows of the {@code GtkMountOperation}
     * will be shown.
     * @return the display on which windows of {@code op} are shown
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the transient parent used by the {@code GtkMountOperation}.
     * @return the transient parent for windows shown by {@code op}
     */
    public @Nullable org.gtk.gtk.Window getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Window) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Window.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the {@code GtkMountOperation} is currently displaying
     * a window.
     * @return {@code true} if {@code op} is currently displaying a window
     */
    public boolean isShowing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_mount_operation_is_showing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the display to show windows of the {@code GtkMountOperation} on.
     * @param display a {@code GdkDisplay}
     */
    public void setDisplay(org.gtk.gdk.Display display) {
        try {
            DowncallHandles.gtk_mount_operation_set_display.invokeExact(
                    handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transient parent for windows shown by the
     * {@code GtkMountOperation}.
     * @param parent transient parent of the window
     */
    public void setParent(@Nullable org.gtk.gtk.Window parent) {
        try {
            DowncallHandles.gtk_mount_operation_set_parent.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_mount_operation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MountOperation.Builder} object constructs a {@link MountOperation} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MountOperation.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.MountOperation.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MountOperation} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MountOperation}.
         * @return A new instance of {@code MountOperation} with the properties 
         *         that were set in the Builder object.
         */
        public MountOperation build() {
            return (MountOperation) org.gtk.gobject.GObject.newWithProperties(
                MountOperation.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The display where dialogs will be shown.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * Whether a dialog is currently shown.
         * @param isShowing The value for the {@code is-showing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsShowing(boolean isShowing) {
            names.add("is-showing");
            values.add(org.gtk.gobject.Value.create(isShowing));
            return this;
        }
        
        /**
         * The parent window.
         * @param parent The value for the {@code parent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gtk.Window parent) {
            names.add("parent");
            values.add(org.gtk.gobject.Value.create(parent));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_mount_operation_new = Interop.downcallHandle(
            "gtk_mount_operation_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_get_display = Interop.downcallHandle(
            "gtk_mount_operation_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_get_parent = Interop.downcallHandle(
            "gtk_mount_operation_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_is_showing = Interop.downcallHandle(
            "gtk_mount_operation_is_showing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_set_display = Interop.downcallHandle(
            "gtk_mount_operation_set_display",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_set_parent = Interop.downcallHandle(
            "gtk_mount_operation_set_parent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_mount_operation_get_type = Interop.downcallHandle(
            "gtk_mount_operation_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
