package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Notification} is a mechanism for creating a notification to be shown
 * to the user -- typically as a pop-up notification presented by the
 * desktop environment shell.
 * <p>
 * The key difference between {@link Notification} and other similar APIs is
 * that, if supported by the desktop environment, notifications sent
 * with {@link Notification} will persist after the application has exited,
 * and even across system reboots.
 * <p>
 * Since the user may click on a notification while the application is
 * not running, applications using {@link Notification} should be able to be
 * started as a D-Bus service, using {@link Application}.
 * <p>
 * In order for {@link Notification} to work, the application must have installed
 * a {@code .desktop} file. For example:
 * <pre>{@code 
 *  [Desktop Entry]
 *   Name=Test Application
 *   Comment=Description of what Test Application does
 *   Exec=gnome-test-application
 *   Icon=org.gnome.TestApplication
 *   Terminal=false
 *   Type=Application
 *   Categories=GNOME;GTK;TestApplication Category;
 *   StartupNotify=true
 *   DBusActivatable=true
 *   X-GNOME-UsesNotifications=true
 * }</pre>
 * <p>
 * The {@code X-GNOME-UsesNotifications} key indicates to GNOME Control Center
 * that this application uses notifications, so it can be listed in the
 * Control Center’s ‘Notifications’ panel.
 * <p>
 * The {@code .desktop} file must be named as {@code org.gnome.TestApplication.desktop},
 * where {@code org.gnome.TestApplication} is the ID passed to g_application_new().
 * <p>
 * User interaction with a notification (either the default action, or
 * buttons) must be associated with actions on the application (ie:
 * "app." actions).  It is not possible to route user interaction
 * through the notification itself, because the object will not exist if
 * the application is autostarted as a result of a notification being
 * clicked.
 * <p>
 * A notification can be sent with g_application_send_notification().
 * @version 2.40
 */
