package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget showing toasts above its content.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="toast-overlay-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="toast-overlay.png" alt="toast-overlay"&gt;
 * &lt;/picture&gt;
 * <p>
 * Toasts can be shown with {@code ToastOverlay#addToast}.
 * <p>
 * See {@link Toast} for details.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * toastoverlay
 * ├── [child]
 * ├── toast
 * ┊   ├── widget
 * ┊   │   ├── [label.heading]
 *     │   ╰── [custom title]
 *     ├── [button]
 *     ╰── button.circular.flat
 * }</pre>
 * <p>
 * {@code AdwToastOverlay}'s CSS node is called {@code toastoverlay}. It contains the child,
 * as well as zero or more {@code toast} subnodes.
 * <p>
 * Each of the {@code toast} nodes contains a {@code widget} subnode, optionally a {@code button}
 * subnode, and another {@code button} subnode with {@code .circular} and {@code .flat} style
 * classes.
 * <p>
 * The {@code widget} subnode contains a {@code label} subnode with the {@code .heading} style
 * class, or a custom widget provided by the application.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwToastOverlay} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_GROUP} role.
 * @version 1.0
 */
public class ToastOverlay extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwToastOverlay";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ToastOverlay proxy instance for the provided memory address.
     * <p>
     * Because ToastOverlay is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ToastOverlay(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ToastOverlay> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ToastOverlay(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_overlay_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwToastOverlay}.
     */
    public ToastOverlay() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Displays {@code toast}.
     * <p>
     * Only one toast can be shown at a time; if a toast is already being displayed,
     * either {@code toast} or the original toast will be placed in a queue, depending on
     * the priority of {@code toast}. See {@code Toast:priority}.
     * <p>
     * If called on a toast that's already displayed, its timeout will be reset.
     * <p>
     * If called on a toast currently in the queue, the toast will be bumped
     * forward to be shown as soon as possible.
     * @param toast a toast
     */
    public void addToast(org.gnome.adw.Toast toast) {
        try {
            DowncallHandles.adw_toast_overlay_add_toast.invokeExact(
                    handle(),
                    toast.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        toast.yieldOwnership();
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_toast_overlay_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_toast_overlay_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
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
            RESULT = (long) DowncallHandles.adw_toast_overlay_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ToastOverlay.Builder} object constructs a {@link ToastOverlay} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ToastOverlay.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ToastOverlay} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ToastOverlay}.
         * @return A new instance of {@code ToastOverlay} with the properties 
         *         that were set in the Builder object.
         */
        public ToastOverlay build() {
            return (ToastOverlay) org.gtk.gobject.GObject.newWithProperties(
                ToastOverlay.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_toast_overlay_new = Interop.downcallHandle(
            "adw_toast_overlay_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_add_toast = Interop.downcallHandle(
            "adw_toast_overlay_add_toast",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_get_child = Interop.downcallHandle(
            "adw_toast_overlay_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_set_child = Interop.downcallHandle(
            "adw_toast_overlay_set_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_toast_overlay_get_type = Interop.downcallHandle(
            "adw_toast_overlay_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
