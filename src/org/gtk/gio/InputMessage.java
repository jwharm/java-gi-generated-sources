package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * <h1>nputVectors and the operation will use all the buffers as if they</h1>
 * were one buffer, and will set @bytes_received to the total number of bytes
 * received across all #GInputVectors.
 * <p>
 * This structure closely mirrors <code>struct mmsghdr</code> and <code>struct msghdr</code> from
 * the POSIX sockets API (see <code>man 2 recvmmsg</code>).
 * <p>
 * If @address is non-<code>null</code> then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 * <p>
 * If @control_messages is non-<code>null</code> then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. @num_control_messages is set to the number of elements in
 * this array, which may be zero.
 * <p>
 * Flags relevant to this message will be returned in @flags. For example,<code>MSG_EOR</code> or <code>MSG_TRUNC</code>.
 */
public class InputMessage extends io.github.jwharm.javagi.ResourceBase {

    public InputMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
