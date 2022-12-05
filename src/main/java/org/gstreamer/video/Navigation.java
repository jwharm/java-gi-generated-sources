package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The Navigation interface is used for creating and injecting navigation related
 * events such as mouse button presses, cursor motion and key presses. The associated
 * library also provides methods for parsing received events, and for sending and
 * receiving navigation related bus events. One main usecase is DVD menu navigation.
 * <p>
 * The main parts of the API are:
 * <p>
 * * The GstNavigation interface, implemented by elements which provide an application
 *   with the ability to create and inject navigation events into the pipeline.
 * * GstNavigation event handling API. GstNavigation events are created in response to
 *   calls on a GstNavigation interface implementation, and sent in the pipeline. Upstream
 *   elements can use the navigation event API functions to parse the contents of received
 *   messages.
 * <p>
 * * GstNavigation message handling API. GstNavigation messages may be sent on the message
 *   bus to inform applications of navigation related changes in the pipeline, such as the
 *   mouse moving over a clickable region, or the set of available angles changing.
 * <p>
 * The GstNavigation message functions provide functions for creating and parsing
 * custom bus messages for signaling GstNavigation changes.
 */
public interface Navigation extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to Navigation if its GType is a (or inherits from) "GstNavigation".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Navigation} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstNavigation", a ClassCastException will be thrown.
     */
    public static Navigation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Navigation.getType())) {
            return new NavigationImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstNavigation");
        }
    }
    
    /**
     * Sends the indicated command to the navigation interface.
     * @param command The command to issue
     */
    default void sendCommand(@NotNull org.gstreamer.video.NavigationCommand command) {
        java.util.Objects.requireNonNull(command, "Parameter 'command' must not be null");
        try {
            DowncallHandles.gst_navigation_send_command.invokeExact(
                    handle(),
                    command.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void sendEvent(@NotNull org.gstreamer.gst.Structure structure) {
        java.util.Objects.requireNonNull(structure, "Parameter 'structure' must not be null");
        try {
            DowncallHandles.gst_navigation_send_event.invokeExact(
                    handle(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void sendKeyEvent(@NotNull java.lang.String event, @NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.gst_navigation_send_key_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(event),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sends a mouse event to the navigation interface. Mouse event coordinates
     * are sent relative to the display space of the related output area. This is
     * usually the size in pixels of the window associated with the element
     * implementing the {@link Navigation} interface.
     * @param event The type of mouse event, as a text string. Recognised values are
     * "mouse-button-press", "mouse-button-release" and "mouse-move".
     * @param button The button number of the button being pressed or released. Pass 0
     * for mouse-move events.
     * @param x The x coordinate of the mouse event.
     * @param y The y coordinate of the mouse event.
     */
    default void sendMouseEvent(@NotNull java.lang.String event, int button, double x, double y) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        try {
            DowncallHandles.gst_navigation_send_mouse_event.invokeExact(
                    handle(),
                    Interop.allocateNativeString(event),
                    button,
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sends a mouse scroll event to the navigation interface. Mouse event coordinates
     * are sent relative to the display space of the related output area. This is
     * usually the size in pixels of the window associated with the element
     * implementing the {@link Navigation} interface.
     * @param x The x coordinate of the mouse event.
     * @param y The y coordinate of the mouse event.
     * @param deltaX The delta_x coordinate of the mouse event.
     * @param deltaY The delta_y coordinate of the mouse event.
     */
    default void sendMouseScrollEvent(double x, double y, double deltaX, double deltaY) {
        try {
            DowncallHandles.gst_navigation_send_mouse_scroll_event.invokeExact(
                    handle(),
                    x,
                    y,
                    deltaX,
                    deltaY);
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
            RESULT = (long) DowncallHandles.gst_navigation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Inspect a {@link org.gstreamer.gst.Event} and return the {@link NavigationEventType} of the event, or
     * {@code GST_NAVIGATION_EVENT_INVALID} if the event is not a {@link Navigation} event.
     * @param event A {@link org.gstreamer.gst.Event} to inspect.
     */
    public static @NotNull org.gstreamer.video.NavigationEventType eventGetType(@NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_get_type.invokeExact(
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.NavigationEventType.of(RESULT);
    }
    
    /**
     * Inspect a {@link Navigation} command event and retrieve the enum value of the
     * associated command.
     * @param event A {@link org.gstreamer.gst.Event} to inspect.
     * @param command Pointer to GstNavigationCommand to receive the
     *     type of the navigation event.
     * @return TRUE if the navigation command could be extracted, otherwise FALSE.
     */
    public static boolean eventParseCommand(@NotNull org.gstreamer.gst.Event event, @NotNull Out<org.gstreamer.video.NavigationCommand> command) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(command, "Parameter 'command' must not be null");
        MemorySegment commandPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_command.invokeExact(
                    event.handle(),
                    (Addressable) commandPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        command.set(org.gstreamer.video.NavigationCommand.of(commandPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    public static boolean eventParseKeyEvent(@NotNull org.gstreamer.gst.Event event, @NotNull Out<java.lang.String> key) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemorySegment keyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_key_event.invokeExact(
                    event.handle(),
                    (Addressable) keyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        key.set(Interop.getStringFrom(keyPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Retrieve the details of either a {@link Navigation} mouse button press event or
     * a mouse button release event. Determine which type the event is using
     * gst_navigation_event_get_type() to retrieve the {@link NavigationEventType}.
     * @param event A {@link org.gstreamer.gst.Event} to inspect.
     * @param button Pointer to a gint that will receive the button
     *     number associated with the event.
     * @param x Pointer to a gdouble to receive the x coordinate of the
     *     mouse button event.
     * @param y Pointer to a gdouble to receive the y coordinate of the
     *     mouse button event.
     * @return TRUE if the button number and both coordinates could be extracted,
     *     otherwise FALSE.
     */
    public static boolean eventParseMouseButtonEvent(@NotNull org.gstreamer.gst.Event event, Out<Integer> button, Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(button, "Parameter 'button' must not be null");
        MemorySegment buttonPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_button_event.invokeExact(
                    event.handle(),
                    (Addressable) buttonPOINTER.address(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        button.set(buttonPOINTER.get(Interop.valueLayout.C_INT, 0));
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Inspect a {@link Navigation} mouse movement event and extract the coordinates
     * of the event.
     * @param event A {@link org.gstreamer.gst.Event} to inspect.
     * @param x Pointer to a gdouble to receive the x coordinate of the
     *     mouse movement.
     * @param y Pointer to a gdouble to receive the y coordinate of the
     *     mouse movement.
     * @return TRUE if both coordinates could be extracted, otherwise FALSE.
     */
    public static boolean eventParseMouseMoveEvent(@NotNull org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_move_event.invokeExact(
                    event.handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Inspect a {@link Navigation} mouse scroll event and extract the coordinates
     * of the event.
     * @param event A {@link org.gstreamer.gst.Event} to inspect.
     * @param x Pointer to a gdouble to receive the x coordinate of the
     *     mouse movement.
     * @param y Pointer to a gdouble to receive the y coordinate of the
     *     mouse movement.
     * @param deltaX Pointer to a gdouble to receive the delta_x coordinate of the
     *     mouse movement.
     * @param deltaY Pointer to a gdouble to receive the delta_y coordinate of the
     *     mouse movement.
     * @return TRUE if all coordinates could be extracted, otherwise FALSE.
     */
    public static boolean eventParseMouseScrollEvent(@NotNull org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y, Out<Double> deltaX, Out<Double> deltaY) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(x, "Parameter 'x' must not be null");
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(deltaX, "Parameter 'deltaX' must not be null");
        MemorySegment deltaXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(deltaY, "Parameter 'deltaY' must not be null");
        MemorySegment deltaYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_scroll_event.invokeExact(
                    event.handle(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address(),
                    (Addressable) deltaXPOINTER.address(),
                    (Addressable) deltaYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        deltaX.set(deltaXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        deltaY.set(deltaYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Check a bus message to see if it is a {@link Navigation} event, and return
     * the {@link NavigationMessageType} identifying the type of the message if so.
     * @param message A {@link org.gstreamer.gst.Message} to inspect.
     * @return The type of the {@link org.gstreamer.gst.Message}, or
     * {@code GST_NAVIGATION_MESSAGE_INVALID} if the message is not a {@link Navigation}
     * notification.
     */
    public static @NotNull org.gstreamer.video.NavigationMessageType messageGetType(@NotNull org.gstreamer.gst.Message message) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_get_type.invokeExact(
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.NavigationMessageType.of(RESULT);
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_ANGLES_CHANGED} for notifying an application
     * that the current angle, or current number of angles available in a
     * multiangle video has changed.
     * @param src A {@link org.gstreamer.gst.Object} to set as source of the new message.
     * @param curAngle The currently selected angle.
     * @param nAngles The number of viewing angles now available.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static @NotNull org.gstreamer.gst.Message messageNewAnglesChanged(@NotNull org.gstreamer.gst.Object src, int curAngle, int nAngles) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_angles_changed.invokeExact(
                    src.handle(),
                    curAngle,
                    nAngles);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_COMMANDS_CHANGED}
     * @param src A {@link org.gstreamer.gst.Object} to set as source of the new message.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static @NotNull org.gstreamer.gst.Message messageNewCommandsChanged(@NotNull org.gstreamer.gst.Object src) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_commands_changed.invokeExact(
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_EVENT}.
     * @param src A {@link org.gstreamer.gst.Object} to set as source of the new message.
     * @param event A navigation {@link org.gstreamer.gst.Event}
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static @NotNull org.gstreamer.gst.Message messageNewEvent(@NotNull org.gstreamer.gst.Object src, @NotNull org.gstreamer.gst.Event event) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_event.invokeExact(
                    src.handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_MOUSE_OVER}.
     * @param src A {@link org.gstreamer.gst.Object} to set as source of the new message.
     * @param active {@code true} if the mouse has entered a clickable area of the display.
     * {@code false} if it over a non-clickable area.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static @NotNull org.gstreamer.gst.Message messageNewMouseOver(@NotNull org.gstreamer.gst.Object src, boolean active) {
        java.util.Objects.requireNonNull(src, "Parameter 'src' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_mouse_over.invokeExact(
                    src.handle(),
                    active ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Message(RESULT, Ownership.FULL);
    }
    
    /**
     * Parse a {@link Navigation} message of type GST_NAVIGATION_MESSAGE_ANGLES_CHANGED
     * and extract the {@code cur_angle} and {@code n_angles} parameters.
     * @param message A {@link org.gstreamer.gst.Message} to inspect.
     * @param curAngle A pointer to a {@code guint} to receive the new
     *     current angle number, or NULL
     * @param nAngles A pointer to a {@code guint} to receive the new angle
     *     count, or NULL.
     * @return {@code true} if the message could be successfully parsed. {@code false} if not.
     */
    public static boolean messageParseAnglesChanged(@NotNull org.gstreamer.gst.Message message, Out<Integer> curAngle, Out<Integer> nAngles) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        java.util.Objects.requireNonNull(curAngle, "Parameter 'curAngle' must not be null");
        MemorySegment curAnglePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(nAngles, "Parameter 'nAngles' must not be null");
        MemorySegment nAnglesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_angles_changed.invokeExact(
                    message.handle(),
                    (Addressable) curAnglePOINTER.address(),
                    (Addressable) nAnglesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
        nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Parse a {@link Navigation} message of type {@code GST_NAVIGATION_MESSAGE_EVENT}
     * and extract contained {@link org.gstreamer.gst.Event}. The caller must unref the {@code event} when done
     * with it.
     * @param message A {@link org.gstreamer.gst.Message} to inspect.
     * @param event a pointer to a {@link org.gstreamer.gst.Event} to receive
     *     the contained navigation event.
     * @return {@code true} if the message could be successfully parsed. {@code false} if not.
     */
    public static boolean messageParseEvent(@NotNull org.gstreamer.gst.Message message, @NotNull Out<org.gstreamer.gst.Event> event) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        MemorySegment eventPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_event.invokeExact(
                    message.handle(),
                    (Addressable) eventPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        event.set(new org.gstreamer.gst.Event(eventPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Parse a {@link Navigation} message of type {@code GST_NAVIGATION_MESSAGE_MOUSE_OVER}
     * and extract the active/inactive flag. If the mouse over event is marked
     * active, it indicates that the mouse is over a clickable area.
     * @param message A {@link org.gstreamer.gst.Message} to inspect.
     * @param active A pointer to a gboolean to receive the
     *     active/inactive state, or NULL.
     * @return {@code true} if the message could be successfully parsed. {@code false} if not.
     */
    public static boolean messageParseMouseOver(@NotNull org.gstreamer.gst.Message message, Out<Boolean> active) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        java.util.Objects.requireNonNull(active, "Parameter 'active' must not be null");
        MemorySegment activePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_parse_mouse_over.invokeExact(
                    message.handle(),
                    (Addressable) activePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        active.set(activePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return RESULT != 0;
    }
    
    /**
     * Inspect a {@link org.gstreamer.gst.Query} and return the {@link NavigationQueryType} associated with
     * it if it is a {@link Navigation} query.
     * @param query The query to inspect
     * @return The {@link NavigationQueryType} of the query, or
     * {@code GST_NAVIGATION_QUERY_INVALID}
     */
    public static @NotNull org.gstreamer.video.NavigationQueryType queryGetType(@NotNull org.gstreamer.gst.Query query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_get_type.invokeExact(
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.NavigationQueryType.of(RESULT);
    }
    
    /**
     * Create a new {@link Navigation} angles query. When executed, it will
     * query the pipeline for the set of currently available angles, which may be
     * greater than one in a multiangle video.
     * @return The new query.
     */
    public static @NotNull org.gstreamer.gst.Query queryNewAngles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_angles.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Query(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new {@link Navigation} commands query. When executed, it will
     * query the pipeline for the set of currently available commands.
     * @return The new query.
     */
    public static @NotNull org.gstreamer.gst.Query queryNewCommands() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_commands.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Query(RESULT, Ownership.FULL);
    }
    
    /**
     * Parse the current angle number in the {@link Navigation} angles {@code query} into the
     * {@code guint} pointed to by the {@code cur_angle} variable, and the number of available
     * angles into the {@code guint} pointed to by the {@code n_angles} variable.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param curAngle Pointer to a {@code guint} into which to store the
     *     currently selected angle value from the query, or NULL
     * @param nAngles Pointer to a {@code guint} into which to store the
     *     number of angles value from the query, or NULL
     * @return {@code true} if the query could be successfully parsed. {@code false} if not.
     */
    public static boolean queryParseAngles(@NotNull org.gstreamer.gst.Query query, Out<Integer> curAngle, Out<Integer> nAngles) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(curAngle, "Parameter 'curAngle' must not be null");
        MemorySegment curAnglePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(nAngles, "Parameter 'nAngles' must not be null");
        MemorySegment nAnglesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_angles.invokeExact(
                    query.handle(),
                    (Addressable) curAnglePOINTER.address(),
                    (Addressable) nAnglesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
        nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Parse the number of commands in the {@link Navigation} commands {@code query}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param nCmds the number of commands in this query.
     * @return {@code true} if the query could be successfully parsed. {@code false} if not.
     */
    public static boolean queryParseCommandsLength(@NotNull org.gstreamer.gst.Query query, Out<Integer> nCmds) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(nCmds, "Parameter 'nCmds' must not be null");
        MemorySegment nCmdsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_length.invokeExact(
                    query.handle(),
                    (Addressable) nCmdsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nCmds.set(nCmdsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Parse the {@link Navigation} command query and retrieve the {@code nth} command from
     * it into {@code cmd}. If the list contains less elements than {@code nth}, {@code cmd} will be
     * set to {@code GST_NAVIGATION_COMMAND_INVALID}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param nth the nth command to retrieve.
     * @param cmd a pointer to store the nth command into.
     * @return {@code true} if the query could be successfully parsed. {@code false} if not.
     */
    public static boolean queryParseCommandsNth(@NotNull org.gstreamer.gst.Query query, int nth, @NotNull Out<org.gstreamer.video.NavigationCommand> cmd) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(cmd, "Parameter 'cmd' must not be null");
        MemorySegment cmdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_nth.invokeExact(
                    query.handle(),
                    nth,
                    (Addressable) cmdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        cmd.set(org.gstreamer.video.NavigationCommand.of(cmdPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Set the {@link Navigation} angles query result field in {@code query}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param curAngle the current viewing angle to set.
     * @param nAngles the number of viewing angles to set.
     */
    public static void querySetAngles(@NotNull org.gstreamer.gst.Query query, int curAngle, int nAngles) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        try {
            DowncallHandles.gst_navigation_query_set_angles.invokeExact(
                    query.handle(),
                    curAngle,
                    nAngles);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@link Navigation} command query result fields in {@code query}. The number
     * of commands passed must be equal to {@code n_commands}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param nCmds the number of commands to set.
     * @param varargs A list of {@code GstNavigationCommand} values, {@code n_cmds} entries long.
     */
    public static void querySetCommands(@NotNull org.gstreamer.gst.Query query, int nCmds, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        try {
            DowncallHandles.gst_navigation_query_set_commands.invokeExact(
                    query.handle(),
                    nCmds,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@link Navigation} command query result fields in {@code query}. The number
     * of commands passed must be equal to {@code n_commands}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param nCmds the number of commands to set.
     * @param cmds An array containing {@code n_cmds}
     *     {@code GstNavigationCommand} values.
     */
    public static void querySetCommandsv(@NotNull org.gstreamer.gst.Query query, int nCmds, @NotNull org.gstreamer.video.NavigationCommand[] cmds) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        java.util.Objects.requireNonNull(cmds, "Parameter 'cmds' must not be null");
        try {
            DowncallHandles.gst_navigation_query_set_commandsv.invokeExact(
                    query.handle(),
                    nCmds,
                    Interop.allocateNativeArray(Enumeration.getValues(cmds), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_send_command = Interop.downcallHandle(
            "gst_navigation_send_command",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_send_event = Interop.downcallHandle(
            "gst_navigation_send_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_send_key_event = Interop.downcallHandle(
            "gst_navigation_send_key_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_send_mouse_event = Interop.downcallHandle(
            "gst_navigation_send_mouse_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_send_mouse_scroll_event = Interop.downcallHandle(
            "gst_navigation_send_mouse_scroll_event",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_get_type = Interop.downcallHandle(
            "gst_navigation_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_get_type = Interop.downcallHandle(
            "gst_navigation_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_parse_command = Interop.downcallHandle(
            "gst_navigation_event_parse_command",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_parse_key_event = Interop.downcallHandle(
            "gst_navigation_event_parse_key_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_parse_mouse_button_event = Interop.downcallHandle(
            "gst_navigation_event_parse_mouse_button_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_parse_mouse_move_event = Interop.downcallHandle(
            "gst_navigation_event_parse_mouse_move_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_event_parse_mouse_scroll_event = Interop.downcallHandle(
            "gst_navigation_event_parse_mouse_scroll_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_get_type = Interop.downcallHandle(
            "gst_navigation_message_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_new_angles_changed = Interop.downcallHandle(
            "gst_navigation_message_new_angles_changed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_new_commands_changed = Interop.downcallHandle(
            "gst_navigation_message_new_commands_changed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_new_event = Interop.downcallHandle(
            "gst_navigation_message_new_event",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_new_mouse_over = Interop.downcallHandle(
            "gst_navigation_message_new_mouse_over",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_parse_angles_changed = Interop.downcallHandle(
            "gst_navigation_message_parse_angles_changed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_parse_event = Interop.downcallHandle(
            "gst_navigation_message_parse_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_message_parse_mouse_over = Interop.downcallHandle(
            "gst_navigation_message_parse_mouse_over",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_get_type = Interop.downcallHandle(
            "gst_navigation_query_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_new_angles = Interop.downcallHandle(
            "gst_navigation_query_new_angles",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_new_commands = Interop.downcallHandle(
            "gst_navigation_query_new_commands",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_parse_angles = Interop.downcallHandle(
            "gst_navigation_query_parse_angles",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_parse_commands_length = Interop.downcallHandle(
            "gst_navigation_query_parse_commands_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_parse_commands_nth = Interop.downcallHandle(
            "gst_navigation_query_parse_commands_nth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_set_angles = Interop.downcallHandle(
            "gst_navigation_query_set_angles",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_set_commands = Interop.downcallHandle(
            "gst_navigation_query_set_commands",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_navigation_query_set_commandsv = Interop.downcallHandle(
            "gst_navigation_query_set_commandsv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class NavigationImpl extends org.gtk.gobject.Object implements Navigation {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public NavigationImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