public class Notification extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNotification";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Notification proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Notification(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Notification> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Notification(input);
    
    private static MemoryAddress constructNew(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_notification_new.invokeExact(Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link Notification} with {@code title} as its title.
     * <p>
     * After populating {@code notification} with more details, it can be sent to
     * the desktop shell with g_application_send_notification(). Changing
     * any properties after this call will not have any effect until
     * resending {@code notification}.
     * @param title the title of the notification
     */
    public Notification(java.lang.String title) {
        super(constructNew(title));
        this.takeOwnership();
    }
    
    /**
     * Adds a button to {@code notification} that activates the action in
     * {@code detailed_action} when clicked. That action must be an
     * application-wide action (starting with "app."). If {@code detailed_action}
     * contains a target, the action will be activated with that target as
     * its parameter.
     * <p>
     * See g_action_parse_detailed_name() for a description of the format
     * for {@code detailed_action}.
     * @param label label of the button
     * @param detailedAction a detailed action name
     */
    public void addButton(java.lang.String label, java.lang.String detailedAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_add_button.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(label, SCOPE),
                        Marshal.stringToAddress.marshal(detailedAction, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds a button to {@code notification} that activates {@code action} when clicked.
     * {@code action} must be an application-wide action (it must start with "app.").
     * <p>
     * If {@code target} is non-{@code null}, {@code action} will be activated with {@code target} as
     * its parameter.
     * @param label label of the button
     * @param action an action name
     * @param target a {@link org.gtk.glib.Variant} to use as {@code action}'s parameter, or {@code null}
     */
    public void addButtonWithTarget(java.lang.String label, java.lang.String action, @Nullable org.gtk.glib.Variant target) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_add_button_with_target_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(label, SCOPE),
                        Marshal.stringToAddress.marshal(action, SCOPE),
                        (Addressable) (target == null ? MemoryAddress.NULL : target.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the body of {@code notification} to {@code body}.
     * @param body the new body for {@code notification}, or {@code null}
     */
    public void setBody(@Nullable java.lang.String body) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_set_body.invokeExact(
                        handle(),
                        (Addressable) (body == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(body, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the type of {@code notification} to {@code category}. Categories have a main
     * type like {@code email}, {@code im} or {@code device} and can have a detail separated
     * by a {@code .}, e.g. {@code im.received} or {@code email.arrived}. Setting the category
     * helps the notification server to select proper feedback to the user.
     * <p>
     * Standard categories are <a href="https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html">listed in the specification</a>.
     * @param category the category for {@code notification}, or {@code null} for no category
     */
    public void setCategory(@Nullable java.lang.String category) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_set_category.invokeExact(
                        handle(),
                        (Addressable) (category == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(category, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the default action of {@code notification} to {@code detailed_action}. This
     * action is activated when the notification is clicked on.
     * <p>
     * The action in {@code detailed_action} must be an application-wide action (it
     * must start with "app."). If {@code detailed_action} contains a target, the
     * given action will be activated with that target as its parameter.
     * See g_action_parse_detailed_name() for a description of the format
     * for {@code detailed_action}.
     * <p>
     * When no default action is set, the application that the notification
     * was sent on is activated.
     * @param detailedAction a detailed action name
     */
    public void setDefaultAction(java.lang.String detailedAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_set_default_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedAction, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the default action of {@code notification} to {@code action}. This action is
     * activated when the notification is clicked on. It must be an
     * application-wide action (start with "app.").
     * <p>
     * If {@code target} is non-{@code null}, {@code action} will be activated with {@code target} as
     * its parameter.
     * <p>
     * When no default action is set, the application that the notification
     * was sent on is activated.
     * @param action an action name
     * @param target a {@link org.gtk.glib.Variant} to use as {@code action}'s parameter, or {@code null}
     */
    public void setDefaultActionAndTarget(java.lang.String action, @Nullable org.gtk.glib.Variant target) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_set_default_action_and_target_value.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(action, SCOPE),
                        (Addressable) (target == null ? MemoryAddress.NULL : target.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the icon of {@code notification} to {@code icon}.
     * @param icon the icon to be shown in {@code notification}, as a {@link Icon}
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.g_notification_set_icon.invokeExact(
                    handle(),
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the priority of {@code notification} to {@code priority}. See
     * {@link NotificationPriority} for possible values.
     * @param priority a {@link NotificationPriority}
     */
    public void setPriority(org.gtk.gio.NotificationPriority priority) {
        try {
            DowncallHandles.g_notification_set_priority.invokeExact(
                    handle(),
                    priority.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code notification} to {@code title}.
     * @param title the new title for {@code notification}
     */
    public void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_notification_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Deprecated in favor of g_notification_set_priority().
     * @param urgent {@code true} if {@code notification} is urgent
     * @deprecated Since 2.42, this has been deprecated in favour of
     *    g_notification_set_priority().
     */
    @Deprecated
    public void setUrgent(boolean urgent) {
        try {
            DowncallHandles.g_notification_set_urgent.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(urgent, null).intValue());
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
            RESULT = (long) DowncallHandles.g_notification_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Notification.Builder} object constructs a {@link Notification} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Notification.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Notification} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Notification}.
         * @return A new instance of {@code Notification} with the properties 
         *         that were set in the Builder object.
         */
        public Notification build() {
            return (Notification) org.gtk.gobject.GObject.newWithProperties(
                Notification.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_notification_new = Interop.downcallHandle(
                "g_notification_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_add_button = Interop.downcallHandle(
                "g_notification_add_button",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_add_button_with_target_value = Interop.downcallHandle(
                "g_notification_add_button_with_target_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_body = Interop.downcallHandle(
                "g_notification_set_body",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_category = Interop.downcallHandle(
                "g_notification_set_category",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_default_action = Interop.downcallHandle(
                "g_notification_set_default_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_default_action_and_target_value = Interop.downcallHandle(
                "g_notification_set_default_action_and_target_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_icon = Interop.downcallHandle(
                "g_notification_set_icon",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_priority = Interop.downcallHandle(
                "g_notification_set_priority",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_notification_set_title = Interop.downcallHandle(
                "g_notification_set_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_notification_set_urgent = Interop.downcallHandle(
                "g_notification_set_urgent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_notification_get_type = Interop.downcallHandle(
                "g_notification_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_notification_get_type != null;
    }
}
