package io.github.jwharm.javagi;

import java.lang.foreign.Addressable;

import org.gtk.gobject.GObject;

public class SignalHandle {

    private final org.gtk.gobject.Object instance;
    private final long handlerId;

    public SignalHandle(Addressable instance, long handlerId) {
        this.instance = new org.gtk.gobject.Object(Refcounted.get(instance));
        this.handlerId = handlerId;
    }

    public void block() {
        GObject.signalHandlerBlock(instance, handlerId);
    }

    public void unblock() {
        GObject.signalHandlerUnblock(instance, handlerId);
    }

    public void disconnect() {
        GObject.signalHandlerDisconnect(instance, handlerId);
    }

    public boolean isConnected() {
        return GObject.signalHandlerIsConnected(instance, handlerId);
    }
}
