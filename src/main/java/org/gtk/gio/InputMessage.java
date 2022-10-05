package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * {@code GInputVectors} and the operation will use all the buffers as if they
 * were one buffer, and will set {@code bytes_received} to the total number of bytes
 * received across all {@code GInputVectors}.
 * <p>
 * This structure closely mirrors {@code struct mmsghdr} and {@code struct msghdr} from
 * the POSIX sockets API (see {@code man 2 recvmmsg}).
 * <p>
 * If {@code address} is non-{@code null} then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 * <p>
 * If {@code control_messages} is non-{@code null} then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. {@code num_control_messages} is set to the number of elements in
 * this array, which may be zero.
 * <p>
 * Flags relevant to this message will be returned in {@code flags}. For example,
 * {@code MSG_EOR} or {@code MSG_TRUNC}.
 */
public class InputMessage extends io.github.jwharm.javagi.ResourceBase {

    public InputMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
