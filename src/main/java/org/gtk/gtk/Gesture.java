package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGesture} is the base class for gesture recognition.
 * <p>
 * Although {@code GtkGesture} is quite generalized to serve as a base for
 * multi-touch gestures, it is suitable to implement single-touch and
 * pointer-based gestures (using the special {@code null} {@code GdkEventSequence}
 * value for these).
 * <p>
 * The number of touches that a {@code GtkGesture} need to be recognized is
 * controlled by the {@code Gtk.Gesture:n-points} property, if a
 * gesture is keeping track of less or more than that number of sequences,
 * it won't check whether the gesture is recognized.
 * <p>
 * As soon as the gesture has the expected number of touches, it will check
 * regularly if it is recognized, the criteria to consider a gesture as
 * "recognized" is left to {@code GtkGesture} subclasses.
 * <p>
 * A recognized gesture will then emit the following signals:
 * <ul>
 * <li>{@code Gtk.Gesture::begin} when the gesture is recognized.
 * <li>{@code Gtk.Gesture::update}, whenever an input event is processed.
 * <li>{@code Gtk.Gesture::end} when the gesture is no longer recognized.
 * </ul>
 * <p>
 * <strong>Event propagation</strong><br/>
 * In order to receive events, a gesture needs to set a propagation phase
 * through {@link EventController#setPropagationPhase}.
 * <p>
 * In the capture phase, events are propagated from the toplevel down
 * to the target widget, and gestures that are attached to containers
 * above the widget get a chance to interact with the event before it
 * reaches the target.
 * <p>
 * In the bubble phase, events are propagated up from the target widget
 * to the toplevel, and gestures that are attached to containers above
 * the widget get a chance to interact with events that have not been
 * handled yet.
 * <p>
 * <strong>States of a sequence</strong><br/>
 * Whenever input interaction happens, a single event may trigger a cascade
 * of {@code GtkGesture}s, both across the parents of the widget receiving the
 * event and in parallel within an individual widget. It is a responsibility
 * of the widgets using those gestures to set the state of touch sequences
 * accordingly in order to enable cooperation of gestures around the
 * {@code GdkEventSequence}s triggering those.
 * <p>
 * Within a widget, gestures can be grouped through {@link Gesture#group}.
 * Grouped gestures synchronize the state of sequences, so calling
 * {@link Gesture#setSequenceState} on one will effectively propagate
 * the state throughout the group.
 * <p>
 * By default, all sequences start out in the {@link EventSequenceState#NONE} state,
 * sequences in this state trigger the gesture event handler, but event
 * propagation will continue unstopped by gestures.
 * <p>
 * If a sequence enters into the {@link EventSequenceState#DENIED} state, the gesture
 * group will effectively ignore the sequence, letting events go unstopped
 * through the gesture, but the "slot" will still remain occupied while
 * the touch is active.
 * <p>
 * If a sequence enters in the {@link EventSequenceState#CLAIMED} state, the gesture
 * group will grab all interaction on the sequence, by:
 * <ul>
 * <li>Setting the same sequence to {@link EventSequenceState#DENIED} on every other
 *   gesture group within the widget, and every gesture on parent widgets
 *   in the propagation chain.
 * <li>Emitting {@code Gtk.Gesture::cancel} on every gesture in widgets
 *   underneath in the propagation chain.
 * <li>Stopping event propagation after the gesture group handles the event.
 * </ul>
 * <p>
 * Note: if a sequence is set early to {@link EventSequenceState#CLAIMED} on
 * {@link org.gtk.gdk.EventType#TOUCH_BEGIN}/{@link org.gtk.gdk.EventType#BUTTON_PRESS} (so those events are captured before
 * reaching the event widget, this implies {@link PropagationPhase#CAPTURE}), one similar
 * event will be emulated if the sequence changes to {@link EventSequenceState#DENIED}.
 * This way event coherence is preserved before event propagation is unstopped
 * again.
 * <p>
 * Sequence states can't be changed freely.
 * See {@link Gesture#setSequenceState} to know about the possible
 * lifetimes of a {@code GdkEventSequence}.
 * <p>
 * <strong>Touchpad gestures</strong><br/>
 * On the platforms that support it, {@code GtkGesture} will handle transparently
 * touchpad gesture events. The only precautions users of {@code GtkGesture} should
 * do to enable this support are:
 * <ul>
 * <li>If the gesture has {@link PropagationPhase#NONE}, ensuring events of type
 *   {@link org.gtk.gdk.EventType#TOUCHPAD_SWIPE} and {@link org.gtk.gdk.EventType#TOUCHPAD_PINCH} are handled by the {@code GtkGesture}
 * </ul>
 */
public class Gesture extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGesture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Gesture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Gesture(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Gesture> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Gesture(input);
    
    /**
     * If there are touch sequences being currently handled by {@code gesture},
     * returns {@code true} and fills in {@code rect} with the bounding box containing
     * all active touches.
     * <p>
     * Otherwise, {@code false} will be returned.
     * <p>
     * Note: This function will yield unexpected results on touchpad
     * gestures. Since there is no correlation between physical and
     * pixel distances, these will look as if constrained in an
     * infinitely small area, {@code rect} width and height will thus be 0
     * regardless of the number of touchpoints.
     * @param rect bounding box containing all active touches.
     * @return {@code true} if there are active touches, {@code false} otherwise
     */
    public boolean getBoundingBox(org.gtk.gdk.Rectangle rect) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_get_bounding_box.invokeExact(
                    handle(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If there are touch sequences being currently handled by {@code gesture},
     * returns {@code true} and fills in {@code x} and {@code y} with the center of the bounding
     * box containing all active touches.
     * <p>
     * Otherwise, {@code false} will be returned.
     * @param x X coordinate for the bounding box center
     * @param y Y coordinate for the bounding box center
     * @return {@code false} if no active touches are present, {@code true} otherwise
     */
    public boolean getBoundingBoxCenter(Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_gesture_get_bounding_box_center.invokeExact(
                        handle(),
                        (Addressable) xPOINTER.address(),
                        (Addressable) yPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns the logical {@code GdkDevice} that is currently operating
     * on {@code gesture}.
     * <p>
     * This returns {@code null} if the gesture is not being interacted.
     * @return a {@code GdkDevice}
     */
    public @Nullable org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_get_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) Interop.register(RESULT, org.gtk.gdk.Device.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns all gestures in the group of {@code gesture}
     * @return The list
     *   of {@code GtkGesture}s, free with g_list_free()
     */
    public org.gtk.glib.List getGroup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_get_group.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the last event that was processed for {@code sequence}.
     * <p>
     * Note that the returned pointer is only valid as long as the
     * {@code sequence} is still interpreted by the {@code gesture}. If in doubt,
     * you should make a copy of the event.
     * @param sequence a {@code GdkEventSequence}
     * @return The last event from {@code sequence}
     */
    public @Nullable org.gtk.gdk.Event getLastEvent(@Nullable org.gtk.gdk.EventSequence sequence) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_get_last_event.invokeExact(
                    handle(),
                    (Addressable) (sequence == null ? MemoryAddress.NULL : sequence.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Event) Interop.register(RESULT, org.gtk.gdk.Event.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GdkEventSequence} that was last updated on {@code gesture}.
     * @return The last updated sequence
     */
    public @Nullable org.gtk.gdk.EventSequence getLastUpdatedSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_get_last_updated_sequence.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.EventSequence.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * If {@code sequence} is currently being interpreted by {@code gesture},
     * returns {@code true} and fills in {@code x} and {@code y} with the last coordinates
     * stored for that event sequence.
     * <p>
     * The coordinates are always relative to the widget allocation.
     * @param sequence a {@code GdkEventSequence}, or {@code null} for pointer events
     * @param x return location for X axis of the sequence coordinates
     * @param y return location for Y axis of the sequence coordinates
     * @return {@code true} if {@code sequence} is currently interpreted
     */
    public boolean getPoint(@Nullable org.gtk.gdk.EventSequence sequence, Out<Double> x, Out<Double> y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_gesture_get_point.invokeExact(
                        handle(),
                        (Addressable) (sequence == null ? MemoryAddress.NULL : sequence.handle()),
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
     * Returns the {@code sequence} state, as seen by {@code gesture}.
     * @param sequence a {@code GdkEventSequence}
     * @return The sequence state in {@code gesture}
     */
    public org.gtk.gtk.EventSequenceState getSequenceState(org.gtk.gdk.EventSequence sequence) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_get_sequence_state.invokeExact(
                    handle(),
                    sequence.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.EventSequenceState.of(RESULT);
    }
    
    /**
     * Returns the list of {@code GdkEventSequences} currently being interpreted
     * by {@code gesture}.
     * @return A list
     *   of {@code GdkEventSequence}, the list elements are owned by GTK and must
     *   not be freed or modified, the list itself must be deleted
     *   through g_list_free()
     */
    public org.gtk.glib.List getSequences() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_get_sequences.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds {@code gesture} to the same group than {@code group_gesture}.
     * <p>
     * Gestures are by default isolated in their own groups.
     * <p>
     * Both gestures must have been added to the same widget before
     * they can be grouped.
     * <p>
     * When gestures are grouped, the state of {@code GdkEventSequences}
     * is kept in sync for all of those, so calling
     * {@link Gesture#setSequenceState}, on one will transfer
     * the same value to the others.
     * <p>
     * Groups also perform an "implicit grabbing" of sequences, if a
     * {@code GdkEventSequence} state is set to {@link EventSequenceState#CLAIMED}
     * on one group, every other gesture group attached to the same
     * {@code GtkWidget} will switch the state for that sequence to
     * {@link EventSequenceState#DENIED}.
     * @param gesture a {@code GtkGesture}
     */
    public void group(org.gtk.gtk.Gesture gesture) {
        try {
            DowncallHandles.gtk_gesture_group.invokeExact(
                    handle(),
                    gesture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if {@code gesture} is currently handling events
     * corresponding to {@code sequence}.
     * @param sequence a {@code GdkEventSequence}
     * @return {@code true} if {@code gesture} is handling {@code sequence}, {@code false} otherwise
     */
    public boolean handlesSequence(@Nullable org.gtk.gdk.EventSequence sequence) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_handles_sequence.invokeExact(
                    handle(),
                    (Addressable) (sequence == null ? MemoryAddress.NULL : sequence.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the gesture is currently active.
     * <p>
     * A gesture is active while there are touch sequences
     * interacting with it.
     * @return {@code true} if gesture is active
     */
    public boolean isActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_is_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if both gestures pertain to the same group.
     * @param other another {@code GtkGesture}
     * @return whether the gestures are grouped
     */
    public boolean isGroupedWith(org.gtk.gtk.Gesture other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_is_grouped_with.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the gesture is currently recognized.
     * <p>
     * A gesture is recognized if there are as many interacting
     * touch sequences as required by {@code gesture}.
     * @return {@code true} if gesture is recognized
     */
    public boolean isRecognized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_is_recognized.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the state of {@code sequence} in {@code gesture}.
     * <p>
     * Sequences start in state {@link EventSequenceState#NONE}, and whenever
     * they change state, they can never go back to that state. Likewise,
     * sequences in state {@link EventSequenceState#DENIED} cannot turn back to
     * a not denied state. With these rules, the lifetime of an event
     * sequence is constrained to the next four:
     * <p>
     * * None
     * * None ??? Denied
     * * None ??? Claimed
     * * None ??? Claimed ??? Denied
     * <p>
     * Note: Due to event handling ordering, it may be unsafe to set the
     * state on another gesture within a {@code Gtk.Gesture::begin} signal
     * handler, as the callback might be executed before the other gesture
     * knows about the sequence. A safe way to perform this could be:
     * <pre>{@code c
     * static void
     * first_gesture_begin_cb (GtkGesture       *first_gesture,
     *                         GdkEventSequence *sequence,
     *                         gpointer          user_data)
     * {
     *   gtk_gesture_set_sequence_state (first_gesture, sequence, GTK_EVENT_SEQUENCE_CLAIMED);
     *   gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * }
     * 
     * static void
     * second_gesture_begin_cb (GtkGesture       *second_gesture,
     *                          GdkEventSequence *sequence,
     *                          gpointer          user_data)
     * {
     *   if (gtk_gesture_get_sequence_state (first_gesture, sequence) == GTK_EVENT_SEQUENCE_CLAIMED)
     *     gtk_gesture_set_sequence_state (second_gesture, sequence, GTK_EVENT_SEQUENCE_DENIED);
     * }
     * }</pre>
     * <p>
     * If both gestures are in the same group, just set the state on
     * the gesture emitting the event, the sequence will be already
     * be initialized to the group's global state when the second
     * gesture processes the event.
     * @param sequence a {@code GdkEventSequence}
     * @param state the sequence state
     * @return {@code true} if {@code sequence} is handled by {@code gesture},
     *   and the state is changed successfully
     */
    public boolean setSequenceState(org.gtk.gdk.EventSequence sequence, org.gtk.gtk.EventSequenceState state) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_set_sequence_state.invokeExact(
                    handle(),
                    sequence.handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the state of all sequences that {@code gesture} is currently
     * interacting with.
     * <p>
     * See {@link Gesture#setSequenceState} for more details
     * on sequence states.
     * @param state the sequence state
     * @return {@code true} if the state of at least one sequence
     *   was changed successfully
     */
    public boolean setState(org.gtk.gtk.EventSequenceState state) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_set_state.invokeExact(
                    handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Separates {@code gesture} into an isolated group.
     */
    public void ungroup() {
        try {
            DowncallHandles.gtk_gesture_ungroup.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_gesture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Begin} callback.
     */
    @FunctionalInterface
    public interface Begin {
    
        /**
         * Emitted when the gesture is recognized.
         * <p>
         * This means the number of touch sequences matches
         * {@code Gtk.Gesture:n-points}.
         * <p>
         * Note: These conditions may also happen when an extra touch
         * (eg. a third touch on a 2-touches gesture) is lifted, in that
         * situation {@code sequence} won't pertain to the current set of active
         * touches, so don't rely on this being true.
         */
        void run(@Nullable org.gtk.gdk.EventSequence sequence);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesture, MemoryAddress sequence) {
            run(org.gtk.gdk.EventSequence.fromAddress.marshal(sequence, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Begin.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the gesture is recognized.
     * <p>
     * This means the number of touch sequences matches
     * {@code Gtk.Gesture:n-points}.
     * <p>
     * Note: These conditions may also happen when an extra touch
     * (eg. a third touch on a 2-touches gesture) is lifted, in that
     * situation {@code sequence} won't pertain to the current set of active
     * touches, so don't rely on this being true.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Gesture.Begin> onBegin(Gesture.Begin handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("begin", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Cancel} callback.
     */
    @FunctionalInterface
    public interface Cancel {
    
        /**
         * Emitted whenever a sequence is cancelled.
         * <p>
         * This usually happens on active touches when
         * {@link EventController#reset} is called on {@code gesture}
         * (manually, due to grabs...), or the individual {@code sequence}
         * was claimed by parent widgets' controllers (see
         * {@link Gesture#setSequenceState}).
         * <p>
         * {@code gesture} must forget everything about {@code sequence} as in
         * response to this signal.
         */
        void run(@Nullable org.gtk.gdk.EventSequence sequence);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesture, MemoryAddress sequence) {
            run(org.gtk.gdk.EventSequence.fromAddress.marshal(sequence, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Cancel.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a sequence is cancelled.
     * <p>
     * This usually happens on active touches when
     * {@link EventController#reset} is called on {@code gesture}
     * (manually, due to grabs...), or the individual {@code sequence}
     * was claimed by parent widgets' controllers (see
     * {@link Gesture#setSequenceState}).
     * <p>
     * {@code gesture} must forget everything about {@code sequence} as in
     * response to this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Gesture.Cancel> onCancel(Gesture.Cancel handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cancel", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code End} callback.
     */
    @FunctionalInterface
    public interface End {
    
        /**
         * Emitted when {@code gesture} either stopped recognizing the event
         * sequences as something to be handled, or the number of touch
         * sequences became higher or lower than {@code Gtk.Gesture:n-points}.
         * <p>
         * Note: {@code sequence} might not pertain to the group of sequences that
         * were previously triggering recognition on {@code gesture} (ie. a just
         * pressed touch sequence that exceeds {@code Gtk.Gesture:n-points}).
         * This situation may be detected by checking through
         * {@link Gesture#handlesSequence}.
         */
        void run(@Nullable org.gtk.gdk.EventSequence sequence);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesture, MemoryAddress sequence) {
            run(org.gtk.gdk.EventSequence.fromAddress.marshal(sequence, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), End.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code gesture} either stopped recognizing the event
     * sequences as something to be handled, or the number of touch
     * sequences became higher or lower than {@code Gtk.Gesture:n-points}.
     * <p>
     * Note: {@code sequence} might not pertain to the group of sequences that
     * were previously triggering recognition on {@code gesture} (ie. a just
     * pressed touch sequence that exceeds {@code Gtk.Gesture:n-points}).
     * This situation may be detected by checking through
     * {@link Gesture#handlesSequence}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Gesture.End> onEnd(Gesture.End handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("end", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SequenceStateChanged} callback.
     */
    @FunctionalInterface
    public interface SequenceStateChanged {
    
        /**
         * Emitted whenever a sequence state changes.
         * <p>
         * See {@link Gesture#setSequenceState} to know
         * more about the expectable sequence lifetimes.
         */
        void run(@Nullable org.gtk.gdk.EventSequence sequence, org.gtk.gtk.EventSequenceState state);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesture, MemoryAddress sequence, int state) {
            run(org.gtk.gdk.EventSequence.fromAddress.marshal(sequence, null), org.gtk.gtk.EventSequenceState.of(state));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SequenceStateChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever a sequence state changes.
     * <p>
     * See {@link Gesture#setSequenceState} to know
     * more about the expectable sequence lifetimes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Gesture.SequenceStateChanged> onSequenceStateChanged(Gesture.SequenceStateChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("sequence-state-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Update} callback.
     */
    @FunctionalInterface
    public interface Update {
    
        /**
         * Emitted whenever an event is handled while the gesture is recognized.
         * <p>
         * {@code sequence} is guaranteed to pertain to the set of active touches.
         */
        void run(@Nullable org.gtk.gdk.EventSequence sequence);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesture, MemoryAddress sequence) {
            run(org.gtk.gdk.EventSequence.fromAddress.marshal(sequence, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Update.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever an event is handled while the gesture is recognized.
     * <p>
     * {@code sequence} is guaranteed to pertain to the set of active touches.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Gesture.Update> onUpdate(Gesture.Update handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("update", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Gesture.Builder} object constructs a {@link Gesture} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Gesture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Gesture} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Gesture}.
         * @return A new instance of {@code Gesture} with the properties 
         *         that were set in the Builder object.
         */
        public Gesture build() {
            return (Gesture) org.gtk.gobject.GObject.newWithProperties(
                Gesture.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The number of touch points that trigger
         * recognition on this gesture.
         * @param nPoints The value for the {@code n-points} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPoints(int nPoints) {
            names.add("n-points");
            values.add(org.gtk.gobject.Value.create(nPoints));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_get_bounding_box = Interop.downcallHandle(
                "gtk_gesture_get_bounding_box",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_bounding_box_center = Interop.downcallHandle(
                "gtk_gesture_get_bounding_box_center",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_device = Interop.downcallHandle(
                "gtk_gesture_get_device",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_group = Interop.downcallHandle(
                "gtk_gesture_get_group",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_last_event = Interop.downcallHandle(
                "gtk_gesture_get_last_event",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_last_updated_sequence = Interop.downcallHandle(
                "gtk_gesture_get_last_updated_sequence",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_point = Interop.downcallHandle(
                "gtk_gesture_get_point",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_sequence_state = Interop.downcallHandle(
                "gtk_gesture_get_sequence_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_sequences = Interop.downcallHandle(
                "gtk_gesture_get_sequences",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_group = Interop.downcallHandle(
                "gtk_gesture_group",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_handles_sequence = Interop.downcallHandle(
                "gtk_gesture_handles_sequence",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_is_active = Interop.downcallHandle(
                "gtk_gesture_is_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_is_grouped_with = Interop.downcallHandle(
                "gtk_gesture_is_grouped_with",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_is_recognized = Interop.downcallHandle(
                "gtk_gesture_is_recognized",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_set_sequence_state = Interop.downcallHandle(
                "gtk_gesture_set_sequence_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_gesture_set_state = Interop.downcallHandle(
                "gtk_gesture_set_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_gesture_ungroup = Interop.downcallHandle(
                "gtk_gesture_ungroup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_get_type = Interop.downcallHandle(
                "gtk_gesture_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_gesture_get_type != null;
    }
}
