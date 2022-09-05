package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGesture` is the base class for gesture recognition.
 * 
 * Although `GtkGesture` is quite generalized to serve as a base for
 * multi-touch gestures, it is suitable to implement single-touch and
 * pointer-based gestures (using the special %NULL `GdkEventSequence`
 * value for these).
 * 
 * The number of touches that a `GtkGesture` need to be recognized is
 * controlled by the [property@Gtk.Gesture:n-points] property, if a
 * gesture is keeping track of less or more than that number of sequences,
 * it won't check whether the gesture is recognized.
 * 
 * As soon as the gesture has the expected number of touches, it will check
 * regularly if it is recognized, the criteria to consider a gesture as
 * "recognized" is left to `GtkGesture` subclasses.
 * 
 * A recognized gesture will then emit the following signals:
 * 
 * - [signal@Gtk.Gesture::begin] when the gesture is recognized.
 * - [signal@Gtk.Gesture::update], whenever an input event is processed.
 * - [signal@Gtk.Gesture::end] when the gesture is no longer recognized.
 * 
 * ## Event propagation
 * 
 * In order to receive events, a gesture needs to set a propagation phase
 * through [method@Gtk.EventController.set_propagation_phase].
 * 
 * In the capture phase, events are propagated from the toplevel down
 * to the target widget, and gestures that are attached to containers
 * above the widget get a chance to interact with the event before it
 * reaches the target.
 * 
 * In the bubble phase, events are propagated up from the target widget
 * to the toplevel, and gestures that are attached to containers above
 * the widget get a chance to interact with events that have not been
 * handled yet.
 * 
 * ## States of a sequence
 * 
 * Whenever input interaction happens, a single event may trigger a cascade
 * of `GtkGesture`s, both across the parents of the widget receiving the
 * event and in parallel within an individual widget. It is a responsibility
 * of the widgets using those gestures to set the state of touch sequences
 * accordingly in order to enable cooperation of gestures around the
 * `GdkEventSequence`s triggering those.
 * 
 * Within a widget, gestures can be grouped through [method@Gtk.Gesture.group].
 * Grouped gestures synchronize the state of sequences, so calling
 * [method@Gtk.Gesture.set_sequence_state] on one will effectively propagate
 * the state throughout the group.
 * 
 * By default, all sequences start out in the %GTK_EVENT_SEQUENCE_NONE state,
 * sequences in this state trigger the gesture event handler, but event
 * propagation will continue unstopped by gestures.
 * 
 * If a sequence enters into the %GTK_EVENT_SEQUENCE_DENIED state, the gesture
 * group will effectively ignore the sequence, letting events go unstopped
 * through the gesture, but the "slot" will still remain occupied while
 * the touch is active.
 * 
 * If a sequence enters in the %GTK_EVENT_SEQUENCE_CLAIMED state, the gesture
 * group will grab all interaction on the sequence, by:
 * 
 * - Setting the same sequence to %GTK_EVENT_SEQUENCE_DENIED on every other
 *   gesture group within the widget, and every gesture on parent widgets
 *   in the propagation chain.
 * - Emitting [signal@Gtk.Gesture::cancel] on every gesture in widgets
 *   underneath in the propagation chain.
 * - Stopping event propagation after the gesture group handles the event.
 * 
 * Note: if a sequence is set early to %GTK_EVENT_SEQUENCE_CLAIMED on
 * %GDK_TOUCH_BEGIN/%GDK_BUTTON_PRESS (so those events are captured before
 * reaching the event widget, this implies %GTK_PHASE_CAPTURE), one similar
 * event will be emulated if the sequence changes to %GTK_EVENT_SEQUENCE_DENIED.
 * This way event coherence is preserved before event propagation is unstopped
 * again.
 * 
 * Sequence states can't be changed freely.
 * See [method@Gtk.Gesture.set_sequence_state] to know about the possible
 * lifetimes of a `GdkEventSequence`.
 * 
 * ## Touchpad gestures
 * 
 * On the platforms that support it, `GtkGesture` will handle transparently
 * touchpad gesture events. The only precautions users of `GtkGesture` should
 * do to enable this support are:
 * 
 * - If the gesture has %GTK_PHASE_NONE, ensuring events of type
 *   %GDK_TOUCHPAD_SWIPE and %GDK_TOUCHPAD_PINCH are handled by the `GtkGesture`
 */
public class Gesture extends EventController {

    public Gesture(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Gesture */
    public static Gesture castFrom(org.gtk.gobject.Object gobject) {
        return new Gesture(gobject.getProxy());
    }
    
    /**
     * If there are touch sequences being currently handled by @gesture,
     * returns %TRUE and fills in @rect with the bounding box containing
     * all active touches.
     * 
     * Otherwise, %FALSE will be returned.
     * 
     * Note: This function will yield unexpected results on touchpad
     * gestures. Since there is no correlation between physical and
     * pixel distances, these will look as if constrained in an
     * infinitely small area, @rect width and height will thus be 0
     * regardless of the number of touchpoints.
     */
    public boolean getBoundingBox(org.gtk.gdk.Rectangle rect) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_bounding_box(HANDLE(), rect.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the logical `GdkDevice` that is currently operating
     * on @gesture.
     * 
     * This returns %NULL if the gesture is not being interacted.
     */
    public org.gtk.gdk.Device getDevice() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_device(HANDLE());
        return new org.gtk.gdk.Device(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns all gestures in the group of @gesture
     */
    public org.gtk.glib.List getGroup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_group(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the last event that was processed for @sequence.
     * 
     * Note that the returned pointer is only valid as long as the
     * @sequence is still interpreted by the @gesture. If in doubt,
     * you should make a copy of the event.
     */
    public org.gtk.gdk.Event getLastEvent(org.gtk.gdk.EventSequence sequence) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_last_event(HANDLE(), sequence.HANDLE());
        return new org.gtk.gdk.Event(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the `GdkEventSequence` that was last updated on @gesture.
     */
    public org.gtk.gdk.EventSequence getLastUpdatedSequence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_last_updated_sequence(HANDLE());
        return new org.gtk.gdk.EventSequence(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the @sequence state, as seen by @gesture.
     */
    public EventSequenceState getSequenceState(org.gtk.gdk.EventSequence sequence) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_sequence_state(HANDLE(), sequence.HANDLE());
        return EventSequenceState.fromValue(RESULT);
    }
    
    /**
     * Returns the list of `GdkEventSequences` currently being interpreted
     * by @gesture.
     */
    public org.gtk.glib.List getSequences() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_get_sequences(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Adds @gesture to the same group than @group_gesture.
     * 
     * Gestures are by default isolated in their own groups.
     * 
     * Both gestures must have been added to the same widget before
     * they can be grouped.
     * 
     * When gestures are grouped, the state of `GdkEventSequences`
     * is kept in sync for all of those, so calling
     * [method@Gtk.Gesture.set_sequence_state], on one will transfer
     * the same value to the others.
     * 
     * Groups also perform an "implicit grabbing" of sequences, if a
     * `GdkEventSequence` state is set to %GTK_EVENT_SEQUENCE_CLAIMED
     * on one group, every other gesture group attached to the same
     * `GtkWidget` will switch the state for that sequence to
     * %GTK_EVENT_SEQUENCE_DENIED.
     */
    public void group(Gesture gesture) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_group(HANDLE(), gesture.HANDLE());
    }
    
    /**
     * Returns %TRUE if @gesture is currently handling events
     * corresponding to @sequence.
     */
    public boolean handlesSequence(org.gtk.gdk.EventSequence sequence) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_handles_sequence(HANDLE(), sequence.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the gesture is currently active.
     * 
     * A gesture is active while there are touch sequences
     * interacting with it.
     */
    public boolean isActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_is_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if both gestures pertain to the same group.
     */
    public boolean isGroupedWith(Gesture other) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_is_grouped_with(HANDLE(), other.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the gesture is currently recognized.
     * 
     * A gesture is recognized if there are as many interacting
     * touch sequences as required by @gesture.
     */
    public boolean isRecognized() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_is_recognized(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the state of @sequence in @gesture.
     * 
     * Sequences start in state %GTK_EVENT_SEQUENCE_NONE, and whenever
     * they change state, they can never go back to that state. Likewise,
     * sequences in state %GTK_EVENT_SEQUENCE_DENIED cannot turn back to
     * a not denied state. With these rules, the lifetime of an event
     * sequence is constrained to the next four:
     * 
     * * None
     * * None → Denied
     * * None → Claimed
     * * None → Claimed → Denied
     * 
     * Note: Due to event handling ordering, it may be unsafe to set the
     * state on another gesture within a [signal@Gtk.Gesture::begin] signal
     * handler, as the callback might be executed before the other gesture
     * knows about the sequence. A safe way to perform this could be:
     * 
     * ```c
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
     * ```
     * 
     * If both gestures are in the same group, just set the state on
     * the gesture emitting the event, the sequence will be already
     * be initialized to the group's global state when the second
     * gesture processes the event.
     */
    public boolean setSequenceState(org.gtk.gdk.EventSequence sequence, EventSequenceState state) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_set_sequence_state(HANDLE(), sequence.HANDLE(), state.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Sets the state of all sequences that @gesture is currently
     * interacting with.
     * 
     * See [method@Gtk.Gesture.set_sequence_state] for more details
     * on sequence states.
     */
    public boolean setState(EventSequenceState state) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_set_state(HANDLE(), state.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Separates @gesture into an isolated group.
     */
    public void ungroup() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_ungroup(HANDLE());
    }
    
    @FunctionalInterface
    public interface BeginHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted when the gesture is recognized.
     * 
     * This means the number of touch sequences matches
     * [property@Gtk.Gesture:n-points].
     * 
     * Note: These conditions may also happen when an extra touch
     * (eg. a third touch on a 2-touches gesture) is lifted, in that
     * situation @sequence won't pertain to the current set of active
     * touches, so don't rely on this being true.
     */
    public void onBegin(BeginHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("begin"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted whenever a sequence is cancelled.
     * 
     * This usually happens on active touches when
     * [method@Gtk.EventController.reset] is called on @gesture
     * (manually, due to grabs...), or the individual @sequence
     * was claimed by parent widgets' controllers (see
     * [method@Gtk.Gesture.set_sequence_state]).
     * 
     * @gesture must forget everything about @sequence as in
     * response to this signal.
     */
    public void onCancel(CancelHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cancel"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted when @gesture either stopped recognizing the event
     * sequences as something to be handled, or the number of touch
     * sequences became higher or lower than [property@Gtk.Gesture:n-points].
     * 
     * Note: @sequence might not pertain to the group of sequences that
     * were previously triggering recognition on @gesture (ie. a just
     * pressed touch sequence that exceeds [property@Gtk.Gesture:n-points]).
     * This situation may be detected by checking through
     * [method@Gtk.Gesture.handles_sequence].
     */
    public void onEnd(EndHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("end"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SequenceStateChangedHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence, EventSequenceState state);
    }
    
    /**
     * Emitted whenever a sequence state changes.
     * 
     * See [method@Gtk.Gesture.set_sequence_state] to know
     * more about the expectable sequence lifetimes.
     */
    public void onSequenceStateChanged(SequenceStateChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureSequenceStateChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("sequence-state-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpdateHandler {
        void signalReceived(Gesture source, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted whenever an event is handled while the gesture is recognized.
     * 
     * @sequence is guaranteed to pertain to the set of active touches.
     */
    public void onUpdate(UpdateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("update"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
