package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGesture</code> is the base class for gesture recognition.
 * <p>
 * Although <code>GtkGesture</code> is quite generalized to serve as a base for
 * multi-touch gestures, it is suitable to implement single-touch and
 * pointer-based gestures (using the special <code>null</code> <code>GdkEventSequence</code>
 * value for these).
 * <p>
 * The number of touches that a <code>GtkGesture</code> need to be recognized is
 * controlled by the {@link [property@Gtk.Gesture:n-points] (ref=property)} property, if a
 * gesture is keeping track of less or more than that number of sequences,
 * it won&<code>#39</code> t check whether the gesture is recognized.
 * <p>
 * As soon as the gesture has the expected number of touches, it will check
 * regularly if it is recognized, the criteria to consider a gesture as
 * &<code>#34</code> recognized&<code>#34</code>  is left to <code>GtkGesture</code> subclasses.
 * <p>
 * A recognized gesture will then emit the following signals:
 * <p>
 * <li>{@link [signal@Gtk.Gesture::begin] (ref=signal)} when the gesture is recognized.
 * <li>{@link [signal@Gtk.Gesture::update] (ref=signal)}, whenever an input event is processed.
 * <li>{@link [signal@Gtk.Gesture::end] (ref=signal)} when the gesture is no longer recognized.
 * <p>
 * <h2>Event propagation</h2>
 * <p>
 * In order to receive events, a gesture needs to set a propagation phase
 * through {@link org.gtk.gtk.EventController<code>#setPropagationPhase</code> .
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
 * of <code>GtkGesture</code>s, both across the parents of the widget receiving the
 * event and in parallel within an individual widget. It is a responsibility
 * of the widgets using those gestures to set the state of touch sequences
 * accordingly in order to enable cooperation of gestures around the<code>GdkEventSequence</code>s triggering those.
 * <p>
 * Within a widget, gestures can be grouped through {@link org.gtk.gtk.Gesture<code>#group</code> .
 * Grouped gestures synchronize the state of sequences, so calling
 * {@link org.gtk.gtk.Gesture<code>#setSequenceState</code>  on one will effectively propagate
 * the state throughout the group.
 * <p>
 * By default, all sequences start out in the {@link org.gtk.gtk.EventSequenceState<code>#NONE</code>  state,
 * sequences in this state trigger the gesture event handler, but event
 * propagation will continue unstopped by gestures.
 * <p>
 * If a sequence enters into the {@link org.gtk.gtk.EventSequenceState<code>#DENIED</code>  state, the gesture
 * group will effectively ignore the sequence, letting events go unstopped
 * through the gesture, but the &<code>#34</code> slot&<code>#34</code>  will still remain occupied while
 * the touch is active.
 * <p>
 * If a sequence enters in the {@link org.gtk.gtk.EventSequenceState<code>#CLAIMED</code>  state, the gesture
 * group will grab all interaction on the sequence, by:
 * <p>
 * <li>Setting the same sequence to {@link org.gtk.gtk.EventSequenceState<code>#DENIED</code>  on every other
 *   gesture group within the widget, and every gesture on parent widgets
 *   in the propagation chain.
 * <li>Emitting {@link [signal@Gtk.Gesture::cancel] (ref=signal)} on every gesture in widgets
 *   underneath in the propagation chain.
 * <li>Stopping event propagation after the gesture group handles the event.
 * <p>
 * Note: if a sequence is set early to {@link org.gtk.gtk.EventSequenceState<code>#CLAIMED</code>  on
 * {@link org.gtk.gdk.EventType<code>#TOUCH_BEGIN</code>  {@link org.gtk.gdk.EventType<code>#BUTTON_PRESS</code>  (so those events are captured before
 * reaching the event widget, this implies {@link org.gtk.gtk.PropagationPhase<code>#CAPTURE</code>  , one similar
 * event will be emulated if the sequence changes to {@link org.gtk.gtk.EventSequenceState<code>#DENIED</code>  
 * This way event coherence is preserved before event propagation is unstopped
 * again.
 * <p>
 * Sequence states can&<code>#39</code> t be changed freely.
 * See {@link org.gtk.gtk.Gesture<code>#setSequenceState</code>  to know about the possible
 * lifetimes of a <code>GdkEventSequence</code>.
 * <p>
 * <h2>Touchpad gestures</h2>
 * <p>
 * On the platforms that support it, <code>GtkGesture</code> will handle transparently
 * touchpad gesture events. The only precautions users of <code>GtkGesture</code> should
 * do to enable this support are:
 * <p>
 * <li>If the gesture has {@link org.gtk.gtk.PropagationPhase<code>#NONE</code>   ensuring events of type
 *   {@link org.gtk.gdk.EventType<code>#TOUCHPAD_SWIPE</code>  and {@link org.gtk.gdk.EventType<code>#TOUCHPAD_PINCH</code>  are handled by the <code>GtkGesture</code>
 */
public class Gesture extends EventController {

    public Gesture(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Gesture */
    public static Gesture castFrom(org.gtk.gobject.Object gobject) {
        return new Gesture(gobject.getReference());
    }
    
    /**
     * If there are touch sequences being currently handled by @gesture,
     * returns <code>true</code> and fills in @rect with the bounding box containing
     * all active touches.
     * 
     * Otherwise, <code>false</code> will be returned.
     * 
     * Note: This function will yield unexpected results on touchpad
     * gestures. Since there is no correlation between physical and
     * pixel distances, these will look as if constrained in an
     * infinitely small area, @rect width and height will thus be 0
     * regardless of the number of touchpoints.
     */
    public boolean getBoundingBox(org.gtk.gdk.Rectangle rect) {
        var RESULT = gtk_h.gtk_gesture_get_bounding_box(handle(), rect.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the logical <code>GdkDevice</code> that is currently operating
     * on @gesture.
     * 
     * This returns <code>null</code> if the gesture is not being interacted.
     */
    public org.gtk.gdk.Device getDevice() {
        var RESULT = gtk_h.gtk_gesture_get_device(handle());
        return new org.gtk.gdk.Device(References.get(RESULT, false));
    }
    
    /**
     * Returns all gestures in the group of @gesture
     */
    public org.gtk.glib.List getGroup() {
        var RESULT = gtk_h.gtk_gesture_get_group(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Returns the last event that was processed for @sequence.
     * 
     * Note that the returned pointer is only valid as long as the
     * @sequence is still interpreted by the @gesture. If in doubt,
     * you should make a copy of the event.
     */
    public org.gtk.gdk.Event getLastEvent(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_get_last_event(handle(), sequence.handle());
        return new org.gtk.gdk.Event(References.get(RESULT, false));
    }
    
    /**
     * Returns the <code>GdkEventSequence</code> that was last updated on @gesture.
     */
    public org.gtk.gdk.EventSequence getLastUpdatedSequence() {
        var RESULT = gtk_h.gtk_gesture_get_last_updated_sequence(handle());
        return new org.gtk.gdk.EventSequence(References.get(RESULT, false));
    }
    
    /**
     * Returns the @sequence state, as seen by @gesture.
     */
    public EventSequenceState getSequenceState(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_get_sequence_state(handle(), sequence.handle());
        return EventSequenceState.fromValue(RESULT);
    }
    
    /**
     * Returns the list of <code>GdkEventSequences</code> currently being interpreted
     * by @gesture.
     */
    public org.gtk.glib.List getSequences() {
        var RESULT = gtk_h.gtk_gesture_get_sequences(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds @gesture to the same group than @group_gesture.
     * <p>
     * Gestures are by default isolated in their own groups.
     * <p>
     * Both gestures must have been added to the same widget before
     * they can be grouped.
     * <p>
     * When gestures are grouped, the state of <code>GdkEventSequences</code>
     * is kept in sync for all of those, so calling
     * {@link org.gtk.gtk.Gesture<code>#setSequenceState</code> , on one will transfer
     * the same value to the others.
     * <p>
     * Groups also perform an &<code>#34</code> implicit grabbing&<code>#34</code>  of sequences, if a<code>GdkEventSequence</code> state is set to {@link org.gtk.gtk.EventSequenceState<code>#CLAIMED</code>  on one group, every other gesture group attached to the same<code>GtkWidget</code> will switch the state for that sequence to
     * {@link org.gtk.gtk.EventSequenceState<code>#DENIED</code>
     */
    public void group(Gesture gesture) {
        gtk_h.gtk_gesture_group(handle(), gesture.handle());
    }
    
    /**
     * Returns <code>true</code> if @gesture is currently handling events
     * corresponding to @sequence.
     */
    public boolean handlesSequence(org.gtk.gdk.EventSequence sequence) {
        var RESULT = gtk_h.gtk_gesture_handles_sequence(handle(), sequence.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the gesture is currently active.
     * 
     * A gesture is active while there are touch sequences
     * interacting with it.
     */
    public boolean isActive() {
        var RESULT = gtk_h.gtk_gesture_is_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if both gestures pertain to the same group.
     */
    public boolean isGroupedWith(Gesture other) {
        var RESULT = gtk_h.gtk_gesture_is_grouped_with(handle(), other.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the gesture is currently recognized.
     * 
     * A gesture is recognized if there are as many interacting
     * touch sequences as required by @gesture.
     */
    public boolean isRecognized() {
        var RESULT = gtk_h.gtk_gesture_is_recognized(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the state of @sequence in @gesture.
     * <p>
     * Sequences start in state {@link org.gtk.gtk.EventSequenceState<code>#NONE</code>   and whenever
     * they change state, they can never go back to that state. Likewise,
     * sequences in state {@link org.gtk.gtk.EventSequenceState<code>#DENIED</code>  cannot turn back to
     * a not denied state. With these rules, the lifetime of an event
     * sequence is constrained to the next four:
     * <p>
     * * None
     * * None &<code>#8594</code>  Denied
     * * None &<code>#8594</code>  Claimed
     * * None &<code>#8594</code>  Claimed &<code>#8594</code>  Denied
     * <p>
     * Note: Due to event handling ordering, it may be unsafe to set the
     * state on another gesture within a {@link [signal@Gtk.Gesture::begin] (ref=signal)} signal
     * handler, as the callback might be executed before the other gesture
     * knows about the sequence. A safe way to perform this could be:
     * <p><pre>c
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
     * </pre>
     * 
     * If both gestures are in the same group, just set the state on
     * the gesture emitting the event, the sequence will be already
     * be initialized to the group&<code>#39</code> s global state when the second
     * gesture processes the event.
     */
    public boolean setSequenceState(org.gtk.gdk.EventSequence sequence, EventSequenceState state) {
        var RESULT = gtk_h.gtk_gesture_set_sequence_state(handle(), sequence.handle(), state.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Sets the state of all sequences that @gesture is currently
     * interacting with.
     * 
     * See {@link org.gtk.gtk.Gesture<code>#setSequenceState</code>  for more details
     * on sequence states.
     */
    public boolean setState(EventSequenceState state) {
        var RESULT = gtk_h.gtk_gesture_set_state(handle(), state.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Separates @gesture into an isolated group.
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
     * 
     * This means the number of touch sequences matches
     * {@link [property@Gtk.Gesture:n-points] (ref=property)}.
     * 
     * Note: These conditions may also happen when an extra touch
     * (eg. a third touch on a 2-touches gesture) is lifted, in that
     * situation @sequence won&<code>#39</code> t pertain to the current set of active
     * touches, so don&<code>#39</code> t rely on this being true.
     */
    public SignalHandle onBegin(BeginHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("begin").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * {@link org.gtk.gtk.EventController<code>#reset</code>  is called on @gesture
     * (manually, due to grabs...), or the individual @sequence
     * was claimed by parent widgets&<code>#39</code>  controllers (see
     * {@link org.gtk.gtk.Gesture<code>#setSequenceState</code> ).
     * 
     * @gesture must forget everything about @sequence as in
     * response to this signal.
     */
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureCancel", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cancel").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * sequences became higher or lower than {@link [property@Gtk.Gesture:n-points] (ref=property)}.
     * 
     * Note: @sequence might not pertain to the group of sequences that
     * were previously triggering recognition on @gesture (ie. a just
     * pressed touch sequence that exceeds {@link [property@Gtk.Gesture:n-points] (ref=property)}).
     * This situation may be detected by checking through
     * {@link org.gtk.gtk.Gesture<code>#handlesSequence</code> .
     */
    public SignalHandle onEnd(EndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * See {@link org.gtk.gtk.Gesture<code>#setSequenceState</code>  to know
     * more about the expectable sequence lifetimes.
     */
    public SignalHandle onSequenceStateChanged(SequenceStateChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureSequenceStateChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("sequence-state-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onUpdate(UpdateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("update").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
