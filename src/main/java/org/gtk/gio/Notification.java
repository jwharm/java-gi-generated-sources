package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class Notification extends org.gtk.gobject.Object {

    public Notification(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Notification */
    public static Notification castFrom(org.gtk.gobject.Object gobject) {
        return new Notification(gobject.refcounted());
    }
    
    static final MethodHandle g_notification_new = Interop.downcallHandle(
        "g_notification_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String title) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_notification_new.invokeExact(Interop.allocateNativeString(title).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Notification} with {@code title} as its title.
     * <p>
     * After populating {@code notification} with more details, it can be sent to
     * the desktop shell with g_application_send_notification(). Changing
     * any properties after this call will not have any effect until
     * resending {@code notification}.
     */
    public Notification(java.lang.String title) {
        super(constructNew(title));
    }
    
    static final MethodHandle g_notification_add_button = Interop.downcallHandle(
        "g_notification_add_button",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a button to {@code notification} that activates the action in
     * {@code detailed_action} when clicked. That action must be an
     * application-wide action (starting with "app."). If {@code detailed_action}
     * contains a target, the action will be activated with that target as
     * its parameter.
     * <p>
     * See g_action_parse_detailed_name() for a description of the format
     * for {@code detailed_action}.
     */
    public void addButton(java.lang.String label, java.lang.String detailedAction) {
        try {
            g_notification_add_button.invokeExact(handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(detailedAction).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_add_button_with_target_value = Interop.downcallHandle(
        "g_notification_add_button_with_target_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a button to {@code notification} that activates {@code action} when clicked.
     * {@code action} must be an application-wide action (it must start with "app.").
     * <p>
     * If {@code target} is non-{@code null}, {@code action} will be activated with {@code target} as
     * its parameter.
     */
    public void addButtonWithTargetValue(java.lang.String label, java.lang.String action, org.gtk.glib.Variant target) {
        try {
            g_notification_add_button_with_target_value.invokeExact(handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(action).handle(), target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_body = Interop.downcallHandle(
        "g_notification_set_body",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the body of {@code notification} to {@code body}.
     */
    public void setBody(java.lang.String body) {
        try {
            g_notification_set_body.invokeExact(handle(), Interop.allocateNativeString(body).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_category = Interop.downcallHandle(
        "g_notification_set_category",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the type of {@code notification} to {@code category}. Categories have a main
     * type like {@code email}, {@code im} or {@code device} and can have a detail separated
     * by a {@code .}, e.g. {@code im.received} or {@code email.arrived}. Setting the category
     * helps the notification server to select proper feedback to the user.
     * <p>
     * Standard categories are <a href="https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html">listed in the specification</a>.
     */
    public void setCategory(java.lang.String category) {
        try {
            g_notification_set_category.invokeExact(handle(), Interop.allocateNativeString(category).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_default_action = Interop.downcallHandle(
        "g_notification_set_default_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setDefaultAction(java.lang.String detailedAction) {
        try {
            g_notification_set_default_action.invokeExact(handle(), Interop.allocateNativeString(detailedAction).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_default_action_and_target_value = Interop.downcallHandle(
        "g_notification_set_default_action_and_target_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setDefaultActionAndTargetValue(java.lang.String action, org.gtk.glib.Variant target) {
        try {
            g_notification_set_default_action_and_target_value.invokeExact(handle(), Interop.allocateNativeString(action).handle(), target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_icon = Interop.downcallHandle(
        "g_notification_set_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon of {@code notification} to {@code icon}.
     */
    public void setIcon(Icon icon) {
        try {
            g_notification_set_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_priority = Interop.downcallHandle(
        "g_notification_set_priority",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the priority of {@code notification} to {@code priority}. See
     * {@link NotificationPriority} for possible values.
     */
    public void setPriority(NotificationPriority priority) {
        try {
            g_notification_set_priority.invokeExact(handle(), priority.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_notification_set_title = Interop.downcallHandle(
        "g_notification_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of {@code notification} to {@code title}.
     */
    public void setTitle(java.lang.String title) {
        try {
            g_notification_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}