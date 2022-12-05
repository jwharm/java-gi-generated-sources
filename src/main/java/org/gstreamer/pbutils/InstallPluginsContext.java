package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque context structure for the plugin installation. Use the provided
 * API to set details on it.
 */
public class InstallPluginsContext extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInstallPluginsContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InstallPluginsContext}
     * @return A new, uninitialized @{link InstallPluginsContext}
     */
    public static InstallPluginsContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InstallPluginsContext newInstance = new InstallPluginsContext(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InstallPluginsContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InstallPluginsContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_install_plugins_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InstallPluginsContext}.
     */
    public InstallPluginsContext() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Copies a {@link InstallPluginsContext}.
     * @return A copy of {@code ctx}
     */
    public @NotNull org.gstreamer.pbutils.InstallPluginsContext copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_install_plugins_context_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.InstallPluginsContext(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a {@link InstallPluginsContext}.
     */
    public void free() {
        try {
            DowncallHandles.gst_install_plugins_context_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is used to tell the external installer process whether it
     * should ask for confirmation or not before searching for missing plugins.
     * <p>
     * If set, this option will be passed to the installer via a
     * --interaction=[show-confirm-search|hide-confirm-search] command line option.
     * @param confirmSearch whether to ask for confirmation before searching for plugins
     */
    public void setConfirmSearch(boolean confirmSearch) {
        try {
            DowncallHandles.gst_install_plugins_context_set_confirm_search.invokeExact(
                    handle(),
                    confirmSearch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is used to pass the calling application's desktop file ID to
     * the external installer process.
     * <p>
     * A desktop file ID is the basename of the desktop file, including the
     * .desktop extension.
     * <p>
     * If set, the desktop file ID will be passed to the installer via a
     * --desktop-id= command line option.
     * @param desktopId the desktop file ID of the calling application
     */
    public void setDesktopId(@NotNull java.lang.String desktopId) {
        java.util.Objects.requireNonNull(desktopId, "Parameter 'desktopId' must not be null");
        try {
            DowncallHandles.gst_install_plugins_context_set_desktop_id.invokeExact(
                    handle(),
                    Interop.allocateNativeString(desktopId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the startup notification ID for the launched process.
     * <p>
     * This is typically used to to pass the current X11 event timestamp to the
     * external installer process.
     * <p>
     * Startup notification IDs are defined in the
     * <a href="http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt">FreeDesktop.Org Startup Notifications standard</a>.
     * <p>
     * If set, the ID will be passed to the installer via a
     * --startup-notification-id= command line option.
     * <p>
     * GTK+/GNOME applications should be able to create a startup notification ID
     * like this:
     * <pre>{@code 
     *   timestamp = gtk_get_current_event_time ();
     *   startup_id = g_strdup_printf ("_TIME%u", timestamp);
     * ...
     * }</pre>
     * @param startupId the startup notification ID
     */
    public void setStartupNotificationId(@NotNull java.lang.String startupId) {
        java.util.Objects.requireNonNull(startupId, "Parameter 'startupId' must not be null");
        try {
            DowncallHandles.gst_install_plugins_context_set_startup_notification_id.invokeExact(
                    handle(),
                    Interop.allocateNativeString(startupId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is for X11-based applications (such as most Gtk/Qt
     * applications on linux/unix) only. You can use it to tell the external
     * installer the XID of your main application window. That way the installer
     * can make its own window transient to your application window during the
     * installation.
     * <p>
     * If set, the XID will be passed to the installer via a --transient-for=XID
     * command line option.
     * <p>
     * Gtk+/Gnome application should be able to obtain the XID of the top-level
     * window like this:
     * <pre>{@code 
     * ##include <gtk/gtk.h>
     * ##ifdef GDK_WINDOWING_X11
     * ##include <gdk/gdkx.h>
     * ##endif
     * ...
     * ##ifdef GDK_WINDOWING_X11
     *   xid = GDK_WINDOW_XWINDOW (GTK_WIDGET (application_window)->window);
     * ##endif
     * ...
     * }</pre>
     * @param xid the XWindow ID (XID) of the top-level application
     */
    public void setXid(int xid) {
        try {
            DowncallHandles.gst_install_plugins_context_set_xid.invokeExact(
                    handle(),
                    xid);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_install_plugins_context_new = Interop.downcallHandle(
            "gst_install_plugins_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_copy = Interop.downcallHandle(
            "gst_install_plugins_context_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_free = Interop.downcallHandle(
            "gst_install_plugins_context_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_set_confirm_search = Interop.downcallHandle(
            "gst_install_plugins_context_set_confirm_search",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_set_desktop_id = Interop.downcallHandle(
            "gst_install_plugins_context_set_desktop_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_set_startup_notification_id = Interop.downcallHandle(
            "gst_install_plugins_context_set_startup_notification_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_context_set_xid = Interop.downcallHandle(
            "gst_install_plugins_context_set_xid",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
