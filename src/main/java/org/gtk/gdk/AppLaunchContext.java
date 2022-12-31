package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkAppLaunchContext} handles launching an application in a graphical context.
 * <p>
 * It is an implementation of {@code GAppLaunchContext} that provides startup
 * notification and allows to launch applications on a specific workspace.
 * <p>
 * <strong>Launching an application</strong><br/>
 * <pre>{@code c
 * GdkAppLaunchContext *context;
 * 
 * context = gdk_display_get_app_launch_context (display);
 * 
 * gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
 * 
 * if (!g_app_info_launch_default_for_uri ("http://www.gtk.org", context, &error))
 *   g_warning ("Launching failed: %s\\n", error->message);
 * 
 * g_object_unref (context);
 * }</pre>
 */
public class AppLaunchContext extends org.gtk.gio.AppLaunchContext {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkAppLaunchContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AppLaunchContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppLaunchContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppLaunchContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppLaunchContext(input, ownership);
    
    /**
     * Gets the {@code GdkDisplay} that {@code context} is for.
     * @return the display of {@code context}
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_app_launch_context_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the workspace on which applications will be launched.
     * <p>
     * This only works when running under a window manager that
     * supports multiple workspaces, as described in the
     * <a href="http://www.freedesktop.org/Standards/wm-spec">Extended Window Manager Hints</a>.
     * Specifically this sets the {@code _NET_WM_DESKTOP} property described
     * in that spec.
     * <p>
     * This only works when using the X11 backend.
     * <p>
     * When the workspace is not specified or {@code desktop} is set to -1,
     * it is up to the window manager to pick one, typically it will
     * be the current workspace.
     * @param desktop the number of a workspace, or -1
     */
    public void setDesktop(int desktop) {
        try {
            DowncallHandles.gdk_app_launch_context_set_desktop.invokeExact(
                    handle(),
                    desktop);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon for applications that are launched with this
     * context.
     * <p>
     * Window Managers can use this information when displaying startup
     * notification.
     * <p>
     * See also {@link AppLaunchContext#setIconName}.
     * @param icon a {@code GIcon}
     */
    public void setIcon(@Nullable org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.gdk_app_launch_context_set_icon.invokeExact(
                    handle(),
                    (Addressable) (icon == null ? MemoryAddress.NULL : icon.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon for applications that are launched with this context.
     * <p>
     * The {@code icon_name} will be interpreted in the same way as the Icon field
     * in desktop files. See also {@link AppLaunchContext#setIcon}.
     * <p>
     * If both {@code icon} and {@code icon_name} are set, the {@code icon_name} takes priority.
     * If neither {@code icon} or {@code icon_name} is set, the icon is taken from either
     * the file that is passed to launched application or from the {@code GAppInfo}
     * for the launched application itself.
     * @param iconName an icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.gdk_app_launch_context_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the timestamp of {@code context}.
     * <p>
     * The timestamp should ideally be taken from the event that
     * triggered the launch.
     * <p>
     * Window managers can use this information to avoid moving the
     * focus to the newly launched application when the user is busy
     * typing in another window. This is also known as 'focus stealing
     * prevention'.
     * @param timestamp a timestamp
     */
    public void setTimestamp(int timestamp) {
        try {
            DowncallHandles.gdk_app_launch_context_set_timestamp.invokeExact(
                    handle(),
                    timestamp);
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
            RESULT = (long) DowncallHandles.gdk_app_launch_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AppLaunchContext.Builder} object constructs a {@link AppLaunchContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppLaunchContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.AppLaunchContext.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppLaunchContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppLaunchContext}.
         * @return A new instance of {@code AppLaunchContext} with the properties 
         *         that were set in the Builder object.
         */
        public AppLaunchContext build() {
            return (AppLaunchContext) org.gtk.gobject.GObject.newWithProperties(
                AppLaunchContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The display that the {@code GdkAppLaunchContext} is on.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_app_launch_context_get_display = Interop.downcallHandle(
            "gdk_app_launch_context_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_app_launch_context_set_desktop = Interop.downcallHandle(
            "gdk_app_launch_context_set_desktop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_app_launch_context_set_icon = Interop.downcallHandle(
            "gdk_app_launch_context_set_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_app_launch_context_set_icon_name = Interop.downcallHandle(
            "gdk_app_launch_context_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_app_launch_context_set_timestamp = Interop.downcallHandle(
            "gdk_app_launch_context_set_timestamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_app_launch_context_get_type = Interop.downcallHandle(
            "gdk_app_launch_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
