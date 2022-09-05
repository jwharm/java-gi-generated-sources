package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GNotification is a mechanism for creating a notification to be shown
 * to the user -- typically as a pop-up notification presented by the
 * desktop environment shell.
 * 
 * The key difference between #GNotification and other similar APIs is
 * that, if supported by the desktop environment, notifications sent
 * with #GNotification will persist after the application has exited,
 * and even across system reboots.
 * 
 * Since the user may click on a notification while the application is
 * not running, applications using #GNotification should be able to be
 * started as a D-Bus service, using #GApplication.
 * 
 * In order for #GNotification to work, the application must have installed
 * a `.desktop` file. For example:
 * |[
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
 * ]|
 * 
 * The `X-GNOME-UsesNotifications` key indicates to GNOME Control Center
 * that this application uses notifications, so it can be listed in the
 * Control Center’s ‘Notifications’ panel.
 * 
 * The `.desktop` file must be named as `org.gnome.TestApplication.desktop`,
 * where `org.gnome.TestApplication` is the ID passed to g_application_new().
 * 
 * User interaction with a notification (either the default action, or
 * buttons) must be associated with actions on the application (ie:
 * "app." actions).  It is not possible to route user interaction
 * through the notification itself, because the object will not exist if
 * the application is autostarted as a result of a notification being
 * clicked.
 * 
 * A notification can be sent with g_application_send_notification().
 */
public class Notification extends org.gtk.gobject.Object {

    public Notification(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Notification */
    public static Notification castFrom(org.gtk.gobject.Object gobject) {
        return new Notification(gobject.getProxy());
    }
    
    /**
     * Creates a new #GNotification with @title as its title.
     * 
     * After populating @notification with more details, it can be sent to
     * the desktop shell with g_application_send_notification(). Changing
     * any properties after this call will not have any effect until
     * resending @notification.
     */
    public Notification(java.lang.String title) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_new(Interop.allocateNativeString(title).HANDLE()), true));
    }
    
    /**
     * Adds a button to @notification that activates the action in
     * @detailed_action when clicked. That action must be an
     * application-wide action (starting with "app."). If @detailed_action
     * contains a target, the action will be activated with that target as
     * its parameter.
     * 
     * See g_action_parse_detailed_name() for a description of the format
     * for @detailed_action.
     */
    public void addButton(java.lang.String label, java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_add_button(HANDLE(), Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Adds a button to @notification that activates @action when clicked.
     * @action must be an application-wide action (it must start with "app.").
     * 
     * If @target is non-%NULL, @action will be activated with @target as
     * its parameter.
     */
    public void addButtonWithTargetValue(java.lang.String label, java.lang.String action, org.gtk.glib.Variant target) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_add_button_with_target_value(HANDLE(), Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(action).HANDLE(), target.HANDLE());
    }
    
    /**
     * Sets the body of @notification to @body.
     */
    public void setBody(java.lang.String body) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_body(HANDLE(), Interop.allocateNativeString(body).HANDLE());
    }
    
    /**
     * Sets the type of @notification to @category. Categories have a main
     * type like `email`, `im` or `device` and can have a detail separated
     * by a `.`, e.g. `im.received` or `email.arrived`. Setting the category
     * helps the notification server to select proper feedback to the user.
     * 
     * Standard categories are [listed in the specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
     */
    public void setCategory(java.lang.String category) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_category(HANDLE(), Interop.allocateNativeString(category).HANDLE());
    }
    
    /**
     * Sets the default action of @notification to @detailed_action. This
     * action is activated when the notification is clicked on.
     * 
     * The action in @detailed_action must be an application-wide action (it
     * must start with "app."). If @detailed_action contains a target, the
     * given action will be activated with that target as its parameter.
     * See g_action_parse_detailed_name() for a description of the format
     * for @detailed_action.
     * 
     * When no default action is set, the application that the notification
     * was sent on is activated.
     */
    public void setDefaultAction(java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_default_action(HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Sets the default action of @notification to @action. This action is
     * activated when the notification is clicked on. It must be an
     * application-wide action (start with "app.").
     * 
     * If @target is non-%NULL, @action will be activated with @target as
     * its parameter.
     * 
     * When no default action is set, the application that the notification
     * was sent on is activated.
     */
    public void setDefaultActionAndTargetValue(java.lang.String action, org.gtk.glib.Variant target) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_default_action_and_target_value(HANDLE(), Interop.allocateNativeString(action).HANDLE(), target.HANDLE());
    }
    
    /**
     * Sets the icon of @notification to @icon.
     */
    public void setIcon(Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_icon(HANDLE(), icon.HANDLE());
    }
    
    /**
     * Sets the priority of @notification to @priority. See
     * #GNotificationPriority for possible values.
     */
    public void setPriority(NotificationPriority priority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_priority(HANDLE(), priority.getValue());
    }
    
    /**
     * Sets the title of @notification to @title.
     */
    public void setTitle(java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_notification_set_title(HANDLE(), Interop.allocateNativeString(title).HANDLE());
    }
    
}
