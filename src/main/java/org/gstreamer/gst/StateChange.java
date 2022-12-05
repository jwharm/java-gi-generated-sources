package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are the different state changes an element goes through.
 * {@link State#NULL} &amp;rArr; {@link State#PLAYING} is called an upwards state change
 * and {@link State#PLAYING} &amp;rArr; {@link State#NULL} a downwards state change.
 */
public enum StateChange implements io.github.jwharm.javagi.Enumeration {
    /**
     * state change from NULL to READY.
     *   * The element must check if the resources it needs are available. Device
     *     sinks and -sources typically try to probe the device to constrain their
     *     caps.
     *   * The element opens the device (in case feature need to be probed).
     */
    NULL_TO_READY(10),
    /**
     * state change from READY to PAUSED.
     *   * The element pads are activated in order to receive data in PAUSED.
     *     Streaming threads are started.
     *   * Some elements might need to return {@link StateChangeReturn#ASYNC} and complete
     *     the state change when they have enough information. It is a requirement
     *     for sinks to return {@link StateChangeReturn#ASYNC} and complete the state change
     *     when they receive the first buffer or {@link EventType#EOS} (preroll).
     *     Sinks also block the dataflow when in PAUSED.
     *   * A pipeline resets the running_time to 0.
     *   * Live sources return {@link StateChangeReturn#NO_PREROLL} and don't generate data.
     */
    READY_TO_PAUSED(19),
    /**
     * state change from PAUSED to PLAYING.
     *   * Most elements ignore this state change.
     *   * The pipeline selects a {@link Clock} and distributes this to all the children
     *     before setting them to PLAYING. This means that it is only allowed to
     *     synchronize on the {@link Clock} in the PLAYING state.
     *   * The pipeline uses the {@link Clock} and the running_time to calculate the
     *     base_time. The base_time is distributed to all children when performing
     *     the state change.
     *   * Sink elements stop blocking on the preroll buffer or event and start
     *     rendering the data.
     *   * Sinks can post {@link MessageType#EOS} in the PLAYING state. It is not allowed
     *     to post {@link MessageType#EOS} when not in the PLAYING state.
     *   * While streaming in PAUSED or PLAYING elements can create and remove
     *     sometimes pads.
     *   * Live sources start generating data and return {@link StateChangeReturn#SUCCESS}.
     */
    PAUSED_TO_PLAYING(28),
    /**
     * state change from PLAYING to PAUSED.
     *   * Most elements ignore this state change.
     *   * The pipeline calculates the running_time based on the last selected
     *     {@link Clock} and the base_time. It stores this information to continue
     *     playback when going back to the PLAYING state.
     *   * Sinks unblock any {@link Clock} wait calls.
     *   * When a sink does not have a pending buffer to play, it returns
     *     {@code GST_STATE_CHANGE_ASYNC} from this state change and completes the state
     *     change when it receives a new buffer or an {@link EventType#EOS}.
     *   * Any queued {@link MessageType#EOS} items are removed since they will be reposted
     *     when going back to the PLAYING state. The EOS messages are queued in
     *     {@link Bin} containers.
     *   * Live sources stop generating data and return {@link StateChangeReturn#NO_PREROLL}.
     */
    PLAYING_TO_PAUSED(35),
    /**
     * state change from PAUSED to READY.
     *   * Sinks unblock any waits in the preroll.
     *   * Elements unblock any waits on devices
     *   * Chain or get_range functions return {@link FlowReturn#FLUSHING}.
     *   * The element pads are deactivated so that streaming becomes impossible and
     *     all streaming threads are stopped.
     *   * The sink forgets all negotiated formats
     *   * Elements remove all sometimes pads
     */
    PAUSED_TO_READY(26),
    /**
     * state change from READY to NULL.
     *   * Elements close devices
     *   * Elements reset any internal state.
     */
    READY_TO_NULL(17),
    /**
     * state change from NULL to NULL. (Since: 1.14)
     */
    NULL_TO_NULL(9),
    /**
     * state change from READY to READY,
     * This might happen when going to PAUSED asynchronously failed, in that case
     * elements should make sure they are in a proper, coherent READY state. (Since: 1.14)
     */
    READY_TO_READY(18),
    /**
     * state change from PAUSED to PAUSED.
     * This might happen when elements were in PLAYING state and 'lost state',
     * they should make sure to go back to real 'PAUSED' state (prerolling for example). (Since: 1.14)
     */
    PAUSED_TO_PAUSED(27),
    /**
     * state change from PLAYING to PLAYING. (Since: 1.14)
     */
    PLAYING_TO_PLAYING(36);
    
    private static final java.lang.String C_TYPE_NAME = "GstStateChange";
    
    private final int value;
    StateChange(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static StateChange of(int value) {
        return switch (value) {
            case 10 -> NULL_TO_READY;
            case 19 -> READY_TO_PAUSED;
            case 28 -> PAUSED_TO_PLAYING;
            case 35 -> PLAYING_TO_PAUSED;
            case 26 -> PAUSED_TO_READY;
            case 17 -> READY_TO_NULL;
            case 9 -> NULL_TO_NULL;
            case 18 -> READY_TO_READY;
            case 27 -> PAUSED_TO_PAUSED;
            case 36 -> PLAYING_TO_PLAYING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given state transition.
     * @param transition a {@link StateChange} to get the name of.
     * @return a string with the name of the state
     *    result.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.StateChange transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_state_change_get_name.invokeExact(
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_state_change_get_name = Interop.downcallHandle(
            "gst_state_change_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
