package io.github.jwharm.javagi;

import org.gtk.gobject.GObject;
import org.gtk.gobject.GObjects;

import java.lang.foreign.Addressable;

/**
 * Represents a signal connection. With a {@code Signal} object, a signal connection
 * can be blocked, unblocked, and disconnected. It is also possible to check if the
 * signal is still connected.
 * @param <T> the type of the signal
 */
public class Signal<T> {

    private final org.gtk.gobject.GObject instance;
    private final long handlerId;

    /**
     * Create a Signal instance for the provided gobject and handler ID
     * @param instance the native memory address of the GObject instance
     * @param handlerId the handler ID of the signal
     */
    public Signal(Addressable instance, long handlerId) {
        this.instance = GObject.fromAddress.marshal(instance, null);
        this.handlerId = handlerId;
    }

    /**
     * See {@link GObjects#signalHandlerBlock(GObject, long)}
     */
    public void block() {
        GObjects.signalHandlerBlock(instance, handlerId);
    }

    /**
     * See {@link GObjects#signalHandlerUnblock(GObject, long)}
     */
    public void unblock() {
        GObjects.signalHandlerUnblock(instance, handlerId);
    }

    /**
     * See {@link GObjects#signalHandlerDisconnect(GObject, long)}
     */
    public void disconnect() {
        GObjects.signalHandlerDisconnect(instance, handlerId);
    }

    /**
     * See {@link GObjects#signalHandlerIsConnected(GObject, long)}
     * @return whether the signal is still connected
     */
    public boolean isConnected() {
        return GObjects.signalHandlerIsConnected(instance, handlerId);
    }
}
