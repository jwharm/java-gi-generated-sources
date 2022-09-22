package io.github.jwharm.javagi;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import java.lang.foreign.MemoryAddress;

public class SignalHandle {

    private final MemoryAddress instance;
    private final long handlerId;

    public SignalHandle(MemoryAddress instance, long handlerId) {
        this.instance = instance;
        this.handlerId = handlerId;
    }

    public void block() {
        gtk_h.g_signal_handler_block(instance, handlerId);
    }

    public void unblock() {
        gtk_h.g_signal_handler_unblock(instance, handlerId);
    }

    public void disconnect() {
        gtk_h.g_signal_handler_disconnect(instance, handlerId);
    }

    public boolean isConnected() {
        return gtk_h.g_signal_handler_is_connected(instance, handlerId) != 0;
    }
}
