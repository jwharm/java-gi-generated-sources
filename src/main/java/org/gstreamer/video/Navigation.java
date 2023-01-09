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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NavigationImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NavigationImpl(input);
    
    /**
     * Sends the indicated command to the navigation interface.
     * @param command The command to issue
     */
    default void sendCommand(org.gstreamer.video.NavigationCommand command) {
        try {
            DowncallHandles.gst_navigation_send_command.invokeExact(
                    handle(),
                    command.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void sendEvent(org.gstreamer.gst.Structure structure) {
        try {
            DowncallHandles.gst_navigation_send_event.invokeExact(
                    handle(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default void sendKeyEvent(java.lang.String event, java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_navigation_send_key_event.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(event, SCOPE),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default void sendMouseEvent(java.lang.String event, int button, double x, double y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_navigation_send_mouse_event.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(event, SCOPE),
                        button,
                        x,
                        y);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public static org.gtk.glib.Type getType() {
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
    public static org.gstreamer.video.NavigationEventType eventGetType(org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_event_get_type.invokeExact(event.handle());
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
    public static boolean eventParseCommand(org.gstreamer.gst.Event event, @Nullable Out<org.gstreamer.video.NavigationCommand> command) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment commandPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_event_parse_command.invokeExact(
                        event.handle(),
                        (Addressable) (command == null ? MemoryAddress.NULL : (Addressable) commandPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (command != null) command.set(org.gstreamer.video.NavigationCommand.of(commandPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public static boolean eventParseKeyEvent(org.gstreamer.gst.Event event, @Nullable Out<java.lang.String> key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment keyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_event_parse_key_event.invokeExact(
                        event.handle(),
                        (Addressable) (key == null ? MemoryAddress.NULL : (Addressable) keyPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (key != null) key.set(Marshal.addressToString.marshal(keyPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean eventParseMouseButtonEvent(org.gstreamer.gst.Event event, Out<Integer> button, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment buttonPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_button_event.invokeExact(
                        event.handle(),
                        (Addressable) (button == null ? MemoryAddress.NULL : (Addressable) buttonPOINTER.address()),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (button != null) button.set(buttonPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean eventParseMouseMoveEvent(org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_move_event.invokeExact(
                        event.handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean eventParseMouseScrollEvent(org.gstreamer.gst.Event event, Out<Double> x, Out<Double> y, Out<Double> deltaX, Out<Double> deltaY) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment deltaXPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment deltaYPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_event_parse_mouse_scroll_event.invokeExact(
                        event.handle(),
                        (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                        (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()),
                        (Addressable) (deltaX == null ? MemoryAddress.NULL : (Addressable) deltaXPOINTER.address()),
                        (Addressable) (deltaY == null ? MemoryAddress.NULL : (Addressable) deltaYPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (deltaX != null) deltaX.set(deltaXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (deltaY != null) deltaY.set(deltaYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Check a bus message to see if it is a {@link Navigation} event, and return
     * the {@link NavigationMessageType} identifying the type of the message if so.
     * @param message A {@link org.gstreamer.gst.Message} to inspect.
     * @return The type of the {@link org.gstreamer.gst.Message}, or
     * {@code GST_NAVIGATION_MESSAGE_INVALID} if the message is not a {@link Navigation}
     * notification.
     */
    public static org.gstreamer.video.NavigationMessageType messageGetType(org.gstreamer.gst.Message message) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_message_get_type.invokeExact(message.handle());
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
     * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
     * @param curAngle The currently selected angle.
     * @param nAngles The number of viewing angles now available.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static org.gstreamer.gst.Message messageNewAnglesChanged(org.gstreamer.gst.GstObject src, int curAngle, int nAngles) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_angles_changed.invokeExact(
                    src.handle(),
                    curAngle,
                    nAngles);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_COMMANDS_CHANGED}
     * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static org.gstreamer.gst.Message messageNewCommandsChanged(org.gstreamer.gst.GstObject src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_commands_changed.invokeExact(src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_EVENT}.
     * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
     * @param event A navigation {@link org.gstreamer.gst.Event}
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static org.gstreamer.gst.Message messageNewEvent(org.gstreamer.gst.GstObject src, org.gstreamer.gst.Event event) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_event.invokeExact(
                    src.handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link Navigation} message with type
     * {@code GST_NAVIGATION_MESSAGE_MOUSE_OVER}.
     * @param src A {@link org.gstreamer.gst.GstObject} to set as source of the new message.
     * @param active {@code true} if the mouse has entered a clickable area of the display.
     * {@code false} if it over a non-clickable area.
     * @return The new {@link org.gstreamer.gst.Message}.
     */
    public static org.gstreamer.gst.Message messageNewMouseOver(org.gstreamer.gst.GstObject src, boolean active) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_message_new_mouse_over.invokeExact(
                    src.handle(),
                    Marshal.booleanToInteger.marshal(active, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Message.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static boolean messageParseAnglesChanged(org.gstreamer.gst.Message message, Out<Integer> curAngle, Out<Integer> nAngles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment curAnglePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment nAnglesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_message_parse_angles_changed.invokeExact(
                        message.handle(),
                        (Addressable) (curAngle == null ? MemoryAddress.NULL : (Addressable) curAnglePOINTER.address()),
                        (Addressable) (nAngles == null ? MemoryAddress.NULL : (Addressable) nAnglesPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (curAngle != null) curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (nAngles != null) nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean messageParseEvent(org.gstreamer.gst.Message message, @Nullable Out<org.gstreamer.gst.Event> event) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment eventPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_message_parse_event.invokeExact(
                        message.handle(),
                        (Addressable) (event == null ? MemoryAddress.NULL : (Addressable) eventPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (event != null) event.set(org.gstreamer.gst.Event.fromAddress.marshal(eventPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean messageParseMouseOver(org.gstreamer.gst.Message message, Out<Boolean> active) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment activePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_message_parse_mouse_over.invokeExact(
                        message.handle(),
                        (Addressable) (active == null ? MemoryAddress.NULL : (Addressable) activePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (active != null) active.set(activePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Inspect a {@link org.gstreamer.gst.Query} and return the {@link NavigationQueryType} associated with
     * it if it is a {@link Navigation} query.
     * @param query The query to inspect
     * @return The {@link NavigationQueryType} of the query, or
     * {@code GST_NAVIGATION_QUERY_INVALID}
     */
    public static org.gstreamer.video.NavigationQueryType queryGetType(org.gstreamer.gst.Query query) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_navigation_query_get_type.invokeExact(query.handle());
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
    public static org.gstreamer.gst.Query queryNewAngles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_angles.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Create a new {@link Navigation} commands query. When executed, it will
     * query the pipeline for the set of currently available commands.
     * @return The new query.
     */
    public static org.gstreamer.gst.Query queryNewCommands() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_navigation_query_new_commands.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static boolean queryParseAngles(org.gstreamer.gst.Query query, Out<Integer> curAngle, Out<Integer> nAngles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment curAnglePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment nAnglesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_query_parse_angles.invokeExact(
                        query.handle(),
                        (Addressable) (curAngle == null ? MemoryAddress.NULL : (Addressable) curAnglePOINTER.address()),
                        (Addressable) (nAngles == null ? MemoryAddress.NULL : (Addressable) nAnglesPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (curAngle != null) curAngle.set(curAnglePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (nAngles != null) nAngles.set(nAnglesPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parse the number of commands in the {@link Navigation} commands {@code query}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param nCmds the number of commands in this query.
     * @return {@code true} if the query could be successfully parsed. {@code false} if not.
     */
    public static boolean queryParseCommandsLength(org.gstreamer.gst.Query query, Out<Integer> nCmds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nCmdsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_length.invokeExact(
                        query.handle(),
                        (Addressable) (nCmds == null ? MemoryAddress.NULL : (Addressable) nCmdsPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (nCmds != null) nCmds.set(nCmdsPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static boolean queryParseCommandsNth(org.gstreamer.gst.Query query, int nth, @Nullable Out<org.gstreamer.video.NavigationCommand> cmd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment cmdPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_navigation_query_parse_commands_nth.invokeExact(
                        query.handle(),
                        nth,
                        (Addressable) (cmd == null ? MemoryAddress.NULL : (Addressable) cmdPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (cmd != null) cmd.set(org.gstreamer.video.NavigationCommand.of(cmdPOINTER.get(Interop.valueLayout.C_INT, 0)));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Set the {@link Navigation} angles query result field in {@code query}.
     * @param query a {@link org.gstreamer.gst.Query}
     * @param curAngle the current viewing angle to set.
     * @param nAngles the number of viewing angles to set.
     */
    public static void querySetAngles(org.gstreamer.gst.Query query, int curAngle, int nAngles) {
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
    public static void querySetCommands(org.gstreamer.gst.Query query, int nCmds, java.lang.Object... varargs) {
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
    public static void querySetCommandsv(org.gstreamer.gst.Query query, int nCmds, org.gstreamer.video.NavigationCommand[] cmds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_navigation_query_set_commandsv.invokeExact(
                        query.handle(),
                        nCmds,
                        Interop.allocateNativeArray(Enumeration.getValues(cmds), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    
    /**
     * The NavigationImpl type represents a native instance of the Navigation interface.
     */
    class NavigationImpl extends org.gtk.gobject.GObject implements Navigation {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Navigation for the provided memory address.
         * @param address the memory address of the instance
         */
        public NavigationImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_navigation_get_type != null;
    }
}
