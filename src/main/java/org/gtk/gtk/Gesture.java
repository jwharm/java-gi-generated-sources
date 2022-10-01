package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
 * <ul>
 * <li>{@code Gtk.Gesture::begin} when the gesture is recognized.
 * <li>{@code Gtk.Gesture::update}, whenever an input event is processed.
 * <li>{@code Gtk.Gesture::end} when the gesture is no longer recognized.
 * </ul>
 * <p>
 * <h2>Event propagation</h2>
 * <p>
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
 * <h2>States of a sequence</h2>
 * <p>
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
 * <p>
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
 * <h2>Touchpad gestures</h2>
 * <p>
 * On the platforms that support it, {@code GtkGesture} will handle transparently
 * touchpad gesture events. The only precautions users of {@code GtkGesture} should
 * do to enable this support are:
 * <p>
 * <ul>
 * <li>If the gesture has {@link PropagationPhase#NONE}, ensuring events of type
 *   {@link org.gtk.gdk.EventType#TOUCHPAD_SWIPE} and {@link org.gtk.gdk.EventType#TOUCHPAD_PINCH} are handled by the {@code GtkGesture}
 */
public class Gesture extends EventController {

    public Gesture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Gesture */
    public static Gesture castFrom(org.gtk.gobject.Object gobject) {
        return new Gesture(gobject.refcounted());
    }
    
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
     */
    public boolean getBoundingBox(org.gtk.gdk.Rectangle rect) {
        var RESULT = gtk_h.gtk_gesture_get_bounding_box(handle(), rect.handle());
        return RESULT != 0;
    }
    
    /**
     * If there are touch sequences being currently handled by {@code gesture},
     * returns {@code true} and fills in @x and @y with the center of the bounding
     * box containing all active touches.
     * <p>
     * Otherwise, {@code false} will be returned.
     */
    public boolean getBoundingBoxCenter(PointerDouble x, PointerDouble y) {
        var RESULT = gtk_h.gtk_gesture_get_bounding_box_center(handle(), x.handle(), y.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the logical {@code GdkDevice} that is currently operating
     * on {@code gesture}.
     * <p>
     * This returns {@code null} if the gesture is not being interacted.
     */
    public org.gtk.gdk.Device getDevice() {
        var RESULT = gtk_h.gtk_gesture_get_device(handle());
        return new org.gtk.gdk.Device(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns all gestures in the group of {@code gesture}
     */
    public org.gtk.glib.List getGroup() {
        var RESULT = gtk_h.gtk_gesture_get_group(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the last event that was processed for {@code sequence}.
     * <p>
     * Note that the returned pointer is only valid as long as the
     * {@code sequence} is still interpreted by the {@code gesture}. If in doubt,
     * you should make a copy of the event.
     */
    public org.gtk.gdk.Event getLastEvent(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_get_last_event(handle(), sequence.handle());
        return new org.gtk.gdk.Event(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkEventSequence} that was last updated on {@code gesture}.
     */
    public org.gtk.gdk.EventSequence getLastUpdatedSequence() {
        var RESULT = gtk_h.gtk_gesture_get_last_updated_sequence(handle());
        return new org.gtk.gdk.EventSequence(Refcounted.get(RESULT, false));
    }
    
    /**
     * If {@code sequence} is currently being interpreted by {@code gesture},
     * returns {@code true} and fills in @x and @y with the last coordinates
     * stored for that event sequence.
     * <p>
     * The coordinates are always relative to the widget allocation.
     */
    public boolean getPoint(org.gtk.gdk.EventSequence sequence, PointerDouble x, PointerDouble y) {
        var RESULT = gtk_h.gtk_gesture_get_point(handle(), sequence.handle(), x.handle(), y.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code sequence} state, as seen by {@code gesture}.
     */
    public EventSequenceState getSequenceState(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_get_sequence_state(handle(), sequence.handle());
        return new EventSequenceState(RESULT);
    }
    
    /**
     * Returns the list of {@code GdkEventSequences} currently being interpreted
     * by {@code gesture}.
     */
    public org.gtk.glib.List getSequences() {
        var RESULT = gtk_h.gtk_gesture_get_sequences(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
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
     */
    public void group(Gesture gesture) {
        gtk_h.gtk_gesture_group(handle(), gesture.handle());
    }
    
    /**
     * Returns {@code true} if {@code gesture} is currently handling events
     * corresponding to {@code sequence}.
     */
    public boolean handlesSequence(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_handles_sequence(handle(), sequence.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the gesture is currently active.
     * <p>
     * A gesture is active while there are touch sequences
     * interacting with it.
     */
    public boolean isActive() {
        var RESULT = gtk_h.gtk_gesture_is_active(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if both gestures pertain to the same group.
     */
    public boolean isGroupedWith(Gesture other) {
        var RESULT = gtk_h.gtk_gesture_is_grouped_with(handle(), other.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the gesture is currently recognized.
     * <p>
     * A gesture is recognized if there are as many interacting
     * touch sequences as required by {@code gesture}.
     */
    public boolean isRecognized() {
        var RESULT = gtk_h.gtk_gesture_is_recognized(handle());
        return RESULT != 0;
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
     * * None → Denied
     * * None → Claimed
     * * None → Claimed → Denied
     * <p>
     * Note: Due to event handling ordering, it may be unsafe to set the
     * state on another gesture within a {@code Gtk.Gesture::begin} signal
     * handler, as the callback might be executed before the other gesture
     * knows about the sequence. A safe way to perform this could be:
     * <p>
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
     */
    public boolean setSequenceState(org.gtk.gdk.EventSequence sequence, EventSequenceState state) {
        var RESULT = gtk_h.gtk_gesture_set_sequence_state(handle(), sequence.handle(), state.getValue());
        return RESULT != 0;
    }
    
    /**
     * Sets the state of all sequences that {@code gesture} is currently
     * interacting with.
     * <p>
     * See {@link Gesture#setSequenceState} for more details
     * on sequence states.
     */
    public boolean setState(EventSequenceState state) {
        var RESULT = gtk_h.gtk_gesture_set_state(handle(), state.getValue());
        return RESULT != 0;
    }
    
    /**
     * Separates {@code gesture} into an isolated group.
     */
    public void ungroup() {
        gtk_h.gtk_gesture_ungroup(handle());
    }
    
    @FunctionalInterface
    public interface BeginHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
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
     */
    public SignalHandle onBegin(BeginHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("begin").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Gesture.Callbacks.class, "signalGestureBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
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
     */
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("cancel").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Gesture.Callbacks.class, "signalGestureCancel",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
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
     */
    public SignalHandle onEnd(EndHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("end").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Gesture.Callbacks.class, "signalGestureEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SequenceStateChangedHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence, EventSequenceState state);
    }
    
    /**
     * Emitted whenever a sequence state changes.
     * <p>
     * See {@link Gesture#setSequenceState} to know
     * more about the expectable sequence lifetimes.
     */
    public SignalHandle onSequenceStateChanged(SequenceStateChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("sequence-state-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Gesture.Callbacks.class, "signalGestureSequenceStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpdateHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted whenever an event is handled while the gesture is recognized.
     * <p>
     * {@code sequence} is guaranteed to pertain to the set of active touches.
     */
    public SignalHandle onUpdate(UpdateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("update").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Gesture.Callbacks.class, "signalGestureUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureBegin(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Gesture.BeginHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Gesture(Refcounted.get(source)), new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)));
        }
        
        public static void signalGestureCancel(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Gesture.CancelHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Gesture(Refcounted.get(source)), new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)));
        }
        
        public static void signalGestureEnd(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Gesture.EndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Gesture(Refcounted.get(source)), new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)));
        }
        
        public static void signalGestureSequenceStateChanged(MemoryAddress source, MemoryAddress sequence, int state, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Gesture.SequenceStateChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Gesture(Refcounted.get(source)), new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)), new EventSequenceState(state));
        }
        
        public static void signalGestureUpdate(MemoryAddress source, MemoryAddress sequence, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Gesture.UpdateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Gesture(Refcounted.get(source)), new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)));
        }
        
    }
}
