package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * A Pointer object contains a pointer to a primitive value that is used when in C, a pointer to 
 * a primitive value is expected, for example as an out-parameter. 
 * For example, use {@code PointerInt} for an {@code *int} 
 * out-parameter.
 */
public abstract class Pointer {
    
    protected final MemoryAddress address;
    private MemorySegmentReference reference;
    
    protected Pointer(ValueLayout layout) {
        MemorySegment segment = Interop.getAllocator().allocate(layout);
        reference = new MemorySegmentReference(segment);
        this.address = segment.address();
    }
    
    public Pointer(MemoryAddress address) {
        this.address = address;
    }
    
    public MemoryAddress handle() {
        return address;
    }
}
