package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ApplicationCommandLinePrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLinePrivate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ApplicationCommandLinePrivate}
     * @return A new, uninitialized @{link ApplicationCommandLinePrivate}
     */
    public static ApplicationCommandLinePrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ApplicationCommandLinePrivate newInstance = new ApplicationCommandLinePrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ApplicationCommandLinePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationCommandLinePrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationCommandLinePrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationCommandLinePrivate(input);
}
