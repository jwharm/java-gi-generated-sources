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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.MountOperation.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.MountOperation parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.MountOperation(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MountOperation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MountOperation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MountOperation if its GType is a (or inherits from) "GtkMountOperation".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MountOperation} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMountOperation", a ClassCastException will be thrown.
     */
    public static MountOperation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), MountOperation.getType())) {
            return new MountOperation(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMountOperation");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Window parent) {
        Addressable RESULT;
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
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_mount_operation_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.Window(RESULT, Ownership.NONE);
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
        return RESULT != 0;
    }
    
    /**
     * Sets the display to show windows of the {@code GtkMountOperation} on.
     * @param display a {@code GdkDisplay}
     */
    public void setDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_mount_operation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.MountOperation.Build {
        
         /**
         * A {@link MountOperation.Build} object constructs a {@link MountOperation} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MountOperation} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MountOperation} using {@link MountOperation#castFrom}.
         * @return A new instance of {@code MountOperation} with the properties 
         *         that were set in the Build object.
         */
        public MountOperation construct() {
            return MountOperation.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MountOperation.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The display where dialogs will be shown.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * Whether a dialog is currently shown.
         * @param isShowing The value for the {@code is-showing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsShowing(boolean isShowing) {
            names.add("is-showing");
            values.add(org.gtk.gobject.Value.create(isShowing));
            return this;
        }
        
        /**
         * The parent window.
         * @param parent The value for the {@code parent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gtk.gtk.Window parent) {
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
