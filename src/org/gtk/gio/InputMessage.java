package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * #GInputVectors and the operation will use all the buffers as if they
 * were one buffer, and will set @bytes_received to the total number of bytes
 * received across all #GInputVectors.
 * 
 * This structure closely mirrors `struct mmsghdr` and `struct msghdr` from
 * the POSIX sockets API (see `man 2 recvmmsg`).
 * 
 * If @address is non-%NULL then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 * 
 * If @control_messages is non-%NULL then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. @num_control_messages is set to the number of elements in
 * this array, which may be zero.
 * 
 * Flags relevant to this message will be returned in @flags. For example,
 * `MSG_EOR` or `MSG_TRUNC`.
 */
public class InputMessage extends io.github.jwharm.javagi.interop.ResourceBase {

    public InputMessage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
